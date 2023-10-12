package ar.edu.unq.po2.tp7;

import java.util.List;
import java.util.stream.Stream;

public class ActividadSemanal {
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
}
