/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import javax.swing.JOptionPane;

/**
 *
 * @author Manlio Tejeda Gutie
 */
public class menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButtonadq = new javax.swing.JRadioButton();
        jRadioButtonusuario = new javax.swing.JRadioButton();
        jRadioButtonprestamo = new javax.swing.JRadioButton();
        jRadioButtonbaja = new javax.swing.JRadioButton();
        jRadioButtonreportes = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jRadioButtonreportes1 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        jLabel3.setText("Biblioteca La Sabiduria");

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel1.setText("Bienvenido Administrador ¿que deseas hacer?");

        buttonGroup1.add(jRadioButtonadq);
        jRadioButtonadq.setText("Adquisicion");

        buttonGroup1.add(jRadioButtonusuario);
        jRadioButtonusuario.setText("Registrar usuario");

        buttonGroup1.add(jRadioButtonprestamo);
        jRadioButtonprestamo.setText("Prestamo a usuario");

        buttonGroup1.add(jRadioButtonbaja);
        jRadioButtonbaja.setText("Baja");

        buttonGroup1.add(jRadioButtonreportes);
        jRadioButtonreportes.setText("Reportes Y Estadisticas");

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("x");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonreportes1);
        jRadioButtonreportes1.setText("devoluciones");
        jRadioButtonreportes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonreportes1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonusuario)
                            .addComponent(jRadioButtonprestamo)
                            .addComponent(jRadioButtonbaja)
                            .addComponent(jRadioButtonreportes)
                            .addComponent(jRadioButtonadq)
                            .addComponent(jRadioButtonreportes1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jButton1)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addComponent(jRadioButtonadq)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonusuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonprestamo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonbaja)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonreportes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonreportes1)
                .addGap(59, 59, 59)
                .addComponent(jButton1)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jRadioButtonadq.isSelected()) {
            adquisiciones a = new adquisiciones();
            a.setVisible(true);
            this.dispose();
            JOptionPane.showMessageDialog(null, "NOTA: en este apartado para el caso de ser una compra coloque un 0 en el ISBN \n");
            JOptionPane.showMessageDialog(null, "NOTA: en este apartado para el caso de ser un canje llene en el formulario los datos de el libro a comprar\n");
        } else {
            if (jRadioButtonprestamo.isSelected()) {
                Prestamos a = new Prestamos();
                a.setVisible(true);
                this.dispose();
                JOptionPane.showMessageDialog(null, "Tiene la posibilidad de buscar el codigo a prestar segun el nombre o el codigo ISBN");
            } else {

                if (jRadioButtonusuario.isSelected()) {
                    usuarios a = new usuarios();
                    a.setVisible(true);
                    this.dispose();
                } else {
                    if (jRadioButtonbaja.isSelected()) {
                        baja a = new baja();
                        a.setVisible(true);
                        this.dispose();

                    } else {
                        if (jRadioButtonreportes.isSelected()) {
                            reportes a = new reportes();
                            a.setVisible(true);
                            this.dispose();
                        } else {

                            if (jRadioButtonreportes1.isSelected()) {
                                NewJFrame a = new NewJFrame();
                                a.setVisible(true);
                                this.dispose();
                            }
                        }

                    }
                }

            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButtonreportes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonreportes1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonreportes1ActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButtonadq;
    private javax.swing.JRadioButton jRadioButtonbaja;
    private javax.swing.JRadioButton jRadioButtonprestamo;
    private javax.swing.JRadioButton jRadioButtonreportes;
    private javax.swing.JRadioButton jRadioButtonreportes1;
    private javax.swing.JRadioButton jRadioButtonusuario;
    // End of variables declaration//GEN-END:variables
}
