package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {
	private ArrayList<Integer> lista = new ArrayList<Integer>();
	
	public ArrayList<Integer> getLista() {
		return lista;
	}

	public void addNumero(int x) {
		this.lista.add(x);
	}

	public int sumarTodos(ArrayList<Integer>lista) {
		int total = 0;
		for (Integer elemento:lista) {
			total += elemento;
		}
		return total;
	}
	
	public int restarTodos(ArrayList<Integer>lista) {
		int total = 0;
		for (Integer elemento:lista) {
			total -= elemento;
		}
		return total;
	}
	
	public int multiplicarTodos(ArrayList<Integer>lista) {
		int total = 1;
		for (Integer elemento:lista) {
			total *= elemento;
		}
		return total;
	}
}
