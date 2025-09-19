package EjerciciosTema2;
import java.util.Scanner;
public class ejercicio_36 {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		System.out.println("Introduce el primer entero");
		int num1 = sc.nextInt();
		System.out.println("Introduce el segundo número");
		int num2 = sc.nextInt();
		int mayor = Math.max(num1, num2);
		int menor = Math.min(num1, num2);
		for (int menor1 = menor; menor1 < mayor + 1; menor1++) {
			System.out.println(menor1);
		}
		sc.close();
	}
}
