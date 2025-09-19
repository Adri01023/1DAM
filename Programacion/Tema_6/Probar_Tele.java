package Ejercicios_Tema_6;

import java.util.Scanner;

public class Probar_Tele {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número de canales");
		int numCanales = sc.nextInt();
		System.out.println("Introduce el canal actual");
		int canalActual = sc.nextInt();
		MiTele mitele = new MiTele(numCanales, canalActual);
		mitele.apagar();
		mitele.cambiarCanal(23);
		mitele.encender();
		mitele.cambiarCanal(12);
	}
}
