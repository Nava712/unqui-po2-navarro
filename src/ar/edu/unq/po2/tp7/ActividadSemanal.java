package ar.edu.unq.po2.tp7;

public class ActividadSemanal implements Comparable<ActividadSemanal>{
	private DiaDeSemana diaDeSemana;
	private int horaInicio;
	private int duracion;
	private Deporte deporte;
	
	public Deporte getDeporte() {
		return deporte;
	}
	
	public int getDuracion() {
		return duracion;
	}
	
	public DiaDeSemana getDiaDeSemana() {
		return diaDeSemana;
	}
	
	public int costoDeActividad(DiaDeSemana diaDeSemana, Deporte deporte) {
		if (diaDeSemana.ordinal() < 3) {
			return 500 + this.agregadoPorComplejidad(deporte);
		} else {
			return 1000 + this.agregadoPorComplejidad(deporte);
		}
	}

	private int agregadoPorComplejidad(Deporte deporte) {
		return deporte.getComplejidad() * 200;
	}

	public int compareTo(ActividadSemanal actividad) {
		int costo = actividad.costoDeActividad(actividad.getDiaDeSemana(), actividad.getDeporte());
		if (this.costoDeActividad(this.getDiaDeSemana(), this.getDeporte()) < costo) {
			return 1;
		} else if (this.costoDeActividad(this.getDiaDeSemana(), this.getDeporte()) == costo){
			return 0;
		} else {
			return -1;
		}
	}
}
