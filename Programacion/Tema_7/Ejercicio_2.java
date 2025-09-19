package Ejercicios_Tema_7;

import java.util.Scanner;

public class Ejercicio_2 {
	public static void main(String[] args) {
		final int NUM = 5;
		int[] enteros = new int[NUM];
		int posicion = 0;
		Scanner teclado = new Scanner(System.in);
		int cont = 0;
		int divisor = 0;
		while (cont < NUM) {
		System.out.println("Introduce una posición del array:");
		posicion = Integer.parseInt(teclado.nextLine());
		System.out.println("Introduce un divisor:");
		try {
			divisor = Integer.parseInt(teclado.nextLine());
		} catch(NumberFormatException y) {
			System.out.println("Introduce un número entero");
		}
		try {
			enteros[posicion] = 100 / divisor;
		} catch(ArrayIndexOutOfBoundsException x) {
			System.out.println("Se va de los límites del Array");
		} catch(ArithmeticException z) {
			System.out.println("No se puede dividir por 0");
		}
		
		cont++;
		}
		System.out.println("El contenido del array de enteros es:");
		for (int valor : enteros) {
		System.out.println(valor);
		}
		}
}
