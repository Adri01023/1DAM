package Ejercicios_Tema_6;

public class ListaMultimedia {
	int x, conta;
	Multimedia[] lista;
	public ListaMultimedia(int i) {
		x = i;
		lista = new Multimedia[i];
	}
	String size() {
		return "La lista tiene " + conta + " objetos";
	}
	boolean add(Multimedia m) {
		for (int i = 0; i < x; i++) {
			if (lista[i] == null) {
				lista[i] = m;
				conta++;
				return true;
			}
			}
		return false;
	}
	Multimedia get(int i) {
		return lista[i];
	}

	public String toString() {
	return lista[0].toString();
	}
}

