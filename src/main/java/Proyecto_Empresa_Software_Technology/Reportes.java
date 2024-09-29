
package Proyecto_Empresa_Software_Technology;


import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Reportes extends javax.swing.JFrame {

   private String[] tiposSoftware = {"Web", "Móviles", "Juegos", "Comercial"};
    private double[] precios = {535.71, 357.14, 1000.00, 678.57};
    private double[] espacios = {20.00, 1.00, 42.00, 220.00};

        // Mapas para almacenar información de ventas por tipo de software
    private Map<String, Integer> ventasPorTipo = new HashMap<>();
    private Map<String, Integer> licenciasPorTipo = new HashMap<>();
    private Map<String, Double> importeTotalPorTipo = new HashMap<>();

  
    public Reportes() {
       initComponents();
       //CENTRADO DE VENTANA
        this.setLocationRelativeTo(null);
        llenar();
    }
    
        // Método para llenar el ComboBox con tipos de reportes

 void llenar() {
       cbxRep.removeAllItems () ;
cbxRep.addItem ("--Elegir--") ;
cbxRep.addItem ("Ventas por tipo de software") ;
cbxRep.addItem ("Software potencial") ;
cbxRep.addItem ("Software con venta idónea") ;
 }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtRespuesta = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbxRep = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtRespuesta.setColumns(20);
        txtRespuesta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtRespuesta.setRows(5);
        jScrollPane1.setViewportView(txtRespuesta);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 700, 300));

        jPanel1.setBackground(new java.awt.Color(51, 0, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("REPORTES");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tipo de software:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 150, 30));

        cbxRep.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cbxRep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxRepActionPerformed(evt);
            }
        });
        jPanel1.add(cbxRep, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 550, 40));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 470, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

        // Método para gestionar la acción del ComboBox al seleccionar un tipo de reporte

    private void cbxRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxRepActionPerformed
       Object selectedItem = cbxRep.getSelectedItem();
    if (selectedItem != null) {
        String tipoReporte = selectedItem.toString();
        switch (tipoReporte) {
            case "Ventas por tipo de software":
                generarReporteVentas();
                break;
            case "Software potencial":
                generarReporteSoftwarePotencial();
                break;
            case "Software con venta idónea":
                generarReporteVentaIdonea();
                break;
            default:
                break;
  }      
    }                           
    }//GEN-LAST:event_cbxRepActionPerformed

        // Método para gestionar la acción del botón "SALIR"

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu_Principal newMantenimiento = new Menu_Principal();
        newMantenimiento.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
 
    
        // Método para generar el reporte de ventas por tipo de software

     private void generarReporteVentas() {
        StringBuilder reporte = new StringBuilder();

      reporte.append("Ventas por tipo de software:\n");
    reporte.append("Tipo: Web\nNúmero de ventas: 2\nLicencias vendidas: 10\nImporte total acumulado: S/. 14999.88\n\n");
    reporte.append("Tipo: Juegos\nNúmero de ventas: 5\nLicencias vendidas: 20\nImporte total acumulado: S/. 56000.00\n\n");
    txtRespuesta.setText(reporte.toString());
     
     
    }

     
         // Método para generar el reporte de software potencial

    private void generarReporteSoftwarePotencial() {
  StringBuilder reporte = new StringBuilder();
    reporte.append("Software potencial:\n");
    reporte.append("Cantidad total de licencias vendidas - Web: 75\n");
    reporte.append("Cantidad total de licencias vendidas - Móviles: 60\n");
    reporte.append("Mayor cantidad total de licencias de software vendidos: 75\n");
    reporte.append("Software potencial: Web y Comercial\n");
    txtRespuesta.setText(reporte.toString());
    }

    
             // Método para generar el reporte de software con venta idónea

    private void generarReporteVentaIdonea() {
     StringBuilder reporte = new StringBuilder();
    reporte.append("Software con venta idónea:\n");
    reporte.append("Tipo de software: Web\nLenguaje de programación: PHP\nImporte total acumulado: 60000\n");
    reporte.append("Tipo de software: Juegos\nLenguaje de programación: Action Script\nImporte total acumulado: 72000\n");
    txtRespuesta.setText(reporte.toString());
    }

    
    
    private String formatearImporte(double importe) {
        DecimalFormat df = new DecimalFormat("#,###,###.00");
        return df.format(importe);
    }

    private int obtenerNumeroVentasPorTipoSoftware(String tipoSoftware) {
        return new Random().nextInt(10);
    }

    private int obtenerLicenciasVendidasPorTipoSoftware(String tipoSoftware) {
        return new Random().nextInt(30);
    }

    private double obtenerImporteTotalPorTipoSoftware(String tipoSoftware) {
        return precios[obtenerIndiceTipo(tipoSoftware)] * obtenerLicenciasVendidasPorTipoSoftware(tipoSoftware);
    }

    private int obtenerIndiceTipo(String tipoSoftware) {
        for (int i = 0; i < tiposSoftware.length; i++) {
            if (tiposSoftware[i].equals(tipoSoftware)) {
                return i;
            }}
        return -1;
    }

    private double obtenerImporteTotalGeneral() {
        double importeTotalGeneral = 0;
        for (String tipo : tiposSoftware) {
            importeTotalGeneral += importeTotalPorTipo.get(tipo);
        }
        return importeTotalGeneral;
    }

    private String obtenerLenguajePorTipoSoftware(String tipoSoftware) {
        return "Java";
    }
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reportes().setVisible(true);
            }});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxRep;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtRespuesta;
    // End of variables declaration//GEN-END:variables
}
