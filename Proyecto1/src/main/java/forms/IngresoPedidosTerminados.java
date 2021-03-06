/*
 * Paquetes
 */
package forms;

import DBsql.DbConnection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

/**
 * @author jeffrey
 */
public class IngresoPedidosTerminados extends javax.swing.JFrame {

    public LocalDate fecha = LocalDate.now();
    public static String nombre_tienda;

    /**
     * Creates new form registrarPedido
     */
    public IngresoPedidosTerminados() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tbPedido = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tPedido = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        tbfecha = new javax.swing.JFormattedTextField();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(49, 66, 82));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoCeleste.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 16, 310, -1));

        jLabel15.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Pedido");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        tbPedido.setBackground(new java.awt.Color(255, 255, 255));
        tbPedido.setFont(new java.awt.Font("Droid Sans Mono Slashed", 0, 12)); // NOI18N
        tbPedido.setForeground(new java.awt.Color(0, 0, 0));
        tbPedido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbPedidoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbPedidoKeyTyped(evt);
            }
        });
        jPanel1.add(tbPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 320, -1));

        tPedido.setBackground(new java.awt.Color(255, 255, 255));
        tPedido.setForeground(new java.awt.Color(0, 0, 0));
        tPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Tienda origen", "Tienda destino", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tPedido);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 401, 234));

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Ingresar pedido terminado");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 255, 245), 3));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 259, 40));

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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 266, -1, -1));

        jPanel3.setBackground(new java.awt.Color(49, 255, 245));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 532, 600, -1));

        jLabel22.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Fecha");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel16.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("(año-mes-dia)");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        tbfecha.setBackground(new java.awt.Color(255, 255, 255));
        tbfecha.setForeground(new java.awt.Color(0, 0, 0));
        tbfecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        jPanel1.add(tbfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbPedidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbPedidoKeyPressed

    }//GEN-LAST:event_tbPedidoKeyPressed

    private void tbPedidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbPedidoKeyTyped

    }//GEN-LAST:event_tbPedidoKeyTyped

    /*
    * Metodo para ingresar pedido terminado
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (!tbfecha.getText().equals("")) {
            fecha = LocalDate.parse(tbfecha.getText());
        } else {
            fecha = LocalDate.now();
        }
        int row = tPedido.getSelectedRow();
        int codigoPedido = Integer.parseInt(tPedido.getModel().getValueAt(row, 0).toString());
        String codigo_tiendaorigen = tPedido.getModel().getValueAt(row, 1).toString();
        String codigo_tiendadestino = tPedido.getModel().getValueAt(row, 2).toString();
        String codigoTiempoEnvio = "";
        String Query = "SELECT ID FROM TIEMPO_ENTRE_TIENDAS WHERE ((tienda_origen='" + codigo_tiendaorigen + "' && tienda_destino='" + codigo_tiendadestino + "')||(tienda_destino='" + codigo_tiendaorigen + "' && tienda_origen='" + codigo_tiendadestino + "'))";
        DbConnection a = new DbConnection();
        ResultSet Result = a.Select(Query);
        try {
            while (Result.next()) {

                codigoTiempoEnvio = String.valueOf(Result.getObject("ID"));
            }

        } catch (Exception e) {
        }

        try {
            String query = ("INSERT INTO RECIBO VALUES('" + 0 + "','" + fecha + "','" + nombre_tienda + "','" + codigoPedido + "','" + Integer.parseInt(codigoTiempoEnvio) + "')");
            JOptionPane.showMessageDialog(null, "El pedido esta en la tienda, se genero correctamente");
            a = new DbConnection();
            a.Insert(query);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Aun no se ha registrado un tiempo entre tiendas de las tiendas seleccionadas");
        }


    }//GEN-LAST:event_jButton2ActionPerformed
    /*
    * Metodo al iniciar el form
     */
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        cargarTabla2();
        listenertbCantidad();
    }//GEN-LAST:event_formComponentShown
    /*
    * Metodo para cargar la tabla de la base de datos
     */
    public void cargarTabla2() {
        String filter = tbPedido.getText();
        String where = "";
        if (!filter.equals("")) {
            where = " WHERE codigo LIKE '%" + filter + "%'";
        } else {
            where = "";
        }
        DefaultTableModel model = new DefaultTableModel();
        model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tPedido.setModel(model);
        String Query = "SELECT codigo, codigo_tiendaorigen, codigo_tiendadestino, fecha FROM PEDIDO" + where;
        DbConnection a = new DbConnection();
        ResultSet Result = a.SelectOnComboBox(Query);

        try {
            ResultSetMetaData ResultMd = Result.getMetaData();
            int columnscount = ResultMd.getColumnCount();
            model.addColumn("Codigo");
            model.addColumn("Tienda origen");
            model.addColumn("Tienda destino");
            model.addColumn("Fecha");
            while (Result.next()) {
                Object[] rows = new Object[columnscount];
                for (int i = 0; i < columnscount; i++) {
                    rows[i] = Result.getObject(i + 1);
                }
                model.addRow(rows);

            }

        } catch (Exception e) {
        }
    }

    /*
    * Metodo listener para tbCantidad y cuando cambie su valor
     */
    public void listenertbCantidad() {
        tbPedido.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent de) {
                cargarTabla2();
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                cargarTabla2();
            }

            @Override
            public void changedUpdate(DocumentEvent de) {
                cargarTabla2();
            }
        });
    }

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
            java.util.logging.Logger.getLogger(IngresoPedidosTerminados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresoPedidosTerminados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresoPedidosTerminados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresoPedidosTerminados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresoPedidosTerminados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tPedido;
    private javax.swing.JTextField tbPedido;
    private javax.swing.JFormattedTextField tbfecha;
    // End of variables declaration//GEN-END:variables

}
