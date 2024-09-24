package tienda_online;

public class Cliente {
private int id;
private String nombre;
private float valor_total;
private float iva;
private float valor_total_cliente;
public Cliente(int id, String nombre, float valor_total, float iva, float valor_total_cliente) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.valor_total = valor_total;
	this.iva = iva;
	this.valor_total_cliente = valor_total_cliente;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public float getValor_total() {
	return valor_total;
}
public void setValor_total(float valor_total) {
	this.valor_total = valor_total;
}
public float getIva() {
	return iva;
}
public void setIva(float iva) {
	this.iva = iva;
}
public float getValor_total_cliente() {
	return valor_total_cliente;
}
public void setValor_total_cliente(float valor_total_cliente) {
	this.valor_total_cliente = valor_total_cliente;
}
@Override
public String toString() {
	return "Cliente id=" + id + ", nombre=" + nombre + ", valor_total=" + valor_total + ", iva=" + iva
			+ ", valor_total_cliente=" + valor_total_cliente;
}

}
