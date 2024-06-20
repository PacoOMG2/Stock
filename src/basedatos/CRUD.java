
package basedatos;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import stock.Producto;
import stock.Proveedor;



public class CRUD {
    
    
    Statement statement = null;
    PreparedStatement pst;
    int filaAfectada;
    ResultSet rst;
    private final Object vspro;
    
    public CRUD(){
        this.pst = null;
        this.rst = null;
        this.statement = null;
        this.filaAfectada = Integer.MAX_VALUE;
        this.vspro = null;
    }//cierra constructor
    
    
    public boolean insertar(String sql){
        
        try {
            
            this.pst = (PreparedStatement) Conexion.conexion.prepareStatement
        (sql, Statement.RETURN_GENERATED_KEYS); 
            
            this.filaAfectada = this.pst.executeUpdate();
            System.err.println("Insertado Correctamente");
            return true;
            
        } catch (SQLException e) {
            System.out.println("Error a insertar. ");
            return false;
        }

    }// cierra llave del metodo insertar
    
    
    
    public ResultSet seleccionar( String sql){
        
        try {
            this.statement = Conexion.conexion.createStatement();
            return this.statement.executeQuery(sql);
 
        } catch (SQLException | ClassCastException e) {
            System.err.println("Error al seleccionar " + e.getMessage());
            return null;
        }//cierra

    } //cierra metodo select
    
    

    public boolean insertProveedor(Proveedor proveedor){
        try {
            if (this.insertar(SQL.insertProveedor(proveedor))){
                this.rst = this.pst.getGeneratedKeys();
                
                if(this.rst.next()){
                    
                    proveedor.setCodigo_proveedor(this.rst.getInt(1));

                }//cierra del 2 if
            }// cierre del 1 id
            return true;
        } catch (SQLException e) {
            System.err.println("Error al insertar" + e.getMessage());
            return false;
        } 
    }
public boolean insertProducto(Producto producto){
        try {
            if (this.insertar(SQL.insertProductos(producto))){
                this.rst = this.pst.getGeneratedKeys();
                
                if(this.rst.next()){
                    
                    producto.setCodigo_producto(this.rst.getInt(1));
                    

                }//cierra del 2 if
            }// cierre del 1 id
            return true;
        } catch (SQLException e) {
            System.err.println("Error al insertar" + e.getMessage());
            return false;
        } finally {
            try {
                if (this.rst != null) this.rst.close();
                if (this.pst != null) this.pst.close();
            } catch (SQLException ex) {
                System.err.println("Error al cerrar conexión con la base de datos: " + ex.getMessage());
            }
        }
    }


    
    public ResultSet selectProducto( String sql){
        
        try {
            this.statement = Conexion.conexion.createStatement();
            return this.statement.executeQuery(sql);
            
            
        } catch (SQLException | ClassCastException e) {
            System.err.println("Error al seleccionar " + e.getMessage());
            return null;
        }//cierra  
    }//cierra metodo vizualizar  
    
   public  ResultSet visualizar (String sql){
       try {
            this.statement = Conexion.conexion.createStatement();
            return this.statement.executeQuery(sql); 
       } catch (SQLException |ClassCastException e) {
           System.err.println("Error al visualizar " + e.getMessage());
            return null;
       }
   
   } 
  
    
   public boolean eliminarInsertar(String sql){
    //El try catch nos sirve para evaluar y mostrar los resultados, el catch los errores
        try {
          this.statement = Conexion.conexion.createStatement();
          this.statement.executeUpdate(sql);
          return true;
          
        } catch (SQLException | ClassCastException e) {
            System.err.println("Error al seleccionar: " + e.getMessage());
            return false;
        }//cierre del catch
  }
    
    
    
}//cierra llave de clase
