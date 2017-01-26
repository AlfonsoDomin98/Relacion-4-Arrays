package Ejercicio33;

import java.util.Arrays;

public class InsertarNumArray {

	public static void main(String[] args) {
		// INTRODUCCION DE LAS VARIABLES
		int [] Array = {1,2,3,4,5};
		int [] aux;

		
		// PROCESO
		
		aux = RellenarArrayPro(Array);
		
		// SALIDA
		
		for(int salida:aux){
			System.out.println(salida);
		}
	}
	
	public static int [] RellenarArrayPro(int [] array){
		int rellenar = 26;
		int posicion = 2;
		int contador = 0;
		array = Arrays.copyOf(array, array.length+1);

		for (int i = array.length-1; i >posicion; i-- ){
			array[i] = array[i-1];
		
		}
		array[posicion] = rellenar;
		
		return array;
	}

}
