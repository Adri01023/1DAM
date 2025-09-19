package EjerciciosTema2;
import java.util.Scanner;
public class invertir {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce la palabra");
			String palabra = sc.nextLine();
			String rellena = "";
			int limite = palabra.length() - 1;
			for (int x = limite; x > -1 ; x--) {
				rellena += palabra.charAt(x);
			}
			System.out.println("La palabra "+ palabra + " al revés es "+ rellena);
			sc.close();
		} 
	}