package DBsql;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DbConnection {

    Connection conexion = null;
    private final String driver = "com.mysql.jdbc.Driver";
    private final String user = "root";
    private final String password = "Jeffjma100";
    private final String url = "jdbc:mysql://localhost/INTELAF?useSSL=false";
    public static final int MYSQL_DUPLICATE_PK = 1062;

    public void connectionDB() {
        conexion = null;
        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(url, user, password);
            if (conexion != null) {
                //System.out.println("Conexion establecida");
            }
        } catch (ClassNotFoundException | SQLException e) {
            //System.out.println("Error al conectar " + e);
        }
    }

    public Connection getConnection() {
        return (Connection) conexion;
    }

    //metodo encargado de salir de la base de datos
    public void disconnectDB() {
        conexion = null;
        if (conexion == null) {
            //System.out.println("Conexion terminada");
        }
    }
    
    public void Insert(String query) {
        try {
            connectionDB();
            Statement stmt=null;
            stmt = getConnection().createStatement();
            stmt.executeUpdate(query);
            stmt.close();
            disconnectDB();
        } catch (SQLException e) {
             if(e.getErrorCode() == MYSQL_DUPLICATE_PK ){
                 JOptionPane.showMessageDialog(null,"Error el ID o codigo ya existe");
             }else{
             JOptionPane.showMessageDialog(null,e);
             }
        }

    }
    public int InsertVenta(String query) {
        int resultado = 0;
        try {
            connectionDB();
            Statement stmt = null;
            stmt = getConnection().createStatement();
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
                JOptionPane.showMessageDialog(null, "Error el ID o codigo ya existe");
            } else {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        return resultado;
    }

    public ResultSet SelectOnComboBox(String query){
        Statement stmt = null;
        try {
            connectionDB();
            stmt = null;
            stmt = getConnection().createStatement();
            ResultSet resultado = stmt.executeQuery(query);
            return resultado;
            
        } catch (Exception e) {
            return null;

        }
    }

    public ResultSet SelectOnTable(String query) {
        Statement stmt = null;
        try {
            connectionDB();
            stmt = null;
            stmt = getConnection().createStatement();
            ResultSet resultado = stmt.executeQuery(query);
            return resultado;
        } catch (Exception e) {
            return null;
            
        }
    }
}
