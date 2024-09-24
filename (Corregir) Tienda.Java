package tienda_online;

public class Tienda 
{
	private ArrayList<Producto> productos;
	
	public Tienda() {
	    this.productos = new ArrayList<>();
	}

	public void agregarProducto(Producto producto) {
	    productos.add(producto);
	}

	public void mostrarProductos() {
	    for (Producto producto : productos) {
	        System.out.println(producto);
	    }
	}

	public static void main(String[] args) {
	    Tienda tienda = new Tienda();

	    // Crear algunos productos
	    Producto p1 = new Producto("Camisa", 19.99, LocalDate.now());
	    Producto p2 = new Producto("Pantalón", 29.99, LocalDate.now());
	    
	    // Agregar productos a la tienda
	    tienda.agregarProducto(p1);
	    tienda.agregarProducto(p2);

	    // Mostrar los productos en la tienda
	    tienda.mostrarProductos();
	}


}
