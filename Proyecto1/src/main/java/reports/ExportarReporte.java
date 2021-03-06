/*
 * Metodo para exportar reportes
 */
package reports;

import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author jeffrey
 */
public class ExportarReporte extends javax.swing.JFrame {

    public JTable tablaexportada = new JTable();
    public String titulo = "";
    public String nombre = "";

    /**
     * Crea form ExportarReporte
     */
    public ExportarReporte() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        tbNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(49, 66, 82));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoCeleste.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 310, -1));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Exportar");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 255, 245), 3));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 114, 47));

        tbNombre.setBackground(new java.awt.Color(255, 255, 255));
        tbNombre.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 13)); // NOI18N
        tbNombre.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(tbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 313, 32));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre de archivo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Droid Sans Mono Slashed", 1, 19)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Exportar reporte a HTML");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        jPanel2.setBackground(new java.awt.Color(49, 255, 245));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 430, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
    * Metodo para exportar reporte a html
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!tbNombre.getText().equals("")) {
            nombre = tbNombre.getText();
            CrearArchivo(tablaexportada, titulo);
            JOptionPane.showMessageDialog(null, "Archivo exportado correctamente");
            tbNombre.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar el nombre del archivo");
        }

    }//GEN-LAST:event_jButton1ActionPerformed
    /*
    * Metodo para crear archivo html
     */
    public void CrearArchivo(JTable tabla, String titulo) {
        try {
            PrintWriter writer = new PrintWriter("Reportes/" + nombre + ".html", "UTF-8");
            writer.println("<html>");
            writer.println("<h1 style=\"color:white;\"><center>" + "Intelaf" + "</center</h1>");
            writer.println("<h2 style=\"color:white;\"><center>" + " " + "</center</h2>");
            writer.println("<h3 style=\"color:white;\"><center>" + titulo + "</center</h3>");
            writer.println("<body style=\"background-color:#314252 ;\">");
            writer.println("<style type=" + "\"" + "text/css" + "\"" + ">");
            writer.println("table, th, td {");
            writer.println("border: 3px solid white;");
            writer.println("border-collapse: collapse;");
            writer.println("border-color: #6699FF;");
            writer.println("background-color: #333333;");
            writer.println("}");
            writer.println(" th, td {");
            writer.println("color: white;");
            writer.println("padding: 10px;");
            writer.println("text align: center");
            writer.println("}");
            writer.println("</style>");
            writer.println("<table style=" + "\"" + "width: 100%" + "\"" + " >");
            writer.println("<tr>");
            for (int i = 0; i < tabla.getColumnCount(); i++) {
                writer.println("<th><strong>" + tabla.getColumnName(i) + "</strong></th>");
            }
            writer.println("</tr>");
            for (int i = 0; i < tabla.getRowCount(); i++) {
                writer.println("<tr>");
                for (int j = 0; j < tabla.getColumnCount(); j++) {
                    writer.println("<td>" + tabla.getModel().getValueAt(i, j).toString() + "</td>");
                }
                writer.println("<tr>");
            }
            writer.println("</table>");
            writer.println("</body>");
            writer.println("</html>");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
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
            java.util.logging.Logger.getLogger(ExportarReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExportarReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExportarReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExportarReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExportarReporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tbNombre;
    // End of variables declaration//GEN-END:variables
}
