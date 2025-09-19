package EjerciciosTema2;
import java.util.Scanner;
public class ejercicio_29 {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		System.out.println("Introduce una nota");
		double nota = sc.nextDouble();
		int conta_s = 0;
		int conta_a = 0;
		int conta_n = 0;
		int conta_ss = 0;
		do {
			if (nota >= 0 && nota <= 4.99) {
				conta_s++;
			} else if (nota >=5 && nota <= 6.99) {
				conta_a++;
			} else if (nota >=7 && nota <= 8.99) {
				conta_n++;
			} else if (nota >= 9 && nota <= 10) {
				conta_ss++;
			} else {
				System.out.println("Introduce un valor correcto");
				break;
			}
			System.out.println("Introduce la siguiente nota (para salir escriba -1)");
			nota = sc.nextDouble();
		} while (nota != -1);
		System.out.println("El número de suspensos ha sido: " + conta_s + "\nEl número de aprobados ha sido: " + conta_a + "\nEl número de notables ha sido: " + conta_n + "\nEl número de sobresalientes ha sido: " + conta_ss);
		sc.close();
	}
}
