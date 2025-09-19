package Ejercicios_Tema_6;

public abstract class Biblioteca {
	int añoPubli;
	String titulo, codigo;
	Biblioteca(String t, String c, int a) {
		añoPubli = a;
		titulo = t;
		codigo = c;
	}
	public abstract String toString();
	abstract int getAñoPubli();
	abstract String getCodigo();
}
