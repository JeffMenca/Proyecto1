
package backend;

import DBsql.DbConnection;
import gui.MainFrame;
import java.io.File;

/**
 *
 * @author jeffrey
 */
public class MainClass {

    public static void main(String[] args) {

        DbConnection conexion = new DbConnection();
        conexion.connectionDB();
        MainFrame interfaz = new MainFrame();
        interfaz.setVisible(true);
        File directorio = new File("Reportes");
        if (!directorio.exists()) {
            if (directorio.mkdirs()) {
                System.out.println("Directorio reportes creados");
            }
        }
    }
}
