package EjerciciosTema2;
import java.util.Scanner;
public class ejercicio_8 {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		int contador = 0;
		System.out.println("Introduce el primer número");
		int num1 = sc.nextInt();
		System.out.println("Introduce el segundo número");
		int num2 = sc.nextInt();
		if (num1 < 0 && num2 < 0) {
			contador = num1 + num2;
			System.out.println("El resultado es: " + contador);
		} else if (num1 > 0 && num2 > 0) {
			contador = num1 + num2;
			System.out.println("El resultado es: " + contador);
		}else if (num1 == 0 || num2 == 0) {
			System.out.println("No se puede introducir 0 como valor");
		}
		sc.close();
	}
}
