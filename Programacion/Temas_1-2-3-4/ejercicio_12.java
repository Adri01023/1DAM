package EjerciciosTema2;
import java.util.Scanner;
public class ejercicio_12 {
public static void main(String[] args) {
	var sc = new Scanner(System.in);
	System.out.println("¿Cual es la distancia a recorrer? (En km)");
	float km = sc.nextFloat();
	System.out.println("Indique los días de su estancia");
	float estanco = sc.nextFloat();
	float calculo = (float) (km * 0.05);
	float descuento = (float) (calculo - (calculo * 0.3));
	if (km > 1000 && estanco > 7) {
		System.out.println("El precio del billete es: " + descuento + "€ y se le ha aplicado un descuento de " + calculo*0.3 + "€");
	} else {
		System.out.println("El precio del billete es: " + calculo + "€");
	}
	sc.close();
}
}
