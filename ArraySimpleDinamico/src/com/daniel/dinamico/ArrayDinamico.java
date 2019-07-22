package com.daniel.dinamico;
/**
 * 
 * @author Daniel
 *
 */
public class ArrayDinamico {
	// Redimensiona arrays de String
	public static String[] redimensionaArray(String almacena[], String frase) {
		String aux[] = new String[almacena.length + 1];
		for (int x = 0; x < almacena.length; x++) {
			aux[x] = almacena[x];
		}
		aux[almacena.length] = frase;
		return aux;

	}

	// Redimensiona arrays de int
	public static int[] redimensionaArray(int almacena[], int valor) {
		int aux[] = new int[almacena.length + 1];
		for (int x = 0; x < almacena.length; x++) {
			aux[x] = almacena[x];
		}
		aux[almacena.length] = valor;
		return aux;

	}

	// Redimensiona array de double
	public static double[] redimensionaArray(double almacena[], double valor) {
		double aux[] = new double[almacena.length + 1];
		for (int x = 0; x < almacena.length; x++) {
			aux[x] = almacena[x];
		}
		aux[almacena.length] = valor;
		return aux;

	}

	// Borra en una posion indicada y redimensiona array de String
	public static String[] borrarPosicion(String almacena[], int posicion) {
		if ((almacena.length - 1) != posicion) {

			for (int i = posicion; i < (almacena.length - 1); i++) {
				almacena[i] = almacena[i + 1];
			}
		}
		String aux[] = new String[almacena.length - 1];
		for (int i = 0; i < aux.length; i++) {
			aux[i] = almacena[i];
		}
		return aux;
	}
	//Borra en una posion indicada y redimensiona array de int
	public static int[] borrarPosicion(int almacena[], int posicion) {
		if ((almacena.length - 1) != posicion) {

			for (int i = posicion; i < (almacena.length - 1); i++) {
				almacena[i] = almacena[i + 1];
			}
		}
		int aux[] = new int[almacena.length - 1];
		for (int i = 0; i < aux.length; i++) {
			aux[i] = almacena[i];
		}
		return aux;
	}
	//Borra en una posion indicada y redimensiona array de double
	public static double[] borrarPosicion(double almacena[], int posicion) {
		if ((almacena.length - 1) != posicion) {

			for (int i = posicion; i < (almacena.length - 1); i++) {
				almacena[i] = almacena[i + 1];
			}
		}
		double aux[] = new double[almacena.length - 1];
		for (int i = 0; i < aux.length; i++) {
			aux[i] = almacena[i];
		}
		return aux;
	}

}
