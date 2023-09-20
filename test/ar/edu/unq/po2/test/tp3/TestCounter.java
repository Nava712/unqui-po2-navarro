package ar.edu.unq.po2.test.tp3;

import static org.junit.jupiter.api.Assertions.*;
import ar.edu.unq.po2.tp3.Counter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TestCounter {
	private Counter counter;
	@BeforeEach
	public void setUp() throws Exception {
	//Se crea el contador
	counter = new Counter();
	//Se agregan los numeros. Un solo par y nueve impares
	counter.addNumber(1);
	counter.addNumber(3);
	counter.addNumber(5);
	counter.addNumber(7);
	counter.addNumber(9);
	counter.addNumber(1);
	counter.addNumber(1);
	counter.addNumber(1);
	counter.addNumber(1);
	counter.addNumber(4);
	}
	
	@Test
	public void testEvenNumbers() {
	// Getting the even occurrences
		int amount = counter.cantidadDePares();
	// I check the amount is the expected one
		assertEquals(amount, 1);
	}
	
	@Test
	public void testOddNumbers() {
	//Getting the odd occurrences
		int amount = counter.cantidadDeImpares();
	// Check the odd occurrences
		assertEquals(amount, 9);
	}
	
	@Test
	public void testMultiples() {
	//Getting the multiples of the number
		int amount = counter.contarMultiplos(1);
	//Check the amount of the multiples
		assertEquals(amount, 10);
	}
}
