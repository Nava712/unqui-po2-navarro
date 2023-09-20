package ar.edu.unq.po2.test.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.DesarmarNumeros;

class TestDesarmarNumeros {
	private DesarmarNumeros desarmador;
	
	@BeforeEach
	public void setUp() {
		desarmador = new DesarmarNumeros();
		
		desarmador.setNumero(840260);
		desarmador.setNumero(6134);
		desarmador.setNumero(204581317);
		desarmador.setNumero(975310);
	}
	
	@Test
	public void testNumeroConMayorDigitosPares() {
		Integer numero = desarmador.encontrarNumeroConMayorDigitosPares(desarmador.getNumero());
		assertEquals(numero, 840260);
	}
}
