package stock;

public class Producto {

    private int codigo_producto;
    private String nombre;
    private int cantidad;
    private float precioCosto;
    private float precioVenta;
    private String fecha;
    private String folio_factura;
    private int id_proveedor;
    private int id_departamento;

    /**
     * @return the codigo_producto
     */
    public int getCodigo_producto() {
        return codigo_producto;
    }

    /**
     * @param codigo_producto the codigo_producto to set
     */
    public void setCodigo_producto(int codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the precioCosto
     */
    public float getPrecioCosto() {
        return precioCosto;
    }

    /**
     * @param precioCosto the precioCosto to set
     */
    public void setPrecioCosto(float precioCosto) {
        this.precioCosto = precioCosto;
    }

    /**
     * @return the precioVenta
     */
    public float getPrecioVenta() {
        return precioVenta;
    }

    /**
     * @param precioVenta the precioVenta to set
     */
    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the folio_factura
     */
    public String getFolio_factura() {
        return folio_factura;
    }

    /**
     * @param folio_factura the folio_factura to set
     */
    public void setFolio_factura(String folio_factura) {
        this.folio_factura = folio_factura;
    }

    /**
     * @return the id_departamento
     */
    public int getId_departamento() {
        return id_departamento;
    }

    /**
     * @param id_departamento the id_departamento to set
     */
    public void setId_departamento(int id_departamento) {
        this.id_departamento = id_departamento;
    }

    /**
     * @return the id_proveedor
     */
    public int getId_proveedor() {
        return id_proveedor;
    }

    /**
     * @param id_proveedor the id_proveedor to set
     */
    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }
}
