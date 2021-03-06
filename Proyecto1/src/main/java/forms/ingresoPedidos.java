/*
 * Paquetes
 */
package forms;

/*
 * imports
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
public class ingresoPedidos extends javax.swing.JFrame {

    public static String nombre_tienda;
    public String nit = "";
    public LocalDate fecha = LocalDate.now();
    public static Double anticipototal, total;

    /**
     * Crea form ingresoVentas
     */
    public ingresoPedidos() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jFormattedTextField7 = new javax.swing.JFormattedTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tbCantidad = new javax.swing.JFormattedTextField();
        lbTotal = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tbNIT = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tbProducto = new javax.swing.JTextField();
        cmTienda = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        tbAnticipo = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        tclientes = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tProducto = new javax.swing.JTable();
        cbPagarCredito = new javax.swing.JCheckBox();
        jLabel18 = new javax.swing.JLabel();
        tbfecha = new javax.swing.JFormattedTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        jLabel7.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cantidad");

        jFormattedTextField7.setBackground(new java.awt.Color(255, 255, 255));
        jFormattedTextField7.setForeground(new java.awt.Color(0, 0, 0));
        jFormattedTextField7.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));

        jComboBox2.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox2.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 13)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Tienda de destino");

        jComboBox4.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox4.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 13)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Tienda de destino");

        jLabel3.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("*");

        jLabel11.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 51, 51));
        jLabel11.setText("*");

        jLabel19.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 51, 51));
        jLabel19.setText("*");

        jLabel21.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 51, 51));
        jLabel21.setText("*");

        jLabel24.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 51, 51));
        jLabel24.setText("*");

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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 570, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoCeleste.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 310, -1));

        jLabel9.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Pedidos");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));

        tbCantidad.setBackground(new java.awt.Color(255, 255, 255));
        tbCantidad.setForeground(new java.awt.Color(0, 0, 0));
        tbCantidad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jPanel1.add(tbCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 50, 30));

        lbTotal.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        lbTotal.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 530, -1, 30));

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Pedir articulo");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 255, 245), 3));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 600, 170, 40));

        jLabel6.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cantidad");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, -1, 30));

        jLabel8.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Total: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 530, -1, 30));

        jLabel15.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("(año-mes-dia)");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        tbNIT.setBackground(new java.awt.Color(255, 255, 255));
        tbNIT.setFont(new java.awt.Font("Droid Sans Mono Slashed", 0, 12)); // NOI18N
        tbNIT.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(tbNIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 310, -1));

        jLabel13.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Producto");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        tbProducto.setBackground(new java.awt.Color(255, 255, 255));
        tbProducto.setFont(new java.awt.Font("Droid Sans Mono Slashed", 0, 12)); // NOI18N
        tbProducto.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(tbProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 170, -1));

        cmTienda.setBackground(new java.awt.Color(255, 255, 255));
        cmTienda.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 13)); // NOI18N
        cmTienda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jPanel1.add(cmTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 320, -1));

        jLabel17.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Anticipo");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 530, -1, -1));

        tbAnticipo.setBackground(new java.awt.Color(255, 255, 255));
        tbAnticipo.setFont(new java.awt.Font("Droid Sans Mono Slashed", 0, 12)); // NOI18N
        tbAnticipo.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(tbAnticipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 530, 60, -1));

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

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 320, 80));

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
        jScrollPane6.setViewportView(tProducto);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 320, 130));

        cbPagarCredito.setBackground(new java.awt.Color(51, 51, 51));
        cbPagarCredito.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 13)); // NOI18N
        cbPagarCredito.setForeground(new java.awt.Color(255, 255, 255));
        cbPagarCredito.setText("Pagar con credito");
        cbPagarCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPagarCreditoActionPerformed(evt);
            }
        });
        jPanel1.add(cbPagarCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 560, -1, -1));

        jLabel18.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Tienda");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        tbfecha.setBackground(new java.awt.Color(255, 255, 255));
        tbfecha.setForeground(new java.awt.Color(0, 0, 0));
        tbfecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        jPanel1.add(tbfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 130, 30));

        jLabel20.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("NIT ");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        jLabel22.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Fecha");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
    * Metodo cuando inicie el formulario
     */
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        cargarTabla1();
        cargarTabla2();
        listenerTBnit();
        listenerTBproducto();
        listenertbCantidad();
        String Query = "SELECT codigo FROM TIENDA";
        DbConnection a = new DbConnection();
        ResultSet Result = a.SelectOnComboBox(Query);
        try {
            while (Result.next()) {

                if (!String.valueOf(Result.getObject("codigo")).equals(nombre_tienda)) {
                    cmTienda.addItem(String.valueOf(Result.getObject("codigo")));
                }
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_formComponentShown
    /*
    * Metodo para pedir articulo
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            int column = 0;
            int row = tclientes.getSelectedRow();
            Double anticipo;
            if (tbAnticipo.getText().equals("")) {
                anticipo = 0.00;
            } else {
                anticipo = Double.parseDouble(tbAnticipo.getText());
            }
            if (!tbfecha.getText().equals("")) {
                fecha = LocalDate.parse(tbfecha.getText());
            } else {
                fecha = LocalDate.now();
            }
            nit = tclientes.getModel().getValueAt(row, column).toString();
            if (!tbCantidad.getText().equals("") && (!nit.equals("")) && (!cmTienda.getSelectedItem().toString().isEmpty()) && (anticipo >= anticipototal)) {

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

                column = 3;
                row = tProducto.getSelectedRow();
                int cantidadProductos = Integer.parseInt(tProducto.getModel().getValueAt(row, column).toString());
                int cantidadpedida = Integer.parseInt(tbCantidad.getText());
                if ((cantidadProductos > 0) && (cantidadpedida <= cantidadProductos)) {
                    column = 0;
                    row = tProducto.getSelectedRow();
                    String codigoProducto = tProducto.getModel().getValueAt(row, column).toString();
                    String query = ("INSERT INTO PEDIDO VALUES('" + 0 + "','" + fecha + "','" + Integer.parseInt(tbCantidad.getText())
                            + "','" + Double.parseDouble(lbTotal.getText()) + "','" + anticipo + "','" + codigoProducto + "','" + nit + "','" + cmTienda.getSelectedItem().toString() + "','" + nombre_tienda + "')");
                    DbConnection a = new DbConnection();
                    int dato = a.InsertVenta(query);
                    JOptionPane.showMessageDialog(null, "Pedido ingresado correctamente");
                    JOptionPane.showMessageDialog(null, "EL codigo de su pedido es " + String.valueOf(dato));
                } else {
                    JOptionPane.showMessageDialog(null, "No existen tantas existencias de ese producto en la tienda seleccionada");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Debe seleccionar la cantidad del producto, la tienda, el NIT del cliente y 25% de anticipo");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un NIT/Cliente");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cbPagarCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPagarCreditoActionPerformed

    }//GEN-LAST:event_cbPagarCreditoActionPerformed

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
    * Metodo para cargar la tabla de la base de datos con filtro
     */
    public void cargarTabla2() {
        String filter = tbProducto.getText();
        String where = "";
        if (!filter.equals("")) {
            where = " WHERE codigo_tienda != '" + nombre_tienda + "' && nombre LIKE '%" + filter + "%'";
        } else {
            where = " WHERE codigo_tienda != '" + nombre_tienda + "'";
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
    * Metodo para sumar una columna
     */
    public void sumartotal() {
        total = 0.0;
        try {
            int row = tProducto.getSelectedRow();
            total = Double.parseDouble(tProducto.getValueAt(row, 2).toString());
            total *= Double.parseDouble(tbCantidad.getText());
            lbTotal.setText(String.valueOf(total));
            anticipototal = total * 0.25;
            tbAnticipo.setText(String.valueOf(anticipototal));

        } catch (Exception e) {
            lbTotal.setText("0.00");
            tbAnticipo.setText("");
        }

    }

    /*
    * Metodo listener para tbCantidad y cuando cambie su valor
     */
    public void listenertbCantidad() {
        tbCantidad.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent de) {
                sumartotal();
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                sumartotal();
            }

            @Override
            public void changedUpdate(DocumentEvent de) {
                sumartotal();
            }
        });
    }

    /*
    * Metodo listener para TBnit y cuando cambie su valor
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
    * Metodo listener para tbProducto y cuando cambie su valor
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

    /*
    * Metodo para cargar la tienda actual
     */
    public void obtenerTiendaActual(String tienda) {
        nombre_tienda = tienda;
    }

    /*
    * Metodo main
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
            java.util.logging.Logger.getLogger(ingresoPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ingresoPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ingresoPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ingresoPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Crea y muestra el form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ingresoPedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbPagarCredito;
    private javax.swing.JComboBox<String> cmTienda;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JFormattedTextField jFormattedTextField7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JTable tProducto;
    private javax.swing.JTextField tbAnticipo;
    private javax.swing.JFormattedTextField tbCantidad;
    private javax.swing.JTextField tbNIT;
    private javax.swing.JTextField tbProducto;
    private javax.swing.JFormattedTextField tbfecha;
    private javax.swing.JTable tclientes;
    // End of variables declaration//GEN-END:variables
}
