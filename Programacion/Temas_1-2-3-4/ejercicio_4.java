package EjerciciosTema2;
import java.util.Scanner;


public class ejercicio_4 {

	public static void main(String[] args){
		System.out.println("Ingrese el primer número entero");
		var sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("Ingrese el segundo número entero");
		int num2 = sc.nextInt();
		if (num1 == num2) {
		System.out.println("Los números son iguales");	
		} else {
		System.out.println("Los números son distintos");
		sc.close();
		}
		}
		}