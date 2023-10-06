package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends Producto {

	public ProductoCooperativa(int precio, int stock) {
		super(precio, stock);
		this.precio = precio * 0.9;
	}

}
