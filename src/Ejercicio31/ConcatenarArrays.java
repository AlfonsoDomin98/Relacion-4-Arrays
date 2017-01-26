package Ejercicio31;

import java.util.Arrays;

public class ConcatenarArrays {

	public static void main(String[] args) {
		// INTRODUCCION DE VARIABLES
		int Array1 [] = {1,2,3,4};
		int Array2 [] = {5,6,7};
		int resultado [];
		
		resultado = ConcatenarArraysPro(Array1, Array2);
		for (int salida:resultado ){
			System.out.println(salida);
		}
		
	}
	public static int [] ConcatenarArraysPro(int [] a, int b []){
		int [] c = Arrays.copyOf(a, a.length + b.length) ;
		int i = 0;
		int j = 0;
		
		
		for (j = 0; j < a.length; j++){
			c[j] = a[j];
		}
		for (i = a.length-1; i < c.length-1; i++){
			c[i+1] = b[i-a.length+1];
		}
		
	
		
		
		return c;
	}

}
