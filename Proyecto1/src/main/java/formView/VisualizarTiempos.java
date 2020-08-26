/*
 * Metodo para cargar la tabla de la base de datos
 */
package formView;

/*
 * Imports
 */
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
 * Clase inicial
 */
public class VisualizarTiempos extends javax.swing.JFrame {

    public static String nombre_tienda;

    /**
     * Crea form VisualizarTiempos
     */
    public VisualizarTiempos() {
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
        tbTiempos = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tTiempos = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tbID = new javax.swing.JFormattedTextField();
        tbDias = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        TbDestino = new javax.swing.JFormattedTextField();
        jLabel18 = new javax.swing.JLabel();
        tbOrigen = new javax.swing.JFormattedTextField();
        Cargar1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

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

        jLabel9.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Visualizar Tiempo entre tiendas");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

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
        jPanel1.add(Cargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 110, 40));

        tbTiempos.setBackground(new java.awt.Color(255, 255, 255));
        tbTiempos.setFont(new java.awt.Font("Droid Sans Mono Slashed", 0, 12)); // NOI18N
        tbTiempos.setForeground(new java.awt.Color(0, 0, 0));
        tbTiempos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbTiemposKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbTiemposKeyTyped(evt);
            }
        });
        jPanel1.add(tbTiempos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 320, -1));

        jLabel15.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Filtrar");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        tTiempos.setBackground(new java.awt.Color(255, 255, 255));
        tTiempos.setForeground(new java.awt.Color(0, 0, 0));
        tTiempos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Tiempo", "Tienda de Destino", "Tienda de Origen"
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
        jScrollPane5.setViewportView(tTiempos);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 490, 190));

        jLabel16.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Ver/Editar");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 70, -1, -1));

        jLabel17.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("ID de tiempo entre tiendas");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        jLabel12.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("ID");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, -1, -1));

        jLabel13.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Tiempo (dias)");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 240, -1, -1));

        tbID.setBackground(new java.awt.Color(255, 255, 255));
        tbID.setForeground(new java.awt.Color(0, 0, 0));
        tbID.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jPanel1.add(tbID, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 180, 240, 30));

        tbDias.setBackground(new java.awt.Color(255, 255, 255));
        tbDias.setForeground(new java.awt.Color(0, 0, 0));
        tbDias.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jPanel1.add(tbDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 230, 240, 30));

        jLabel14.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Tienda de destino");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, -1, -1));

        TbDestino.setBackground(new java.awt.Color(255, 255, 255));
        TbDestino.setForeground(new java.awt.Color(0, 0, 0));
        TbDestino.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jPanel1.add(TbDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 280, 240, 30));

        jLabel18.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Tienda de origen");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, -1, -1));

        tbOrigen.setBackground(new java.awt.Color(255, 255, 255));
        tbOrigen.setForeground(new java.awt.Color(0, 0, 0));
        tbOrigen.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jPanel1.add(tbOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 330, 240, 30));

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
        jPanel1.add(Cargar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 390, 110, 40));

        jLabel19.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 51, 51));
        jLabel19.setText("*");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 230, 30, 30));

        jLabel10.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 51));
        jLabel10.setText("*= Editable");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 400, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1093, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
    * Cargar datos a tb para luego editarlos
     */
    private void CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarActionPerformed

        try {
            int row = tTiempos.getSelectedRow();
            tbID.setText(tTiempos.getModel().getValueAt(row, 0).toString());
            tbDias.setText(tTiempos.getModel().getValueAt(row, 1).toString());
            TbDestino.setText(tTiempos.getModel().getValueAt(row, 2).toString());
            tbOrigen.setText(tTiempos.getModel().getValueAt(row, 3).toString());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_CargarActionPerformed

    private void tbTiemposKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbTiemposKeyPressed

    }//GEN-LAST:event_tbTiemposKeyPressed

    private void tbTiemposKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbTiemposKeyTyped

    }//GEN-LAST:event_tbTiemposKeyTyped
    /*
    * Metodo al iniciar el form
     */
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        cargarTabla2();
        listenertbTiempos();
        tbID.setEditable(false);
        TbDestino.setEditable(false);
        tbOrigen.setEditable(false);
    }//GEN-LAST:event_formComponentShown
    /*
    * Metodo para editar
     */
    private void Cargar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cargar1ActionPerformed
        if ((!tbID.getText().equals("")) && (!TbDestino.getText().equals("")) && (!tbOrigen.getText().equals("")) && (!tbDias.getText().equals(""))) {
            String query = ("UPDATE TIEMPO_ENTRE_TIENDAS SET tiempo = '" + Integer.parseInt(tbDias.getText()) + "' WHERE ID='" + Integer.parseInt(tbID.getText()) + "'");
            DbConnection a = new DbConnection();
            a.Insert(query);
            cargarTabla2();
            JOptionPane.showMessageDialog(null, "Se edito correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "Debe cargar un tiempo entre tiendas y llenar la casilla editable");
        }
    }//GEN-LAST:event_Cargar1ActionPerformed
    /*
    * Metodo para cargar la tabla de la base de datos
     */
    public void cargarTabla2() {
        String filter = tbTiempos.getText();
        String where = "";
        if (!filter.equals("")) {
            where = " WHERE tienda_origen = '" + nombre_tienda + "' && ID LIKE '%" + filter + "%' || tienda_destino='" + nombre_tienda + "' && ID LIKE '%" + filter + "%'";
        } else {
            where = " WHERE tienda_origen = '" + nombre_tienda + "' || tienda_destino='" + nombre_tienda + "'";
        }
        DefaultTableModel model = new DefaultTableModel();
        model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tTiempos.setModel(model);
        String Query = "SELECT * from TIEMPO_ENTRE_TIENDAS" + where + " ORDER BY tiempo ASC";
        DbConnection a = new DbConnection();
        ResultSet Result = a.SelectOnComboBox(Query);

        try {
            ResultSetMetaData ResultMd = Result.getMetaData();
            int columnscount = ResultMd.getColumnCount();
            model.addColumn("ID");
            model.addColumn("Tiempo");
            model.addColumn("Tienda de Destino");
            model.addColumn("Tienda de Origen");
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
    * Listener para tbTiempos y cuando cambie su valor
     */
    public void listenertbTiempos() {
        tbTiempos.getDocument().addDocumentListener(new DocumentListener() {
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
     * @param args tmain
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
            java.util.logging.Logger.getLogger(VisualizarTiempos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizarTiempos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizarTiempos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizarTiempos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualizarTiempos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cargar;
    private javax.swing.JButton Cargar1;
    private javax.swing.JFormattedTextField TbDestino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tTiempos;
    private javax.swing.JFormattedTextField tbDias;
    private javax.swing.JFormattedTextField tbID;
    private javax.swing.JFormattedTextField tbOrigen;
    private javax.swing.JTextField tbTiempos;
    // End of variables declaration//GEN-END:variables
}
