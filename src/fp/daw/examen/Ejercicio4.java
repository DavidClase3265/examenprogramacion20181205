package fp.daw.examen;

import java.util.Random;

public class Ejercicio4 {

	/* 
	 * 1 punto
	 * 
	 * Define, después de este comentario, un método llamado 'arrayAleatorioOrdenado' que
	 * reciba en un parámetro formal un número entero que determinará la dimensión de un
	 * vector de números enteros que tendrá que crear y rellenar con números aleatorios
	 * comprendidos entre 975 y 13579 y ordenados de menor a mayor a partir de la posición 0.
	 * Finalmente retornará el array.
	 */
	
	/*Lo primero que hice fue crear el metodo que al meterse un numero que determinara la
	 * dimension de un vector que para ello lo puse en new array, mas tarde cree una clase
	 * random para que r fuese un numero aleatorio comprendido entre 975 y 13579, despues
	 * solo tuve que hacer un for para que recorriese el array con el valor aleatorio que le meti */
	public static arrayAleatorioOrdenado(int numero) {
		random r=new Random(12604) + 975;
		int [] array= new array[numero]
		
		for (i=0;i<=array.length-1;i++) {
					vector[i]=s;
				}
		return array;
	}
	
	/*
	 * 0,25 puntos
	 * 
	 * Escribe en el método main las sentencias necesarias para poner a prueba el método
	 * 'arrayAleatorioOrdenado' mostrando por pantalla el resultado de su ejecución. 
	 */
	
	public static void main(String[] args) {
		

	}

}
