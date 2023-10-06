package ar.edu.unq.po2.tp5;

import java.time.LocalDate;
import java.time.Period;

public class Persona implements SerVivo{
	private String nombre;
	private LocalDate fechaNacimiento;
	
	public Persona(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }
	
	public String getNombre() {
		return nombre;
	}

    public int calcularEdad() {
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        return periodo.getYears();
    }
}
