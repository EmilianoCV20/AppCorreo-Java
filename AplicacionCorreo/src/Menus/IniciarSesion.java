package Menus;

import Clases.ComprobarInternet;
import Clases.Validacion;
import com.placeholder.PlaceHolder;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class IniciarSesion extends javax.swing.JFrame {

    public static String EnviaCorreo;
    public static String Contraseña;
    private boolean Conexion;
    public static int servidor;
    ButtonGroup btnGr;
    

    public IniciarSesion() {
        initComponents();
        PlaceHolder correo = new PlaceHolder(jTextFieldCorreo, "usuario123@correo.com");
        PlaceHolder contra = new PlaceHolder(jPasswordFieldContra, "contraseñasegura");
        jLabelError.setVisible(false);
        btnGr = new ButtonGroup();
        btnGr.add(jRadioButtonGmail);
        btnGr.add(jRadioButtonHotmail);
    }

    public void verificarConexion() {
        ComprobarInternet google = new ComprobarInternet();
        Conexion = google.test();
        System.out.println(Conexion);
        jRadioButtonGmail.setEnabled(Conexion);

        if (Conexion) {
            System.out.println("CONECTADO");
            this.jLab_EstadoInternet.setText("Se establecio conexion a internet");
            jTextFieldCorreo.setEnabled(true);
            jPasswordFieldContra.setEnabled(true);
            jButtonSesion.setEnabled(true);
        } else {
            System.out.println("SIN CONEXION");
            jLab_EstadoInternet.setText("No se pudo establecer conexion a internet");
            jTextFieldCorreo.setEnabled(false);
            jPasswordFieldContra.setEnabled(false);
            jButtonSesion.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        HostCorreo = new javax.swing.ButtonGroup();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jPanelSesion = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelCorreo = new javax.swing.JLabel();
        jRadioButtonGmail = new javax.swing.JRadioButton();
        jLabelUsuario = new javax.swing.JLabel();
        jTextFieldCorreo = new javax.swing.JTextField();
        jLabelContra = new javax.swing.JLabel();
        jButtonSesion = new javax.swing.JButton();
        JButtonSalir = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabelSesion = new javax.swing.JLabel();
        jPasswordFieldContra = new javax.swing.JPasswordField();
        jButtonInternet = new javax.swing.JButton();
        jLabelError = new javax.swing.JLabel();
        jLabelVersion = new javax.swing.JLabel();
        jRadioButtonHotmail = new javax.swing.JRadioButton();
        jLab_EstadoInternet = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jRadioButton2.setText("jRadioButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanelSesion.setBackground(new java.awt.Color(51, 51, 51));
        jPanelSesion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel1.setBackground(new java.awt.Color(0, 0, 153));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SELECCIONE SU CORREO E INGRESE SU USUARIO Y CONTRASEÑA");
        jLabel1.setOpaque(true);

        jLabelCorreo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelCorreo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCorreo.setText("TIPO DE CORREO:");

        jRadioButtonGmail.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jRadioButtonGmail.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonGmail.setText("GMAIL");
        jRadioButtonGmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRadioButtonGmailMousePressed(evt);
            }
        });

        jLabelUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuario.setText("USUARIO:");

        jTextFieldCorreo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabelContra.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelContra.setForeground(new java.awt.Color(255, 255, 255));
        jLabelContra.setText("CONTRASEÑA:");

        jButtonSesion.setBackground(new java.awt.Color(0, 51, 153));
        jButtonSesion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonSesion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSesion.setText("INICIAR SESION");
        jButtonSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSesionActionPerformed(evt);
            }
        });

        JButtonSalir.setBackground(new java.awt.Color(0, 51, 153));
        JButtonSalir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        JButtonSalir.setText("SALIR");
        JButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonSalirActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 0, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.blue, java.awt.Color.blue, java.awt.Color.blue, java.awt.Color.blue));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        jLabelSesion.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelSesion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSesion.setText("INICIAR SESIÓN");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabelSesion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSesion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPasswordFieldContra.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPasswordFieldContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldContraActionPerformed(evt);
            }
        });

        jButtonInternet.setBackground(new java.awt.Color(0, 204, 204));
        jButtonInternet.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonInternet.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInternet.setText("CONECTARSE A INTERNET");
        jButtonInternet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInternetActionPerformed(evt);
            }
        });

        jLabelError.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelError.setForeground(new java.awt.Color(255, 255, 255));
        jLabelError.setText("!ERROR¡ Los datos Ingresados no son correctos");

        jLabelVersion.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabelVersion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelVersion.setText("VERSION 1.2");

        jRadioButtonHotmail.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jRadioButtonHotmail.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonHotmail.setText("HOTMAIL");

        javax.swing.GroupLayout jPanelSesionLayout = new javax.swing.GroupLayout(jPanelSesion);
        jPanelSesion.setLayout(jPanelSesionLayout);
        jPanelSesionLayout.setHorizontalGroup(
            jPanelSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSesionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(61, 61, 61))
            .addGroup(jPanelSesionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSesionLayout.createSequentialGroup()
                        .addGroup(jPanelSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSesionLayout.createSequentialGroup()
                                .addGroup(jPanelSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelSesionLayout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(jLabelUsuario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSesionLayout.createSequentialGroup()
                                        .addComponent(jLabelContra)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanelSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelError)
                                            .addComponent(jPasswordFieldContra, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(jPanelSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JButtonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanelSesionLayout.createSequentialGroup()
                                .addComponent(jLabelCorreo)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButtonGmail)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButtonHotmail)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanelSesionLayout.createSequentialGroup()
                        .addComponent(jButtonInternet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelVersion)
                        .addGap(20, 20, 20))))
        );
        jPanelSesionLayout.setVerticalGroup(
            jPanelSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSesionLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addGroup(jPanelSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCorreo)
                    .addComponent(jRadioButtonGmail)
                    .addComponent(jRadioButtonHotmail))
                .addGap(18, 18, 18)
                .addGroup(jPanelSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSesion)
                    .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUsuario))
                .addGap(18, 18, 18)
                .addGroup(jPanelSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelContra)
                    .addComponent(jPasswordFieldContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButtonSalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelError, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanelSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInternet)
                    .addComponent(jLabelVersion))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLab_EstadoInternet.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        jLab_EstadoInternet.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLab_EstadoInternet, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(206, 206, 206)
                .addComponent(jLab_EstadoInternet, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInternetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInternetActionPerformed
        verificarConexion();
    }//GEN-LAST:event_jButtonInternetActionPerformed

    private void jPasswordFieldContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldContraActionPerformed

    }//GEN-LAST:event_jPasswordFieldContraActionPerformed

    private void JButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_JButtonSalirActionPerformed

    private void jButtonSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSesionActionPerformed
        jButtonInternet.doClick();
        if (Conexion == true) {

            if (jRadioButtonGmail.isSelected()) {
                servidor = 0;
                jTextFieldCorreo.setEnabled(true);
                jPasswordFieldContra.setEnabled(true);
            }
            if (jRadioButtonHotmail.isSelected()) {
                servidor = 1;
                jTextFieldCorreo.setEnabled(true);
                jPasswordFieldContra.setEnabled(true);
            }

            Validacion obj = new Validacion(this.jTextFieldCorreo, this.jPasswordFieldContra, jLabelError, this);
            obj.start();
            jLabelError.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "PUEDE HACE LO SIGUIENTE: "
                    + "\n -Comprobar el módem y el router al que este conectado "
                    + "\n -Volver a establecer conexion "
                    + "\n -Reiniciar el Modem", "NO HAY CONEXION A INTERNET", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_jButtonSesionActionPerformed

    private void jRadioButtonGmailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonGmailMousePressed

    }//GEN-LAST:event_jRadioButtonGmailMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup HostCorreo;
    private javax.swing.JButton JButtonSalir;
    private javax.swing.JButton jButtonInternet;
    private javax.swing.JButton jButtonSesion;
    private javax.swing.JLabel jLab_EstadoInternet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelContra;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JLabel jLabelSesion;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JLabel jLabelVersion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelSesion;
    private javax.swing.JPasswordField jPasswordFieldContra;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButtonGmail;
    private javax.swing.JRadioButton jRadioButtonHotmail;
    private javax.swing.JTextField jTextFieldCorreo;
    // End of variables declaration//GEN-END:variables
}
