package ar.edu.unq.po2.tp4;

public class Producto {
	private String nombre;
	protected double precio;
	private boolean esPrecioCuidado;
	
	public Producto(String nombre, double precio, boolean esPrecioCuidado) {
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = esPrecioCuidado;
	}
	
	//Este otro constuctor es para cuando se instancia un producto y no se especifica si es precio cuidado o no
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = false;
	}
	
	public void aumentarPrecio(double aumento) {
		precio += aumento;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}
}
