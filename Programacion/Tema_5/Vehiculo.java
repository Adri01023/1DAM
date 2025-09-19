package Ejercicios_Tema5;

public class Vehiculo implements Comparable<Vehiculo> {
	String matricula, marca, modelo;
	Integer caballos;
	Integer km;
	
	public Vehiculo(String mat, String mar, String mod, Integer c, Integer km) {
		matricula = mat;
		marca = mar;
		modelo = mod;
		caballos = c;
		this.km = km;
	}

	@Override
	public int compareTo(Vehiculo o) {
		int resul = km.compareTo(o.km);
		if (resul == 0) resul = caballos.compareTo(o.caballos);
		return resul;
	}
	@Override
	public String toString() {
		return "[" + matricula + " " + modelo + "]";
	}
}
