package EjerciciosTema2;
import java.util.Scanner;
public class ejercicio_40 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer número (1 de 9): ");
		int num = sc.nextInt();
		int compara1 = num;
		double media = 0;
		for (int x = 2 ; x < 9; x++) {
			media += num;
			System.out.println("Introduce el siguiente número (" + x + " de 9)");
			num = sc.nextInt();
		}
		System.out.println("Introduce el último número: ");
		num = sc.nextInt();
		int compara2 = num;
		if (compara1 == compara2) {
			System.out.println("La media de los 9 números es: " + media / 9);
		} else {
			System.out.println("Vamos los chicos");
		}
		sc.close();
	}
}
