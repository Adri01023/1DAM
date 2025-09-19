package EjerciciosTema2;
import java.util.Scanner;
public class ejercicio_21 {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		System.out.println("Introduce un número");
		int num = sc.nextInt();
		if (num > 0) {
			System.out.println("El número es positivo");
		} else if (num < 0){
			System.out.println("El número es negativo");
		}
		do {
			num = sc.nextInt();
			if (num > 0) {
				System.out.println("El número es positivo");
			} else if (num < 0){
				System.out.println("El número es negativo");
		}
	}while (num != 0);
		sc.close();
}
}