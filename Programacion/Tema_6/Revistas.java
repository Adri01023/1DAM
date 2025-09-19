package Ejercicios_Tema_6;

public class Revistas extends Biblioteca {
	int numero;
	Revistas(String t, String c, int a, int n) {
		super(t, c, a);
		numero = n;
	}

	@Override
	public String toString() {
		return "Revista " + titulo + " edición " + numero;
	}

	@Override
	int getAñoPubli() {
		return añoPubli;
	}

	@Override
	String getCodigo() {
		return codigo;
	}

}
