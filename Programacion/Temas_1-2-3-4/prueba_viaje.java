package EjerciciosTema2;

public class prueba_viaje {
public static void main(String[] args) {
	Viaje pruebita = new Viaje("El Cairo", "Madrid", 1246, 1, 8);
	Viaje pruebita2 = new Viaje("Alaska", "Minnesota", 566, 2, 2);
	System.out.println(pruebita.detalles());
	System.out.println(pruebita.reserva());
	System.out.println(pruebita.getPlazas());
	System.out.println(pruebita.modifica(85));
	System.out.println(pruebita.getPlazas());
	System.out.println(pruebita.getRecaudacion());
	System.out.println(pruebita2.detalles());
	System.out.println(pruebita2.reserva());
	System.out.println(pruebita2.getRecaudacion());
	System.out.println(pruebita2.getPlazas());
}
}
	/*int numero = 5;
	int resultado = factorial(numero);
	System.out.println("Factorial de " + numero + " es " + resultado);
}
	public static int factorial(int n) {
		if (n==0) {
			return 1;
		}
			return n * factorial(n -1);
	}
	
	}
*/