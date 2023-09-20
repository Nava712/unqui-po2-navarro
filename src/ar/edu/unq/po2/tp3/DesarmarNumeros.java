package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
	

public class DesarmarNumeros {
	private ArrayList<Integer> numeros = new ArrayList<Integer>();
	
	public void setNumero(int numero) {
		this.numeros.add(numero);
	}
	
	public ArrayList<Integer> getNumero() {
		return numeros;
	}
	
	public int encontrarNumeroConMayorDigitosPares(ArrayList<Integer> numeros) {
        int numeroMayorDigitosPares = -1;  // Inicializamos con un valor negativo
        int cantidadDigitosParesMayor = 0;

        for (int numero : numeros) {
            int cantidadDigitosPares = contarDigitosPares(numero);

            if (cantidadDigitosPares > cantidadDigitosParesMayor) {
                cantidadDigitosParesMayor = cantidadDigitosPares;
                numeroMayorDigitosPares = numero;
            }
        }

        return numeroMayorDigitosPares;
    }

    public int contarDigitosPares(int numero) {
        int contador = 0;

        while (numero != 0) {
            int digito = numero % 10;  // Obtener el último dígito
            if (digito % 2 == 0) {
                contador++;
            }
            numero /= 10;  // Eliminar el último dígito
        }

        return contador;
    }
}
