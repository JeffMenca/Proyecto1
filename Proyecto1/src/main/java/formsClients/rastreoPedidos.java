/*
 * paquetes
 */
package formsClients;
/*
 * imports
 */
import DBsql.DbConnection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author jeffrey
 */
public class rastreoPedidos extends javax.swing.JFrame {
    
    
    public LocalDate fecha = LocalDate.now();
    /**
     * Create form rastreoPedidos
     */
    public rastreoPedidos() {
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
        jLabel3 = new javax.swing.JLabel();
        tbpedido = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tbDias = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tbTotal = new javax.swing.JTextField();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(49, 66, 82));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoMorado.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 310, -1));

        lbTitulo.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 27)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo.setText("Rastreo de pedidos");
        jPanel1.add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, -1));

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

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 824, 260));

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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 240, -1, -1));

        jPanel3.setBackground(new java.awt.Color(229, 151, 253));

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

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 1170, -1));

        jLabel3.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Codigo del pedido");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 160, -1, -1));

        tbpedido.setBackground(new java.awt.Color(255, 255, 255));
        tbpedido.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 13)); // NOI18N
        tbpedido.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(tbpedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 190, 240, 30));

        btBuscar.setBackground(new java.awt.Color(51, 51, 51));
        btBuscar.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 12)); // NOI18N
        btBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btBuscar.setText("Buscar");
        btBuscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 151, 253), 3, true));
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 240, 100, 50));

        jLabel4.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dias restante de llegada");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 310, -1, -1));

        tbDias.setBackground(new java.awt.Color(255, 255, 255));
        tbDias.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 13)); // NOI18N
        tbDias.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(tbDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 340, 240, 30));

        jLabel5.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Total por pagar");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 390, -1, -1));

        tbTotal.setBackground(new java.awt.Color(255, 255, 255));
        tbTotal.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 13)); // NOI18N
        tbTotal.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(tbTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 420, 240, 30));

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

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        
    }//GEN-LAST:event_formComponentShown
   /*
    * Metodo para buscar los pedidos
    */
    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        if (!tbpedido.getText().equals("")) {
            cargarTabla2();
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar el codigo del pedido");
        }
    }//GEN-LAST:event_btBuscarActionPerformed
   /*
    * Metodo para cargar la tabla de la base de datos
    */
     public void cargarTabla2(){
    
        DefaultTableModel model=new DefaultTableModel();
        model= new DefaultTableModel(){
                @Override
                public boolean isCellEditable(int row, int column) {
                return false;
                }
           };
         tReporte1.setModel(model);
         String Query = "SELECT p.codigo,p.fecha,p.total,p.anticipo,p.codigo_tiendaorigen,ti.nombre,pro.nombre,t.tiempo FROM PEDIDO p LEFT"
                 + " JOIN RECIBO r ON p.codigo = r.codigo_pedido INNER JOIN TIENDA ti ON ti.codigo=p.codigo_tiendadestino"
                 + " INNER JOIN TIEMPO_ENTRE_TIENDAS t ON ((p.codigo_tiendaorigen= t.tienda_origen)&&(p.codigo_tiendadestino=t.tienda_destino)||(p.codigo_tiendaorigen= t.tienda_destino)&&(p.codigo_tiendadestino=t.tienda_origen)) INNER JOIN PRODUCTO pro ON pro.codigo=p.codigo_producto WHERE r.ID IS NULL && p.codigo ='" +tbpedido.getText()+"'";
         DbConnection a = new DbConnection();
         ResultSet Result = a.Select(Query);


        try {
            ResultSetMetaData ResultMd = Result.getMetaData();
            int columnscount = ResultMd.getColumnCount();
            model.addColumn("Codigo");
            model.addColumn("Fecha");
            model.addColumn("Total");
            model.addColumn("Anticipo");
            model.addColumn("Se pidio en");
            model.addColumn("Recoger en");
            model.addColumn("Producto");
            model.addColumn("Tiempo de llegada");
 
            while (Result.next()) {
                Object[] rows = new Object[columnscount];
               tbDias.setText(ATiempo(Result.getString("Fecha"),Result.getString("Tiempo")));
               tbTotal.setText(ATotal(Result.getString("Total"),Result.getString("Anticipo")));
                for (int i = 0; i < columnscount; i++) {
                    rows[i] = Result.getObject(i + 1);

                }
                model.addRow(rows);

            }

        } catch (Exception e) {
        }
    }
    /*
    * Metodo para cargar el tiempo restante de dias para que llegue el producto
    */
    public String ATiempo(String fechapedido, String tiempo) {
        LocalDate fechaDelPedido = LocalDate.parse(fechapedido);
        long diasdiferencia = DAYS.between(fechaDelPedido, fecha);
        int tiempototal = (int) diasdiferencia;
        int tiempoEnvio = Integer.parseInt(tiempo);
        if (tiempoEnvio < tiempototal) {
            return String.valueOf(tiempototal-tiempoEnvio);
        } else {
            return "0";
        }
    }
   /*
    * Metodo para mostrar el total final
    */
    public String ATotal(String total, String anticipo) {
        Double canttotal = Double.parseDouble(total);
        Double cantanticipo = Double.parseDouble(anticipo);
        if (cantanticipo < canttotal) {
            return String.valueOf(canttotal-cantanticipo);
        } else {
            return "0";
        }
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
            java.util.logging.Logger.getLogger(rastreoPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rastreoPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rastreoPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rastreoPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rastreoPedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTable tReporte1;
    private javax.swing.JTextField tbDias;
    private javax.swing.JTextField tbTotal;
    private javax.swing.JTextField tbpedido;
    // End of variables declaration//GEN-END:variables
}
