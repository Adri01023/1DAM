package Ejercicios_Tema_6;

public class Estudiante extends Persona {
	String curso;
	Estudiante(String n, String a, String d, EstadoCivil e, String c) {
		super(n, a, d, e);
		curso = c;
	}
	void MatriculaNueva(String mn) {
		curso = mn;
	}
	void cambiarCurso(String d, String nc) {
		if (dni.equals(d)) {
			dni = nc;
			System.out.println("Curso cambiado con éxito");
		} else System.out.println("No se ha encontrado el DNI introducido");
	}
	@Override
	public String toString() {
		return "Alumno/a: " + nombre + " " + apellidos + " Matriculado en: " + curso;
	}
	
}
