package EjerciciosTema2;
import java.util.Scanner;
public class ejercicio_27 {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		System.out.println("Introduce un sueldo (llevas 1 de 10)");
		int sueldo = sc.nextInt();
		int contador_s = 0;
		if (sueldo > 1000) {
			contador_s ++;
		}
		for (int contador = 2 ; contador < 11 ; contador++) {
			System.out.println("Introduce otro sueldo (llevas " + contador + " de 10)" );
			sueldo = sc.nextInt();
			if (sueldo > 1000) {
				contador_s ++;
			}
		}
		System.out.println("El número de empleados que cobran más de 1000€ es: " + contador_s);
		sc.close();
	}
}