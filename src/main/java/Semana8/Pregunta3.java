package Semana8;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
public class Pregunta3 extends javax.swing.JFrame {

    public Pregunta3() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Préstamos a Clientes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNumeroClientes = new javax.swing.JTextField();
        btnProceso = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRes = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("PRESTAMOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));

        jLabel2.setText("NÚMEROS DE CLIENTES: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        txtNumeroClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroClientesActionPerformed(evt);
            }
        });
        jPanel1.add(txtNumeroClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 270, -1));

        btnProceso.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnProceso.setText("PROCESO");
        btnProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesoActionPerformed(evt);
            }
        });
        jPanel1.add(btnProceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, -1, -1));

        txtRes.setColumns(20);
        txtRes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtRes.setRows(5);
        jScrollPane1.setViewportView(txtRes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 570, 260));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesoActionPerformed
        try {
            int numClientes = Integer.parseInt(txtNumeroClientes.getText());
            txtRes.setText(""); // Limpiar el área de texto antes de agregar nuevos resultados

            java.util.Random random = new java.util.Random();
            java.text.DecimalFormat df = new java.text.DecimalFormat("#.##");

            for (int i = 1; i <= numClientes; i++) {
                int prestamo = random.nextInt(3501) + 500; // Generar préstamos entre 500 y 4000
                double interes;
                if (prestamo <= 1500) {
                    interes = prestamo * 0.08;
                } else if (prestamo <= 2500) {
                    interes = prestamo * 0.10;
                } else {
                    interes = prestamo * 0.12;
                }
                txtRes.append("Cliente " + i + ": Préstamo de $" + prestamo + " - Interés a pagar: $" 
                                        + df.format(interes) + "\n");
            }
        } catch (NumberFormatException ex) {
            txtRes.setText("Error: Ingrese un número válido de clientes.");
        }
    }//GEN-LAST:event_btnProcesoActionPerformed

    private void txtNumeroClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroClientesActionPerformed

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
            java.util.logging.Logger.getLogger(Pregunta3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pregunta3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pregunta3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pregunta3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Pregunta3().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProceso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtNumeroClientes;
    private javax.swing.JTextArea txtRes;
    // End of variables declaration//GEN-END:variables
}
