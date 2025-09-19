package EjerciciosTema2;
import java.util.Scanner;
public class ejercicio_25 {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		System.out.println("Introduce un número distinto de 0");
		int num = sc.nextInt();
		int suma = 0;
		if (num != 0) {
			suma = num + suma;
		} else { 
			System.out.println("Introduce un valor válido");
		}
		do {
			System.out.println("Introduce otro número distinto de 0");
			num = sc.nextInt();
			if (num != 0) {
				suma = num + suma;
			}
		} while (num != 0);
		System.out.println("La suma de los números es: " + suma);
		sc.close();
	}
}
