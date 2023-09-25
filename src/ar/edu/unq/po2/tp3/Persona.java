package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private String nombre;
    private LocalDate fechaNacimiento;

    public String getNombre() {
		return nombre;
	}

	public Persona(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int calcularEdad() {
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        return periodo.getYears();
    }
    /* Si un objeto cualquiera que le pide la edad a una Persona: ¿Conoce cómo ésta calcula u 
     * obtiene tal valor? ¿Cómo se llama el mecanismo de abstracción que permite esto?. No, no
     * conoce ni debe conocer la forma de como calcula lo que se le consulta. Este mecansismo se
     * llama encapsulamiento */
    
    public boolean menorQue(Persona persona) {
    	if (this.calcularEdad() < persona.calcularEdad()) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
}