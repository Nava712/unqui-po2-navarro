package ar.edu.unq.po2.tp4;

public class IngresoHorasExtra extends Ingreso {
	private int horasExtra;
	
	public IngresoHorasExtra(String mesPercepcion, String concepto, int montoPercibido, int horasExtra) {
		super(mesPercepcion, concepto, montoPercibido);
		this.horasExtra = horasExtra;
	}
	
	public int getHorasExtra() {
		return horasExtra;
	}
}
