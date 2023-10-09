package ar.edu.unq.po2.tp6;

import java.util.ArrayList;

public class Banco {
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	//private int capital;
	//No se hace un constructor, ya que se le van a agregar clientes con "agregarClientes"
	
	public void agregarClientes(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public int registrarSolicitud(int monto, SolicitudDeCredito solicitud, Cliente cliente, int plazoEnMeses) {
			return solicitud.solicitudDeCredito(cliente, monto, plazoEnMeses);
	}
}