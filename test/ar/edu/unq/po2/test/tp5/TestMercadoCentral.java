package ar.edu.unq.po2.test.tp5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.*;

public class TestMercadoCentral {
	private Caja caja = new Caja();
	private Cliente cliente = new Cliente();
	private Producto leche = new ProductoTradicional(50, 10);
	private Producto huevos = new ProductoCooperativa(100, 7);
	private Producto sal = new ProductoTradicional(20, 50);
	
	@BeforeEach
	public void setUp() {
		cliente.agregarProducto(leche);
		cliente.agregarProducto(huevos);
		cliente.agregarProducto(sal);
	}
	
	@Test
	public void totalAPagar() {
		assertEquals(160, cliente.pagarEnCaja(cliente.getProductos(), caja));
	}
	
	@Test
	public void reduccionDeStock() {
		cliente.pagarEnCaja(cliente.getProductos(), caja);
		assertEquals(9,leche.getStock());
		assertEquals(6,huevos.getStock());
		assertEquals(49,sal.getStock());
	}
	
}
