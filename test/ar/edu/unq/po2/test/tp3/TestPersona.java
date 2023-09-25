package ar.edu.unq.po2.test.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Persona;

class TestPersona {
	private Persona persona1 = new Persona("Juan", LocalDate.of(2002, 1, 7));
	private Persona persona2 = new Persona("Ariel", LocalDate.of(1999, 4, 26));
	
	@Test
	public void edadDePersona() {
		assertEquals(21, persona1.calcularEdad());
	}
	@Test
	public void personaMayor() {
		assertEquals(true, persona1.menorQue(persona2));
	}
}
