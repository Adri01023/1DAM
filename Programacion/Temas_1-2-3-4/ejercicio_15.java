package EjerciciosTema2;
import java.util.Scanner;
public class ejercicio_15 {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		System.out.println("De que categoría es el trabajador (A, B, C)");
		String categoria = sc.nextLine();
		System.out.println("En que sección está (1 , 2, 3)");
		int seccion = sc.nextInt();
		System.out.println("Cuantas bajas injustificadas tiene el trabajador");
		int bajas = sc.nextInt();
		categoria = categoria.toLowerCase();
		int sueldo = 1100;
		switch (categoria) {
		case "a":
			sueldo = sueldo + (240/3);
			System.out.println("El trabajador cobrará: " + sueldo + "€");
			break;
		case "b":
			sueldo = sueldo + (240/3);
			System.out.println("El trabajador cobrará: " + sueldo + "€");
			break;
		case "c":
			if (seccion == 1) {
			sueldo = (int) (sueldo + ((30 - bajas) * 0.5) - (bajas * 30));
			System.out.println("El trabajador cobrará: " + sueldo + "€");
			} else if (seccion == 2 || seccion==3) {
			sueldo = (int) (sueldo + ((30 - bajas) * 1.2) - (bajas * 10));
			System.out.println("El trabajador cobrará: " + sueldo + "€");
			}
			break;
		}
		sc.close();
	}
}
