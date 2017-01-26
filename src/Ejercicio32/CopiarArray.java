package Ejercicio32;

import java.util.Arrays;

public class CopiarArray {

	public static void main(String[] args) {
		// INTRODUCCION DE VARIABLES
		int [] Array1 = {1,2,3,4,5};
		int [] Copiar ;
		
		// PROCESO
		
		Copiar = CopiarArrayPro(Array1);
		
		for(int salida : Copiar){
			
		}
		// SALIDA
		System.out.print("[");
		for(int salida : Copiar){	
		System.out.print("-"+salida);
		}
		System.out.print("-]");
	}
	
	public static int [] CopiarArrayPro(int array []){
		int ArrayCop[] = Arrays.copyOf(array, array.length);
		
		for (int contador = 0; contador < array.length; contador ++){
			
			ArrayCop[contador] = array[contador];
		}
		
		return array;
	}
}
