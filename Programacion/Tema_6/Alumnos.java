package Ejercicios_Tema_6;

public class Alumnos {
	String nombre;
	int edad;
	Alumnos(String n, int e) {
		nombre = n;
		edad = e;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Alumno " + nombre + ", edad " + edad ;
	}
	
}
