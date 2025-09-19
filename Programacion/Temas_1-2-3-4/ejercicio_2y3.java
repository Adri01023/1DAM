package EjerciciosTema2;

import java.util.Scanner;

public class ejercicio_2y3 {
	public static void main(String[] args) {
	System.out.println("Ingrese la cantidad que desea convertir a € (en $)");
	Scanner sc = new Scanner(System.in);
	float lauro = sc.nextFloat();
	if (lauro < 100) {
		lauro = (float) (lauro + (lauro * 0.002));
	}
	System.out.println(lauro + "$ en € son " + (lauro *0.9) + "€");
	sc.close();
}
}