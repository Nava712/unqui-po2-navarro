package ar.edu.unq.po2.tp3;

public class PersonaEquipoTrabajo {
	private String nombre;
	private String apellido;
	private int edad;
	
	public PersonaEquipoTrabajo(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public int getEdad() {
		return edad;
	}
}
