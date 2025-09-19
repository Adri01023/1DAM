package EjerciciosTema2;
import java.util.Scanner;
public class ejercicio_28 {
	public static void main(String[] args) {
	var sc = new Scanner(System.in);
	double media_alt = 0;
	double media_edad = 0;
	int conta_e = 0;
	int conta_a = 0;
	for (int x = 1; x < 6; x++) {
		System.out.println("Introduce una edad ("+ x + " de 5)");
		double edad = sc.nextDouble();
		if (edad >= 18) {
			conta_e++;
			media_edad += edad;
		} else {
			media_edad += edad;
		}
		}
	for (int y = 1; y < 6; y++) {
		System.out.println("Introduce una altura ("+ y + " de 5)");
		double altura = sc.nextDouble();
		if (altura >= 1.75) {
			conta_a++;
			media_alt += altura;
		} else {
			media_alt += altura;
		}
		}
	System.out.println("El promedio de edad es: " + media_edad / 5 + " el número de personas mayores de edad son: " + conta_e);
	System.out.printf("El promedio de altura es: %1$1.2f  el numero de personas que miden mas de 1,75 son: %2$1d" , media_alt /5 , conta_a);
	sc.close();
}
}
