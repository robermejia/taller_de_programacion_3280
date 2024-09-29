package Proyecto_Empresa_Software_Technology;
public class Consulta_Software extends javax.swing.JFrame {
    
        // Datos para almacenar información sobre tipos de software

    private final String[] tiposSoftware = {"Web", "Móviles", "Juegos", "Comercial"};
    private final double[] precios = {535.71, 357.14, 1000.00, 678.57};
    private final double[] espacios = {20.00, 1.00, 42.00, 220.00};
    private final String[] lenguajes = {"PHP", "Java", "Action Script", "Visual Basic NET"};
    private final double[] descuentos = {2.5, 3.0, 6.2, 8.5};
    private final double precioDolar = 2.8;
    private final double unidadImpositivaTributaria = 700.00;

    
        // Constructor de la clase

    public Consulta_Software() {
        initComponents();
        //CENTRADO DE VENTANA
        this.setLocationRelativeTo(null);
        llenar();
        jTextField1.setEnabled(false);
        jTextField2.setEnabled(false);
        jTextField3.setEnabled(false);
    }
    
        // Método para llenar el ComboBox con tipos de software

 void llenar() {
       cbxTsoftware.removeAllItems () ;
cbxTsoftware.addItem ( "--Elegir--") ;
cbxTsoftware.addItem ( "Web") ;
cbxTsoftware.addItem ( "Móviles") ;
cbxTsoftware.addItem (  "Juegos") ;
cbxTsoftware.addItem (  "Comercial") ;
 }
 
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cbxTsoftware = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 470, -1, -1));

        jPanel1.setBackground(new java.awt.Color(51, 0, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("CONSULTAR SOFTWARE");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        cbxTsoftware.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cbxTsoftware.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxTsoftware.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTsoftwareActionPerformed(evt);
            }
        });
        jPanel1.add(cbxTsoftware, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 330, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Lenguaje de programación:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, -1, 30));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 290, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tipo de software:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 150, 22));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Precio del software en dólares:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, -1, 22));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 290, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Espacio que ocupa el software:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, -1, 22));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 320, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Método para gestionar la acción del ComboBox al seleccionar un tipo de software

    private void cbxTsoftwareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTsoftwareActionPerformed
     int indiceSeleccionado = cbxTsoftware.getSelectedIndex();
        if (indiceSeleccionado > 0) {
            jTextField1.setText(String.valueOf(precios[indiceSeleccionado - 1]));  
            jTextField2.setText(lenguajes[indiceSeleccionado - 1]);
            jTextField3.setText(String.valueOf(espacios[indiceSeleccionado - 1]));
        } else {
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
        }
    
                                            

    }//GEN-LAST:event_cbxTsoftwareActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
             Menu_Principal newMantenimiento = new Menu_Principal();
        newMantenimiento.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consulta_Software().setVisible(true);
            }});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxTsoftware;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
