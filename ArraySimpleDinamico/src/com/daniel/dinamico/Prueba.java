package com.daniel.dinamico;

public class Prueba {
	public static void main(String[] args) {
		//Parimos de un array de 3 cadenas
		String x[] = { "a", "b", "c" };
		//Mostramos todos los elementos del array
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		//Borramos las cadenas en las posiciones indicadas, por ejemplo la 1 y la 0
		x =ArrayDinamico.borrarPosicion(x,1);
		x =ArrayDinamico.borrarPosicion(x,0);
		//Volvemnos a mostrar el array
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		//Partimos de un array de tamaño de 0
		int y [] = new int [0];
		//Redmiensionamos el array, por ejemplo en tamaño de 3 
		for(int i=0;i<3;i++) {
			y = ArrayDinamico.redimensionaArray(y, i);
		}
		//Printa array redimensiondo en 3
		for(int j=0;j<y.length;j++) {
			System.out.println(y[j]);
		}
	}
}
