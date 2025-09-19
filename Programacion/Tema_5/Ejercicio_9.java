package Ejercicios_Tema5;

import java.util.HashSet;
import java.util.Iterator;

public class Ejercicio_9 {
	public static void main(String[] args) {
		HashSet<String> jugadores = new HashSet<String>();
		jugadores.add("Jordi Alba");
		jugadores.add("Piqué");
		jugadores.add("Busquets");
		jugadores.add("Iniesta");
		jugadores.add("Messi");
		for (Iterator<String> iterador = jugadores.iterator(); iterador.hasNext();) {
			System.out.println(iterador.next());
		}
		if (jugadores.contains("Neymar JR")) System.out.println("Se queda");
			else System.out.println("Se va");
		HashSet<String> jugadores2 = new HashSet<String>();
		jugadores2.add("Piqu");
		jugadores2.add("Busquets");
		if (jugadores.containsAll(jugadores2)) System.out.println("Todos los jugadores2 existen en jugadores");
			else System.out.println("No todos los jugadores2 existen en jugadores");
		System.out.println(jugadores.addAll(jugadores2));
		System.out.println(jugadores);
	}
}
