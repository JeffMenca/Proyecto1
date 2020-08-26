/*
 * Paquetes
 */
package formView;

import DBsql.DbConnection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

/**
 * @author jeffrey
 */

/*
 * Clase principal
 */
public class VIsualizarProductos extends javax.swing.JFrame {

    public static String nombre_tienda;

    /**
     * Crea el form VIsualizarProductos
     */
    public VIsualizarProductos() {
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
        Cargar = new javax.swing.JButton();
        tbProducto = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tEmpleado = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Cargar1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        tbnombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tbfabricante = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tbcantidad = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        tbprecio = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        tbdescripcion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tbgarantia = new javax.swing.JFormattedTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tbcodigo = new javax.swing.JTextField();

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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 558, 1250, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoCeleste.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 331, -1));

        jLabel9.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Visualizar Productos");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        Cargar.setBackground(new java.awt.Color(102, 102, 102));
        Cargar.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        Cargar.setForeground(new java.awt.Color(255, 255, 255));
        Cargar.setText("Cargar");
        Cargar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 255, 245), 3));
        Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarActionPerformed(evt);
            }
        });
        jPanel1.add(Cargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 110, 40));

        tbProducto.setBackground(new java.awt.Color(255, 255, 255));
        tbProducto.setFont(new java.awt.Font("Droid Sans Mono Slashed", 0, 12)); // NOI18N
        tbProducto.setForeground(new java.awt.Color(0, 0, 0));
        tbProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbProductoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbProductoKeyTyped(evt);
            }
        });
        jPanel1.add(tbProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 340, -1));

        jLabel15.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Filtrar");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        tEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        tEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        tEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Fabricante", "Cantidad", "Precio", "Descripcion", "Garantia", "Codigo Tienda"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tEmpleado);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 570, 190));

        jLabel16.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Ver/Editar");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 80, -1, -1));

        jLabel17.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Codigo Producto/ Nombre");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        jLabel19.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 51, 51));
        jLabel19.setText("*");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 320, 30, 30));

        jLabel10.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 51));
        jLabel10.setText("*= Editable");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 470, -1, -1));

        Cargar1.setBackground(new java.awt.Color(102, 102, 102));
        Cargar1.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        Cargar1.setForeground(new java.awt.Color(255, 255, 255));
        Cargar1.setText("Editar");
        Cargar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 255, 245), 3));
        Cargar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cargar1ActionPerformed(evt);
            }
        });
        jPanel1.add(Cargar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 460, 110, 40));

        jLabel12.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Nombre");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, -1, -1));

        tbnombre.setBackground(new java.awt.Color(255, 255, 255));
        tbnombre.setFont(new java.awt.Font("Droid Sans Mono Slashed", 0, 12)); // NOI18N
        tbnombre.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(tbnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 200, 240, -1));

        jLabel3.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fabricante");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 230, -1, 40));

        tbfabricante.setBackground(new java.awt.Color(255, 255, 255));
        tbfabricante.setFont(new java.awt.Font("Droid Sans Mono Slashed", 0, 12)); // NOI18N
        tbfabricante.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(tbfabricante, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 240, 240, -1));

        jLabel5.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cantidad");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, -1, 30));

        tbcantidad.setBackground(new java.awt.Color(255, 255, 255));
        tbcantidad.setForeground(new java.awt.Color(0, 0, 0));
        tbcantidad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jPanel1.add(tbcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 280, 240, 30));

        jLabel7.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Precio");
        jLabel7.setToolTipText("");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 320, -1, 30));

        tbprecio.setBackground(new java.awt.Color(255, 255, 255));
        tbprecio.setForeground(new java.awt.Color(0, 0, 0));
        tbprecio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jPanel1.add(tbprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 320, 240, 30));

        jLabel6.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Descripcion");
        jLabel6.setToolTipText("");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, -1, 50));

        tbdescripcion.setBackground(new java.awt.Color(255, 255, 255));
        tbdescripcion.setFont(new java.awt.Font("Droid Sans Mono Slashed", 0, 12)); // NOI18N
        tbdescripcion.setForeground(new java.awt.Color(0, 0, 0));
        tbdescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbdescripcionActionPerformed(evt);
            }
        });
        jPanel1.add(tbdescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 360, 240, -1));

        jLabel8.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Garantia (meses)");
        jLabel8.setToolTipText("");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, -1, 30));

        tbgarantia.setBackground(new java.awt.Color(255, 255, 255));
        tbgarantia.setForeground(new java.awt.Color(0, 0, 0));
        tbgarantia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jPanel1.add(tbgarantia, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 400, 240, 30));

        jLabel20.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 51, 51));
        jLabel20.setText("*");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 280, 30, 30));

        jLabel4.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Codigo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, -1, 30));

        tbcodigo.setBackground(new java.awt.Color(255, 255, 255));
        tbcodigo.setFont(new java.awt.Font("Droid Sans Mono Slashed", 0, 12)); // NOI18N
        tbcodigo.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(tbcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 160, 240, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1093, Short.MAX_VALUE)
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
    * Metodo para cargar los datos a un tb para poder editarlos
     */
    private void CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarActionPerformed

        try {
            int row = tEmpleado.getSelectedRow();
            tbcodigo.setText(tEmpleado.getModel().getValueAt(row, 0).toString());
            tbnombre.setText(tEmpleado.getModel().getValueAt(row, 1).toString());
            tbfabricante.setText(tEmpleado.getModel().getValueAt(row, 2).toString());
            tbcantidad.setText(tEmpleado.getModel().getValueAt(row, 3).toString());
            tbprecio.setText(tEmpleado.getModel().getValueAt(row, 4).toString());
            tbdescripcion.setText(tEmpleado.getModel().getValueAt(row, 5).toString());
            tbgarantia.setText(tEmpleado.getModel().getValueAt(row, 6).toString());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_CargarActionPerformed

    private void tbProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbProductoKeyPressed

    }//GEN-LAST:event_tbProductoKeyPressed

    private void tbProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbProductoKeyTyped

    }//GEN-LAST:event_tbProductoKeyTyped
    /*
    * Metodo para editar la tabla de la base de datos
     */
    private void Cargar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cargar1ActionPerformed
        if ((tbcantidad.getText().equals("")) || (tbprecio.getText().equals(""))) {
            JOptionPane.showMessageDialog(null, "Debe llenar los campos obligatorios");
        } else {
            String codigo = tbcodigo.getText();
            String nombre = tbnombre.getText();
            String fabricante = tbfabricante.getText();
            String cantidad = tbcantidad.getText();
            String precio = tbprecio.getText();
            String descripcion = tbdescripcion.getText();
            String garantia = tbgarantia.getText();
            String query = ("UPDATE PRODUCTO SET codigo ='" + codigo + "',nombre='" + nombre + "',  fabricante='" + fabricante + "',cantidad='" + cantidad + "',precio='" + precio + "',descripcion='" + descripcion + "',garantia='" + garantia + "' WHERE codigo='" + codigo + "'");
            DbConnection a = new DbConnection();
            a.Insert(query);
            JOptionPane.showMessageDialog(null, "Empleado ingresado correctamente");
            cargarTabla2();
        }

    }//GEN-LAST:event_Cargar1ActionPerformed

    private void tbdescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbdescripcionActionPerformed

    }//GEN-LAST:event_tbdescripcionActionPerformed
    /*
    * Metodo cuando inicia el formulario
     */
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        cargarTabla2();
        listenertbProducto();
        tbcodigo.setEditable(false);
        tbnombre.setEditable(false);
        tbfabricante.setEditable(false);
        tbdescripcion.setEditable(false);
        tbgarantia.setEditable(false);
    }//GEN-LAST:event_formComponentShown
    /*
    * Metodo obtener la tienda con la que se ingreso
     */
    public void obtenerTiendaActual(String tienda) {
        nombre_tienda = tienda;

    }

    /*
    * Metodo para cargar la tabla de la base de datos
     */
    public void cargarTabla2() {
        String filter = tbProducto.getText();
        String where = "";
        if (!filter.equals("")) {
            where = " WHERE codigo LIKE '%" + filter + "%' || nombre LIKE '%" + filter + "%' ";
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
        tEmpleado.setModel(model);
        String Query = "SELECT * FROM PRODUCTO" + where + " ORDER BY codigo ASC";
        DbConnection a = new DbConnection();
        ResultSet Result = a.SelectOnComboBox(Query);

        try {
            ResultSetMetaData ResultMd = Result.getMetaData();
            int columnscount = ResultMd.getColumnCount();
            model.addColumn("Codigo");
            model.addColumn("Nombre");
            model.addColumn("Fabricante");
            model.addColumn("Cantidad");
            model.addColumn("Precio");
            model.addColumn("Descripcion");
            model.addColumn("Garantia");
            model.addColumn("Codigo Tienda");
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
    * Listener cuando tbProducto cambie su valor
     */
    public void listenertbProducto() {
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
     * @param clase principal
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
            java.util.logging.Logger.getLogger(VIsualizarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VIsualizarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VIsualizarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VIsualizarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VIsualizarProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cargar;
    private javax.swing.JButton Cargar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tEmpleado;
    private javax.swing.JTextField tbProducto;
    private javax.swing.JFormattedTextField tbcantidad;
    private javax.swing.JTextField tbcodigo;
    private javax.swing.JTextField tbdescripcion;
    private javax.swing.JTextField tbfabricante;
    private javax.swing.JFormattedTextField tbgarantia;
    private javax.swing.JTextField tbnombre;
    private javax.swing.JFormattedTextField tbprecio;
    // End of variables declaration//GEN-END:variables
}
