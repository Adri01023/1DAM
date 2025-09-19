package Ejercicios_Tema_6;

public class Libros extends Biblioteca implements Prestable {
	boolean prestado = false;
	Libros(String t, String c, int a) {
		super(t, c, a);
	}

	@Override
	public void prestar() {
		if (prestado) {
			System.out.println("Este libro ya está prestado");
		} else {
			System.out.println("Prestando libro... \n Libro prestado");
			prestado = true;
		}
		
	}

	@Override
	public void devolver() {
		if (prestado) {
			System.out.println("Devolviendo libro... \n Libro devuelto");
			prestado = false;
		} else {
			System.out.println("El libro no ha sido prestado, devolución cancelada");
		}
	}

	@Override
	public String toString() {
		return  "Libro " + titulo;
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
