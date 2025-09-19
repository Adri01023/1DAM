package EjerciciosTema2;
import java.util.Scanner;
public class ejercicio_38 {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		/*System.out.println("Introduce números");
		int num1 = sc.nextInt();
		System.out.println("Introduce números (distinto del anterior)");
		int num2 = sc.nextInt();
		if (num1 == num2) {
			System.out.println("Has introducido dos valores iguales");
		} else {
		do {
			System.out.println("Introduce número (distinto del anterior)");
			num1 = sc.nextInt();
			System.out.println("Introduce número (distinto del anterior)");
			num2 = sc.nextInt();
		} while (num1 != num2);
		System.out.println("Has introducido dos valores iguales");
		}*/
		String palabra = sc.nextLine();
		String palindromo = palabra.substring(palabra.length(), 0);
		System.out.println(palindromo);
		sc.close();
	}
}
