/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizinversa;

/**
 *
 * @author Santos
 */
public class PanelMatrizInversa extends javax.swing.JFrame {

    /**
     * Creates new form PanelMatrizInversa
     */
    public PanelMatrizInversa() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonCrearMatriz = new javax.swing.JButton();
        jButtonLimpiarMatriz = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaMatrizInversa = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablaMatriz = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jButtonInversaMatriz1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Introduzca los valores de la matriz:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 280, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Matriz inversa:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 160, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Tamaño de la matriz:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 160, 30));

        jButtonCrearMatriz.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonCrearMatriz.setText("Crear matriz");
        getContentPane().add(jButtonCrearMatriz, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 127, -1));

        jButtonLimpiarMatriz.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonLimpiarMatriz.setText("Limpiar tabla");
        jButtonLimpiarMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarMatrizActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLimpiarMatriz, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 78, 14));

        jTablaMatrizInversa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTablaMatrizInversa);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 410, 130));

        jTablaMatriz.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTablaMatriz);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 410, 130));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setText("                 Matriz Inversa");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 40));

        jButtonInversaMatriz1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonInversaMatriz1.setText("Inversa de la matriz");
        jButtonInversaMatriz1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInversaMatriz1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInversaMatriz1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButtonLimpiarMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarMatrizActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLimpiarMatrizActionPerformed

    private void jButtonInversaMatriz1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInversaMatriz1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonInversaMatriz1ActionPerformed

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
            java.util.logging.Logger.getLogger(PanelMatrizInversa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelMatrizInversa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelMatrizInversa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelMatrizInversa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelMatrizInversa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCrearMatriz;
    private javax.swing.JButton jButtonInversaMatriz1;
    private javax.swing.JButton jButtonLimpiarMatriz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablaMatriz;
    private javax.swing.JTable jTablaMatrizInversa;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
