package transaccion.empresa;

import transaccion.cliente.Cliente;
import transaccion.cliente.pago.InformacionPago;
import transaccion.empresa.pagos.ProcesadorPago;
import transaccion.empresa.productos.Carritou;
import transaccion.empresa.productos.Catalogo;

public class Empresa {

	private Cliente c;
	private Catalogo catalogo;
	private ProcesadorPago procesadorPagos;

	public Empresa() {
		// TODO Auto-generated constructor stub
		this.catalogo=new Catalogo();
		this.procesadorPagos=new ProcesadorPago();
	}

	public void recibirSaludo(Cliente c) {
		// TODO Auto-generated method stub
		this.c=c;
	}

	public Catalogo getCatalogo() {
		// TODO Auto-generated method stub
		return catalogo;
	}

	public Carritou getCarrito() {
		// TODO Auto-generated method stub
		return new Carritou();
	}

	public boolean recibirPago(InformacionPago ip, int calcularTotal) {
		// TODO Auto-generated method stub
		boolean confirmacion=procesadorPagos.procesarPago(ip,calcularTotal);
		
		return confirmacion;
	}

}
