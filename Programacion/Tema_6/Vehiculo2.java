package Ejercicios_Tema_6;

public class Vehiculo2 extends Vehiculo implements Comparar {

	Vehiculo2(double p, String m) {
		super(p, m);
	}

	@Override
	public boolean esMenor(double x) {
		if (peso < x) return true;
		else return false; 
	}

	@Override
	public boolean esMayor(double x) {
		if (peso > x) return true;
		else return false;
	}

	@Override
	public boolean esIgual(double x) {
		if (peso == x) return true;
		else return false;
	}

}
