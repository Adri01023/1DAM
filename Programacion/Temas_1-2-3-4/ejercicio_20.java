package EjerciciosTema2;
import java.util.Scanner;
public class ejercicio_20 {
	public static void main(String[] args) {
	var sc = new Scanner(System.in);
	System.out.println("Introduce un número positivo");
	int num = sc.nextInt();
	do {
		System.out.println(num * num);
		System.out.println("Introduce un número positivo");
		num = sc.nextInt();
	} while (num > 0);
	sc.close();
}
}
