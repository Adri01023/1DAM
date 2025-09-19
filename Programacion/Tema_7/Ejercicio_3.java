package Ejercicios_Tema_7;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio_3 {
public static void main(String[] args) {
	int z = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Seleciona el tamaño del Array (que no sea mayor a quince)");
	try {
		z = sc.nextInt();
	} catch (InputMismatchException h) {
		System.out.println("Introduce números enteros");
		System.exit(1);
	} catch (NumberFormatException s) {
		System.out.println("Introduce el tipo dato que se requiere (números enteros)");
		System.exit(1);
	}
	int[] numeros = new int[z];
	rellenaArray(numeros);
	muestraArray(numeros);
}
	static int[] rellenaArray(int[] x) {
		try  {
			Scanner sc = new Scanner(System.in);
			int y = 0;
			if (x.length > 15) {
				x[99999] = 8;
			} else {
				int w = 0;
				for (int i = 0; i < x.length; i++) {
					System.out.println("Pon un número posición [" + i + "]");
					w = sc.nextInt();
					if (w < 0) {
						throw new ArithmeticException("Se ha introducido un número negativo");
					}
					x[i] = w;
				}
				sc.close();	
			}
			
		}	catch (ArrayIndexOutOfBoundsException df) {
			System.out.println("Error, se está intentando ingresar un dato en una posición fuera de los límites del Array");
			System.exit(1);
		}	catch (ArithmeticException y) {
			System.out.println("Se ha ingresado un número negativo, pruebe otra vez");
			System.exit(1);
		}
		return x;
		}
	
	static void muestraArray(int[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.println("\nPosición " + i + "[" + x[i] + "]");
		} 
	}
}
