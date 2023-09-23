package ar.edu.unq.po2.test.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Multiplos;

class TestMultiplos {
	private Multiplos multiplo = new Multiplos();
	
	@Test
	public void test1() {
		assertEquals(multiplo.encontrarMayorMultiploComun(3, 9), 999);
	}
}
