package ar.edu.unq.po2.tp7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Municipio {
	private List<ActividadSemanal> actividad = new ArrayList<ActividadSemanal>();
	
	public void agregarActividad(ActividadSemanal actividad) {
		this.actividad.add(actividad);
	}
	
	public List<ActividadSemanal> todasLasActividadesDeFutbol(List<ActividadSemanal> actividades) {
		Stream<ActividadSemanal> stream = actividades.stream();
		return stream.filter(a -> a.getDeporte() == Deporte.Futbol).toList();
	}
	
	public List<ActividadSemanal> actividadesDeComplejidad(int complejidad, List<ActividadSemanal> actividades) {
		Stream<ActividadSemanal> stream = actividades.stream();
		return stream.filter(a -> a.getDeporte().complejidad == complejidad).toList();
	}
	
	public int horasTotalesProvistas(List<ActividadSemanal> actividades) {
		Stream<ActividadSemanal> stream = actividades.stream();
		return stream.mapToInt(a -> a.getDuracion()).sum();
	}
	
}
