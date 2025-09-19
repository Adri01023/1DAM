package EjerciciosTema2;
import java.util.Scanner;
public class ejercicio_9 {
	public static void main(String[] args) {
	var sc = new Scanner(System.in);
	System.out.println("Introduce el primer número");
	int num1 = sc.nextInt();
	System.out.println("Introduce el segundo número");
	int num2 = sc.nextInt();
	int mayor = Math.max(num1,num2);
	if (num1 == num2) {
		System.out.println("Los números han de ser distintos");
	} else {
		System.out.println("El número de mayor valor es: " + mayor);
	}
	sc.close();
}
}