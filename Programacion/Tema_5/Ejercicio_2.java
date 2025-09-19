package Ejercicios_Tema5;

import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio_2 {
	public static void main(String[] args) {
		ArrayList<Producto> lista = new ArrayList<Producto>();
		Scanner sc = new Scanner(System.in);
		int conta = 0;
		float total = 0;
		while (lista.size() != 8 && conta != 4) {
			pedir(lista, sc);
			for (Producto x : lista) {
				total = Producto.total;
				if (x.nombrep.equals("FIN")) {
					conta = 4;
					total -= (x.precio * x.cantidad);
				}
			}
		}
		ticket(lista, conta, total);
		sc.close();
	}
	public static void pedir(ArrayList<Producto> pepe, Scanner sc) {
		System.out.println("\nNombre producto");
		String n = sc.next();
		System.out.println("\nIntroduce la cantidad");
		int c = sc.nextInt();
		System.out.println("\nIntroduce el precio");
		float p = sc.nextFloat();
		Producto x = new Producto(n, c, p);
		pepe.add(x);
		}
	public static void ticket(ArrayList<Producto> x, int z, float t) {
		 System.out.println("\n\n\n\n******** Cantidad * Precio ** Total\n");
		 if (z == 4) {
		for (int i = 0; i < x.size() -1; i++) {
			System.out.println(x.get(i));
		}
		} else {
			for (int i = 0; i < x.size() ; i++) {
				System.out.println( x.get(i));
			}
		}
		 System.out.printf("Precio Final ******************* %.2f€" ,t);
	}
}
