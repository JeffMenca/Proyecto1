/*
 * Metodo para cargar la tabla de la base de datos
 */
package formsClients;

import DBsql.DbConnection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

/**
 * @author jeffrey
 */
public class catalogoProductos extends javax.swing.JFrame {

    /**
     * Crea form catalogoProductos
     */
    public catalogoProductos() {
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
        tbProducto = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tEmpleado = new javax.swing.JTable();
        cbFiltrar = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        chDescendente = new javax.swing.JCheckBox();
        chAscendente = new javax.swing.JCheckBox();
        jLabel17 = new javax.swing.JLabel();
        cbOrdenar = new javax.swing.JComboBox<>();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(49, 66, 82));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(229, 151, 253));

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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 920, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoMorado.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 331, -1));

        jLabel9.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Catalogo Productos");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

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
        jPanel1.add(tbProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 270, -1));

        jLabel15.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Categoria");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

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

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 860, 280));

        cbFiltrar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Codigo", "Fabricante" }));
        jPanel1.add(cbFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 270, -1));

        jLabel16.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Filtrar");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        chDescendente.setBackground(new java.awt.Color(51, 51, 51));
        chDescendente.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 13)); // NOI18N
        chDescendente.setForeground(new java.awt.Color(255, 255, 255));
        chDescendente.setText("Descendente");
        chDescendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chDescendenteActionPerformed(evt);
            }
        });
        jPanel1.add(chDescendente, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 250, -1, -1));

        chAscendente.setBackground(new java.awt.Color(51, 51, 51));
        chAscendente.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 13)); // NOI18N
        chAscendente.setForeground(new java.awt.Color(255, 255, 255));
        chAscendente.setSelected(true);
        chAscendente.setText("Ascedente");
        chAscendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chAscendenteActionPerformed(evt);
            }
        });
        jPanel1.add(chAscendente, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, -1, -1));

        jLabel17.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Ordenar");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, -1, -1));

        cbOrdenar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Codigo", "Fabricante", "Cantidad", "Precio" }));
        jPanel1.add(cbOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 270, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 921, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbProductoKeyTyped

    }//GEN-LAST:event_tbProductoKeyTyped

    private void tbProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbProductoKeyPressed

    }//GEN-LAST:event_tbProductoKeyPressed

    /*
    * Metodo para formulario inicial
     */
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        cargarTabla2();
        listenertbProducto();
        cbOrdenar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                cargarTabla2();
            }
        });
    }//GEN-LAST:event_formComponentShown
    /*
    * Metodo para cargar la tabla 2
     */
    private void chDescendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chDescendenteActionPerformed
        chAscendente.setSelected(false);
        cargarTabla2();
    }//GEN-LAST:event_chDescendenteActionPerformed
    /*
    * Metodo para cambiar a orden ascendente
     */
    private void chAscendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chAscendenteActionPerformed
        chDescendente.setSelected(false);
        cargarTabla2();
    }//GEN-LAST:event_chAscendenteActionPerformed
    /*
    * Metodo para cargar la tabla de la base de datos
     */
    public void cargarTabla2() {
        String filter = tbProducto.getText();
        String where = "";
        String orderby = " ORDER BY codigo";
        String ASDESC = " ASC";
        //Filtro
        if (!filter.equals("")) {
            if (cbFiltrar.getSelectedItem().toString().equals("Nombre")) {
                where = " WHERE nombre LIKE '%" + filter + "%' ";
            } else if (cbFiltrar.getSelectedItem().toString().equals("Codigo")) {
                where = " WHERE codigo LIKE '%" + filter + "%' ";
            } else if (cbFiltrar.getSelectedItem().toString().equals("Fabricante")) {
                where = " WHERE fabricante LIKE '%" + filter + "%' ";
            }
        } else {
            where = "";
        }
        //Orden ascendent/descendiente
        if (chDescendente.isSelected()) {
            ASDESC = " DESC";
        } else {
            ASDESC = " ASC";
        }
        //Ordenar
        if (cbOrdenar.getSelectedItem().toString().equals("Codigo")) {
            orderby = " ORDER BY codigo";
        } else if (cbOrdenar.getSelectedItem().toString().equals("Nombre")) {
            orderby = " ORDER BY nombre";
        } else if (cbOrdenar.getSelectedItem().toString().equals("Fabricante")) {
            orderby = " ORDER BY fabricante";
        } else if (cbOrdenar.getSelectedItem().toString().equals("Cantidad")) {
            orderby = " ORDER BY cantidad";
        } else if (cbOrdenar.getSelectedItem().toString().equals("Precio")) {
            orderby = " ORDER BY precio";
        } else {
            orderby = " ORDER BY codigo";
        }
        DefaultTableModel model = new DefaultTableModel();
        model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tEmpleado.setModel(model);
        String Query = "SELECT * FROM PRODUCTO" + where + orderby + ASDESC;
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
    * Metodo listener para productos
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
            java.util.logging.Logger.getLogger(catalogoProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(catalogoProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(catalogoProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(catalogoProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new catalogoProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbFiltrar;
    private javax.swing.JComboBox<String> cbOrdenar;
    private javax.swing.JCheckBox chAscendente;
    private javax.swing.JCheckBox chDescendente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tEmpleado;
    private javax.swing.JTextField tbProducto;
    // End of variables declaration//GEN-END:variables
}
