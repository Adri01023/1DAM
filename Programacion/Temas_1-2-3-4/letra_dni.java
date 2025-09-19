package EjerciciosTema2;
import java.util.Scanner;
public class letra_dni {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce los números de tu DNI");
		String cadena_dni = sc.next();
		while (cadena_dni.length() != 8) {
			System.out.println("Introduce un valor válido (los 8 números de tu DNI)");
			cadena_dni = sc.next();
		}
		int  int_dni = Integer.parseInt(cadena_dni);
		int resto = int_dni % 23;
		switch (resto) {
		case 0:
			System.out.println("La letra de tu DNI es T");
			break;

		case 1:
			System.out.println("La letra de tu DNI es R");
			break;
		
		case 2:
			System.out.println("La letra de tu DNI es W");
			break;
		
		case 3:
			System.out.println("La letra de tu DNI es A");
			break;
			
		case 4:
			System.out.println("La letra de tu DNI es G");
			break;

		case 5:
			System.out.println("La letra de tu DNI es M");
			break;
		
		case 6:
			System.out.println("La letra de tu DNI es Y");
			break;
		
		case 7:
			System.out.println("La letra de tu DNI es F");
			break;
			
		case 8:
			System.out.println("La letra de tu DNI es P");
			break;

		case 9:
			System.out.println("La letra de tu DNI es D");
			break;
		
		case 10:
			System.out.println("La letra de tu DNI es X");
			break;
		
		case 11:
			System.out.println("La letra de tu DNI es B");
			break;
		
		case 12:
			System.out.println("La letra de tu DNI es N");
			break;

		case 13:
			System.out.println("La letra de tu DNI es J");
			break;
		
		case 14:
			System.out.println("La letra de tu DNI es Z");
			break;
		
		case 15:
			System.out.println("La letra de tu DNI es S");
			break;
			
		case 16:
			System.out.println("La letra de tu DNI es Q");
			break;

		case 17:
			System.out.println("La letra de tu DNI es V");
			break;
		
		case 18:
			System.out.println("La letra de tu DNI es H");
			break;
		
		case 19:
			System.out.println("La letra de tu DNI es L");
			break;
			
		case 20:
			System.out.println("La letra de tu DNI es C");
			break;

		case 21:
			System.out.println("La letra de tu DNI es K");
			break;
		
		case 22:
			System.out.println("La letra de tu DNI es E");
			break;
		}
		sc.close();
	}
}
