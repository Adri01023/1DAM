package Ejercicios_Tema_6;

public class Empleados extends Persona {
	int año_inc, num_d;
	
	Empleados(String n, String a, String d, EstadoCivil e, int ai, int nd) {
		super(n, a, d, e);
		año_inc = ai;
		num_d = nd;
	}
	void ReasigDesp(int rd) {
		num_d = rd;
	}
	void listarEmpleados() {
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "Empleado: " + nombre + " " + apellidos + " DNI: " + dni;
	}
	
}
