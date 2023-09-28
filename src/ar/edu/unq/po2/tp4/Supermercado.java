package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Supermercado {
	private String nombre;
	private String direccion;
	private ArrayList<Producto> productos = new ArrayList<Producto>();
	
	public Supermercado(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public int getCantidadDeProductos() {
		return productos.size();
	}
	
	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}
	
	public double getPrecioTotal() {
		double precio = 0;
		for (Producto producto:productos) {
			precio += producto.getPrecio();
		}
		return precio;
	}
}
