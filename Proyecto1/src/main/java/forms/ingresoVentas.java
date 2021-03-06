/*
 * Paquetes
 */
package forms;

/*
 * Imports
 */
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
public class ingresoVentas extends javax.swing.JFrame {

    public static String nombre_tienda;
    public DefaultTableModel modelcarrito = new DefaultTableModel();
    public String nit = "";
    public LocalDate fecha = LocalDate.now();

    /**
     * Create form ingresoPedidos
     */
    public ingresoVentas() {
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
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        tbCantidad = new javax.swing.JFormattedTextField();
        lbtotal = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tbNIT = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tbProducto = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tProducto = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tclientes = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tcarrito = new javax.swing.JTable();
        cbPagarCredito = new javax.swing.JCheckBox();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 790, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoCeleste.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 310, -1));

        jLabel9.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ventas");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Agregar el carrito");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 255, 245), 3));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 540, 190, 40));

        tbCantidad.setBackground(new java.awt.Color(255, 255, 255));
        tbCantidad.setForeground(new java.awt.Color(0, 0, 0));
        tbCantidad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jPanel1.add(tbCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 50, 30));

        lbtotal.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        lbtotal.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 510, -1, 30));

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Comprar articulos");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 255, 245), 3));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 590, 170, 40));

        jLabel6.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cantidad");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, 30));

        jLabel8.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Total: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, -1, 30));

        jLabel15.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("NIT ");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        tbNIT.setBackground(new java.awt.Color(255, 255, 255));
        tbNIT.setFont(new java.awt.Font("Droid Sans Mono Slashed", 0, 12)); // NOI18N
        tbNIT.setForeground(new java.awt.Color(0, 0, 0));
        tbNIT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbNITKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbNITKeyTyped(evt);
            }
        });
        jPanel1.add(tbNIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 320, -1));

        jLabel13.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Producto");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        tbProducto.setBackground(new java.awt.Color(255, 255, 255));
        tbProducto.setFont(new java.awt.Font("Droid Sans Mono Slashed", 0, 12)); // NOI18N
        tbProducto.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(tbProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 170, -1));

        tProducto.setBackground(new java.awt.Color(255, 255, 255));
        tProducto.setForeground(new java.awt.Color(0, 0, 0));
        tProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Precio", "Cantidad"
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
        jScrollPane4.setViewportView(tProducto);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 320, 130));

        tclientes.setBackground(new java.awt.Color(255, 255, 255));
        tclientes.setForeground(new java.awt.Color(0, 0, 0));
        tclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NIT", "Nombre", "Credito"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tclientes);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 320, 80));

        tcarrito.setBackground(new java.awt.Color(255, 255, 255));
        tcarrito.setForeground(new java.awt.Color(0, 0, 0));
        tcarrito.setModel(new javax.swing.table.DefaultTableModel(
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
                "Cantidad", "Codigo", "Producto", "Precio"
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
        jScrollPane2.setViewportView(tcarrito);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 320, 320));

        cbPagarCredito.setBackground(new java.awt.Color(51, 51, 51));
        cbPagarCredito.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 13)); // NOI18N
        cbPagarCredito.setForeground(new java.awt.Color(255, 255, 255));
        cbPagarCredito.setText("Pagar con credito");
        cbPagarCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPagarCreditoActionPerformed(evt);
            }
        });
        jPanel1.add(cbPagarCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 550, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 782, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
    * Metodo cuando inicia el metodo
     */
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        cargarTabla1();
        cargarTabla2();
        listenerTBnit();
        listenerTBproducto();
        modelcarrito = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        modelcarrito.addColumn("Cantidad");
        modelcarrito.addColumn("Codigo");
        modelcarrito.addColumn("Producto");
        modelcarrito.addColumn("Precio");
    }//GEN-LAST:event_formComponentShown

    private void tbNITKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbNITKeyTyped

    }//GEN-LAST:event_tbNITKeyTyped

    private void tbNITKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbNITKeyPressed

    }//GEN-LAST:event_tbNITKeyPressed

    /*
    * Metodo para ingresar productos al carrito
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            int column = 0;
            int row = tclientes.getSelectedRow();
            nit = tclientes.getModel().getValueAt(row, column).toString();

            if (!tbCantidad.getText().equals("") && (!nit.equals(""))) {
                column = 3;
                row = tProducto.getSelectedRow();
                int cantidadProductos = Integer.parseInt(tProducto.getModel().getValueAt(row, column).toString());
                int cantidadpedida = Integer.parseInt(tbCantidad.getText());
                if ((cantidadProductos > 0) && (cantidadpedida <= cantidadProductos)) {
                    tclientes.setEnabled(false);
                    column = 0;
                    row = tProducto.getSelectedRow();
                    String value3 = tProducto.getModel().getValueAt(row, column).toString();
                    column = 1;
                    row = tProducto.getSelectedRow();
                    String value = tProducto.getModel().getValueAt(row, column).toString();
                    column = 2;
                    String value2 = tProducto.getModel().getValueAt(row, column).toString();
                    tcarrito.setModel(modelcarrito);
                    modelcarrito.addRow(new Object[]{tbCantidad.getText(), value3, value, value2});
                    sumartotal();
                    column = 0;
                    row = tProducto.getSelectedRow();
                    String codigoProductoAgregado = tProducto.getModel().getValueAt(row, column).toString();
                    cantidadProductos -= cantidadpedida;
                    String query = ("UPDATE PRODUCTO SET cantidad = '" + cantidadProductos + "' WHERE codigo='" + codigoProductoAgregado + "'");
                    DbConnection a = new DbConnection();
                    a.Insert(query);
                    cargarTabla2();
                } else {
                    JOptionPane.showMessageDialog(null, "El producto no esta en existencia, debe realizar un pedido");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Debe seleccionar la cantidad que desea del producto");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un NIT/Cliente");
        }

        /*
    * Metodo para ingresar ventas
         */
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            if (tcarrito.getRowCount() > 0) {
                int row;
                Double total = Double.parseDouble(lbtotal.getText());
                if (cbPagarCredito.isSelected() == true) {
                    row = tclientes.getSelectedRow();
                    Double credito = Double.parseDouble(tclientes.getModel().getValueAt(row, 2).toString());
                    if (credito >= total) {
                        credito -= total;
                        String query = ("UPDATE CLIENTE SET credito = '" + credito + "' WHERE NIT='" + nit + "'");
                        DbConnection a = new DbConnection();
                        a.Insert(query);
                    } else {
                        Double totalNuevo = total - credito;
                        credito = 0.00;
                        JOptionPane.showMessageDialog(null, "Su credito no es suficiente, debera pagar en efectivo " + totalNuevo);
                        String query = ("UPDATE CLIENTE SET credito = '" + credito + "' WHERE NIT='" + nit + "'");
                        DbConnection a = new DbConnection();
                        a.Insert(query);
                    }
                }

                String query = ("INSERT INTO FACTURA VALUES('" + 0 + "','" + fecha + "','" + total + "','" + nit + "','" + nombre_tienda + "')");
                DbConnection a = new DbConnection();
                int codigofactura = a.InsertVenta(query);
                JOptionPane.showMessageDialog(null, "Se realizo su compra y su factura correctamente");
                cargarTabla1();
                tclientes.setEnabled(true);

                for (int i = 0; i < tcarrito.getRowCount(); i++) {
                    int cantidad = Integer.parseInt(tcarrito.getModel().getValueAt(i, 0).toString());
                    Double precio = Double.parseDouble(tcarrito.getModel().getValueAt(i, 3).toString());
                    String codigoproducto = tcarrito.getModel().getValueAt(i, 1).toString();
                    try {
                        query = ("INSERT INTO VENTA VALUES('" + 0 + "','" + cantidad + "','" + precio + "','" + codigoproducto + "','" + codigofactura + "')");
                        a = new DbConnection();
                        a.Insert(query);
                    } catch (Exception e) {
                    }

                }
                modelcarrito = new DefaultTableModel() {
                    @Override
                    public boolean isCellEditable(int row, int column) {
                        return false;
                    }
                };
                modelcarrito.addColumn("Cantidad");
                modelcarrito.addColumn("Codigo");
                modelcarrito.addColumn("Producto");
                modelcarrito.addColumn("Precio");
                tcarrito.setModel(modelcarrito);

            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar por lo menos un producto");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No tiene nada en el carrito");
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void cbPagarCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPagarCreditoActionPerformed

    }//GEN-LAST:event_cbPagarCreditoActionPerformed
    /*
    * Metodo para obtener la tienda actual
     */
    public void obtenerTiendaActual(String tienda) {
        nombre_tienda = tienda;

    }

    /*
    * Metodo para sumar total de una columna
     */
    public void sumartotal() {
        double t = 0;
        double p = 0;
        int rowscount = tcarrito.getRowCount();
        if (tcarrito.getRowCount() > 0) {
            for (int i = 0; i < rowscount; i++) {
                p = Double.parseDouble(tcarrito.getValueAt(i, 3).toString());
                p *= Double.parseDouble(tcarrito.getValueAt(i, 0).toString());
                t += p;
            }
        }
        lbtotal.setText(String.valueOf(t));

    }

    /*
    * Metodo para cargar la tabla de la base de datos
     */
    public void cargarTabla1() {
        String filter = tbNIT.getText();
        String where = "";
        if (!filter.equals("")) {
            where = " WHERE NIT LIKE '%" + filter + "%'";
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
        tclientes.setModel(model);
        String Query = "SELECT NIT, nombre, credito FROM CLIENTE" + where;
        DbConnection a = new DbConnection();
        ResultSet Result = a.SelectOnComboBox(Query);

        try {
            ResultSetMetaData ResultMd = Result.getMetaData();
            int columnscount = ResultMd.getColumnCount();
            model.addColumn("NIT");
            model.addColumn("Nombre");
            model.addColumn("Credito");
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
    * Metodo cargar tabla con filtro
     */
    public void cargarTabla2() {
        String filter = tbProducto.getText();
        String where = "";
        if (!filter.equals("")) {
            where = " WHERE codigo_tienda= '" + nombre_tienda + "' && nombre LIKE '%" + filter + "%'";
        } else {
            where = " WHERE codigo_tienda= '" + nombre_tienda + "'";
        }
        DefaultTableModel model = new DefaultTableModel();
        model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tProducto.setModel(model);
        String Query = "SELECT codigo, nombre, precio, cantidad FROM PRODUCTO" + where;
        DbConnection a = new DbConnection();
        ResultSet Result = a.SelectOnComboBox(Query);

        try {
            ResultSetMetaData ResultMd = Result.getMetaData();
            int columnscount = ResultMd.getColumnCount();
            model.addColumn("Codigo");
            model.addColumn("Nombre");
            model.addColumn("Precio");
            model.addColumn("Cantidad");
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
    * Metodo para listener de tbNit y cuando cambie de valor
     */
    public void listenerTBnit() {
        tbNIT.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent de) {
                cargarTabla1();
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                cargarTabla1();
            }

            @Override
            public void changedUpdate(DocumentEvent de) {
                cargarTabla1();
            }
        });
    }

    /*
    * Metodo listener tbProducto y cuando cambia de valor
     */
    public void listenerTBproducto() {
        tbProducto.getDocument().addDocumentListener(new DocumentListener() {
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
            java.util.logging.Logger.getLogger(ingresoVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ingresoVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ingresoVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ingresoVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ingresoVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbPagarCredito;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lbtotal;
    private javax.swing.JTable tProducto;
    private javax.swing.JFormattedTextField tbCantidad;
    private javax.swing.JTextField tbNIT;
    private javax.swing.JTextField tbProducto;
    private javax.swing.JTable tcarrito;
    private javax.swing.JTable tclientes;
    // End of variables declaration//GEN-END:variables
}
