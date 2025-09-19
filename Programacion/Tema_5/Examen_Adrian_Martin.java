package Ejercicios_Tema5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Examen_Adrian_Martin {
	public static void main(String[] args) {
		HashMap<String, Integer> inventario = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		String nombre;
		int numero;
		int menu;
		do {
			System.out.println("\nMenú de opciones:\n"
					+ "1. Agregar producto\n"
					+ "2. Eliminar producto\n"
					+ "3. Mostrar inventario\n"
					+ "4. Buscar producto\n"
					+ "5. Salir");
			menu = sc.nextInt();
			switch (menu) {
			case 1: {
				System.out.println("Introduzca el nombre del producto");
				nombre = sc.next();
				System.out.println("Introduzca la cantidad");
				numero = sc.nextInt();
				Agrega(inventario, nombre, numero);
				break;
			}
			case 2: {
				System.out.println("Introduzca el nombre del producto");
				nombre = sc.next();
				Elimina(inventario, nombre);
				break;
			}
			case 3: { //Chequea si el inventario está vacío, si tiene elementos los lista
				if (inventario.size() == 0) {
					System.out.println("El inventario está vacío");
				} else {
				Iterator it = inventario.keySet().iterator();
				System.out.println("Inventario actual: \n ");
				while (it.hasNext()) {
					String it2 = (String) it.next();
					System.out.println(" - " + it2 + ": " +  inventario.get(it2) + "\n");
				} }
				break;
			}
			case 4: {
				System.out.println("Introduzca el producto a buscar");
				nombre = sc.next();
			System.out.println(Busca(inventario, nombre));
				break;
			}
			case 5: {
				System.out.println("Adios");
				break;
			}
			}
		} while (menu != 5);
	}
	static void Agrega(HashMap<String, Integer> x, String y, Integer z) { //Metodo para agregar productos (Opcion 1) 
		int antes;
		if (x.containsKey(y)) {
			antes = (int) x.get(y);
			x.remove(y);
			z += antes;
			x.put(y,z);
		} else {
			x.put(y, z);
		}
	}
	static void Elimina(HashMap<String, Integer> x, String y) { //Metodo para eliminar productos (Opcion 2) 
		x.remove(y);
	}
	static String Busca(HashMap<String, Integer> x, String y) { //Metodo para buscar productos (Opcion 4) 
		if (x.containsKey(y)) {
			return "La cantidad de " + y + " es " + x.get(y); 
		} else {
			return "No hay " + y + " en el inventario";
		}
	}
	
}
