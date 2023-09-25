package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class EquipoDeTrabajo {
	private String nombre;
	private ArrayList<PersonaEquipoTrabajo> integrantes;
	
	public EquipoDeTrabajo(String nombre, ArrayList<PersonaEquipoTrabajo> integrantes) {
		this.nombre = nombre;
		this.integrantes = integrantes;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void agregarPersona(PersonaEquipoTrabajo persona) {
		integrantes.add(persona);
	}
	
	public int promedioEdadEquipo() {
		int promedio = 0;
		for (PersonaEquipoTrabajo integrante:integrantes) {
			promedio += integrante.getEdad();
		}
		return promedio / integrantes.size();
	}
}
