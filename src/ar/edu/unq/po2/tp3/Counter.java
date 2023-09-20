package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
	
	private ArrayList<Integer> lista = new ArrayList<Integer>();
		
	public void addNumber(int number) {
		this.lista.add(number);
	}
	
	public ArrayList<Integer> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Integer> lista) {
		this.lista = lista;
	}
	
	public int cantidadDePares() {
		int pares = 0;
		for (int elemento : lista) {
			 pares += devolverSiEsPar(elemento);
		}
		return pares;
	}

	public Integer devolverSiEsPar(Integer n) {
		if (n % 2 == 0) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public int cantidadDeImpares() {
		int impares = 0;
		for (int elemento : lista) {
			 impares += devolverSiEsImpar(elemento);
		}
		return impares;
	}

	public Integer devolverSiEsImpar(Integer n) {
		if (n % 2 != 0) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public int contarMultiplos(int numeroObjetivo) {
        int contador = 0;
        
        for (int elemento : lista) {
            if (elemento % numeroObjetivo == 0) {
                contador++;
            }
        }
        return contador;
    }
}