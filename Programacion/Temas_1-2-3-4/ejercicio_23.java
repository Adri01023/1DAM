package EjerciciosTema2;
import java.util.Scanner;
public class ejercicio_23 {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		System.out.println("Introduce un número positivo");
		int num = sc.nextInt();
		int contador = 0;
		if (num > 0) {
			contador ++;
		}
		do {
			System.out.println("Introduce un número positivo");
			num = sc.nextInt();
			contador ++;
		}while (num > 0);
		System.out.println("Se han introducido: " + contador + " números");
		sc.close();
	}
}