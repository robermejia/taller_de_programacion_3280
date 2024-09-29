package Proyecto_Empresa_Software_Technology;

import javax.swing.JOptionPane;

// Clase principal de modificación de software
public class Modificar_Software extends javax.swing.JFrame {

// Datos para almacenar información sobre tipos de software
    private String[] tiposSoftware = {"Web", "Móviles", "Juegos", "Comercial"};
    private double[] precios = {535.71, 357.14, 1000.00, 678.57};
    private double[] espacios = {20.00, 1.00, 42.00, 220.00};

// Constructor de la clase
    public Modificar_Software() {
        initComponents();
//centrado de ventana
        this.setLocationRelativeTo(null);
         llenar();
    }

// Método para llenar el ComboBox con tipos de software por codigo
    void llenar() {
        cbxTsoftware1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"--Elegir--"}));
        cbxTsoftware1.addItem("Web");
        cbxTsoftware1.addItem("Móviles");
        cbxTsoftware1.addItem("Juegos");
        cbxTsoftware1.addItem("Comercial");
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbxTsoftware1 = new javax.swing.JComboBox<>();
        btnSalir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tipo de software:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 170, -1));

        cbxTsoftware1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cbxTsoftware1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxTsoftware1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTsoftware1ActionPerformed(evt);
            }
        });
        getContentPane().add(cbxTsoftware1, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 180, 190, -1));

        btnSalir.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 460, -1, -1));

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Espacio que ocupa el software:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 260, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Precio del software en dólares:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 270, -1));

        jPanel1.setBackground(new java.awt.Color(51, 0, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("MODIFICAR SOFTWARE");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, -1));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 190, -1));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 190, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void s() {
        jLabel1 = new javax.swing.JLabel();
        cbxTsoftware1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Tipo de software");
        cbxTsoftware1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTsoftware1ActionPerformed(evt);
            }});

        btnSalir.setText("SALIR");
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }});

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        jLabel2.setText("Espacio que ocupa el software");
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        jLabel3.setText("Precio del software en dólares");
    }
 
// Método para gestionar la acción del ComboBox al seleccionar un tipo de software
    private void cbxTsoftware1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTsoftware1ActionPerformed

 String tipoSeleccionado = cbxTsoftware1.getSelectedItem().toString();
        int indiceSeleccionado = cbxTsoftware1.getSelectedIndex();

// Actualiza los campos con los valores correspondientes al tipo de software seleccionado
        if (indiceSeleccionado > 0) {
            jTextField1.setText(String.valueOf(precios[indiceSeleccionado - 1]));
            jTextField2.setText(String.valueOf(espacios[indiceSeleccionado - 1]));
        } else {
            jTextField1.setText("");
            jTextField2.setText("");
        }
                                                

    }//GEN-LAST:event_cbxTsoftware1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed
   
    // Método para gestionar la acción del botón "SALIR"
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Menu_Principal newMantenimiento = new Menu_Principal();
        newMantenimiento.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    // Metodo que gestiona el boton para guardar los cambios 
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String tipoSeleccionado = cbxTsoftware1.getSelectedItem().toString();
        int indiceSeleccionado = cbxTsoftware1.getSelectedIndex();

// Verifica si se ha seleccionado un tipo de software
        if (indiceSeleccionado > 0) {
            try {
                
 // Intenta obtener los nuevos valores de precio y espacio
                double nuevoPrecio = Double.parseDouble(jTextField1.getText());
                double nuevoEspacio = Double.parseDouble(jTextField2.getText());

// Actualiza los valores en los arrays
                precios[indiceSeleccionado - 1] = nuevoPrecio;
                espacios[indiceSeleccionado - 1] = nuevoEspacio;

// Muestra los mensajes al presionar el boton de Guardar.
                JOptionPane.showMessageDialog(this, "Cambios guardados exitosamente.");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese valores numéricos.");
            }} else {
            JOptionPane.showMessageDialog(this, "Seleccione un tipo de software primero.");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modificar_Software().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbxTsoftware1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
