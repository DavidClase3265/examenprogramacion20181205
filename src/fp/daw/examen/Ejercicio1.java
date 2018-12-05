package fp.daw.examen;

public class Ejercicio1 {

	/* 
	 * 1 punto
	 * 
	 * Define, después de este comentario, un método llamado 'contiene' que
	 * reciba dos parámetros: un vector de cadenas de caracteres y una cadena.
	 * El método retornará true si la cadena recibida en el segundo parámetro
	 * se encuentra almacenada en el vector y false en caso contrario.
	 * El método incluirá una única sentencia 'return' y no está permitido el
	 * uso de variables booleanas.
	 */
	
	/*Este ejercicio lo pense de la siguiente manera, lo primero que hice fue invocar a un
	 metodo que tiene una cadena de caracteres y un vector, segun la cadena que sea
	 cambia el valor, en el metodo recorre el vector y en el caso de que sea el mismo que la cadena
	 pues retorna true, posteriormente al invocarlo hago que se almacene en una variable y que 
	 la cadena se sustituya en este caso por numero, lo almacene en una variable ya que era static, 
	 si hubiese sido void lo hubiese ejecutado en el metodo
	 */
	

	
	public static boolean contiene(String cadena, String [] vector) {	
			for(int i=0;i<vector.length-1;i++) {
				if (vector[i] == cadena) {
				return true;
				}
				else {
					return false;
				}
			}
	}
	
		
	/*
	 * 0,25 puntos
	 * 
	 * Escribe en el método main las sentencias necesarias para poner a prueba
	 * el método 'contiene' mostrando por pantalla el resultado de su ejecución. 
	 */
					
	
	
	public static void main(String[] args) {

	String a = contiene("Cadena numero 1", {"Cadena numero 1","Cadena numero 2","Cadena numero 3","Cadena numero 4"})

	}


	}	
}

