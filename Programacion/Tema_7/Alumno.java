package Ejercicios_Tema_7;

public class Alumno {
	String nombre;
	int edad;
	double nota;
	
	public Alumno(String n, int e, double no) throws EdadNoValidaException {
		edad = e;
		if (edad < 0) {
            throw new EdadNoValidaException("La edad no puede ser negativa.");
        }
        nombre = n;
        
        nota = no;
    }
	
	public double getNota() {
		return nota;
	}
	
	public void setNota(double n) {
		nota = n;
		System.out.println("Nota actualizada");
	}
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	@Override
	public String toString() {
		return "Alumno: " + nombre + " Edad: " + edad + " Nota: " + nota;
	}
}
