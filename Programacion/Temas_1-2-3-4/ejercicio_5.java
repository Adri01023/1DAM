package EjerciciosTema2;
import java.util.Scanner;
public class ejercicio_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número de horas trabajadas");
		int horas = sc.nextInt();
		int menos35 = (horas * 15);
		int mas35 = ((horas - 35)*22) + 525;
		if (horas <= 35) {
			System.out.println("El salario a pagar es: " + menos35+ "€");
		} else {
			System.out.println("El salario a pagar es: " + mas35+ "€");
		}
		sc.close();
	}
}
