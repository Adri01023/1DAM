package Ejercicios_Tema_6;

public class Profesor extends Empleados {
	String departamento;
	public Profesor(String n, String a, String d, EstadoCivil e, int ai, int nd, String depa) {
		super(n, a, d, e, ai, nd);
		departamento = depa;
	}
	void CambioDepa(String dep) {
		departamento = dep;
	}
	void cambiarDepa(String d, String nc) {
		if (dni.equals(d)) {
			departamento = nc;
			System.out.println("Departamento cambiado con éxito");
		} else System.out.println("No se ha encontrado el DNI introducido");
	}
	void listarProfesoresDepartamento(String d) {
		if (departamento.equals(d)) toString();
	}
@Override
	public String toString() {
		return "Profesor/a: " + nombre + " " + apellidos + " Departamento: " + departamento + " Número despacho: " + num_d;
	}
	
}
