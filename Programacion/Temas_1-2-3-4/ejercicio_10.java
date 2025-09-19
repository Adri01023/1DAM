package EjerciciosTema2;
import java.util.Scanner;
public class ejercicio_10 {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		System.out.println("Introduce el primer número");
		int num1 = sc.nextInt();
		System.out.println("Introduce el segundo número");
		int num2 = sc.nextInt();
		int menor = Math.min(num1, num2);
		int mayor = Math.max(num1, num2);
		System.out.println("Estos números en orden serían: " + menor + ", " + mayor);
		sc.close();
	}
}
