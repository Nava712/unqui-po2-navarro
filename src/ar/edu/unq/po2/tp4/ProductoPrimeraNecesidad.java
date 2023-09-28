package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {
	double descuento; 
	
	public ProductoPrimeraNecesidad(String nombreP, double precioP, double descuentoP) {
		//Este super se usa para llamar al constructor de "Producto", sino no te deja hacer el propio de ProductoPrimeraNecesidad
		super(nombreP, precioP);
		this.descuento=descuentoP;
	}
	
	public ProductoPrimeraNecesidad(String nombreP, double precioP, boolean preciosCuidados,double descuentoP) {
		super(nombreP, precioP, preciosCuidados);
		this.descuento=descuentoP;
	}
	
	public double getPrecio() {
		return precio * descuento;
	}
}