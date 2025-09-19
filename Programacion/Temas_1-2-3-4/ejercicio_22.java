package EjerciciosTema2;
import java.util.Scanner;
public class ejercicio_22 {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		System.out.println("Introduce un número");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("El número es par");
		} else if (num % 2 == 1){
			System.out.println("El número es impar");
		}
		do {
			num = sc.nextInt();
			if (num % 2 == 0) {
				System.out.println("El número es par");
			} else if (num % 2 == 1) {
				System.out.println("El número es impar");
		}
	}while (num != 0);
		sc.close();
	}
}
