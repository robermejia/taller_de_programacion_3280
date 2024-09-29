
package Proyecto_Empresa_Software_Technology;

public class Listado_Software extends javax.swing.JFrame {


    public Listado_Software() {
        initComponents();
        //CENTRADO DE VENTANA
        this.setLocationRelativeTo(null);
        llena();      
    }
    void llena(){
        lstLista.removeAllItems();
        lstLista.addItem("--Elegir--");
        lstLista.addItem("Web");
        lstLista.addItem("Móviles");
        lstLista.addItem("Juegos");
        lstLista.addItem("Comercial");       
    }
    
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        txtResList = new javax.swing.JTextArea();
        btnSalir = new javax.swing.JButton();
        lstLista = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnMostrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResList.setEditable(false);
        txtResList.setColumns(20);
        txtResList.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtResList.setRows(5);
        jScrollPane2.setViewportView(txtResList);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 470, 220));

        btnSalir.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSalir.setText("REGRESAR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 470, -1, -1));

        lstLista.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lstLista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(lstLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 162, 280, 40));

        jPanel1.setBackground(new java.awt.Color(51, 0, 255));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Elige una opción:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 160, -1));

        btnMostrar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnMostrar.setText("MOSTRAR");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("LISTADO DE SOFTWARE");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Menu_Principal newMantenimiento = new Menu_Principal();
        newMantenimiento.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
       
        String mensaje2;
        int orderList=lstLista.getSelectedIndex();
        switch(orderList){
            case 1: txtResList.setText(mensaje2= "Tipo: "+Menu_Principal.softTipo[0]+
                                                 "\nPrecio: "+Menu_Principal.softPrecio[0]+" $"+
                                                 "\nEspacio: "+Menu_Principal.softEspacio[0]+" MB"+
                                                 "\nLenguaje: "+Menu_Principal.softLenguaje[0]
                                                );                   
            break;
            case 2: txtResList.setText(mensaje2="Tipo: "+Menu_Principal.softTipo[1]+
                                                 "\nPrecio: "+Menu_Principal.softPrecio[1]+" $"+
                                                 "\nEspacio: "+Menu_Principal.softEspacio[1]+" MB"+
                                                 "\nLenguaje: "+Menu_Principal.softLenguaje[1]
                                                );       
            break;
            case 3: txtResList.setText(mensaje2="Tipo: "+Menu_Principal.softTipo[2]+
                                                 "\nPrecio: "+Menu_Principal.softPrecio[2]+" $"+
                                                 "\nEspacio: "+Menu_Principal.softEspacio[2]+" MB"+
                                                 "\nLenguaje: "+Menu_Principal.softLenguaje[2]
                                                );       
            break;
            case 4: txtResList.setText(mensaje2="Tipo: "+Menu_Principal.softTipo[3]+
                                                 "\nPrecio: "+Menu_Principal.softPrecio[3]+" $"+
                                                 "\nEspacio: "+Menu_Principal.softEspacio[3]+" MB"+
                                                 "\nLenguaje: "+Menu_Principal.softLenguaje[3]
                                                );   
            break;        
        }
        
    }//GEN-LAST:event_btnMostrarActionPerformed

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
            java.util.logging.Logger.getLogger(Listado_Software.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Listado_Software.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Listado_Software.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Listado_Software.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Listado_Software().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> lstLista;
    private javax.swing.JTextArea txtResList;
    // End of variables declaration//GEN-END:variables
}
