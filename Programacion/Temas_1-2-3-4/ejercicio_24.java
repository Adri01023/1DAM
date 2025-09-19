package EjerciciosTema2;
import java.util.Scanner;
public class ejercicio_24 {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		System.out.println("Introduce un número a adivinar");
		int adivina = sc.nextInt();
		System.out.println("Intenta adivinar");
		int intento = sc.nextInt();
		if (intento < adivina) {
			System.out.println("¡Casi! Prueba con un número mas alto");
		} else {
			System.out.println("¡Casi! Prueba con un número mas bajo");
		}
		do {
			intento = sc.nextInt();
			if (intento < adivina) {
				System.out.println("¡Casi! Prueba con un número mas alto");
			} else if (intento > adivina){
				System.out.println("¡Casi! Prueba con un número mas bajo");
			}
		}while (intento != adivina);
		System.out.println("¡Felicidades has ganado!");
		sc.close();
	}
}
