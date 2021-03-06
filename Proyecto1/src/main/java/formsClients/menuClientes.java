/*
 * Paquetes
 */
package formsClients;

/*
 * Metodo para cargar la tabla de la base de datos
 */
import gui.MainFrame;

/**
 * @author jeffrey
 */
public class menuClientes extends javax.swing.JFrame {

    /**
     * Crea form menuClientes
     */
    public menuClientes() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btTiempo = new javax.swing.JButton();
        btTienda = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btCambiarTienda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(49, 66, 82));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(229, 151, 253));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 580, 30));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoMorado.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 331, -1));

        btTiempo.setBackground(new java.awt.Color(229, 151, 253));
        btTiempo.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        btTiempo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Rastreo.png"))); // NOI18N
        btTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTiempoActionPerformed(evt);
            }
        });
        jPanel1.add(btTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 130, 120));

        btTienda.setBackground(new java.awt.Color(229, 151, 253));
        btTienda.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        btTienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/catalogo.png"))); // NOI18N
        btTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTiendaActionPerformed(evt);
            }
        });
        jPanel1.add(btTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 130, 120));

        jLabel9.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Menu");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        btCambiarTienda.setBackground(new java.awt.Color(229, 151, 253));
        btCambiarTienda.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 13)); // NOI18N
        btCambiarTienda.setForeground(new java.awt.Color(255, 255, 255));
        btCambiarTienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/volvermenu.png"))); // NOI18N
        btCambiarTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCambiarTiendaActionPerformed(evt);
            }
        });
        jPanel1.add(btCambiarTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 90, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
    * Metodo para ver el catalogo de productos
     */
    private void btTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTiendaActionPerformed
        catalogoProductos a = new catalogoProductos();
        a.setVisible(true);
    }//GEN-LAST:event_btTiendaActionPerformed
    /*
    * Metodo para cambiar de tienda
     */
    private void btCambiarTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCambiarTiendaActionPerformed
        MainFrame a = new MainFrame();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btCambiarTiendaActionPerformed
    /*
    * Metodo para ver el rastreo de pedidos
     */
    private void btTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTiempoActionPerformed
        rastreoPedidos a = new rastreoPedidos();
        a.setVisible(true);
    }//GEN-LAST:event_btTiempoActionPerformed

    /**
     * @param args main
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
            java.util.logging.Logger.getLogger(menuClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCambiarTienda;
    private javax.swing.JButton btTiempo;
    private javax.swing.JButton btTienda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
