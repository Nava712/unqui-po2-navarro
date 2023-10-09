package ar.edu.unq.po2.test.tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp6.*;

public class TestBanco {
	private Propiedad propiedad1 = new Propiedad("Lote de coste moderado", "Avellaneda 1550", 500000);
	private Propiedad propiedad2 = new Propiedad("Lote lujoso", "Rodolfo Lopez 70", 1000000);
	
	private Cliente cliente1 = new Cliente("Juan", "Perez", "Avellaneda 1400", 35, 5000, propiedad1);
	private Cliente cliente2 = new Cliente("Marcos", "Lopez", "Rodolfo Lopez 65", 40, 3000, propiedad2);
	
	private Banco banco = new Banco();
	
	private SolicitudDeCredito solicitudPersonal = new SolicitudPersonal();
	private SolicitudDeCredito solicitudHipotecaria= new SolicitudHipotecaria();
	
	@BeforeEach
	public void setUp() {
		banco.agregarClientes(cliente1);
		banco.agregarClientes(cliente2);
	}
	
	@Test
	public void clientePrestamoAceptadoPersonal() {
		assertEquals(50, cliente1.pedirCredito(100, banco, solicitudPersonal, 2));
	}
	
	@Test
	public void clientePrestamoDenegadoPersonal() {
		assertEquals(0, cliente1.pedirCredito(100000, banco, solicitudPersonal, 2));
	}

	@Test
	public void clientePrestamoAceptadoHipotecario() {
		assertEquals(1000, cliente1.pedirCredito(2000, banco, solicitudHipotecaria, 2));
	}
	
	@Test
	public void clientePrestamoDenegadoHipotecario() {
		assertEquals(0, cliente1.pedirCredito(20000, banco, solicitudHipotecaria, 2));
	}
}
