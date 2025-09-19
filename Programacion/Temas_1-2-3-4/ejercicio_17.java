package EjerciciosTema2;
import java.util.Scanner;
public class ejercicio_17 {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		System.out.println("Introduzca un número entero positivo mayor que 2");
		int num = sc.nextInt();
		if (num > 2) {
			System.out.println(":)");
		} else {
			System.out.println("Introduzca de nuevo el número");
		}
		sc.close();
	}
}
