package ar.edu.unq.po2.tp7;

public enum Deporte {
	Running(1), Futbol(2), Basket(2), Tennis(3), Jabalina(4);
	int complejidad;
	
	Deporte(int complejidad) {
		this.complejidad = complejidad;
	}
	
	public int getComplejidad() {
		return complejidad;
	}
}
