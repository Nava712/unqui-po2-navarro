package ar.edu.unq.po2.tp4;

public class Trabajador {
	private Ingreso ingreso;
	
	public Trabajador(Ingreso ingreso) {
		this.ingreso = ingreso;
	}

	public int getTotalPercibido() {
		return ingreso.getMonto();
	}
	
	public int getMontoImponible() {
		return this.getTotalPercibido();
	}
	
	public double getImpuestoAPagar() {
		return this.getMontoImponible() * 0.02;
	}
}
