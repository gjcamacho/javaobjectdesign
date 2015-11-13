package transaccion.cliente;

import transaccion.cliente.pago.InformacionPago;
import transaccion.empresa.Empresa;
import transaccion.empresa.productos.Carritou;
import transaccion.empresa.productos.Catalogo;
import transaccion.empresa.productos.Producto;

public class Cliente {

	public Catalogo catalogo;
	public Carritou carrito;

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public void examinarCatalogo() {
		// TODO Revisar el objeto catalogo y obtiene el arreglo de Producto[]
		
		int id=23;
		
		this.agregarACarrito(catalogo.getProducto(id));
		
	}

	public void agregarACarrito(Producto p) {
		// TODO Agrega p a Carritou
		
		carrito.add(p);
		
	}

	public void pagar(Empresa e) {
		// TODO Auto-generated method stub
		
		InformacionPago ip=new InformacionPago("1234567812345678","Visa");
		
		boolean confirmacion=e.recibirPago(ip,carrito.calcularTotal());
		
		if(confirmacion)
			System.out.println("Yeeeeiiii!!!");
		else
			System.out.println("F***********!!!");
		
	}

}
