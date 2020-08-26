/*
 * Paquetes
 */
package backend;

/*
 * Librerias
 */
import DBsql.DbConnection;
import gui.MainFrame;
import java.io.File;

/**
 * @author jeffrey
 */

/*
 * Clase principal
 */
public class MainClass {

    /*
     * Clase main que inicia el programa
     */
    public static void main(String[] args) {
        //Crea conexion a la base de datos
        DbConnection conexion = new DbConnection();
        conexion.connectionDB();
        //Llama al formularip principal
        MainFrame interfaz = new MainFrame();
        interfaz.setVisible(true);
        //Crea una carpeta para guardar los reportes
        File directorio = new File("Reportes");
        if (!directorio.exists()) {
            if (directorio.mkdirs()) {
                System.out.println("Directorio reportes creados");
            }
        }
    }
}
