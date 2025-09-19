package EjerciciosTema2;
import java.util.Scanner;
public class ejercicio_33 {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		System.out.println("Introduce un número:");
		int num = sc.nextInt();
		for (int x = num -1; x > 0 ; x--) {
			if (x % 2 == 0) {
				System.out.println(x);
			}
		}
		sc.close();
}
}
