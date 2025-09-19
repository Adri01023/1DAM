package Ejercicios_tema8;

public class Empleado extends Persona {
	double sueldo;
	Empleado(String d, String n, int e, double s) {
		super(d, n, e);
		sueldo = s;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
}
