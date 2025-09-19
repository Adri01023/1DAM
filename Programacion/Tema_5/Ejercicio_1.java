package Ejercicios_Tema5;
import java.util.ArrayList;
public class Ejercicio_1 {
	public static void main(String[] args) {
		Objeto hola = new Objeto(7, "Paqui");
		ArrayList<Objeto> lista = new ArrayList<>();
		Objeto Objeto1 = new Objeto(1, "Paco");
		putInicio(Objeto1, lista);
		putFinal(hola, lista);
		System.out.println(lista.toString());
		System.out.println(popPrincipio(lista));
		System.out.println(lista.toString());
	}	
	public static void putInicio(Objeto h1, ArrayList<Objeto> al) {
		al.add(0, h1);
	}
	public static void putFinal(Objeto h1, ArrayList<Objeto> al) {
		al.add(al.size()-1, h1);
	}
	public static Objeto popPrincipio(ArrayList<Objeto> lo) {
		Objeto n = lo.get(0);
		lo.remove(0);
		return n;
	}
	public static int count(ArrayList<Objeto> h1) {
		return h1.size();
	}

}