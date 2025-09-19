package Ejercicios_Tema_7;

public class Ejercicio_1 {
	public static void main(String[] args) {
		int [] numeros = new int[5];
		try {
			System.out.println("Prueba ArrayIndexOutOfBoundsExcepction");
			numeros[6] = 9;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Se va de los límites");
		} 
	}
}
