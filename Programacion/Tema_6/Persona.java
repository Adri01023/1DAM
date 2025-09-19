package Ejercicios_Tema_6;

public abstract class Persona {
	String nombre, apellidos, dni;
	enum EstadoCivil {
		Casado, Casada, Viudo, Viuda, Separado, Separada, Soltero, Soltera, Divorciado, Divorciada
	}
	EstadoCivil estadoc;
	Persona(String n, String a, String d, EstadoCivil e) {
		nombre = n;
		apellidos = a;
		dni = d;
		estadoc = e;
	}
	void CambioEstadoCivil(EstadoCivil e) {
		estadoc = e;
	}
	public abstract String toString();
}
