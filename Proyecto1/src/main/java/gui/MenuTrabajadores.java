/*
 * Metodo para cargar la tabla de la base de datos
 */
package gui;

import forms.*;

/**
 * @author jeffrey
 */
public class MenuTrabajadores extends javax.swing.JFrame {

    public static String nombre_tienda;

    /**
     * Crea form MenuTrabajadores
     */
    public MenuTrabajadores() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btTiempo = new javax.swing.JButton();
        btCargar = new javax.swing.JButton();
        btVentas = new javax.swing.JButton();
        btUsuarios = new javax.swing.JButton();
        btTienda = new javax.swing.JButton();
        btPedidos = new javax.swing.JButton();
        btProductos = new javax.swing.JButton();
        btReportes = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btCambiarTienda = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(233, 150, 254));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        jButton9.setBackground(new java.awt.Color(102, 153, 255));
        jButton9.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(49, 66, 82));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(102, 153, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 527, 850, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoAzul.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 331, -1));

        btTiempo.setBackground(new java.awt.Color(102, 153, 255));
        btTiempo.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        btTiempo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiempoentretiendas.png"))); // NOI18N
        btTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTiempoActionPerformed(evt);
            }
        });
        jPanel1.add(btTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 130, 120));

        btCargar.setBackground(new java.awt.Color(102, 153, 255));
        btCargar.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 13)); // NOI18N
        btCargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cargarinfo.png"))); // NOI18N
        btCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCargarActionPerformed(evt);
            }
        });
        jPanel1.add(btCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, 130, 120));

        btVentas.setBackground(new java.awt.Color(102, 153, 255));
        btVentas.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        btVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventas.png"))); // NOI18N
        btVentas.setToolTipText("");
        btVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVentasActionPerformed(evt);
            }
        });
        jPanel1.add(btVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 130, 120));

        btUsuarios.setBackground(new java.awt.Color(102, 153, 255));
        btUsuarios.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        btUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuariosyclientes.png"))); // NOI18N
        btUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUsuariosActionPerformed(evt);
            }
        });
        jPanel1.add(btUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, 130, 120));

        btTienda.setBackground(new java.awt.Color(102, 153, 255));
        btTienda.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        btTienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tienda.png"))); // NOI18N
        btTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTiendaActionPerformed(evt);
            }
        });
        jPanel1.add(btTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 130, 120));

        btPedidos.setBackground(new java.awt.Color(102, 153, 255));
        btPedidos.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        btPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pedidos.png"))); // NOI18N
        btPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPedidosActionPerformed(evt);
            }
        });
        jPanel1.add(btPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 130, 120));

        btProductos.setBackground(new java.awt.Color(102, 153, 255));
        btProductos.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        btProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/productos.png"))); // NOI18N
        btProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProductosActionPerformed(evt);
            }
        });
        jPanel1.add(btProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 130, 120));

        btReportes.setBackground(new java.awt.Color(102, 153, 255));
        btReportes.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        btReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reportes.png"))); // NOI18N
        btReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReportesActionPerformed(evt);
            }
        });
        jPanel1.add(btReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 130, 120));

        jLabel9.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Menu");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, -1, -1));

        btCambiarTienda.setBackground(new java.awt.Color(102, 153, 255));
        btCambiarTienda.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 13)); // NOI18N
        btCambiarTienda.setForeground(new java.awt.Color(255, 255, 255));
        btCambiarTienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cambiartienda.png"))); // NOI18N
        btCambiarTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCambiarTiendaActionPerformed(evt);
            }
        });
        jPanel1.add(btCambiarTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, 90, 90));

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
    * Metodo para ingresar tiempo
     */
    private void btTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTiempoActionPerformed
        MenuTiempos ingresarTiempo = new MenuTiempos();
        ingresarTiempo.obtenerTiendaActual(nombre_tienda);
        ingresarTiempo.setVisible(true);

    }//GEN-LAST:event_btTiempoActionPerformed
    /*
    * Metodo para cargar archivos
     */
    private void btCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCargarActionPerformed
        CargarArchivos archivos = new CargarArchivos();
        archivos.setVisible(true);
    }//GEN-LAST:event_btCargarActionPerformed
    /*
    * Metodo para ingresar ventas
     */
    private void btVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVentasActionPerformed
        ingresoVentas ventas = new ingresoVentas();
        ventas.obtenerTiendaActual(nombre_tienda);
        ventas.setVisible(true);
    }//GEN-LAST:event_btVentasActionPerformed
    /*
    * Metodo para ingresar usuarios
     */
    private void btUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUsuariosActionPerformed
        MenuUsuarios ingresousuarios = new MenuUsuarios();
        ingresousuarios.setVisible(true);
    }//GEN-LAST:event_btUsuariosActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

    }//GEN-LAST:event_jButton9ActionPerformed

    /*
    * Metodo para ingresar tiendas
     */
    private void btTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTiendaActionPerformed
        MenuTiendas ingresarTienda = new MenuTiendas();
        ingresarTienda.setVisible(true);

    }//GEN-LAST:event_btTiendaActionPerformed
    /*
    * Metodo para ingresar pedidos
     */
    private void btPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPedidosActionPerformed
        MenuPedidos ingresoPedido = new MenuPedidos();
        ingresoPedido.obtenerTiendaActual(nombre_tienda);
        ingresoPedido.setVisible(true);
    }//GEN-LAST:event_btPedidosActionPerformed
    /*
    * Metodo para ingresar productos
     */
    private void btProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProductosActionPerformed
        MenuProductos ingresoproductos = new MenuProductos();
        ingresoproductos.obtenerTiendaActual(nombre_tienda);
        ingresoproductos.setVisible(true);
    }//GEN-LAST:event_btProductosActionPerformed
    /*
    * Metodo para ingresar reportes
     */
    private void btReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReportesActionPerformed
        MenuReportes a = new MenuReportes();
        a.obtenerTiendaActual(nombre_tienda);
        a.setVisible(true);
    }//GEN-LAST:event_btReportesActionPerformed
    /*
    * Metodo para cargar datos al iniciar form
     */
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        if (nombre_tienda.equals("Cargar datos")) {
            btTienda.setEnabled(false);
            btTiempo.setEnabled(false);
            btProductos.setEnabled(false);
            btUsuarios.setEnabled(false);
            btVentas.setEnabled(false);
            btPedidos.setEnabled(false);
            btReportes.setEnabled(false);
        } else {
            btTienda.setEnabled(true);
            btTiempo.setEnabled(true);
            btProductos.setEnabled(true);
            btUsuarios.setEnabled(true);
            btVentas.setEnabled(true);
            btPedidos.setEnabled(true);
            btReportes.setEnabled(true);
        }
    }//GEN-LAST:event_formComponentShown
    /*
    * Metodo para trabajadores ingresados
     */
    private void btCambiarTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCambiarTiendaActionPerformed
        Trabajadores JframeTrabajadores = new Trabajadores();
        JframeTrabajadores.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btCambiarTiendaActionPerformed
    /*
    * Metodo para obtener tienda actual
     */
    public void obtenerTiendaActual(String tienda) {
        nombre_tienda = tienda;
    }

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
            java.util.logging.Logger.getLogger(MenuTrabajadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuTrabajadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuTrabajadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuTrabajadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuTrabajadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCambiarTienda;
    private javax.swing.JButton btCargar;
    private javax.swing.JButton btPedidos;
    private javax.swing.JButton btProductos;
    private javax.swing.JButton btReportes;
    private javax.swing.JButton btTiempo;
    private javax.swing.JButton btTienda;
    private javax.swing.JButton btUsuarios;
    private javax.swing.JButton btVentas;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
