package EjerciciosTema2;
import java.util.Scanner;
public class ejercicio_18 {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		System.out.println("Introduce un número positivo mayor que 2");
		int num = sc.nextInt();
		if (num > 2) {
			for (int x = num ; x >= 2 ; x -= 2)
			{
				System.out.println(x);
			}
		} else {
			System.out.println("Introduce un valor válido");
		}
		sc.close();
	}
}