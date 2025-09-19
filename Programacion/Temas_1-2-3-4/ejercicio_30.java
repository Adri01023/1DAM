package EjerciciosTema2;
import java.util.Scanner;
public class ejercicio_30 {
	public static void main(String[] args) {
		int conta_par = 0;
		int conta_impar = 0;
		int conta_n = 0;
		var sc = new Scanner(System.in);
		for (int x = 0; x < 99; x++) {
			System.out.println("Introduce un número ("+x+" de 99 )");
			int pide = sc.nextInt();
			if (pide % 2 == 0) {
				conta_par++;
			} else if (pide % 2 == 1) {
				conta_impar++;
			} else if (pide == 0) {
				conta_n++;
			}
		}
		System.out.println("La cantidad de números pares es: " + conta_par + "\nLa cantidad de números impares es: " + conta_impar + "\nLacantidad de números nulos es: " + conta_n);
		sc.close();
	}
}
