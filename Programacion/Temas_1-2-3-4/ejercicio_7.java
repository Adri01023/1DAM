package EjerciciosTema2;
import java.util.Scanner;
public class ejercicio_7 {
	public static void main(String[] args) {
	var sc = new Scanner(System.in);
	System.out.println("Introduzca la temperatura actual");
	int temp = sc.nextInt();
	if (temp > 30) {
		System.out.println("La actividad más apropiada es natación");
	} else if (temp >20 && temp <=30){
		System.out.println("La actividad más apropiada es tenis");
	} else if (temp >10 && temp <=20) {
		System.out.println("La actividad más apropiada es golf");
	} else if (temp >5 && temp <=10) {
		System.out.println("La actividad más apropiada es esquí");
	} else if (temp <= 5) {
		System.out.println("La actividad más apropiada es parchís");
	}
	sc.close();
}
}
