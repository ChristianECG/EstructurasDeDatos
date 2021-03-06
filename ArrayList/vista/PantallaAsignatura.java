/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista; 

/**
 *
 * @author christianecg
 */
import control.ControlAsignatura;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Asignatura;
public class PantallaAsignatura extends javax.swing.JFrame {
    
    private control.ControlAsignatura controlAsignatura = new ControlAsignatura();
    private DefaultTableModel modelo;
    
    public Image getIconImage(){
        return Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon.png"));
    }

    /**
     * Creates new form PantallaAsignatura
     */
    public PantallaAsignatura() {
        initComponents();
        modelo = (DefaultTableModel) tbl_info.getModel();
        modelo.setColumnIdentifiers(new String[]{"Clave", "Nombre", "HT", "HP"});
        setIconImage(getIconImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_header = new javax.swing.JPanel();
        txt_exit = new javax.swing.JLabel();
        txt_minimizar = new javax.swing.JLabel();
        pnl_body = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfl_clave = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfl_nombre = new javax.swing.JTextField();
        tfl_ht = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfl_hp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_info = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btn_add = new javax.swing.JButton();
        btn_consulta = new javax.swing.JButton();
        txt_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Control de Asignaturas");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_header.setBackground(new java.awt.Color(254, 254, 254));

        txt_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cerrar_.png"))); // NOI18N
        txt_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_exitMouseClicked(evt);
            }
        });

        txt_minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minimizar_.png"))); // NOI18N
        txt_minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_minimizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl_headerLayout = new javax.swing.GroupLayout(pnl_header);
        pnl_header.setLayout(pnl_headerLayout);
        pnl_headerLayout.setHorizontalGroup(
            pnl_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_headerLayout.createSequentialGroup()
                .addContainerGap(550, Short.MAX_VALUE)
                .addComponent(txt_minimizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_exit)
                .addContainerGap())
        );
        pnl_headerLayout.setVerticalGroup(
            pnl_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_headerLayout.createSequentialGroup()
                .addGroup(pnl_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_exit)
                    .addComponent(txt_minimizar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(pnl_header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 20));

        pnl_body.setBackground(new Color(255,255,255,0));

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Clave");

        tfl_clave.setBackground(new java.awt.Color(205, 205, 205));
        tfl_clave.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        tfl_clave.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Nombre");

        tfl_nombre.setBackground(new java.awt.Color(205, 205, 205));
        tfl_nombre.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        tfl_nombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        tfl_ht.setBackground(new java.awt.Color(205, 205, 205));
        tfl_ht.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        tfl_ht.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Horas teóricas");

        jLabel4.setFont(new java.awt.Font("Noto Sans", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Horas prácticas");

        tfl_hp.setBackground(new java.awt.Color(205, 205, 205));
        tfl_hp.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        tfl_hp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        tbl_info.setBackground(new java.awt.Color(228, 228, 228));
        tbl_info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl_info);

        jPanel1.setBackground(new Color(0,0,0,0));

        btn_add.setBackground(new java.awt.Color(25, 25, 25));
        btn_add.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        btn_add.setForeground(new java.awt.Color(222, 222, 222));
        btn_add.setText("Añadir");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_consulta.setBackground(new java.awt.Color(25, 25, 25));
        btn_consulta.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        btn_consulta.setForeground(new java.awt.Color(222, 222, 222));
        btn_consulta.setText("Consultar");
        btn_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_consulta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(btn_add, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btn_add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_consulta)
                .addGap(0, 52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_bodyLayout = new javax.swing.GroupLayout(pnl_body);
        pnl_body.setLayout(pnl_bodyLayout);
        pnl_bodyLayout.setHorizontalGroup(
            pnl_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_bodyLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pnl_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_bodyLayout.createSequentialGroup()
                        .addGroup(pnl_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_bodyLayout.createSequentialGroup()
                                .addGroup(pnl_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_bodyLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(34, 34, 34))
                                    .addGroup(pnl_bodyLayout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(pnl_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfl_hp, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                    .addComponent(tfl_ht)))
                            .addGroup(pnl_bodyLayout.createSequentialGroup()
                                .addGroup(pnl_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(84, 84, 84)
                                .addGroup(pnl_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfl_clave, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfl_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        pnl_bodyLayout.setVerticalGroup(
            pnl_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_bodyLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnl_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnl_bodyLayout.createSequentialGroup()
                        .addGroup(pnl_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfl_clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfl_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfl_ht, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(pnl_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfl_hp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(pnl_body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 600, 430));

        txt_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Red-Geometric-Wallpaper-19.png"))); // NOI18N
        getContentPane().add(txt_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_minimizarMouseClicked
        this.setState(1);
    }//GEN-LAST:event_txt_minimizarMouseClicked

    private void txt_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_txt_exitMouseClicked

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        if(!tfl_hp.getText().equals("") && !tfl_ht.getText().equals("")
                && !tfl_clave.getText().equals("") && !tfl_nombre.getText().equals("")){
            modelo.Asignatura asignatura = new Asignatura();
            asignatura.setClave(tfl_clave.getText());
            asignatura.setNombre(tfl_nombre.getText());
            asignatura.setHp(Byte.parseByte(tfl_hp.getText()));
            asignatura.setHt(Byte.parseByte(tfl_ht.getText()));
            controlAsignatura.agregarAsignatura(asignatura);
            btn_consultaActionPerformed(evt);
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Faltan datos por ser llenados");
        }
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultaActionPerformed
        modelo.setRowCount(0);
        String clave = tfl_clave.getText();
        String nombre = tfl_nombre.getText();
        byte hp = tfl_hp.getText().equals("") ? 0 : Byte.parseByte(tfl_hp.getText());
        byte ht = tfl_ht.getText().equals("") ? 0 : Byte.parseByte(tfl_ht.getText());
        ArrayList<Asignatura> consulta = controlAsignatura.getConsulta(clave, nombre, hp, ht);
        
        for(Asignatura a : consulta){
            modelo.addRow(a.toArray());
        }
        
        tfl_clave.setText("");
        tfl_nombre.setText("");
        tfl_ht.setText("");
        tfl_hp.setText("");
    }//GEN-LAST:event_btn_consultaActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaAsignatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaAsignatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaAsignatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaAsignatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaAsignatura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_consulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnl_body;
    private javax.swing.JPanel pnl_header;
    private javax.swing.JTable tbl_info;
    private javax.swing.JTextField tfl_clave;
    private javax.swing.JTextField tfl_hp;
    private javax.swing.JTextField tfl_ht;
    private javax.swing.JTextField tfl_nombre;
    private javax.swing.JLabel txt_background;
    private javax.swing.JLabel txt_exit;
    private javax.swing.JLabel txt_minimizar;
    // End of variables declaration//GEN-END:variables
}
