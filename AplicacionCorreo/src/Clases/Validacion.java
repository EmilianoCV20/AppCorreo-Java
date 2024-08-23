package Clases;

import Menus.Mensaje;
import Menus.IniciarSesion;
import java.util.Properties;
import java.util.logging.Level;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Validacion implements Runnable{
    
    JTextField Correo;
    JPasswordField Contraseña;
    JLabel Error;
    IniciarSesion jLogin;
    String Email, pase;

    public Validacion(JTextField correo, JPasswordField contraseña, JLabel error, IniciarSesion jLogin) {
        this.Correo = correo;
        this.Contraseña = contraseña;
        this.Error = error;
        this.jLogin = jLogin;
        Email = this.Correo.getText();
        pase = this.Contraseña.getText();
    }

    @Override
    public void run() {
        Properties props = new Properties();
        
        final String usuario = Email;
        final String contra = pase;
        
        if(IniciarSesion.servidor == 0) { //GMAIL
            props.put("mail.transport.protocol", "smtp");
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.socketFactory.port", "587");
            props.put("mail.smtp.socketFactory.fallback", "false");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", "587");
        }
        
        if(IniciarSesion.servidor == 1) { //Hotmail
            props.put("mail.transport.protocol", "smtp");
            props.put("mail.smtp.host", "smtp.live.com");
            props.put("mail.smtp.socketFactory.port", "25");
            props.put("mail.smtp.socketFactory.fallback", "false");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", "25");
        }
        
        Session sesion = Session.getInstance(props, new javax.mail.Authenticator()
        {
            @Override
            protected javax.mail.PasswordAuthentication getPasswordAuthentication()
            {
                return new javax.mail.PasswordAuthentication(usuario, contra);
            }
        });
        
        sesion.setDebug(false);
        
        Transport transporte = null;
        
        try{
            transporte = sesion.getTransport("smtp");
        } catch (javax.mail.NoSuchProviderException ex){
            java.util.logging.Logger.getLogger(Validacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try{
            transporte.connect();
            Error.setVisible(true);
            jLogin.dispose();
            Mensaje ventana = new Mensaje(Email, pase);
            ventana.setVisible(true);
        } catch (MessagingException ex) {
            Error.setVisible(true);
            Contraseña.setText("");
        }
    }
    
    public void start(){
        new Thread(this).start();
    }
        
    
}
