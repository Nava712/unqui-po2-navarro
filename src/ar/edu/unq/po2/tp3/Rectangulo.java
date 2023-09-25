package ar.edu.unq.po2.tp3;
import ar.edu.unq.po2.tp3.Point;

public class Rectangulo {
	private Point esquinaSuperiorIzquierda;
	private int ancho;
	private int altura;
	
	public Rectangulo(Point esquinaSuperiorIzquierda, int ancho, int altura) {
		this.esquinaSuperiorIzquierda = esquinaSuperiorIzquierda;
		this.ancho = ancho;
		this.altura = altura;
	}
	
	public int area() {
		return ancho * altura;
	}
	
	public int perimetro() {
		return (ancho*2) + (altura*2);
	}
	
	public String orientacion() {
		if (ancho > altura) {
			return "Horizontal";
		}
		else if (ancho < altura){ 
			return "Vertical"; 
		}
		else { 
			return "Iguales"; 
		}
	}
}
