/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import colaDinamica.ColaD;
import colaEstatica.ColaE;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.TerminoEcuacion;
import modelo.Usuario;

/**
 *
 * @author christianecg
 */
public class Frm_Tarea190922 extends javax.swing.JFrame {
    DefaultTableModel model;
    colaDinamica.ColaD colaEcuacion = new ColaD();
    colaEstatica.ColaE colaUsuario;

    /**
     * Creates new form Frm_Tarea190909
     */
    public Frm_Tarea190922() {
        initComponents();
        model = (DefaultTableModel) tbl_Mostrar.getModel();
        rbn_EcuacionActionPerformed(null);
        rbn_Ecuacion.setSelected(true);
        rbn_Usuario.setSelected(false);
        colaUsuario = new ColaE(Integer.parseInt(JOptionPane.showInputDialog("Inserta el tamaño de la cola")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_Usuario = new javax.swing.JPanel();
        lbl_enviar_usuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txf_usuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        psf_password = new javax.swing.JPasswordField();
        lbl_pop_usuario = new javax.swing.JLabel();
        pnl_Ecuacion = new javax.swing.JPanel();
        spn_potencia = new javax.swing.JSpinner();
        spn_coeficiente = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        lbl_enviar_ecuacion = new javax.swing.JLabel();
        lbl_pop_ecuacion = new javax.swing.JLabel();
        pnl_Opciones = new javax.swing.JPanel();
        rbn_Ecuacion = new javax.swing.JRadioButton();
        rbn_Usuario = new javax.swing.JRadioButton();
        pnl_Tabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Mostrar = new javax.swing.JTable();
        lbl_listar = new javax.swing.JLabel();
        pnl_head = new javax.swing.JPanel();
        lbl_exit = new javax.swing.JLabel();
        lbl_minimize = new javax.swing.JLabel();
        lbl_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setIconImages(null);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(600, 424));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_Usuario.setBackground(new java.awt.Color(255,255,255,180));
        pnl_Usuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        pnl_Usuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_enviar_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/send.redimensionado.png"))); // NOI18N
        lbl_enviar_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_enviar_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_enviar_usuarioMouseClicked(evt);
            }
        });
        pnl_Usuario.add(lbl_enviar_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nick de usuario:");
        pnl_Usuario.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));
        pnl_Usuario.add(txf_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 210, 30));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Contraseña:");
        pnl_Usuario.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));
        pnl_Usuario.add(psf_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 210, 30));

        lbl_pop_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/X-512.redimensionado.png"))); // NOI18N
        lbl_pop_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_pop_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_pop_usuarioMouseClicked(evt);
            }
        });
        pnl_Usuario.add(lbl_pop_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        getContentPane().add(pnl_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 275, 150));

        pnl_Ecuacion.setBackground(new java.awt.Color(255,255,255,180));
        pnl_Ecuacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ecuación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        pnl_Ecuacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        spn_potencia.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        spn_potencia.setModel(new javax.swing.SpinnerNumberModel(Byte.valueOf((byte)1), Byte.valueOf((byte)-120), Byte.valueOf((byte)120), Byte.valueOf((byte)1)));
        pnl_Ecuacion.add(spn_potencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 70, 30));

        spn_coeficiente.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        spn_coeficiente.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(1.0f), Float.valueOf(-250.0f), Float.valueOf(250.0f), Float.valueOf(1.0f)));
        spn_coeficiente.setOpaque(false);
        pnl_Ecuacion.add(spn_coeficiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 80, 60));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("x");
        pnl_Ecuacion.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        lbl_enviar_ecuacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/send.redimensionado.png"))); // NOI18N
        lbl_enviar_ecuacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_enviar_ecuacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_enviar_ecuacionMouseClicked(evt);
            }
        });
        pnl_Ecuacion.add(lbl_enviar_ecuacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        lbl_pop_ecuacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/X-512.redimensionado.png"))); // NOI18N
        lbl_pop_ecuacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_pop_ecuacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_pop_ecuacionMouseClicked(evt);
            }
        });
        pnl_Ecuacion.add(lbl_pop_ecuacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        getContentPane().add(pnl_Ecuacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 275, 150));

        pnl_Opciones.setBackground(new java.awt.Color(255,255,255,180));

        rbn_Ecuacion.setBackground(new Color(255,255,255,0));
        rbn_Ecuacion.setForeground(new java.awt.Color(0, 0, 0));
        rbn_Ecuacion.setText("Ecuación");
        rbn_Ecuacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbn_EcuacionActionPerformed(evt);
            }
        });

        rbn_Usuario.setBackground(new Color(255,255,255,0));
        rbn_Usuario.setForeground(new java.awt.Color(0, 0, 0));
        rbn_Usuario.setText("Usuario");
        rbn_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbn_UsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_OpcionesLayout = new javax.swing.GroupLayout(pnl_Opciones);
        pnl_Opciones.setLayout(pnl_OpcionesLayout);
        pnl_OpcionesLayout.setHorizontalGroup(
            pnl_OpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_OpcionesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(rbn_Ecuacion)
                .addGap(18, 18, 18)
                .addComponent(rbn_Usuario)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        pnl_OpcionesLayout.setVerticalGroup(
            pnl_OpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_OpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_OpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbn_Ecuacion)
                    .addComponent(rbn_Usuario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(pnl_Opciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        pnl_Tabla.setBackground(new java.awt.Color(255,255,255,250));

        tbl_Mostrar.setBackground(new java.awt.Color(255,255,255,100));
        tbl_Mostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl_Mostrar);

        lbl_listar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/32-512.redimensionado.png"))); // NOI18N
        lbl_listar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_listar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_listarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl_TablaLayout = new javax.swing.GroupLayout(pnl_Tabla);
        pnl_Tabla.setLayout(pnl_TablaLayout);
        pnl_TablaLayout.setHorizontalGroup(
            pnl_TablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_TablaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_listar)
                .addContainerGap())
        );
        pnl_TablaLayout.setVerticalGroup(
            pnl_TablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_TablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_listar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(pnl_Tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, 370));

        pnl_head.setBackground(java.awt.SystemColor.menu);
        pnl_head.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/web_close.redimensionado.png"))); // NOI18N
        lbl_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_exitMouseClicked(evt);
            }
        });

        lbl_minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Web_-_Design_-_Device_130-512.redimensionado.png"))); // NOI18N
        lbl_minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_minimizeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl_headLayout = new javax.swing.GroupLayout(pnl_head);
        pnl_head.setLayout(pnl_headLayout);
        pnl_headLayout.setHorizontalGroup(
            pnl_headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_headLayout.createSequentialGroup()
                .addContainerGap(546, Short.MAX_VALUE)
                .addComponent(lbl_minimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_exit)
                .addContainerGap())
        );
        pnl_headLayout.setVerticalGroup(
            pnl_headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_headLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnl_headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_minimize)
                    .addComponent(lbl_exit))
                .addContainerGap())
        );

        getContentPane().add(pnl_head, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        lbl_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/_fs_Math_2018.xl.jpg"))); // NOI18N
        lbl_background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lbl_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 602, 426));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbl_exitMouseClicked

    private void lbl_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_minimizeMouseClicked
        this.setState(1);
    }//GEN-LAST:event_lbl_minimizeMouseClicked

    private void rbn_EcuacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbn_EcuacionActionPerformed
        rbn_Usuario.setSelected(!rbn_Ecuacion.isSelected());
        txf_usuario.setEnabled(false);
        psf_password.setEnabled(false);
        spn_coeficiente.setEnabled(true);
        spn_potencia.setEnabled(true);
        model.setColumnIdentifiers(new String[]{"Indice","Coeficiente","Potencia"});
        listar();
    }//GEN-LAST:event_rbn_EcuacionActionPerformed

    private void rbn_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbn_UsuarioActionPerformed
        rbn_Ecuacion.setSelected(!rbn_Usuario.isSelected());
        txf_usuario.setEnabled(true);
        psf_password.setEnabled(true);
        spn_coeficiente.setEnabled(false);
        spn_potencia.setEnabled(false);
        model.setColumnIdentifiers(new String[]{"Indice","Usuario","Contraseña"});
        listar();
    }//GEN-LAST:event_rbn_UsuarioActionPerformed

    private void lbl_enviar_ecuacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_enviar_ecuacionMouseClicked
        try {
            modelo.TerminoEcuacion te = new TerminoEcuacion();
            te.setCoeficiente(String.valueOf(spn_coeficiente.getValue()));
            te.setPotencia((String.valueOf(spn_potencia.getValue())));
            colaEcuacion.insertar(te);
            listar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "Se ha producido una excepción",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_lbl_enviar_ecuacionMouseClicked

    private void lbl_enviar_usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_enviar_usuarioMouseClicked
        try {
            String pass= "";
            char[] password = psf_password.getPassword();
            for(char c : password){
                pass+=c;
            }
            modelo.Usuario usuario = new Usuario();
            usuario.setUsuario(txf_usuario.getText());
            usuario.setPassword(pass);
            colaUsuario.insertar(usuario);
            listar();
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(rootPane, exception.getMessage(), "Se ha producido una excepción",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_lbl_enviar_usuarioMouseClicked

    private void lbl_pop_ecuacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_pop_ecuacionMouseClicked
        try {
            colaEcuacion.eliminar();
            listar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "Se ha producido una excepción",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_lbl_pop_ecuacionMouseClicked

    private void lbl_pop_usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_pop_usuarioMouseClicked
        try {
            colaUsuario.eliminar();
            listar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "Se ha producido una excepción",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_lbl_pop_usuarioMouseClicked

    private void lbl_listarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_listarMouseClicked
        listar();
    }//GEN-LAST:event_lbl_listarMouseClicked

    private void listar(){
        model.setRowCount(0);
        if(rbn_Ecuacion.isSelected()){
            ArrayList<Object> toArray = colaEcuacion.toArray();
            int i = 1;
            for(Object ob : toArray){
                TerminoEcuacion termino = (TerminoEcuacion) ob;
                String[] array = termino.toArray();
                array[0] = i+"";
                model.addRow(array);
                i++;
            }
        }
        else{
            try {
                ArrayList<Object> toArray = colaUsuario.toArray();
                int i = 1;
                for (Object ob : toArray) {
                    if (ob != null) {
                        Usuario user = (Usuario) ob;
                        String[] array = user.toArray();
                        array[0] = i + "";
                        model.addRow(array);
                        i++;
                    }
                }                
            } catch (Exception ex) {
                //JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
                                  
        }
        
        spn_coeficiente.setValue(0);
        spn_potencia.setValue(0);
        txf_usuario.setText("");
        psf_password.setText("");
    }
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm_Tarea190922.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Tarea190922.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Tarea190922.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Tarea190922.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Tarea190922().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_background;
    private javax.swing.JLabel lbl_enviar_ecuacion;
    private javax.swing.JLabel lbl_enviar_usuario;
    private javax.swing.JLabel lbl_exit;
    private javax.swing.JLabel lbl_listar;
    private javax.swing.JLabel lbl_minimize;
    private javax.swing.JLabel lbl_pop_ecuacion;
    private javax.swing.JLabel lbl_pop_usuario;
    private javax.swing.JPanel pnl_Ecuacion;
    private javax.swing.JPanel pnl_Opciones;
    private javax.swing.JPanel pnl_Tabla;
    private javax.swing.JPanel pnl_Usuario;
    private javax.swing.JPanel pnl_head;
    private javax.swing.JPasswordField psf_password;
    private javax.swing.JRadioButton rbn_Ecuacion;
    private javax.swing.JRadioButton rbn_Usuario;
    private javax.swing.JSpinner spn_coeficiente;
    private javax.swing.JSpinner spn_potencia;
    private javax.swing.JTable tbl_Mostrar;
    private javax.swing.JTextField txf_usuario;
    // End of variables declaration//GEN-END:variables
}
