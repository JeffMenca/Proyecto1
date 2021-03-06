/*
 * paquetes
 */
package gui;

/*
 * imports
 */
import DBsql.DbConnection;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * @author jeffrey
 */
public class CargarArchivos extends javax.swing.JFrame {

    public static String[] datos = new String[25];
    public static File txt;
    public Boolean vacia = true;
    public static int lineaError = 0;

    /**
     * Crea CargarArchivos
     */
    public CargarArchivos() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(720, 450));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(49, 66, 82));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Droid Sans Mono", 1, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Archivo Seleccionado");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 197, -1, 26));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Kandira PERSONAL", 0, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(31, 203, 253), 3));
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 236, 300, 31));

        jButton2.setBackground(new java.awt.Color(20, 20, 20));
        jButton2.setFont(new java.awt.Font("Droid Sans Mono", 1, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Seleccionar archivo...");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(31, 203, 253), 3));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 238, 31));

        jButton3.setBackground(new java.awt.Color(20, 20, 20));
        jButton3.setFont(new java.awt.Font("Droid Sans Mono", 1, 15)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Cargar");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(31, 203, 253), 3));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 174, 43));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoAzul.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 331, -1));

        jPanel2.setBackground(new java.awt.Color(31, 203, 253));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 406, 670, -1));

        jLabel9.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cargar informacion");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

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

    /*
    * Metodo para cargar la tabla de la base de datos
     */
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        ComprobarDBVacia();


    }//GEN-LAST:event_formComponentShown
    /*
    * Metodo para cargar la tabla de la base de datos
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            cargarTXT(txt);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    /*
    * Metodo para seleccionar un archivo
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFileChooser file = new JFileChooser();
        file.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int returnVal = file.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            jTextField1.setText(file.getSelectedFile().getName());
            txt = file.getSelectedFile();
            jButton2.setEnabled(true);

        } else {
            jButton2.setEnabled(false);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /*
    * Metodo para vaciar el textbox
     */
    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MouseClicked

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
            java.util.logging.Logger.getLogger(CargarArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CargarArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CargarArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CargarArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CargarArchivos().setVisible(true);
            }
        });
    }

    /*
    * Metodo para cargar el txt
     */
    public void cargarTXT(File txt) throws FileNotFoundException, IOException {

        String frase = "", frasePorDividir;
        int contadorDeDatos = 0;
        FileReader f = new FileReader(txt);
        BufferedReader b = new BufferedReader(f);
        for (int i = 0; i < datos.length; i++) {
            datos[i] = "";
        }
        while ((frasePorDividir = b.readLine()) != null) {

            char[] fraseDividida = frasePorDividir.toCharArray();
            for (int i = 0; i < fraseDividida.length; i++) {
                if (fraseDividida[i] == 44) {
                    datos[contadorDeDatos] = frase;
                    contadorDeDatos++;
                    frase = "";
                } else {
                    frase = frase + String.valueOf(fraseDividida[i]);
                }
            }
            datos[contadorDeDatos] = frase;
            ComprobarTipoDeDato();
            frase = "";
            contadorDeDatos = 0;
            lineaError++;
        }
        JOptionPane.showMessageDialog(null, "Los datos sin errores se ingresaron exitosamente");
    }

    /*
    * Metodo para comprobar si la DB esta vacia
     */
    public void ComprobarDBVacia() {

        String[] tablas = new String[10];
        for (int i = 1; i <= 9; i++) {
            switch (i) {
                case 1:
                    tablas[i] = "TIENDA";
                    break;
                case 2:
                    tablas[i] = "TIEMPO_ENTRE_TIENDAS";
                    break;
                case 3:
                    tablas[i] = "EMPLEADO";
                    break;
                case 4:
                    tablas[i] = "CLIENTE";
                    break;
                case 5:
                    tablas[i] = "PRODUCTO";
                    break;
                case 6:
                    tablas[i] = "FACTURA";
                    break;
                case 7:
                    tablas[i] = "VENTA";
                    break;
                case 8:
                    tablas[i] = "PEDIDO";
                    break;
                case 9:
                    tablas[i] = "RECIBO";
                    break;
                default:
                    break;
            }
            String Query = "SELECT * FROM " + tablas[i];
            DbConnection a = new DbConnection();
            ResultSet Result = a.Select(Query);
            try {
                if ((Result != null) && (Result.next())) {
                    vacia = false;
                }

            } catch (SQLException ex) {
            }
        }
        if (vacia == true) {
            jButton2.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "No puede cargar datos, la base de datos no esta vacia");
            jButton2.setEnabled(false);
            jButton3.setEnabled(false);
        }
    }

    /*
    * Metodo para comprobar el tipo de dato
     */
    public void ComprobarTipoDeDato() {

        switch (datos[0]) {
            case "TIENDA": {
                try {
                    String query = ("INSERT INTO TIENDA VALUES('" + datos[3] + "','" + datos[1] + "','" + datos[4] + "','" + datos[2] + "','" + datos[5] + "','" + datos[6] + "','" + datos[7] + "')");
                    DbConnection a = new DbConnection();
                    a.Insert(query);

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error en el txt en la linea " + lineaError);
                }
                break;

            }
            case "TIEMPO": {
                try {
                    String query = ("INSERT INTO TIEMPO_ENTRE_TIENDAS VALUES('" + 0 + "','" + Integer.parseInt(datos[3]) + "','" + datos[2] + "','" + datos[1] + "')");
                    DbConnection a = new DbConnection();
                    a.Insert(query);

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error en el txt en la linea " + lineaError);
                }
                break;

            }
            case "PRODUCTO": {
                try {
                    String query = ("INSERT INTO PRODUCTO VALUES('" + datos[3] + "','" + datos[1] + "','" + datos[2] + "','" + Integer.parseInt(datos[4]) + "','" + Double.parseDouble(datos[5]) + "','" + datos[7] + "','" + 0 + "','" + datos[6] + "')");
                    DbConnection a = new DbConnection();
                    a.Insert(query);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error en el txt en la linea " + lineaError);
                }
                break;

            }
            case "CLIENTE": {
                try {
                    String query = ("INSERT INTO CLIENTE VALUES('" + datos[2] + "','" + datos[1] + "','" + datos[3] + "','" + datos[5] + "','" + Double.parseDouble(datos[4]) + "','" + datos[6] + "','" + datos[7] + "')");
                    DbConnection a = new DbConnection();
                    a.Insert(query);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error en el txt en la linea " + lineaError);
                }
                break;

            }
            case "EMPLEADO": {
                try {
                    String query = ("INSERT INTO EMPLEADO VALUES('" + datos[2] + "','" + datos[1] + "','" + datos[3] + "','" + datos[5] + "','" + datos[4] + "','" + datos[6] + "','" + datos[7] + "')");
                    DbConnection a = new DbConnection();
                    a.Insert(query);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error en el txt en la linea " + lineaError);
                }
                break;

            }
            case "PEDIDO": {
                try {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    String date = datos[4];
                    LocalDate fecha = LocalDate.parse(date, formatter);
                    String query = ("INSERT INTO PEDIDO VALUES('" + 0 + "','" + fecha + "','" + Integer.parseInt(datos[7]) + "','" + Double.parseDouble(datos[8]) + "','" + Double.parseDouble(datos[9]) + "','" + datos[6] + "','" + datos[5] + "','" + datos[2] + "','" + datos[3] + "')");
                    DbConnection a = new DbConnection();
                    a.Insert(query);

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error en el txt en la linea " + lineaError);
                }
                break;

            }
            default:
                break;
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
