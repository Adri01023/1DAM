package EjerciciosTema2;
import java.util.Scanner;
public class ejercicio_34 {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		System.out.println("De que número deseas obtener la tabla de multiplicar: (del 1 al 10)");
		int num = sc.nextInt();
		if (num <= 10) {
		for (int x = 1 ; x < 11; x ++) {
			int resultado = num * x;
			System.out.println(num + " x " + x + " = " + resultado);
		}
	} else {
		System.out.println("Reinicia el programa e introduce un valor correcto");
	}
		sc.close();
}
}