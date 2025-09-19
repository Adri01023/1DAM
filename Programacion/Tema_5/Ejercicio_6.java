package ejercicios;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;
public class Ejercicio_6 {
	public static void main(String[] args) {
		int conta = 0;
		ArrayList<Temperatura> temp = new ArrayList<Temperatura>();
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println(" 1. Rellenar las temperaturas. "
				+ "\n 2. Mostrar las temperaturas. "
				+ "\n 3. Temperatura media "
				+ "\n 4. Día mas caluroso");
		conta = sc.nextInt();
		switch (conta) {
		case 1:
			rellenar(temp,sc);
			break;
		case 2:
			mostrar(temp);
			break;
		case 3:
			System.out.println(media(temp));
			break;
		case 4:
			System.out.println(calor(temp));
			break;
		default:
			break;
		}
		} while (conta != 5);
		sc.close();
	}
	public static void rellenar(ArrayList<Temperatura> t, Scanner sc) {
		System.out.println("Introduce la temperatura");
		float tp = sc.nextFloat();
		System.out.println("Introduce el día de la semana");
		String d = sc.next();
		System.out.println("Introduce el día del mes");
		int i = sc.nextInt();
		t.add(new Temperatura(i,d,tp));
	}
	public static void mostrar(ArrayList<Temperatura> t) {
		ListIterator<Temperatura> iterador = t.listIterator();
		while (iterador.hasNext()) {
			System.out.println(iterador.next());
		}
		
	}
	public static float media(ArrayList<Temperatura> t) {
		float resultado = 0;
		for (Temperatura n : t) {
			resultado += n.temp;
		}
		return resultado / t.size();
	}
	public static String calor(ArrayList<Temperatura> t) {
		float conta = -200;
		Temperatura salida = null;
		for (Temperatura n : t) {
			if (n.temp > conta ) {
				salida = n;
				conta = n.temp;
			}
		}
		return "\nEl " + salida.dia_s + " " + salida.dia_m + " con " + salida.temp + "ºC \n";
	}
}
