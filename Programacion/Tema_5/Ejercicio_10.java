package Ejercicios_Tema5;

import java.util.Iterator;
import java.util.TreeSet;

public class Ejercicio_10 {
	public static void main(String[] args) {
		TreeSet<String> colores = new TreeSet<String>();
		colores.add("Red");
		colores.add("Green");
		colores.add("Orange");
		colores.add("White");
		colores.add("Black");
		for (Iterator<String> iteradorklk = colores.iterator(); iteradorklk.hasNext();) System.out.print(iteradorklk.next() + "  ");
		TreeSet<String> colores2 = new TreeSet<String>();
		colores2.add("Pink");
		colores2.add("Blue");
		colores2.add("Yellow");
		colores.addAll(colores2);
		System.out.println("\n\n");
		for (Iterator<String> iteradorklk = colores.iterator(); iteradorklk.hasNext();) System.out.print(iteradorklk.next() + "  ");
		System.out.println("\n\nPrimero " + colores.first());
		System.out.println("\nÚltimo " + colores.last());
		TreeSet<Integer> numeros = new TreeSet<Integer>();
		for (Integer i = 0; i < 11; i++) numeros.add(i * i);
		System.out.println(numeros);
		System.out.println(numeros.descendingSet());
		System.out.println(numeros.first());
		System.out.println(numeros.last());
		System.out.println(numeros.headSet(7).size());
		System.out.println(numeros.higher(8));
	}
	/*public static Integer compara(TreeSet<Integer> l, Integer n) {
		for (Iterator<Integer> iterador = l.iterator(); iterador.hasNext();) {
		if (iterador.next() )
			
	}*/
}
