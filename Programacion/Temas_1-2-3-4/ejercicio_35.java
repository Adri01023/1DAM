package EjerciciosTema2;
import java.util.Scanner;
public class ejercicio_35 {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		System.out.println("Introduce el primer número");
		int num1 = sc.nextInt();
		System.out.println("Introduce el segundo número");
		int num2 = sc.nextInt();
		System.out.println("Introduce el tercer número");
		int num3 = sc.nextInt();
		System.out.println("Introduce el cuarto número");
		int num4 = sc.nextInt();
		System.out.println("Introduce el quinto número");
		int num5 = sc.nextInt();
		int mayor1 = Math.max(num1, num2);
		int mayor2 = Math.max(mayor1, num3);
		int mayor3 = Math.max(mayor2, num4);
		int mayor4 = Math.max(mayor3, num5);
		System.out.println("El número mayor es: " + mayor4);
		sc.close();
	}
}
