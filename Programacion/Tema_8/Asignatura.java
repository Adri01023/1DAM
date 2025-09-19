package Ejercicios_tema8;

import java.io.Serializable;

public class Asignatura implements Serializable {
	double nota;
	String nombre;
	Asignatura(String nom, double not) {
		nota = not;
		nombre = nom;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
