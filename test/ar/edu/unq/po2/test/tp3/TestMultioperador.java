package ar.edu.unq.po2.test.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Multioperador;

class TestMultioperador {
	private Multioperador multioperador = new Multioperador();
	
	@BeforeEach
	public void setUp() {
		multioperador.addNumero(5);
		multioperador.addNumero(2);
		multioperador.addNumero(340);
		multioperador.addNumero(97);
		multioperador.addNumero(10);
	}
	
	@Test
	public void totalSuma() {
		assertEquals(multioperador.sumarTodos(multioperador.getLista()), 454);
	}
	
	//Se inicializó un contador en 0 y de ahí se hizo la resta, quedando así el mismo resultado que la suma, pero en negativo
	@Test
	public void totalResta() {
		assertEquals(multioperador.restarTodos(multioperador.getLista()), -454);
	}
	
	@Test
	public void totalMultiplicacion() {
		assertEquals(multioperador.multiplicarTodos(multioperador.getLista()), 3298000);
	}
	
}
