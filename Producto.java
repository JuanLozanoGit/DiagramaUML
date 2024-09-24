package tienda_online;

import java.time.LocalDate;

public class Producto 
{


	private String tipodeProducto;
	private String nombre;
	private String descipcionProducto;
	private float precioVenta;
	private int cantidad;
	private Proveedor proveedor;
	private LocalDate fechaCreacion;
	
	public Producto(String tipodeProducto, String nombre, String descipcionProducto, float precioVenta, int cantidad,
			Proveedor proveedor, LocalDate fechaCreacion) {
		super();
		this.tipodeProducto = tipodeProducto;
		this.nombre = nombre;
		this.descipcionProducto = descipcionProducto;
		this.precioVenta = precioVenta;
		this.cantidad = cantidad;
		this.proveedor = proveedor;
		this.fechaCreacion = fechaCreacion;
	}

	public String getTipodeProducto() {
		return tipodeProducto;
	}

	public void setTipodeProducto(String tipodeProducto) {
		this.tipodeProducto = tipodeProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescipcionProducto() {
		return descipcionProducto;
	}

	public void setDescipcionProducto(String descipcionProducto) {
		this.descipcionProducto = descipcionProducto;
	}

	public float getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	@Override
	public String toString() {
		return "Producto [tipodeProducto=" + tipodeProducto + ", nombre=" + nombre + ", descipcionProducto="
				+ descipcionProducto + ", precioVenta=" + precioVenta + ", cantidad=" + cantidad + ", proveedor="
				+ proveedor + ", fechaCreacion=" + fechaCreacion + ", getTipodeProducto()=" + getTipodeProducto()
				+ ", getNombre()=" + getNombre() + ", getDescipcionProducto()=" + getDescipcionProducto()
				+ ", getPrecioVenta()=" + getPrecioVenta() + ", getCantidad()=" + getCantidad() + ", getProveedor()="
				+ getProveedor() + ", getFechaCreacion()=" + getFechaCreacion() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	

	
	
	
}
