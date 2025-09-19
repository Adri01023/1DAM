package Ejercicios_Tema5;

public class Ejercicio_14 {
	public static void main(String[] args) {
		Alumnoexp x1 = new Alumnoexp("05451068E", "Adrian");
		Alumnoexp x2 = new Alumnoexp("04512542P", "Pepe");
		x1.calificar("Lengua", (float) 7.6);
		x1.calificar("Mates", (float) 3.4);
		x1.calificar("Mates", (float) 5);
		x2.calificar("Programacion", (float) 8);
		x2.calificar("Marcas", (float) 7);
		System.out.println(x1);
		System.out.println(x2);
		System.out.printf("\nLa nota media es: %.2f" ,x1.media());
	}
}
