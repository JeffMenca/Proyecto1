/*
 * paquetes
 */
package reports;

import DBsql.DbConnection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.time.LocalDate;
import javax.swing.table.DefaultTableModel;

/**
 * @author jeffrey
 */
public class Reporte4 extends javax.swing.JFrame {

    public static String nombre_tienda;
    public LocalDate fecha = LocalDate.now();

    /**
     * Crea form Reporte4
     */
    public Reporte4() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tReporte1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btExportar = new javax.swing.JButton();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(49, 66, 82));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoCeleste.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 25, 310, -1));

        lbTitulo.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 21)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo.setText("Pedidos de la tienda en transito");
        jPanel1.add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        tReporte1.setBackground(new java.awt.Color(255, 255, 255));
        tReporte1.setForeground(new java.awt.Color(0, 0, 0));
        tReporte1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Fecha", "Cantidad", "Total", "Anticipo", "Codigo Producto", "Codigo Cliente", "Tienda Origen", "Tienda destino", "Tiempo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tReporte1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 824, 240));

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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 227, -1, -1));

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

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 454, 987, -1));

        btExportar.setBackground(new java.awt.Color(51, 51, 51));
        btExportar.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 13)); // NOI18N
        btExportar.setForeground(new java.awt.Color(255, 255, 255));
        btExportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exportarToHTML.png"))); // NOI18N
        btExportar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 255, 245), 3));
        btExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExportarActionPerformed(evt);
            }
        });
        jPanel1.add(btExportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 50, 90, 100));

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

    /*
    * Metodo al iniciar el form
     */
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        cargarTabla2();
        lbTitulo.setText("Pedidos en transito de la tienda " + nombre_tienda);
    }//GEN-LAST:event_formComponentShown
    /*
    * Metodo para exportar reporte
     */
    private void btExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExportarActionPerformed
        ExportarReporte exportar = new ExportarReporte();
        exportar.tablaexportada.setModel(tReporte1.getModel());
        exportar.titulo = "Pedidos en transito de la tienda " + nombre_tienda;
        exportar.setVisible(true);
    }//GEN-LAST:event_btExportarActionPerformed
    /*
    * Metodo para cargar la tabla de la base de datos
     */
    public void cargarTabla2() {

        String where = " WHERE codigo_tiendaorigen= '" + nombre_tienda + "' && r.ID IS NULL";
        DefaultTableModel model = new DefaultTableModel();
        model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tReporte1.setModel(model);
        String Query = "SELECT p.* FROM PEDIDO p LEFT JOIN RECIBO r ON p.codigo = r.codigo_pedido" + where;
        DbConnection a = new DbConnection();
        ResultSet Result = a.SelectOnComboBox(Query);

        try {
            ResultSetMetaData ResultMd = Result.getMetaData();
            int columnscount = ResultMd.getColumnCount();
            model.addColumn("Codigo");
            model.addColumn("Fecha");
            model.addColumn("Cantidad");
            model.addColumn("Total");
            model.addColumn("Anticipo");
            model.addColumn("Codigo producto");
            model.addColumn("Codigo cliente");
            model.addColumn("Tienda origen");
            model.addColumn("TIenda destino");
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
    * Metodo para obtener tienda
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
            java.util.logging.Logger.getLogger(Reporte4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reporte4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reporte4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reporte4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reporte4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExportar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTable tReporte1;
    // End of variables declaration//GEN-END:variables
}
