package transaccion;

import transaccion.cliente.Cliente;
import transaccion.cliente.pago.InformacionPago;
import transaccion.empresa.Empresa;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main m= new Main();
		
		m.iniciar();

	}

	private void iniciar() {
		// TODO Auto-generated method stub
		
		Empresa e=new Empresa();
		
		Cliente c=new Cliente();
		
		e.recibirSaludo(c);
		
		c.catalogo=e.getCatalogo();
		
		c.carrito=e.getCarrito();
		
		c.examinarCatalogo();
		
		c.pagar(e);
		
		
		
		
	}

}
