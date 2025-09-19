package Ejercicios_Tema_6;

public class Empleado_I {
	String nombre, direccion, dni;
	boolean esPropio;
	long telefono, id;
	double beneficio, horas;
	Empleado_I(String n, String di, String d, long t, double b) {
		nombre = n;
		direccion = di;
		dni = d;
		telefono = t;
		beneficio = b;
		id++;
	}
	void fichar(double hora) {
		horas += hora;
	}
	abstract void 
}
