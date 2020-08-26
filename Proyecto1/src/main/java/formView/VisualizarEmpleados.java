/*
 * Paquetes
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
public class VisualizarEmpleados extends javax.swing.JFrame {

    /**
     * Crea form VisualizarUsuarios
     */
    public VisualizarEmpleados() {
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
        tbEmpleado = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tEmpleado = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tbCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tbnombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tbtelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tbNIT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tbDPI = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tbcorreo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tbdireccion = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Cargar1 = new javax.swing.JButton();

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
        jLabel9.setText("Visualizar Empleados");
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

        tbEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        tbEmpleado.setFont(new java.awt.Font("Droid Sans Mono Slashed", 0, 12)); // NOI18N
        tbEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        tbEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbEmpleadoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbEmpleadoKeyTyped(evt);
            }
        });
        jPanel1.add(tbEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 320, -1));

        jLabel15.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Filtrar");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        tEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        tEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        tEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Telefono", "NIT", "DPI", "Correo", "Direccion"
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
        jScrollPane5.setViewportView(tEmpleado);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 530, 190));

        jLabel16.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Ver/Editar");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 80, -1, -1));

        jLabel17.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Codigo empleado/ Nombre");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        jLabel12.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Codigo del empleado");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, -1, -1));

        tbCodigo.setBackground(new java.awt.Color(255, 255, 255));
        tbCodigo.setFont(new java.awt.Font("Droid Sans Mono Slashed", 0, 12)); // NOI18N
        tbCodigo.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(tbCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 170, 240, -1));

        jLabel3.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, -1, 40));

        tbnombre.setBackground(new java.awt.Color(255, 255, 255));
        tbnombre.setFont(new java.awt.Font("Droid Sans Mono Slashed", 0, 12)); // NOI18N
        tbnombre.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(tbnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 210, 240, -1));

        jLabel4.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefono");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 250, -1, 30));

        tbtelefono.setBackground(new java.awt.Color(255, 255, 255));
        tbtelefono.setFont(new java.awt.Font("Droid Sans Mono Slashed", 0, 12)); // NOI18N
        tbtelefono.setForeground(new java.awt.Color(0, 0, 0));
        tbtelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbtelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(tbtelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 250, 240, -1));

        jLabel5.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NIT");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 290, -1, 30));

        tbNIT.setBackground(new java.awt.Color(255, 255, 255));
        tbNIT.setFont(new java.awt.Font("Droid Sans Mono Slashed", 0, 12)); // NOI18N
        tbNIT.setForeground(new java.awt.Color(0, 0, 0));
        tbNIT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbNITKeyTyped(evt);
            }
        });
        jPanel1.add(tbNIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 290, 240, -1));

        jLabel7.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DPI");
        jLabel7.setToolTipText("");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 330, -1, 30));

        tbDPI.setBackground(new java.awt.Color(255, 255, 255));
        tbDPI.setFont(new java.awt.Font("Droid Sans Mono Slashed", 0, 12)); // NOI18N
        tbDPI.setForeground(new java.awt.Color(0, 0, 0));
        tbDPI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbDPIKeyTyped(evt);
            }
        });
        jPanel1.add(tbDPI, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 330, 240, -1));

        jLabel6.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Correo electronico");
        jLabel6.setToolTipText("");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, -1, 50));

        tbcorreo.setBackground(new java.awt.Color(255, 255, 255));
        tbcorreo.setFont(new java.awt.Font("Droid Sans Mono Slashed", 0, 12)); // NOI18N
        tbcorreo.setForeground(new java.awt.Color(0, 0, 0));
        tbcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbcorreoActionPerformed(evt);
            }
        });
        jPanel1.add(tbcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 370, 240, -1));

        jLabel8.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Direccion");
        jLabel8.setToolTipText("");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, -1, 30));

        tbdireccion.setBackground(new java.awt.Color(255, 255, 255));
        tbdireccion.setFont(new java.awt.Font("Droid Sans Mono Slashed", 0, 12)); // NOI18N
        tbdireccion.setForeground(new java.awt.Color(0, 0, 0));
        tbdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbdireccionActionPerformed(evt);
            }
        });
        jPanel1.add(tbdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 410, 240, -1));

        jLabel19.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 51, 51));
        jLabel19.setText("*");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 210, 30, 30));

        jLabel20.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 51, 51));
        jLabel20.setText("*");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 370, 30, 30));

        jLabel21.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 51, 51));
        jLabel21.setText("*");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 290, 30, 30));

        jLabel22.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 51, 51));
        jLabel22.setText("*");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 330, 30, 30));

        jLabel23.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 51, 51));
        jLabel23.setText("*");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 410, 30, 30));

        jLabel24.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 51, 51));
        jLabel24.setText("*");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 250, 30, 30));

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
    * Cargar los datos a tb para poder editarlos
     */
    private void CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarActionPerformed

        try {
            int row = tEmpleado.getSelectedRow();
            tbCodigo.setText(tEmpleado.getModel().getValueAt(row, 0).toString());
            tbnombre.setText(tEmpleado.getModel().getValueAt(row, 1).toString());
            tbtelefono.setText(tEmpleado.getModel().getValueAt(row, 2).toString());
            tbNIT.setText(tEmpleado.getModel().getValueAt(row, 3).toString());
            tbDPI.setText(tEmpleado.getModel().getValueAt(row, 4).toString());
            tbcorreo.setText(tEmpleado.getModel().getValueAt(row, 5).toString());
            tbdireccion.setText(tEmpleado.getModel().getValueAt(row, 6).toString());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_CargarActionPerformed

    private void tbEmpleadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbEmpleadoKeyPressed

    }//GEN-LAST:event_tbEmpleadoKeyPressed

    private void tbEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbEmpleadoKeyTyped

    }//GEN-LAST:event_tbEmpleadoKeyTyped
    /*
    * Limitacion de caracteres
     */
    private void tbtelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbtelefonoKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
        if (tbtelefono.getText().length() == 8)
            evt.consume();
    }//GEN-LAST:event_tbtelefonoKeyTyped

    private void tbNITKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbNITKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
        if (tbNIT.getText().length() == 13)
            evt.consume();
    }//GEN-LAST:event_tbNITKeyTyped

    private void tbDPIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbDPIKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
        if (tbDPI.getText().length() == 13)
            evt.consume();
    }//GEN-LAST:event_tbDPIKeyTyped

    private void tbcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbcorreoActionPerformed

    }//GEN-LAST:event_tbcorreoActionPerformed

    private void tbdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbdireccionActionPerformed

    }//GEN-LAST:event_tbdireccionActionPerformed
    /*
    * Metodo cuando inicia el form
     */
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        cargarTabla2();
        listenertbEmpleado();
        tbCodigo.setEnabled(false);
    }//GEN-LAST:event_formComponentShown
    /*
    * Metodo para editar
     */
    private void Cargar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cargar1ActionPerformed
        if ((tbCodigo.getText().equals("")) || (tbnombre.getText().equals("")) || (tbtelefono.getText().equals("")) || (tbDPI.getText().equals("")) || (tbcorreo.getText().equals("")) || (tbdireccion.getText().equals(""))) {
            JOptionPane.showMessageDialog(null, "Debe llenar los campos obligatorios");
        } else {
            String codigo = tbCodigo.getText();
            String nombre = tbnombre.getText();
            String telefono = tbtelefono.getText();
            String NIT = tbNIT.getText();
            String DPI = tbDPI.getText();
            String correo = tbcorreo.getText();
            String direccion = tbdireccion.getText();

            String query = ("UPDATE EMPLEADO SET nombre ='" + nombre + "',telefono='" + telefono + "',  NIT='" + NIT + "',DPI='" + DPI + "',correo='" + correo + "',direccion='" + direccion + "' WHERE codigo='" + codigo + "'");
            DbConnection a = new DbConnection();
            a.Insert(query);
            JOptionPane.showMessageDialog(null, "Empleado ingresado correctamente");
            cargarTabla2();
        }

    }//GEN-LAST:event_Cargar1ActionPerformed
    /*
    * Metodo para cargar la tabla de la base de datos
     */
    public void cargarTabla2() {
        String filter = tbEmpleado.getText();
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
        String Query = "SELECT * FROM EMPLEADO" + where + " ORDER BY codigo ASC";
        DbConnection a = new DbConnection();
        ResultSet Result = a.SelectOnComboBox(Query);

        try {
            ResultSetMetaData ResultMd = Result.getMetaData();
            int columnscount = ResultMd.getColumnCount();
            model.addColumn("Codigo");
            model.addColumn("Nombre");
            model.addColumn("Telefono");
            model.addColumn("NIT");
            model.addColumn("DPI");
            model.addColumn("Correo");
            model.addColumn("Direccion");
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
    * Listener para tb empleado y cuando cambia su valor
     */
    public void listenertbEmpleado() {
        tbEmpleado.getDocument().addDocumentListener(new DocumentListener() {
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
            java.util.logging.Logger.getLogger(VisualizarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualizarEmpleados().setVisible(true);
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
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
    private javax.swing.JTextField tbCodigo;
    private javax.swing.JTextField tbDPI;
    private javax.swing.JTextField tbEmpleado;
    private javax.swing.JTextField tbNIT;
    private javax.swing.JTextField tbcorreo;
    private javax.swing.JTextField tbdireccion;
    private javax.swing.JTextField tbnombre;
    private javax.swing.JTextField tbtelefono;
    // End of variables declaration//GEN-END:variables
}
