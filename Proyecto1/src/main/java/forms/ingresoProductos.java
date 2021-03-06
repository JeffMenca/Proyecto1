/*
 * Paquetes
 */
package forms;

/*
 * imports
 */
import DBsql.DbConnection;
import javax.swing.JOptionPane;

/**
 * @author jeffrey
 */
public class ingresoProductos extends javax.swing.JFrame {

    public static String nombre_tienda;

    /**
     * Crea form ingresoProductos
     */
    public ingresoProductos() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tbnombre = new javax.swing.JTextField();
        tbfabricante = new javax.swing.JTextField();
        tbcodigo = new javax.swing.JTextField();
        tbdescripcion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        ftprecio = new javax.swing.JFormattedTextField();
        ftgarantia = new javax.swing.JFormattedTextField();
        ftcantidad = new javax.swing.JFormattedTextField();

        jPanel1.setBackground(new java.awt.Color(49, 66, 82));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(49, 255, 245));

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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 558, 640, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoCeleste.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 331, -1));

        jLabel2.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("*");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 20, 30));

        jLabel3.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fabricante");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, 40));

        jLabel4.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Codigo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, 30));

        jLabel5.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cantidad");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, -1, 30));

        jLabel6.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Descripcion");
        jLabel6.setToolTipText("");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, -1, 50));

        jLabel7.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Precio");
        jLabel7.setToolTipText("");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, -1, 30));

        jLabel8.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Garantia (meses)");
        jLabel8.setToolTipText("");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, -1, 30));

        tbnombre.setBackground(new java.awt.Color(255, 255, 255));
        tbnombre.setFont(new java.awt.Font("Droid Sans Mono Slashed", 0, 12)); // NOI18N
        tbnombre.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(tbnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 240, -1));

        tbfabricante.setBackground(new java.awt.Color(255, 255, 255));
        tbfabricante.setFont(new java.awt.Font("Droid Sans Mono Slashed", 0, 12)); // NOI18N
        tbfabricante.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(tbfabricante, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 240, -1));

        tbcodigo.setBackground(new java.awt.Color(255, 255, 255));
        tbcodigo.setFont(new java.awt.Font("Droid Sans Mono Slashed", 0, 12)); // NOI18N
        tbcodigo.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(tbcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 240, -1));

        tbdescripcion.setBackground(new java.awt.Color(255, 255, 255));
        tbdescripcion.setFont(new java.awt.Font("Droid Sans Mono Slashed", 0, 12)); // NOI18N
        tbdescripcion.setForeground(new java.awt.Color(0, 0, 0));
        tbdescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbdescripcionActionPerformed(evt);
            }
        });
        jPanel1.add(tbdescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 240, -1));

        jLabel9.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ingreso de Productos");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        jLabel10.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 51));
        jLabel10.setText("*=Obligatorio");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, -1, -1));

        jLabel11.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 51, 51));
        jLabel11.setText("*");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 30, 40));

        jLabel13.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 51, 51));
        jLabel13.setText("*");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 30, 30));

        jLabel14.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 51, 51));
        jLabel14.setText("*");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 30, 30));

        jLabel12.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Nombre");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ingresar");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 255, 245), 3));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, 110, 40));

        jLabel15.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 51, 51));
        jLabel15.setText("*");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 30, 30));

        ftprecio.setBackground(new java.awt.Color(255, 255, 255));
        ftprecio.setForeground(new java.awt.Color(0, 0, 0));
        ftprecio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jPanel1.add(ftprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 240, 30));

        ftgarantia.setBackground(new java.awt.Color(255, 255, 255));
        ftgarantia.setForeground(new java.awt.Color(0, 0, 0));
        ftgarantia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jPanel1.add(ftgarantia, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 240, 30));

        ftcantidad.setBackground(new java.awt.Color(255, 255, 255));
        ftcantidad.setForeground(new java.awt.Color(0, 0, 0));
        ftcantidad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jPanel1.add(ftcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 240, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 634, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void tbdescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbdescripcionActionPerformed

    }//GEN-LAST:event_tbdescripcionActionPerformed

    /*
    * Metodo para ingresar productos
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if ((tbcodigo.getText().equals("")) || (tbnombre.getText().equals("")) || (tbfabricante.getText().equals("")) || (ftcantidad.getText().equals("")) || (ftprecio.getText().equals(""))) {
            JOptionPane.showMessageDialog(null, "Faltan ingresar los datos obligatorios");
        } else {
            String codigo = tbcodigo.getText();
            String nombre = tbnombre.getText();
            String fabricante = tbfabricante.getText();
            int cantidad = Integer.parseInt(ftcantidad.getText());
            Double precio = Double.parseDouble(ftprecio.getText());
            String descripcion = tbdescripcion.getText();
            int garantia;
            if (ftgarantia.getText().length() == 0) {
                garantia = 0;
            } else {
                garantia = Integer.parseInt(ftgarantia.getText());
            }
            String codigo_tienda = nombre_tienda;

            String query = ("INSERT INTO PRODUCTO VALUES('" + codigo + "','" + nombre + "','" + fabricante + "','" + cantidad + "','" + precio + "','" + descripcion + "','" + garantia + "','" + codigo_tienda + "')");
            DbConnection a = new DbConnection();
            a.Insert(query);
            JOptionPane.showMessageDialog(null, "Producto ingresado correctamente");
            tbcodigo.setText("");
            tbnombre.setText("");
            tbfabricante.setText("");
            ftcantidad.setText("");
            ftprecio.setText("");
            tbdescripcion.setText("");
            ftgarantia.setText("");

        }

    }//GEN-LAST:event_jButton1ActionPerformed
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
            java.util.logging.Logger.getLogger(ingresoProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ingresoProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ingresoProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ingresoProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ingresoProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField ftcantidad;
    private javax.swing.JFormattedTextField ftgarantia;
    private javax.swing.JFormattedTextField ftprecio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tbcodigo;
    private javax.swing.JTextField tbdescripcion;
    private javax.swing.JTextField tbfabricante;
    private javax.swing.JTextField tbnombre;
    // End of variables declaration//GEN-END:variables
}
