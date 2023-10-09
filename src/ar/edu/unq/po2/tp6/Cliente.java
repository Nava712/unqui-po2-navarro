package ar.edu.unq.po2.tp6;

public class Cliente {
	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private int sueldoNetoMensual;
	private Propiedad propiedad;
	//private Propiedad propiedad
	
	public Cliente(String nombre, String apellido, String direccion, int edad, int sueldoNetoMensual, Propiedad propiedad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNetoMensual = sueldoNetoMensual;
		this.propiedad = propiedad;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public int getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}
	
	public Propiedad getPropiedad() {
		return propiedad;
	}
	
	public int getSueldoNetoAnual() {
		return sueldoNetoMensual * 12;
	}
	
	public int pedirCredito(int monto, Banco banco, SolicitudDeCredito solicitud, int plazoEnMeses) {
		return banco.registrarSolicitud(monto, solicitud, this, plazoEnMeses);
	}

}
