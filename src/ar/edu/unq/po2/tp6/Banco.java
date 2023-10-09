package ar.edu.unq.po2.tp6;

import java.util.List;

public class Banco {
	private List<Cliente> clientes;
	//private int capital;
	//No se hace un constructor, ya que se le van a agregar clientes con "agregarClientes"
	
	public void agregarClientes(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public int registrarSolicitud(int monto, SolicitudDeCredito solicitud, Cliente cliente, int plazoEnMeses) {
			return solicitud.solicitudDeCredito(cliente, monto, plazoEnMeses);
	}
}