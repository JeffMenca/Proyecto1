/*
 * Paquetes
 */
package forms;

/*
 * imports
 */
import DBsql.DbConnection;
import javax.swing.JOptionPane;

/**
 *
 * @author jeffrey
 */
public class ingresoUsuarios extends javax.swing.JFrame {

    /**
     * Create form ingresoUsuarios
     */
    public ingresoUsuarios() {
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
        lb1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tbDPI = new javax.swing.JTextField();
        tbtelefono = new javax.swing.JTextField();
        tbdireccion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lb7 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        tbCodigoNIT = new javax.swing.JTextField();
        tbNITcredito = new javax.swing.JTextField();
        tbcorreo = new javax.swing.JTextField();
        lb5 = new javax.swing.JLabel();
        lb6 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        tbnombre = new javax.swing.JTextField();
        jfcredito = new javax.swing.JFormattedTextField();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 920, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoCeleste.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 331, -1));

        lb1.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        lb1.setForeground(new java.awt.Color(255, 51, 51));
        lb1.setText("*");
        jPanel1.add(lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 20, 30));

        jLabel3.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, 40));

        jLabel4.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefono");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, 30));

        jLabel5.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NIT");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, 30));

        jLabel6.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Correo electronico");
        jLabel6.setToolTipText("");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, 50));

        jLabel7.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DPI");
        jLabel7.setToolTipText("");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, -1, 30));

        jLabel8.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Direccion");
        jLabel8.setToolTipText("");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, -1, 30));

        tbDPI.setBackground(new java.awt.Color(255, 255, 255));
        tbDPI.setFont(new java.awt.Font("Droid Sans Mono Slashed", 0, 12)); // NOI18N
        tbDPI.setForeground(new java.awt.Color(0, 0, 0));
        tbDPI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbDPIKeyTyped(evt);
            }
        });
        jPanel1.add(tbDPI, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 240, -1));

        tbtelefono.setBackground(new java.awt.Color(255, 255, 255));
        tbtelefono.setFont(new java.awt.Font("Droid Sans Mono Slashed", 0, 12)); // NOI18N
        tbtelefono.setForeground(new java.awt.Color(0, 0, 0));
        tbtelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbtelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(tbtelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 240, -1));

        tbdireccion.setBackground(new java.awt.Color(255, 255, 255));
        tbdireccion.setFont(new java.awt.Font("Droid Sans Mono Slashed", 0, 12)); // NOI18N
        tbdireccion.setForeground(new java.awt.Color(0, 0, 0));
        tbdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbdireccionActionPerformed(evt);
            }
        });
        jPanel1.add(tbdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, 240, -1));

        jLabel9.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ingreso de Usuarios");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jLabel10.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 51));
        jLabel10.setText("*=Obligatorio");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, -1, -1));

        lb7.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        lb7.setForeground(new java.awt.Color(255, 51, 51));
        lb7.setText("*");
        jPanel1.add(lb7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, 30, 50));

        lb2.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        lb2.setForeground(new java.awt.Color(255, 51, 51));
        lb2.setText("*");
        jPanel1.add(lb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 30, 30));

        lb3.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        lb3.setForeground(new java.awt.Color(255, 51, 51));
        lb3.setText("*");
        jPanel1.add(lb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 30, 30));

        jLabel12.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Codigo del empleado");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        lb4.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        lb4.setForeground(new java.awt.Color(255, 51, 51));
        lb4.setText("*");
        jPanel1.add(lb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 30, 30));

        tbCodigoNIT.setBackground(new java.awt.Color(255, 255, 255));
        tbCodigoNIT.setFont(new java.awt.Font("Droid Sans Mono Slashed", 0, 12)); // NOI18N
        tbCodigoNIT.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(tbCodigoNIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 240, -1));

        tbNITcredito.setBackground(new java.awt.Color(255, 255, 255));
        tbNITcredito.setFont(new java.awt.Font("Droid Sans Mono Slashed", 0, 12)); // NOI18N
        tbNITcredito.setForeground(new java.awt.Color(0, 0, 0));
        tbNITcredito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbNITcreditoKeyTyped(evt);
            }
        });
        jPanel1.add(tbNITcredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 240, -1));

        tbcorreo.setBackground(new java.awt.Color(255, 255, 255));
        tbcorreo.setFont(new java.awt.Font("Droid Sans Mono Slashed", 0, 12)); // NOI18N
        tbcorreo.setForeground(new java.awt.Color(0, 0, 0));
        tbcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbcorreoActionPerformed(evt);
            }
        });
        jPanel1.add(tbcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 240, -1));

        lb5.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        lb5.setForeground(new java.awt.Color(255, 51, 51));
        lb5.setText("*");
        jPanel1.add(lb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 30, 40));

        lb6.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        lb6.setForeground(new java.awt.Color(255, 51, 51));
        lb6.setText("*");
        jPanel1.add(lb6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, 30, 50));

        jCheckBox1.setBackground(new java.awt.Color(102, 102, 102));
        jCheckBox1.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 19)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Clientes");
        jCheckBox1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox1StateChanged(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, -1));

        jCheckBox2.setBackground(new java.awt.Color(102, 102, 102));
        jCheckBox2.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 19)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("Empleados");
        jCheckBox2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox2StateChanged(evt);
            }
        });
        jPanel1.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ingresar");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 255, 245), 3));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 550, 110, 40));

        tbnombre.setBackground(new java.awt.Color(255, 255, 255));
        tbnombre.setFont(new java.awt.Font("Droid Sans Mono Slashed", 0, 12)); // NOI18N
        tbnombre.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(tbnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 240, -1));

        jfcredito.setBackground(new java.awt.Color(255, 255, 255));
        jfcredito.setForeground(new java.awt.Color(0, 0, 0));
        jfcredito.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jPanel1.add(jfcredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 240, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbdireccionActionPerformed

    }//GEN-LAST:event_tbdireccionActionPerformed

    private void tbcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbcorreoActionPerformed

    }//GEN-LAST:event_tbcorreoActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

    }//GEN-LAST:event_jCheckBox1ActionPerformed
    /*
    * Metodo para ingresar usuarios
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if ((jCheckBox1.isSelected() == false) && ((jCheckBox2.isSelected() == false))) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar que tipo de usuario desea");
        } else {
            if (jCheckBox2.isSelected()) {

                if ((tbCodigoNIT.getText().equals("")) || (tbnombre.getText().equals("")) || (tbtelefono.getText().equals("")) || (tbDPI.getText().equals("")) || (tbcorreo.getText().equals("")) || (tbdireccion.getText().equals(""))) {
                    JOptionPane.showMessageDialog(null, "Debe llenar los campos obligatorios");
                } else {
                    String codigo = tbCodigoNIT.getText();
                    String nombre = tbnombre.getText();
                    String telefono = tbtelefono.getText();
                    String NIT = tbNITcredito.getText();
                    String DPI = tbDPI.getText();
                    String correo = tbcorreo.getText();
                    String direccion = tbdireccion.getText();

                    String query = ("INSERT INTO EMPLEADO VALUES('" + codigo + "','" + nombre + "','" + telefono + "','" + NIT + "','" + DPI + "','" + correo + "','" + direccion + "')");
                    DbConnection a = new DbConnection();
                    a.Insert(query);
                    JOptionPane.showMessageDialog(null, "Empleado ingresado correctamente");
                    tbCodigoNIT.setText("");
                    tbnombre.setText("");
                    tbtelefono.setText("");
                    tbNITcredito.setText("");
                    jfcredito.setText("");
                    tbDPI.setText("");
                    tbcorreo.setText("");
                    tbdireccion.setText("");
                }

            } else if (jCheckBox1.isSelected()) {
                if ((tbCodigoNIT.getText().equals("")) || (tbnombre.getText().equals("")) || (tbtelefono.getText().equals(""))) {
                    JOptionPane.showMessageDialog(null, "Debe llenar los campos obligatorios");
                } else {
                    String NIT = tbCodigoNIT.getText();
                    String nombre = tbnombre.getText();
                    String telefono = tbtelefono.getText();
                    String DPI = tbDPI.getText();
                    String correo = tbcorreo.getText();
                    String direccion = tbdireccion.getText();
                    Double credito;
                    if (jfcredito.getText().length() == 0) {
                        credito = 0.0;
                    } else {
                        credito = Double.parseDouble(jfcredito.getText());
                    }

                    String query = ("INSERT INTO CLIENTE VALUES('" + NIT + "','" + nombre + "','" + telefono + "','" + DPI + "','" + credito + "','" + correo + "','" + direccion + "')");
                    DbConnection a = new DbConnection();
                    a.Insert(query);
                    JOptionPane.showMessageDialog(null, "Cliente ingresado correctamente");
                    tbCodigoNIT.setText("");
                    tbnombre.setText("");
                    tbtelefono.setText("");
                    tbNITcredito.setText("");
                    jfcredito.setText("");
                    tbDPI.setText("");
                    tbcorreo.setText("");
                    tbdireccion.setText("");
                }

            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    /*
    * Metodo para cambiar de cliente a usuario
     */
    private void jCheckBox2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox2StateChanged
        if (jCheckBox2.isSelected() == true) {
            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(true);
            jLabel12.setText("Codigo del empleado");
            jLabel5.setText("NIT");
            jLabel9.setText("Ingreso de Empleados");
            lb1.setVisible(true);
            lb2.setVisible(true);
            lb3.setVisible(true);
            lb4.setVisible(false);
            lb5.setVisible(true);
            lb6.setVisible(true);
            lb7.setVisible(true);
            tbNITcredito.setEnabled(true);
            tbNITcredito.setVisible(true);
            jfcredito.setEnabled(false);
            jfcredito.setVisible(false);

        }
    }//GEN-LAST:event_jCheckBox2StateChanged
    /*
    * Metodo para cambiar de usuario a cliente
     */
    private void jCheckBox1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox1StateChanged
        if (jCheckBox1.isSelected() == true) {
            jCheckBox2.setSelected(false);
            jCheckBox1.setSelected(true);
            jLabel12.setText("Nit del cliente");
            jLabel5.setText("Credito");
            jLabel9.setText("Ingreso de Clientes");
            lb1.setVisible(true);
            lb2.setVisible(true);
            lb3.setVisible(true);
            lb4.setVisible(false);
            lb5.setVisible(false);
            lb6.setVisible(false);
            lb7.setVisible(false);
            tbNITcredito.setEnabled(false);
            tbNITcredito.setVisible(false);
            jfcredito.setEnabled(true);
            jfcredito.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox1StateChanged
    /*
    * Metodo cuando inicia el formulario
     */
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        lb1.setVisible(false);
        lb2.setVisible(false);
        lb3.setVisible(false);
        lb4.setVisible(false);
        lb5.setVisible(false);
        lb6.setVisible(false);
        lb7.setVisible(false);
    }//GEN-LAST:event_formComponentShown
    /*
    * Metodo para limitar caracteres
     */
    private void tbtelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbtelefonoKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
        if (tbtelefono.getText().length() == 8)
            evt.consume();
    }//GEN-LAST:event_tbtelefonoKeyTyped

    private void tbNITcreditoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbNITcreditoKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
        if (tbNITcredito.getText().length() == 13)
            evt.consume();
    }//GEN-LAST:event_tbNITcreditoKeyTyped

    private void tbDPIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbDPIKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
        if (tbDPI.getText().length() == 13)
            evt.consume();
    }//GEN-LAST:event_tbDPIKeyTyped

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
            java.util.logging.Logger.getLogger(ingresoUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ingresoUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ingresoUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ingresoUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ingresoUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JFormattedTextField jfcredito;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JLabel lb7;
    private javax.swing.JTextField tbCodigoNIT;
    private javax.swing.JTextField tbDPI;
    private javax.swing.JTextField tbNITcredito;
    private javax.swing.JTextField tbcorreo;
    private javax.swing.JTextField tbdireccion;
    private javax.swing.JTextField tbnombre;
    private javax.swing.JTextField tbtelefono;
    // End of variables declaration//GEN-END:variables
}
