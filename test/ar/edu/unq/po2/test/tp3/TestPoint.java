package ar.edu.unq.po2.test.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Point;

class TestPoint {
	private Point fstPoint = new Point(5, 5);
	private Point sndPoint = new Point();
	private Point thdPoint = new Point(3, 2);
	
	@Test
	public void puntoOrigen() {
		assertEquals(0, sndPoint.getx());
		assertEquals(0, sndPoint.gety());
	}	
	
	@Test
	public void testSumarPuntos() {
		Point punto = fstPoint.sumarPoint(thdPoint);
		assertEquals(8, punto.getx());
		assertEquals(7, punto.gety());
	}
}
