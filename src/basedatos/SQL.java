package basedatos;

import stock.Departamento;
import stock.Producto;
import stock.Proveedor;

public class SQL {

    public static String insertDepartamento(Departamento departamento) {
        return "INSERT INTO departamento VALUES (NULL, '" + departamento.getNombre() + "')";
    }

    public static String insertProveedor(Proveedor proveedor) {
        return "INSERT INTO proveedor VALUES (NULL, '" + proveedor.getNombre_proveedor() + "', '"
                + proveedor.getTelefono() + "', "
                + proveedor.getId_departamento() + ");";
    }

    public static String eliminarDepartamento(int id) {
        return "Delete from departamento where id_departamento = " + id;
    }

    public static String selectDepartamento(int id) {
        return "Select * from departamento where id_departamento = " + id;
    }

    public static String actualizarDepartamento(Departamento departamento) {
        return "UPDATE departamento SET nombre_departamento='" + departamento.getNombre() + "' where id_departamento = " + departamento.getId_departamento();
    }

    public static String selectAlmacen() {
        return "SELECT productos.cod_producto,productos.nombre,productos.cantidad,productos.precio_costo,productos.precio_venta,productos.fecha_registro,productos.folio_factura,departamento.nombre_departamento from productos join departamento on productos.id_departamento=departamento.id_departamento;";
    }

    public static String selectProductoCodigo(String codigo){
          return "SELECT productos.cod_producto,productos.nombre,productos.cantidad,productos.precio_costo,productos.precio_venta,productos.fecha_registro,productos.folio_factura,departamento.nombre_departamento from productos join departamento on productos.id_departamento=departamento.id_departamento WHERE cod_producto= '"+codigo+"'";
        
      }
    
    public static String selectProductoNombre(String nombre){
          return "SELECT productos.cod_producto,productos.nombre,productos.cantidad,productos.precio_costo,productos.precio_venta,productos.fecha_registro,productos.folio_factura,departamento.nombre_departamento from productos join departamento on productos.id_departamento=departamento.id_departamento WHERE nombre LIKE '%"+nombre+"%'";
        
      }
    public static String selectProductoDepartamento(String departamento){
          return "SELECT productos.cod_producto,productos.nombre,productos.cantidad,productos.precio_costo,productos.precio_venta,productos.fecha_registro,productos.folio_factura,departamento.nombre_departamento from productos join departamento on productos.id_departamento=departamento.id_departamento WHERE departamento.id_departamento= '"+departamento+"'";
        
      }
    
    public static String seletTodosDepartamento() {
        return "SELECT * FROM departamento";
    }

    public static String seletTodosProveedor() {
        return "SELECT cod_proveedor FROM proveedor";
    }

    public static String seletTodosProveedores() {
        return "SELECT cod_proveedor, nombre_proveedor,telefono,nombre_departamento FROM proveedor join departamento on proveedor.departamento = departamento.id_departamento";
    }

    public static String selectProveedor(int id) {
        return "SELECT * FROM proveedor WHERE cod_proveedor = " + id;
    }
    
    public static String selectUsuarios(){
        return "Select * from usuario";
    
    }
    //Consulta con retorno

    //Sentencia con retorno
    public static String insertProductos(Producto producto) {
        return "INSERT INTO productos VALUES (NULL, '" + producto.getNombre() + "',"
                + " '" + producto.getCantidad() + "',"
                + " '" + producto.getPrecioCosto() + "', "
                + "'" + producto.getPrecioVenta() + "', "
                + " '" + producto.getFecha() + "',"
                + " '" + producto.getFolio_factura() + "',"
                + "'" + producto.getId_departamento() + "')";
    }

    // visualizar todos los productos
    public static String seletTodoProduct() {
        return "SELECT id_productos, codigo_barra, nombre_producto, precio_costo, precio_venta, descripcion, id_departamento FROM productos";
    }

    public static String eliminarProducto(int id) {
        return "DELETE FROM productos WHERE cod_producto = " + id;
    }
    
    public static String eliminarProveedor(int id){
        return "Delete from proveedor where cod_proveedor = " + id;
    }
    /*
    public static String ActualizarProducto(Producto producto){
        return "UPDATE INTO productos VALUES (NULL, '"
                +producto.getCodigo_barra()+"', '"
                +producto.getNombre_producto()+"', "
                +producto.getPrecio_costo()+", "
                +producto.getPrecio_venta()+", '"
                +producto.getDescripcion()+"', "
                +producto.getId_inventario()+", "
                +producto.getId_departamento()+");";
    }
     */
    public static String selectProductos() {
        return "Select * from Productos";
    }

    public static String selectProductosId(int id) {
        return "Select * from Productos WHERE cod_producto=" + id;
    }//fin selectProductosId

    public static String actualizarProductos(Producto producto, int id) {
        return "UPDATE Productos SET nombre='" + producto.getNombre() + "', cantidad=" + producto.getCantidad() + ","
                + "precio_costo=" + producto.getPrecioCosto() + ",precio_venta=" + producto.getPrecioVenta() + ","
                + "fecha_registro='" + producto.getFecha() + "',folio_factura='" + producto.getFolio_factura() + "',"
                + "id_departamento=" + producto.getId_departamento() + " WHERE cod_producto=" + id + "";
    }

    public static String actualizarProveedor(Proveedor proveedor, int id) {
        return "UPDATE proveedor SET nombre_proveedor='"+proveedor.getNombre_proveedor()+"',telefono="+proveedor.getTelefono()+","
                + "departamento="+proveedor.getId_departamento()+" WHERE cod_proveedor="+id+"";
    }

}
