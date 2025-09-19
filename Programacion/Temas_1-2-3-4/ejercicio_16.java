package EjerciciosTema2;
import java.util.Scanner;
public class ejercicio_16 {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		System.out.println("Indique su nota y se le devolverá su calificación:");
		double nota = sc.nextDouble();
		if (nota >= 0 && nota <= 4.99) {
			System.out.println("Suspenso");
		} else if (nota >= 5 && nota <= 6.99) {
			System.out.println("Bien");
		} else if (nota >= 7 && nota <= 8.99) {
			System.out.println("Notable");
		} else if (nota >= 9 && nota <= 10) {
			System.out.println("Sobresaliente");
		} else {
			System.out.println("Ingrese una nota calificable");
		}
		sc.close();
	}
}