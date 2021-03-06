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
import static java.time.temporal.ChronoUnit.DAYS;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

/**
 * @author jeffrey
 */
public class ingresoVentasPedidos extends javax.swing.JFrame {

    public LocalDate fecha = LocalDate.now();
    public static String nombre_tienda;

    /**
     * Crea form ingresoVentasPedidos
     */
    public ingresoVentasPedidos() {
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

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(49, 66, 82));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoCeleste.png"))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Codigo de recibo");

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
                "Codigo de Recibo/ID", "Codigo de pedido", "Fecha de ingreso", "Tiempo de envio"
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

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Vender pedido");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 255, 245), 3));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel15)
                        .addGap(14, 14, 14)
                        .addComponent(tbPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 620, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(tbPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 261, Short.MAX_VALUE)))
        );

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

    private void tbPedidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbPedidoKeyPressed

    }//GEN-LAST:event_tbPedidoKeyPressed

    private void tbPedidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbPedidoKeyTyped

    }//GEN-LAST:event_tbPedidoKeyTyped

    /*
    * Metodo para ingresar ventas de los pedidos
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {

            String codigoproducto = "", codigocliente = "";
            String total = "", cantidad = "", anticipo = "";
            LocalDate fechapedido = null;
            String tiempo = "";
            String creditoGanado = "";
            int row = tPedido.getSelectedRow();
            String codigo_pedido = tPedido.getModel().getValueAt(row, 1).toString();
            String codigo_tiempoenvio = tPedido.getModel().getValueAt(row, 3).toString();
            String Query = "SELECT * FROM PEDIDO WHERE codigo= '" + codigo_pedido + "'";
            DbConnection a = new DbConnection();
            ResultSet Result = a.Select(Query);
            while (Result.next()) {

                codigoproducto = (String.valueOf(Result.getObject("codigo_producto")));
                codigocliente = (String.valueOf(Result.getObject("codigo_cliente")));
                total = (String.valueOf(Result.getObject("total")));
                cantidad = (String.valueOf(Result.getObject("cantidad")));
                anticipo = (String.valueOf(Result.getObject("anticipo")));
                fechapedido = LocalDate.parse(String.valueOf(Result.getObject("fecha")));

            }

            Query = "SELECT tiempo FROM TIEMPO_ENTRE_TIENDAS WHERE ID= '" + codigo_tiempoenvio + "'";
            a = new DbConnection();
            Result = a.Select(Query);
            while (Result.next()) {
                tiempo = (String.valueOf(Result.getObject("tiempo")));
            }

            long diasdiferencia = DAYS.between(fechapedido, fecha);
            int tiempototal = (int) diasdiferencia;
            if (tiempototal > Integer.parseInt(tiempo)) {
                if (total.equals(anticipo)) {
                    creditoGanado = String.valueOf(Double.parseDouble(total) * 0.05);
                    String query = ("UPDATE CLIENTE SET credito= credito+'" + Double.parseDouble(creditoGanado) + "' WHERE NIT='" + codigocliente + "'");
                    a = new DbConnection();
                    a.Insert(query);
                    JOptionPane.showMessageDialog(null, "Se le agrego 5% de credito de la compra por el anticipo y el retraso");
                } else {
                    creditoGanado = String.valueOf(Double.parseDouble(total) * 0.02);
                    String query = ("UPDATE CLIENTE SET credito= credito+'" + Double.parseDouble(creditoGanado) + "' WHERE NIT='" + codigocliente + "'");
                    a = new DbConnection();
                    a.Insert(query);
                    JOptionPane.showMessageDialog(null, "Se le agrego 2% de credito de la compra por el retraso");
                }
            }

            String query = ("INSERT INTO FACTURA VALUES('" + 0 + "','" + fecha + "','" + Double.parseDouble(total) + "','" + codigocliente + "','" + nombre_tienda + "')");
            a = new DbConnection();
            int codigofactura = a.InsertVenta(query);
            Double pagofinal = (Double.parseDouble(total) - (Double.parseDouble(anticipo)));
            if (pagofinal < 0.00) {
                pagofinal = 0.00;
            }

            JOptionPane.showMessageDialog(null, "Se realizo su compra y su factura correctamente y debe pagar " + pagofinal);
            query = ("INSERT INTO VENTA VALUES('" + 0 + "','" + Integer.parseInt(cantidad) + "','" + Double.parseDouble(total) + "','" + codigoproducto + "','" + codigofactura + "')");
            a = new DbConnection();
            a.Insert(query);
        } catch (Exception e) {
        }


    }//GEN-LAST:event_jButton2ActionPerformed
    /*
    * Metodo cuando inicia el formulario
     */
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        cargarTabla();
        listenertbCantidad();

    }//GEN-LAST:event_formComponentShown
    /*
    * Metodo para cargar la tabla de la base de datos
     */
    public void cargarTabla() {
        String filter = tbPedido.getText();
        String where = "";
        if (!filter.equals("")) {
            where = " WHERE ID LIKE '%" + filter + "%'";
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
        String Query = "SELECT ID, codigo_pedido, fecha_ingreso, tiempo_envio FROM RECIBO" + where;
        DbConnection a = new DbConnection();
        ResultSet Result = a.SelectOnComboBox(Query);

        try {
            ResultSetMetaData ResultMd = Result.getMetaData();
            int columnscount = ResultMd.getColumnCount();
            model.addColumn("Codigo de Recibo/ID");
            model.addColumn("Codigo de Pedido");
            model.addColumn("Fecha de ingreso");
            model.addColumn("Tiempo de envio");
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
    * Metodo listener para tbCantidad y cuando cambia de valor
     */
    public void listenertbCantidad() {
        tbPedido.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent de) {
                cargarTabla();
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                cargarTabla();
            }

            @Override
            public void changedUpdate(DocumentEvent de) {
                cargarTabla();
            }
        });
    }

    /*
    * Metodo para obtener la tienda actual
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
            java.util.logging.Logger.getLogger(ingresoVentasPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ingresoVentasPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ingresoVentasPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ingresoVentasPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ingresoVentasPedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tPedido;
    private javax.swing.JTextField tbPedido;
    // End of variables declaration//GEN-END:variables
}
