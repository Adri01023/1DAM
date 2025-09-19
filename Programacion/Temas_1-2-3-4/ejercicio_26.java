package EjerciciosTema2;
import java.util.Scanner;
public class ejercicio_26 {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		System.out.println("Introduce un número positivo");
		double num = sc.nextDouble();
		double suma = 0;
		double contador = 0;
		if (num > 0) {
			suma = num + suma;
			contador ++;
		} else { 
			System.out.println("Introduce un valor válido");
		}
		do {
			System.out.println("Introduce otro número positivo");
			num = sc.nextDouble();
			if (num > 0) {
				suma = num + suma;
				contador ++;
			}
		} while (num > 0);
		System.out.println("La media de los números es: " + suma / contador);
		sc.close();
	}
}
