package ar.edu.unq.po2.tp4;

public class Ingreso {
	private String mesPercepcion;
	private String concepto;
	private int montoPercibido;
	
	public Ingreso(String mesPercepcion, String concepto, int montoPercibido) {
		this.mesPercepcion = mesPercepcion;
		this.concepto = concepto;
		this.montoPercibido = montoPercibido;
	}
	
	public int getMonto() {
		return montoPercibido;
	}
}
