package EjerciciosTema2;

import java.util.Scanner;

public class ejercicio_1 {
	public static void main(String[] args) {
		System.out.println("Por favor ingrese su nota:");
		var sc = new Scanner(System.in);
			int nota = sc.nextInt();
			if (nota >10) {
			System.out.println("Reinicie el programa e ingrese la nota de nuevo");
			}
			else if (nota >=5){
				System.out.println("Ha aprobado y su nota es: " + nota);
			}
			else {
				System.out.println("Ha suspendido y su nota es: " + nota);
			}
			sc.close();

		 }
	}
