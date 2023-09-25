package ar.edu.unq.po2.tp3;
import ar.edu.unq.po2.tp3.Rectangulo;

public class Cuadrado {
	private Rectangulo cuerpo;

	public Cuadrado(Point esquina, int ancho) {
		this.cuerpo = new Rectangulo(esquina, ancho, ancho);
	}
	
	public Rectangulo getCuerpo() {
		return cuerpo;
	}
}
