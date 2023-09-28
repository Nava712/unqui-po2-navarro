package ar.edu.unq.po2.test.tp4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.ProductoPrimeraNecesidad;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, 0.9d);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(7.2, leche.getPrecio());
	}
}
