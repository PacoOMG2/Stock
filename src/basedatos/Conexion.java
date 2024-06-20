
package basedatos;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    private static final String DB = "stock";
    private static final String URL = "jdbc:mysql://localhost:3306/" + DB;
    
    public static Connection conexion;

   
    
        // Metodo para iniciar la conexion 
    public static Connection iniciar(){
        Conexion.conexion = null;
        
        try {
            //Realizamos la conexion con la BD
            Class.forName("com.mysql.jdbc.Driver");
            
            //Intentamos conectarnos
            Conexion.conexion = (Connection) DriverManager.getConnection(
                    Conexion.URL
                    , Conexion.USUARIO
                    ,Conexion.PASSWORD
            );
            
            
            System.out.println("Me conecte con la base de datos");
        
        } catch (ClassNotFoundException | SQLException ex) {
            
            System.err.println("Error de conexion: "
                    + ex.getLocalizedMessage());
        }
        return Conexion.conexion;
    }
    
    //Metodo para cerrar la conexion 
    public static void cerrarConexion() {
    try {
        if (conexion != null) {
            conexion.close();
            System.out.println("La conexión se ha cerrado correctamente.");
        }
    } catch (SQLException ex) {
        
        System.err.println("Error al cerrar la conexión: " + ex.getMessage());
    }
}
    //
}
