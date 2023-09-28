package ar.edu.unq.po2.test.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.Ingreso;
import ar.edu.unq.po2.tp4.IngresoHorasExtra;
import ar.edu.unq.po2.tp4.Trabajador;

public class TrabajadorTest {
	private Trabajador trabajador1 = new Trabajador(new Ingreso("Enero", "Haberes", 50000));
	private Trabajador trabajador2 = new Trabajador(new IngresoHorasExtra("Enero", "Haberes", 60000, 10));
	
	@Test
	public void totalesPercibidos() {
		assertEquals(50000, trabajador1.getTotalPercibido());
		assertEquals(60000, trabajador2.getTotalPercibido());
	}
	//No se hace test de monto imponible ya que da el mismo resultado que total percibido

	@Test
	public void impuestosAPagar() {
		assertEquals(1000, trabajador1.getImpuestoAPagar());
		assertEquals(1200, trabajador2.getImpuestoAPagar());
	}
	
	
}
