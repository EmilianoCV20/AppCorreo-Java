package Clases;

import Menus.IniciarSesion;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EnviarMensaje implements Runnable {

    String Correo, Contraseña, Nombre, Destinatario, Asunto, Mensaje, rutaArchivo;
    JTextField destinatario, asunto, archivoAdjunto;
    JTextArea mensaje;
    String[] vect;
    JLabel Estado;

    public EnviarMensaje(String correo, String contraseña, JTextField destinatario, JTextField asunto, JTextField archivoAdj, JTextArea mensaje, String nombre, JLabel estado) {
        this.Correo = correo;
        this.Contraseña = contraseña;
        this.destinatario = destinatario;
        this.asunto = asunto;
        this.archivoAdjunto = archivoAdj;
        this.mensaje = mensaje;
        this.Nombre = nombre;
        this.Estado = estado;
        Destinatario = destinatario.getText();
        Asunto = asunto.getText();
        Mensaje = mensaje.getText();
        rutaArchivo = archivoAdj.getText();
        vect = Destinatario.split(",");
    }

    @Override
    public void run() {
        if (rutaArchivo.equals("")) {

            final String usuario = Correo;
            final String pass = Contraseña;
            Properties props = new Properties();

            if (IniciarSesion.servidor == 0) {
                props.put("mail.transport.protocol", "smtp");
                props.put("mail.smtp.host", "smtp.gmail.com");
                props.put("mail.smtp.socketFactory.port", "587");
                props.put("mail.smtp.socketFactory.fallback", "false");
                props.put("mail.smtp.starttls.enable", "true");
                props.put("mail.smtp.auth", "true");
                props.put("mail.smtp.port", "587");
            }
            
            if (IniciarSesion.servidor == 1) {
                props.put("mail.transport.protocol", "smtp");
                props.put("mail.smtp.host", "smtp.live.com");
                props.put("mail.smtp.socketFactory.port", "25");
                props.put("mail.smtp.socketFactory.fallback", "false");
                props.put("mail.smtp.starttls.enable", "true");
                props.put("mail.smtp.auth", "true");
                props.put("mail.smtp.port", "25");
            }

            Session sesion = Session.getInstance(props,
                    new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(usuario, pass);
                }
            });
            sesion.setDebug(false);

            try {
                Estado.setText("Procesando el Envio...");
                for (int i = 0; i < vect.length; i++) {
                    Message message = new MimeMessage(sesion);
                    message.setFrom(new InternetAddress(usuario));
                    message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(vect[i]));
                    message.setSubject(Asunto);
                    message.setText(Mensaje);
                    Transport.send(message);
                    JOptionPane.showMessageDialog(null, "¡¡¡MENSAJE ENVIADO CON EXITO!!! \nSe envio a los siguientes correos: \n" + vect[i]);
                }
                Estado.setText("MENSAJE ENVIADO");
                mensaje.setText("");
                asunto.setText("");
                destinatario.setText("");
            } catch (MessagingException e) {
                Estado.setText("¡ERROR! NO SE PUDO ENVIAR EL MENSAJE");
                JOptionPane.showMessageDialog(null, "COMPRUEBE SU CONEXION A INTERNET");
            }
        } else {

            Properties props = new Properties();
            if (IniciarSesion.servidor == 0) {
                props.setProperty("mail.smtp.host", "smtp.gmail.com");
                props.setProperty("mail.smtp.starttls.enable", "true");
                props.setProperty("mail.smtp.port", "587");
                props.setProperty("mail.smtp.auth", "true");
            }
            if (IniciarSesion.servidor == 1) {
                props.setProperty("mail.smtp.host", "smtp.live.com");
                props.setProperty("mail.smtp.starttls.enable", "true");
                props.setProperty("mail.smtp.port", "25");
                props.setProperty("mail.smtp.auth", "true");
            }

            Session session = Session.getDefaultInstance(props);
            session.setDebug(false);
            BodyPart texto = new MimeBodyPart();

            try {
                Estado.setText("Procesando el Envio...");
                for (int i = 0; i < vect.length; i++) {
                    texto.setText(Mensaje);
                    BodyPart adjunto = new MimeBodyPart();
                    adjunto.setDataHandler(new DataHandler(new FileDataSource(rutaArchivo)));
                    adjunto.setFileName(Nombre);
                    MimeMultipart multiParte = new MimeMultipart();
                    multiParte.addBodyPart(texto);
                    multiParte.addBodyPart(adjunto);
                    MimeMessage message = new MimeMessage(session);
                    message.setFrom(new InternetAddress(Correo));
                    message.addRecipient(Message.RecipientType.TO, new InternetAddress(vect[i]));
                    message.setSubject(Asunto);
                    message.setContent(multiParte);
                    Transport t = null;
                    t = session.getTransport("smtp");
                    t.connect(Correo, Contraseña);
                    t.sendMessage(message, message.getAllRecipients());
                    t.close();
                    JOptionPane.showMessageDialog(null, "¡¡¡MENSAJE ENVIADO CON EXITO!!! \nSe envio a los siguientes correos: \n" + vect[i]);
                }
                Estado.setText("MENSAJE ENVIADO");
                mensaje.setText("");
                asunto.setText("");
                destinatario.setText("");
                archivoAdjunto.setText("");
            } catch (MessagingException ex) {
                Estado.setText("¡ERROR! NO SE PUDO ENVIAR EL MENSAJE");
                JOptionPane.showMessageDialog(null, "COMPRUEBE SU CONEXION A INTERNET");
            }
        }
    }

    public void start() {
        new Thread(this).start();
    }
}
