package Ejercicios_Tema5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ejercicio_8 {
	public static void main(String[] args) {
		HashSet<String> colores = new HashSet<String>();
		colores.add("Red");
		colores.add("Green");
		colores.add("Black");
		colores.add("White");
		colores.add("Pink");
		colores.add("Yellow");
		for (Iterator<String> iterador = colores.iterator(); iterador.hasNext();) {
			String paco = iterador.next();
			System.out.println(paco);
		}
		System.out.println(colores.size());
		Object colores_clonau = colores.clone();
		System.out.println(colores_clonau);
		colores.toArray();
		for (String x: colores) {
			System.out.println(x);
		}
		HashSet<String> colores3 = new HashSet<String>();
		colores3.add("Red");
		colores3.add("Green");
		colores3.add("Black");
		colores3.add("White");
		colores3.add("Pink");
		colores3.add("Yellow");
		HashSet<String> colores2 = new HashSet<String>();
		colores2.add("Red");
		colores2.add("Pink");
		colores2.add("Black");
		colores2.add("Orange");
		for (Iterator<String> iterator = colores3.iterator(); iterator.hasNext();) {
			//System.out.println("\n\n" + iterator.next());
			if (colores2.retainAll(colores3)) {
				System.out.println("Elementos iguales entre los dos HashSet");
				System.out.println(iterator.next());
				}
		}
		TreeSet<String> treecolor = new TreeSet<String>(colores2); 
		//Iterator<String> ite = treecolor.iterator();
		//while(ite.hasNext())
			System.out.println(treecolor);
	}
}
