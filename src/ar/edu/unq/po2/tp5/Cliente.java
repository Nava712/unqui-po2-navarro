package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	List<Producto> listaDeProductos = new ArrayList<Producto>();
	
	public void agregarProducto(Producto producto) {
		listaDeProductos.add(producto);
	}
	
	public double pagarEnCaja(List<Producto> list, Caja caja) {
		return caja.registrarProductos(list);
	}
	
	public List<Producto> getProductos() {
		return listaDeProductos;
	}
}
