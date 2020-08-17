
package backend;

import DBsql.DbConnection;
import gui.MainFrame;

/**
 *
 * @author jeffrey
 */
public class MainClass {
     public static void main(String[] args) {

        DbConnection conexion=new DbConnection();
        conexion.conexionDB();
         MainFrame interfaz= new MainFrame();
         interfaz.setVisible(true);
        
    }
}
