package EjerciciosTema2;
import java.util.Scanner;
public class ejercicio_14 {
	public static void main(String[] args) {
	var sc = new Scanner(System.in);
	System.out.println("¿Cuantos Kw/h marcaba en la última lectura?");
	double kw = sc.nextFloat();
	double cst = 2;
	double cst_100 = 0;
	if (kw <= 100) {
		cst_100 = ((cst + 0.5) * kw);
		System.out.println("El importe a pagar es de: " + cst_100 + "€");
	} else if (kw > 100 && kw <= 250) {
		cst_100 = (((cst + 0.7) * (kw - 100))) + 250;
		System.out.println("El importe a pagar es de: " + cst_100 + "€");
	} else if (kw > 250) {
		cst_100 = (((cst + 1) * (kw - 250))) + 655;
		System.out.println("El importe a pagar es de: " + cst_100 + "€");
	}
	sc.close();
}
}
