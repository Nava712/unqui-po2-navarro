package ar.edu.unq.po2.tp5;

public class Producto {
	protected double precio;
	private int stock;
	
	public Producto(int precio, int stock) {
		this.precio = precio;
		this.stock = stock;
	}
	
	public double getPrecio() {
		return precio;
	}
	public int getStock() {
		return stock;
	}
	
	public void reducirStock() {
		stock -= 1;
	}
}
