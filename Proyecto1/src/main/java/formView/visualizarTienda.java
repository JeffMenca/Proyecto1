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
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jeffrey
 */
public class visualizarTienda extends javax.swing.JFrame {

    /**
     * Creates form visualizarTienda
     */
    public visualizarTienda() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tbnombre = new javax.swing.JTextField();
        tbdireccion = new javax.swing.JTextField();
        tbtelefono2 = new javax.swing.JTextField();
        tbcorreo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tbhorario = new javax.swing.JTextField();
        Cargar = new javax.swing.JButton();
        tbtelefono1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tbcodigo = new javax.swing.JTextField();
        tbTienda = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tTiendas = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

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

        jLabel3.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Direccion");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 250, -1, 30));

        jLabel5.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Telefono 1");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, -1, 30));

        jLabel6.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Correo Electronico");
        jLabel6.setToolTipText("");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, -1, 40));

        jLabel7.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Telefono 2");
        jLabel7.setToolTipText("");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, -1, 30));

        jLabel8.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Horario");
        jLabel8.setToolTipText("");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 410, -1, 30));

        tbnombre.setBackground(new java.awt.Color(255, 255, 255));
        tbnombre.setFont(new java.awt.Font("Droid Sans Mono Slashed", 0, 12)); // NOI18N
        tbnombre.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(tbnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 210, 240, -1));

        tbdireccion.setBackground(new java.awt.Color(255, 255, 255));
        tbdireccion.setFont(new java.awt.Font("Droid Sans Mono Slashed", 0, 12)); // NOI18N
        tbdireccion.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(tbdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 250, 240, -1));

        tbtelefono2.setBackground(new java.awt.Color(255, 255, 255));
        tbtelefono2.setFont(new java.awt.Font("Droid Sans Mono Slashed", 0, 12)); // NOI18N
        tbtelefono2.setForeground(new java.awt.Color(0, 0, 0));
        tbtelefono2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbtelefono2KeyTyped(evt);
            }
        });
        jPanel1.add(tbtelefono2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 330, 240, -1));

        tbcorreo.setBackground(new java.awt.Color(255, 255, 255));
        tbcorreo.setFont(new java.awt.Font("Droid Sans Mono Slashed", 0, 12)); // NOI18N
        tbcorreo.setForeground(new java.awt.Color(0, 0, 0));
        tbcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbcorreoActionPerformed(evt);
            }
        });
        jPanel1.add(tbcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 370, 240, -1));

        jLabel9.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Visualizar Tiendas");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        jLabel12.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Nombre");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 210, -1, -1));

        tbhorario.setBackground(new java.awt.Color(255, 255, 255));
        tbhorario.setFont(new java.awt.Font("Droid Sans Mono Slashed", 0, 12)); // NOI18N
        tbhorario.setForeground(new java.awt.Color(0, 0, 0));
        tbhorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbhorarioActionPerformed(evt);
            }
        });
        jPanel1.add(tbhorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 410, 240, -1));

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
        jPanel1.add(Cargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, 110, 40));

        tbtelefono1.setBackground(new java.awt.Color(255, 255, 255));
        tbtelefono1.setFont(new java.awt.Font("Droid Sans Mono Slashed", 0, 12)); // NOI18N
        tbtelefono1.setForeground(new java.awt.Color(0, 0, 0));
        tbtelefono1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbtelefono1KeyTyped(evt);
            }
        });
        jPanel1.add(tbtelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 290, 240, -1));

        jLabel4.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Codigo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, -1, 40));

        tbcodigo.setBackground(new java.awt.Color(255, 255, 255));
        tbcodigo.setFont(new java.awt.Font("Droid Sans Mono Slashed", 0, 12)); // NOI18N
        tbcodigo.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(tbcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 170, 240, -1));

        tbTienda.setBackground(new java.awt.Color(255, 255, 255));
        tbTienda.setFont(new java.awt.Font("Droid Sans Mono Slashed", 0, 12)); // NOI18N
        tbTienda.setForeground(new java.awt.Color(0, 0, 0));
        tbTienda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbTiendaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbTiendaKeyTyped(evt);
            }
        });
        jPanel1.add(tbTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 320, -1));

        jLabel15.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Filtrar");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        tTiendas.setBackground(new java.awt.Color(255, 255, 255));
        tTiendas.setForeground(new java.awt.Color(0, 0, 0));
        tTiendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Direccion", "Telefono 1", "Telefono 2", "Correo", "Horario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tTiendas);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 530, 190));

        jLabel16.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Ver tienda");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 80, -1, -1));

        jLabel17.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Codigo de tienda/ Nombre");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

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

    private void tbtelefono2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbtelefono2KeyTyped

    }//GEN-LAST:event_tbtelefono2KeyTyped

    private void tbcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbcorreoActionPerformed

    }//GEN-LAST:event_tbcorreoActionPerformed

    private void tbhorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbhorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbhorarioActionPerformed

    /*
    * Metodo para cargar a tb los datos
     */
    private void CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarActionPerformed

        try {
            int row = tTiendas.getSelectedRow();
            tbcodigo.setText(tTiendas.getModel().getValueAt(row, 0).toString());
            tbnombre.setText(tTiendas.getModel().getValueAt(row, 1).toString());
            tbdireccion.setText(tTiendas.getModel().getValueAt(row, 2).toString());
            tbtelefono1.setText(tTiendas.getModel().getValueAt(row, 3).toString());
            tbtelefono2.setText(tTiendas.getModel().getValueAt(row, 4).toString());
            tbcorreo.setText(tTiendas.getModel().getValueAt(row, 5).toString());
            tbhorario.setText(tTiendas.getModel().getValueAt(row, 6).toString());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_CargarActionPerformed

    private void tbtelefono1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbtelefono1KeyTyped

    }//GEN-LAST:event_tbtelefono1KeyTyped

    private void tbTiendaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbTiendaKeyPressed

    }//GEN-LAST:event_tbTiendaKeyPressed

    private void tbTiendaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbTiendaKeyTyped

    }//GEN-LAST:event_tbTiendaKeyTyped
    /*
    * Metodo al iniciar el form
     */
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        cargarTabla2();
        listenertbTienda();
    }//GEN-LAST:event_formComponentShown
    /*
    * Metodo para cargar la tabla de la base de datos
     */
    public void cargarTabla2() {
        String filter = tbTienda.getText();
        String where = "";
        if (!filter.equals("")) {
            where = " WHERE codigo LIKE '%" + filter + "%' ORDER BY nombre ASC || nombre LIKE '%" + filter + "%' ORDER BY nombre ASC ";
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
        tTiendas.setModel(model);
        String Query = "SELECT * FROM TIENDA" + where;
        DbConnection a = new DbConnection();
        ResultSet Result = a.SelectOnComboBox(Query);

        try {
            ResultSetMetaData ResultMd = Result.getMetaData();
            int columnscount = ResultMd.getColumnCount();
            model.addColumn("Codigo");
            model.addColumn("Nombre");
            model.addColumn("Direccion");
            model.addColumn("Telefono 1");
            model.addColumn("Telefono 2");
            model.addColumn("Correo");
            model.addColumn("Horario");
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
    * Metodo listener para tbTienda y cuando cambie su valor
     */
    public void listenertbTienda() {
        tbTienda.getDocument().addDocumentListener(new DocumentListener() {
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
            java.util.logging.Logger.getLogger(visualizarTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(visualizarTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(visualizarTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(visualizarTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new visualizarTienda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cargar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JTable tTiendas;
    private javax.swing.JTextField tbTienda;
    private javax.swing.JTextField tbcodigo;
    private javax.swing.JTextField tbcorreo;
    private javax.swing.JTextField tbdireccion;
    private javax.swing.JTextField tbhorario;
    private javax.swing.JTextField tbnombre;
    private javax.swing.JTextField tbtelefono1;
    private javax.swing.JTextField tbtelefono2;
    // End of variables declaration//GEN-END:variables
}
