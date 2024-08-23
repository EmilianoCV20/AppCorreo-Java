package Menus;

import Clases.ComprobarInternet;
import Clases.EnviarMensaje;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Mensaje extends javax.swing.JFrame {

    public String adjunto;
    private boolean conexion;
    String Correo;
    String Contraseña;
    String Nombre;
    String Archivo;
    String X,Y,Z,N;

    public Mensaje(String correo, String contra) {
        this.Correo = correo;
        this.Contraseña = contra;
        initComponents();
    }

    private Mensaje() {

    }

    public void verificarConexion() {
        ComprobarInternet google = new ComprobarInternet();
        conexion = google.test();
        System.out.println(conexion);

        if (conexion) {
            System.out.println("ESTAS CONECTADO A AL RED");
        } else {
            System.out.println("SIN CONEXION");
            jLabbelInternet.setText("NO HAY CONEXION A INTERNET");
            jTextFieldDestinatario.setEnabled(conexion);
            jTextFieldAsunto.setEnabled(false);
            jTextAreaMensaje.setEnabled(false);
            jButtonEnviar.setEnabled(false);
            jButtonDescartar.setEnabled(false);
            jButtonArchivo.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldDestinatario = new javax.swing.JTextField();
        jTextFieldAsunto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaMensaje = new javax.swing.JTextArea();
        jButtonEnviar = new javax.swing.JButton();
        jButtonDescartar = new javax.swing.JButton();
        jButtonArchivo = new javax.swing.JButton();
        jButtonCerrarSesion = new javax.swing.JButton();
        jButtonConexion = new javax.swing.JButton();
        jLabbelInternet = new javax.swing.JLabel();
        jTextFieldArchivo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabbelEstado = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonBorrarArch = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jButtonCargar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("APLICACION CORREO");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DESTINATARIOS:");

        jTextFieldDestinatario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextFieldDestinatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDestinatarioActionPerformed(evt);
            }
        });

        jTextFieldAsunto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextFieldAsunto.setToolTipText("");

        jTextAreaMensaje.setColumns(20);
        jTextAreaMensaje.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextAreaMensaje.setRows(5);
        jScrollPane1.setViewportView(jTextAreaMensaje);

        jButtonEnviar.setBackground(new java.awt.Color(0, 51, 102));
        jButtonEnviar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonEnviar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEnviar.setText("ENVIAR MENSAJE");
        jButtonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviarActionPerformed(evt);
            }
        });

        jButtonDescartar.setBackground(new java.awt.Color(0, 51, 102));
        jButtonDescartar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonDescartar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDescartar.setText("DESCARTAR");
        jButtonDescartar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDescartarActionPerformed(evt);
            }
        });

        jButtonArchivo.setBackground(new java.awt.Color(0, 51, 102));
        jButtonArchivo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonArchivo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonArchivo.setText("ADJUNTAR ARCHIVO");
        jButtonArchivo.setToolTipText("Adjuntar");
        jButtonArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonArchivoActionPerformed(evt);
            }
        });

        jButtonCerrarSesion.setBackground(new java.awt.Color(0, 204, 204));
        jButtonCerrarSesion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCerrarSesion.setText("CERRAR SESION");
        jButtonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarSesionActionPerformed(evt);
            }
        });

        jButtonConexion.setBackground(new java.awt.Color(0, 204, 204));
        jButtonConexion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonConexion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConexion.setText("CONECTARSE A INTERNET");
        jButtonConexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConexionActionPerformed(evt);
            }
        });

        jLabbelInternet.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabbelInternet.setForeground(new java.awt.Color(255, 255, 255));

        jTextFieldArchivo.setEditable(false);
        jTextFieldArchivo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ASUNTO:");

        jLabbelEstado.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabbelEstado.setForeground(new java.awt.Color(255, 255, 255));
        jLabbelEstado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.blue, java.awt.Color.blue, java.awt.Color.blue, java.awt.Color.blue));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MENU DEL EMAIL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel4)
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        jButtonBorrarArch.setBackground(new java.awt.Color(0, 51, 102));
        jButtonBorrarArch.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonBorrarArch.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBorrarArch.setText("Borrar Archivo");
        jButtonBorrarArch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarArchActionPerformed(evt);
            }
        });

        jButtonGuardar.setBackground(new java.awt.Color(0, 51, 102));
        jButtonGuardar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGuardar.setText("GUARDAR");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonCargar.setBackground(new java.awt.Color(0, 51, 102));
        jButtonCargar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonCargar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCargar.setText("CARGAR");
        jButtonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonConexion)
                        .addGap(18, 18, 18)
                        .addComponent(jLabbelInternet, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCerrarSesion))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonArchivo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonBorrarArch))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldAsunto)
                                    .addComponent(jTextFieldDestinatario)))))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonDescartar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCargar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonGuardar)
                        .addGap(61, 61, 61)
                        .addComponent(jLabbelEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonEnviar)))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonCerrarSesion)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabbelInternet, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonConexion))
                        .addGap(15, 15, 15)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAsunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jButtonArchivo)
                    .addComponent(jTextFieldArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBorrarArch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                        .addComponent(jButtonDescartar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCargar))
                    .addComponent(jLabbelEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldDestinatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDestinatarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDestinatarioActionPerformed

    private void jButtonArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonArchivoActionPerformed
        JFileChooser fc = new JFileChooser();
        int option = fc.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            Archivo = fc.getSelectedFile().getPath();
            Nombre = fc.getSelectedFile().getName();
            jTextFieldArchivo.setText(Archivo);
        }
    }//GEN-LAST:event_jButtonArchivoActionPerformed

    private void jButtonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarSesionActionPerformed
        this.dispose();
        IniciarSesion ventana = new IniciarSesion();
        ventana.setVisible(true);
    }//GEN-LAST:event_jButtonCerrarSesionActionPerformed

    private void jButtonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviarActionPerformed
        jButtonConexion.doClick();

        if (conexion == true) {
            if (jTextFieldDestinatario.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "NO SE AGREGO NINGUN DESTINATARIO");
            } else {
                int valor = 5;
                if (jTextFieldAsunto.getText().equals("")) {
                    valor = JOptionPane.showConfirmDialog(rootPane, "¿SEGURO QUE QUIERE DEJAR EL CORREO SIN ASUNTO?");
                }
                if (valor == 5 || valor == 0) {
                    EnviarMensaje obj = new EnviarMensaje(Correo, Contraseña, jTextFieldDestinatario, jTextFieldAsunto, jTextFieldArchivo, jTextAreaMensaje, Nombre, jLabbelEstado);
                    obj.start();
                    obj = null;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "PUEDE HACE LO SIGUIENTE: "
                    + "\n -Comprobar el módem y el router al que este conectado "
                    + "\n -Volver a establecer conexion "
                    + "\n -Reiniciar el Modem", "NO HAY CONEXION A INTERNET", JOptionPane.PLAIN_MESSAGE);
        }

    }//GEN-LAST:event_jButtonEnviarActionPerformed

    private void jButtonConexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConexionActionPerformed
        verificarConexion();
    }//GEN-LAST:event_jButtonConexionActionPerformed

    private void jButtonDescartarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDescartarActionPerformed
        jTextFieldDestinatario.setText("");
        jTextFieldAsunto.setText("");
        jTextAreaMensaje.setText("");
        jTextFieldArchivo.setText("");
    }//GEN-LAST:event_jButtonDescartarActionPerformed

    private void jButtonBorrarArchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarArchActionPerformed
        jTextFieldArchivo.setText("");
    }//GEN-LAST:event_jButtonBorrarArchActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        X = jTextFieldDestinatario.getText();
        Y = jTextFieldAsunto.getText();
        Z = jTextAreaMensaje.getText();
        N = jTextFieldArchivo.getText();
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarActionPerformed
        jTextFieldDestinatario.setText(X);
        jTextFieldAsunto.setText(Y);
        jTextAreaMensaje.setText(Z);
        jTextFieldArchivo.setText(N);
    }//GEN-LAST:event_jButtonCargarActionPerformed

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
            java.util.logging.Logger.getLogger(Mensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mensaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonArchivo;
    private javax.swing.JButton jButtonBorrarArch;
    private javax.swing.JButton jButtonCargar;
    private javax.swing.JButton jButtonCerrarSesion;
    private javax.swing.JButton jButtonConexion;
    private javax.swing.JButton jButtonDescartar;
    private javax.swing.JButton jButtonEnviar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JLabel jLabbelEstado;
    private javax.swing.JLabel jLabbelInternet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTextArea jTextAreaMensaje;
    private javax.swing.JTextField jTextFieldArchivo;
    private static javax.swing.JTextField jTextFieldAsunto;
    private static javax.swing.JTextField jTextFieldDestinatario;
    // End of variables declaration//GEN-END:variables
}
