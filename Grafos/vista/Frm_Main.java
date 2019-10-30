package vista;

import control.Grafo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.*;
import modelo.Arista;
import modelo.Nodo;

/**
 *
 * @author christianecg
 */
public class Frm_Main extends javax.swing.JFrame {

    private DefaultTableModel model;
    private Grafo grafo;
    /**
     * Creates new form Frm_Main
     */
    public Frm_Main() {
        initComponents();
        model = (DefaultTableModel) tbl_Datos.getModel();
        grafo = new Grafo();
        model.setColumnIdentifiers(new String[]{"Origen","Destino","Peso"});
        
        btn_AddArista.setEnabled(false);
        
        
        grafo.addNodo("Tlahue");
        grafo.addNodo("Tinaco");
        grafo.addNodo("Hoyos");
        grafo.addNodo("ITSOEH");
        grafo.addNodo("Tezo");
        
        try {
            grafo.addAristas("Tlahue", "Tezo", 30);
            grafo.addAristas("Tinaco", "Tezo", 20);
            grafo.addAristas("Hoyos", "Tezo", 8);
            grafo.addAristas("ITSOEH", "Tezo", 40);
            grafo.addAristas("Tezo", "Tlahue", 30);
            grafo.addAristas("Tezo", "Tinaco", 20);
            grafo.addAristas("Tezo", "Hoyos", 8);
            grafo.addAristas("Tezo", "ITSOEH", 40);
            grafo.addAristas("Tlahue", "Tinaco", 5);
            grafo.addAristas("Tinaco", "Tlahue", 5);
            grafo.addAristas("Tinaco", "Hoyos", 2);
            grafo.addAristas("Hoyos", "Tinaco", 2);
            grafo.addAristas("ITSOEH", "Hoyos", 2);
            grafo.addAristas("Hoyos", "ITSOEH", 2);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        
        llenarComboBox();
        llenarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Datos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txf_NombreNodo = new javax.swing.JTextField();
        btn_AddNodo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cmb_NodoOrigen = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cmb_NodoDestino = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        spn_PesoAristas = new javax.swing.JSpinner();
        btn_AddArista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Grafo");

        tbl_Datos.setBackground(new java.awt.Color(0, 0, 102));
        tbl_Datos.setForeground(new java.awt.Color(204, 255, 204));
        tbl_Datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbl_Datos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_DatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_Datos);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nodos"));

        jLabel1.setText("Nombre");

        txf_NombreNodo.setBackground(new java.awt.Color(153, 204, 255));

        btn_AddNodo.setBackground(new java.awt.Color(153, 153, 255));
        btn_AddNodo.setText("Añadir");
        btn_AddNodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddNodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txf_NombreNodo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_AddNodo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txf_NombreNodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_AddNodo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Aristas"));

        jLabel2.setText("Nodo origen");

        cmb_NodoOrigen.setBackground(new java.awt.Color(153, 204, 255));

        jLabel3.setText("Nodo destino");

        cmb_NodoDestino.setBackground(new java.awt.Color(153, 204, 255));

        jLabel4.setText("Peso");

        spn_PesoAristas.setModel(new javax.swing.SpinnerNumberModel(0L, null, null, 1L));
        spn_PesoAristas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_AddArista.setBackground(new java.awt.Color(153, 153, 255));
        btn_AddArista.setText("Añadir");
        btn_AddArista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddAristaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(cmb_NodoOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(spn_PesoAristas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_AddArista))
                        .addComponent(cmb_NodoDestino, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmb_NodoOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmb_NodoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spn_PesoAristas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_AddArista))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AddNodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddNodoActionPerformed
        if(!txf_NombreNodo.getText().equals("")){
            grafo.addNodo(txf_NombreNodo.getText());
            btn_AddArista.setEnabled(true);
        }
        else
            JOptionPane.showMessageDialog(rootPane, "No puedes insertar nodos vacíos");
        llenarComboBox();
    }//GEN-LAST:event_btn_AddNodoActionPerformed

    private void btn_AddAristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddAristaActionPerformed
        try {
            grafo.addAristas(
                    String.valueOf(cmb_NodoOrigen.getSelectedItem()),
                    String.valueOf(cmb_NodoDestino.getSelectedItem()),
                    Long.parseLong(String.valueOf(spn_PesoAristas.getValue())));
            llenarTabla();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_btn_AddAristaActionPerformed

    private void tbl_DatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_DatosMouseClicked
        int rowAtPoint = tbl_Datos.rowAtPoint(evt.getPoint());
        int columnAtPoint = tbl_Datos.columnAtPoint(evt.getPoint());
        switch(columnAtPoint){
            case 0:
                cmb_NodoOrigen.setSelectedItem(model.getValueAt(rowAtPoint,0));
                break;
            case 1:
                cmb_NodoDestino.setSelectedItem(model.getValueAt(rowAtPoint,1));
                break;
            case 2:
                spn_PesoAristas.setValue(Long.parseLong(String.valueOf(model.getValueAt(rowAtPoint,2))));
        }
    }//GEN-LAST:event_tbl_DatosMouseClicked

    private void llenarComboBox(){
        ArrayList<Nodo> nodos = grafo.getNodos();
        cmb_NodoOrigen.removeAllItems();
        cmb_NodoDestino.removeAllItems();
        for(Nodo nodo : nodos){
            cmb_NodoOrigen.addItem(nodo.getNombre());
            cmb_NodoDestino.addItem(nodo.getNombre());
        }
    }
    
    private void llenarTabla(){
        ArrayList<Nodo> nodos = grafo.getNodos();
            model.setNumRows(0);
            for(Nodo nodo : nodos){
                ArrayList<Arista> aristas = nodo.getAristas();
                for(Arista arista : aristas){
                    String[] toArray = arista.toArray();
                    model.addRow(new String[]{nodo.getNombre(),toArray[0],toArray[1]});
                }
            }
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
            java.util.logging.Logger.getLogger(Frm_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AddArista;
    private javax.swing.JButton btn_AddNodo;
    private javax.swing.JComboBox<String> cmb_NodoDestino;
    private javax.swing.JComboBox<String> cmb_NodoOrigen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spn_PesoAristas;
    private javax.swing.JTable tbl_Datos;
    private javax.swing.JTextField txf_NombreNodo;
    // End of variables declaration//GEN-END:variables
}
