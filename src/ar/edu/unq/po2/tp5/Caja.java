package ar.edu.unq.po2.tp5;

import java.util.List;

public class Caja {
	
	public double registrarProductos(List<Producto> list) {
		double precioProductos = 0;
		for (Producto producto:list) {
			precioProductos += producto.getPrecio();
			producto.reducirStock();
		}		
		return precioProductos;
	}
}
