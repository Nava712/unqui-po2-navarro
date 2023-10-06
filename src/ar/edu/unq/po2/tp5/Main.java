package ar.edu.unq.po2.tp5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
	private Persona persona1 = new Persona("Juan", LocalDate.of(2002, 1, 7));
	private Persona persona2 = new Persona("Nahuel", LocalDate.of(2001, 7, 7));
	private Mascota mascota1 = new Mascota("Rocco", "Labrador");
	private Mascota mascota2 = new Mascota("Cartucho", "Chihuahua");
	
	private List<SerVivo> lista = new ArrayList<SerVivo>();
	
	public void main() {
		lista.add(persona1);
		lista.add(persona2);
		lista.add(mascota1);
		lista.add(mascota2);
		
		for (SerVivo serVivo : lista) {
            String nombre = serVivo.getNombre();
            System.out.println(nombre);
        }
	}
	
}
