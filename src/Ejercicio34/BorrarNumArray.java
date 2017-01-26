package Ejercicio34;

import java.util.Arrays;

public class BorrarNumArray {

	public static void main(String[] args) {
		// INTRODUCCION DE VARIABLES
		int [] Array = {1,2,3,4,5};
		int [] aux;
		
		// PROCESO
		aux = BorrarArray(Array);
		
		// SALIDA
		for(int salida:aux){
			System.out.println(salida);
		}
		
	}
	public static int [] BorrarArray (int [] array){
		int posicion = 1;

		
		
		for(int contador = posicion +1  ; contador < array.length; contador++){
			array[contador - 1] = array[contador];
			
			
		}
		array = Arrays.copyOf(array, array.length-1);
		
		return array;
	}

}
