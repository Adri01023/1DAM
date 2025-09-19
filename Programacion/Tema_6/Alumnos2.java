package Ejercicios_Tema_6;

public class Alumnos2 extends Alumnos implements Comparar {

	Alumnos2(String n, int e) { super(n, e); }

	@Override
	public boolean esMenor(double x) {
		if (edad < x) {
			return true;
		} else {
			return false;
	}
	}

	@Override
	public boolean esMayor(double x) {
		if (edad > x) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean esIgual(double x) {
		if (edad == x) {
			return true;
		} else {
			return false;
		}
	}
	
}
