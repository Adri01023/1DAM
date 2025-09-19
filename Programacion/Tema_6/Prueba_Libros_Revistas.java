package Ejercicios_Tema_6;

import java.util.ArrayList;

public class Prueba_Libros_Revistas {
	public static void main(String[] args) {
		ArrayList<Biblioteca> inventario = new ArrayList<Biblioteca>();
		Libros libro1 = new Libros("Dentro de casa", "2312342", 2016);
		Revistas revista1 = new Revistas("Hola", "2453648", 2022, 105);
		inventario.add(libro1);
		inventario.add(revista1);
		System.out.println(inventario);
		libro1.devolver();
		libro1.prestar();
		libro1.devolver();
		System.out.println(revista1.getAñoPubli());
	}
}
