package ar.edu.unq.po2.test.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Cuadrado;
import ar.edu.unq.po2.tp3.Point;
import ar.edu.unq.po2.tp3.Rectangulo;

class TestRectangulo {
	private Cuadrado cuadrado = new Cuadrado(new Point(10, 10), 5);
	private Rectangulo rectangulo = new Rectangulo(new Point(5, 10), 10, 12);
	
	@Test
	public void areaRectangulo() {
		assertEquals(25, cuadrado.getCuerpo().area());
		assertEquals(120, rectangulo.area());
	}
	
	@Test
	public void perimetroRectangulo() {
		assertEquals(20, cuadrado.getCuerpo().perimetro());
		assertEquals(44, rectangulo.perimetro());
	}
	
	@Test
	public void orientacionRectangulo() {
		assertEquals("Iguales", cuadrado.getCuerpo().orientacion());
		assertEquals("Vertical", rectangulo.orientacion());
	}
	
}
