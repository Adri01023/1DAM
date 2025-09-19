package EjerciciosTema2;
import java.util.Scanner;
public class ejercicio_11 {
public static void main(String[] args) {
	var sc = new Scanner(System.in);
	System.out.println("Introduce el primer número");
	int num1 = sc.nextInt();
	System.out.println("Introduce el segundo número");
	int num2 = sc.nextInt();
	System.out.println("Introduce el tercer número");
	int num3 = sc.nextInt();
	int mayor1 = Math.max(num1, num2);
	int mayorf = Math.max(mayor1, num3);
	System.out.println("El número de mayor valor es: " + mayorf);
	sc.close();
}
}
