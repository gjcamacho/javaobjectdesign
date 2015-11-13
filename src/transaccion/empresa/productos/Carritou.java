package transaccion.empresa.productos;

public class Carritou {
	
	Producto[] productos;

	public Carritou() {
		// TODO Auto-generated constructor stub
	}
	
	public void agregarProducto(Producto p){
		//TODO Agregar p a productos[];
	}

	public void add(Producto p) {
		// TODO Agregar p a productos[]
		
	}

	public int calcularTotal() {
		// TODO Sumar todos los productos
		int total=0;
		for(int i=0;i<productos.length;i++){
			total+=productos[i].precio;
		}
		
		
		return total;
	}

}
