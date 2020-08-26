/*
 * Metodo para cargar la tabla de la base de datos
 */
package reports;

import DBsql.DbConnection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jeffrey
 */
public class Reporte8 extends javax.swing.JFrame {

    public static String nombre_tienda;

    /**
     * Crea form Reporte8
     */
    public Reporte8() {
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tReporte1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        tbfinal = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tbInicio = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
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
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 310, -1));

        jLabel15.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 21)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Productos mas vendidos por tienda");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        tReporte1.setBackground(new java.awt.Color(255, 255, 255));
        tReporte1.setForeground(new java.awt.Color(0, 0, 0));
        tReporte1.setModel(new javax.swing.table.DefaultTableModel(
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
                "Codigo", "Nombre", "Veces comprado", "Fecha"
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
        jScrollPane2.setViewportView(tReporte1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 560, 240));

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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 232, -1, -1));

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

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 464, 930, -1));

        tbfinal.setBackground(new java.awt.Color(255, 255, 255));
        tbfinal.setForeground(new java.awt.Color(0, 0, 0));
        tbfinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        jPanel1.add(tbfinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, 215, 30));

        jLabel2.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha Final (año-mes-dia)");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, -1, -1));

        jLabel3.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha Inicio (año-mes-dia)");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, -1, -1));

        tbInicio.setBackground(new java.awt.Color(255, 255, 255));
        tbInicio.setForeground(new java.awt.Color(0, 0, 0));
        tbInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        jPanel1.add(tbInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 215, 30));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ingresar intervalo");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(49, 255, 245), 3, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, 170, 50));

        btExportar.setBackground(new java.awt.Color(51, 51, 51));
        btExportar.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 13)); // NOI18N
        btExportar.setForeground(new java.awt.Color(255, 255, 255));
        btExportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exportarToHTML.png"))); // NOI18N
        btExportar.setToolTipText("");
        btExportar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 255, 245), 3));
        btExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExportarActionPerformed(evt);
            }
        });
        jPanel1.add(btExportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 80, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
    * Metodo para cargar la tabla de la base de datos sin intervalo de tiempo
     */
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        cargarTabla();
    }//GEN-LAST:event_formComponentShown
    /*
    * Metodo para comprobar intervalo
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!tbInicio.getText().equals("") && !tbfinal.getText().equals(""))
            cargarTabla2();
        else
            JOptionPane.showMessageDialog(null, "Debe ingresar un intervalo de tiempo");
    }//GEN-LAST:event_jButton1ActionPerformed
    /*
    * Metodo para exportar reporte
     */
    private void btExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExportarActionPerformed
        ExportarReporte exportar = new ExportarReporte();
        exportar.tablaexportada.setModel(tReporte1.getModel());
        exportar.titulo = "Productos mas vendidos por tienda";
        exportar.setVisible(true);
    }//GEN-LAST:event_btExportarActionPerformed
    /*
    * Metodo para cargar la tabla de la base de datos con intervalo
     */
    public void cargarTabla2() {

        DefaultTableModel model = new DefaultTableModel();
        model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tReporte1.setModel(model);
        String Query = "SELECT p.codigo,p.nombre,f.fecha,p.codigo_tienda,COUNT(p.codigo) FROM PRODUCTO p INNER JOIN VENTA v ON p.codigo=v.codigo_producto INNER JOIN FACTURA f ON v.codigo_factura=f.codigo WHERE p.codigo_tienda='" + nombre_tienda + "' GROUP BY p.codigo,p.nombre,f.fecha ORDER BY COUNT(p.codigo) DESC";
        DbConnection a = new DbConnection();
        ResultSet Result = a.SelectOnComboBox(Query);

        try {
            ResultSetMetaData ResultMd = Result.getMetaData();
            int columnscount = ResultMd.getColumnCount();
            model.addColumn("Codigo");
            model.addColumn("Nombre");
            model.addColumn("Fecha");
            model.addColumn("Tienda");
            model.addColumn("Veces comprado");
            while (Result.next()) {
                Object[] rows = new Object[columnscount];
                if (Intervalo(tbInicio.getText(), tbfinal.getText(), Result.getString("Fecha"))) {
                    for (int i = 0; i < columnscount; i++) {
                        rows[i] = Result.getObject(i + 1);
                    }
                    model.addRow(rows);
                }
            }

        } catch (Exception e) {
        }
    }

    /*
    * Metodo para cargar la tabla de la base de datos sin intervalo
     */
    public void cargarTabla() {

        DefaultTableModel model = new DefaultTableModel();
        model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tReporte1.setModel(model);
        String Query = "SELECT p.codigo,p.nombre,f.fecha,p.codigo_tienda,COUNT(p.codigo) FROM PRODUCTO p INNER JOIN VENTA v ON p.codigo=v.codigo_producto INNER JOIN FACTURA f ON v.codigo_factura=f.codigo WHERE p.codigo_tienda='" + nombre_tienda + "' GROUP BY p.codigo,p.nombre,f.fecha ORDER BY COUNT(p.codigo) DESC";
        DbConnection a = new DbConnection();
        ResultSet Result = a.SelectOnComboBox(Query);

        try {
            ResultSetMetaData ResultMd = Result.getMetaData();
            int columnscount = ResultMd.getColumnCount();
            model.addColumn("Codigo");
            model.addColumn("Nombre");
            model.addColumn("Fecha");
            model.addColumn("Tienda");
            model.addColumn("Veces comprado");
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
    * Metodo para cargar el intervalo de tiempo
     */
    public Boolean Intervalo(String fechaInicio, String fechaFinal, String fechaPedido) {
        LocalDate fechaDelPedido = LocalDate.parse(fechaPedido);
        LocalDate fechaDelInicio = LocalDate.parse(fechaInicio);
        LocalDate fechaDelFinal = LocalDate.parse(fechaFinal);
        long diasintervalo = DAYS.between(fechaDelInicio, fechaDelFinal);
        int tiempointervalo = (int) diasintervalo;
        long diaspedido = DAYS.between(fechaDelInicio, fechaDelPedido);
        int tiempopedido = (int) diaspedido;
        return tiempopedido <= tiempointervalo && tiempopedido >= 0;
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
            java.util.logging.Logger.getLogger(Reporte8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reporte8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reporte8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reporte8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reporte8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExportar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tReporte1;
    private javax.swing.JFormattedTextField tbInicio;
    private javax.swing.JFormattedTextField tbfinal;
    // End of variables declaration//GEN-END:variables
}
