package EjerciciosTema2;
import java.util.Scanner;

 public class ejercicio_43_recursividad {
	 	// Escribiremos como sería la formula a un número x en este caso n
		static int factorial( int n ) {
	        if (n != 0) 
	        	// Esta formula al ser recursiva se hará el factorial(n-1) hasta que dicha función sea 0 y nos devuelva 1 rompiendo así el bucle
	            return n * factorial(n-1);
	         else 
	            return 1;
	         }
		
		// Ahora escribimos la funcion main por la que sale la anterior fórmula
		 public static void main(String[] args) {
			 Scanner sc = new Scanner(System.in);
			 	System.out.println("De que número quieres saber el factorial");
				int n = sc.nextInt();
		        int resultado = factorial(n);
		        System.out.println("El factorial de "+ n +" es igual a: " + resultado);
		        sc.close();
		    }
	}
