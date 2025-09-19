package EjerciciosTema2;
import java.util.Scanner;
public class ejercicio_13 {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		System.out.println("Indica el precio del producto");
		float precio = sc.nextFloat();
		float descuento5 = (float) (precio - (precio*0.05));
		float descuento10 = (float) (precio - (precio*0.1));
		if (precio < 6) {
			System.out.println("El precio de la prenda es: " + precio + "€");
		} else if (precio >= 6 && precio < 60){
			System.out.println("El precio de la prenda es: "+ descuento5 + "€ y se le ha aplicado un descuento de " + precio * 0.05 + "€");
		} else if (precio >= 60) {
			System.out.println("El precio de la prenda es: "+ descuento10 + "€ y se le ha aplicado un descuento de " + precio * 0.1 + "€");
		}
		sc.close();
}
}