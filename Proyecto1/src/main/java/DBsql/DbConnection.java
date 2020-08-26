/*
 * Paquetes
 */
package DBsql;

/*
 * Librerias
 */
import gui.CargarArchivos;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/*
 * @author jeffmenca
 */

/*
 * Clase principal
 */
public class DbConnection {
    
    //Variables
    Connection conexion = null;
    private final String driver = "com.mysql.jdbc.Driver";
    private final String user = "root";
    private final String password = "Jeffjma100";
    private final String url = "jdbc:mysql://localhost/INTELAF?useSSL=false";
    public static final int MYSQL_DUPLICATE_PK = 1062;
    
    /*
     * Conexion a la base datos
     */
    public void connectionDB() {
        conexion = null;
        try {
            //Llama al jdbc
            Class.forName(driver);
            conexion = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar a la base de datos " + e);
        }
    }
    
    /*
     * Metodo para llamar a la conexion
     */
    public Connection getConnection() {
        return (Connection) conexion;
    }

    /*
     * Metodo encargado de salir de la base de datos
     */
    public void disconnectDB() {
        conexion = null;
    }
    
    /*
     * Metodo para insertar valores en la base de datos
     */
    public void Insert(String query) {
        try {
            connectionDB();
            //Creamos el statement
            PreparedStatement stmt = null;
            stmt = getConnection().prepareStatement(query);
            stmt.executeUpdate(query);
            stmt.close();
        } catch (SQLException e) {
            if (e.getErrorCode() == MYSQL_DUPLICATE_PK) {
                JOptionPane.showMessageDialog(null, "Error el ID o codigo ya existe, o ingreso de manera incorrecta un dato");
            } else {
                JOptionPane.showMessageDialog(null, e);
            }
        } finally {
            disconnectDB();
        }
    }
    
    /*
     * Metodo para insertar ventas
     * Return Generated Keys
     */
    public int InsertVenta(String query) {
        int resultado = 0;
        try {
            connectionDB();
            PreparedStatement stmt = null;
            stmt = getConnection().prepareStatement(query);
            //El statement regresa las generated keys para no repetir venta
            stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                resultado = rs.getInt(1);
            }
            rs.close();
            stmt.close();
            disconnectDB();
        } catch (SQLException e) {
            if (e.getErrorCode() == MYSQL_DUPLICATE_PK) {
                if (CargarArchivos.lineaError == 0) {
                    JOptionPane.showMessageDialog(null, "Error el ID o codigo ya existe");
                } else {
                    JOptionPane.showMessageDialog(null, "Error, query erronea en la linea " + CargarArchivos.lineaError);
                }
            } else {
                JOptionPane.showMessageDialog(null, e);
            }
        } finally {
            disconnectDB();
        }
        return resultado;
    }
    
    /*
     * Metodo para llenar un combobox con la base de datos
     * return un resultset
     */
    public ResultSet SelectOnComboBox(String query) {
        PreparedStatement stmt = null;
        try {
            connectionDB();
            stmt = null;
            stmt = getConnection().prepareStatement(query);
            ResultSet resultado = stmt.executeQuery(query);
            //Regresa los resultados
            return resultado;

        } catch (Exception e) {
            return null;

        } finally {
            disconnectDB();
        }
    }
    
    /*
     * Metodo para seleccionar datos de la base de datos
     * return un resultset
     */
    public ResultSet Select(String query) {
        PreparedStatement stmt = null;
        try {
            connectionDB();
            stmt = null;
            stmt = getConnection().prepareStatement(query);
            ResultSet resultado = stmt.executeQuery(query);
            return resultado;

        } catch (Exception e) {
            return null;

        } finally {
            disconnectDB();
        }
    }
    
    /*
     * Metodo para llenar una tabla con la base de datos
     * return un resultset
     */
    public ResultSet SelectOnTable(String query) {
        PreparedStatement stmt = null;
        try {
            connectionDB();
            stmt = null;
            stmt = getConnection().prepareStatement(query);
            ResultSet resultado = stmt.executeQuery(query);
            return resultado;
        } catch (Exception e) {
            return null;

        } finally {
            disconnectDB();
        }
    }
}
