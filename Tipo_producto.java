package tienda_online;

public class Tipo_producto {
private int codigo_producto;
private String descripcion;
private float porcentaje_IVA;
public Tipo_producto(int codigo_producto, String descripcion, float porcentaje_IVA) {
	super();
	this.codigo_producto = codigo_producto;
	this.descripcion = descripcion;
	this.porcentaje_IVA = porcentaje_IVA;
}
public int getCodigo_producto() {
	return codigo_producto;
}
public void setCodigo_producto(int codigo_producto) {
	this.codigo_producto = codigo_producto;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
public float getPorcentaje_IVA() {
	return porcentaje_IVA;
}
public void setPorcentaje_IVA(float porcentaje_IVA) {
	this.porcentaje_IVA = porcentaje_IVA;
}
@Override
public String toString() {
	return "Tipo_producto codigo_producto=" + codigo_producto + ", descripcion=" + descripcion + ", porcentaje_IVA="
			+ porcentaje_IVA;
}

}
