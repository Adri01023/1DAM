package Ejercicios_Tema5;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Alumnoexp extends Alumno {
	Map<String, Float> notas = new TreeMap<String, Float>();
	
	public Alumnoexp(String dni, String nombre) {
	        super(dni, nombre); // Llamamos al constructor de la clase base (Alumno)
	    }
	
	public Double media() {
		Double c = 0.0;
		Iterator<String> ite = notas.keySet().iterator();
		while (ite.hasNext()) {
			c += notas.get(ite.next());
		}
		return notaMedia = c/notas.size();
	}
	public void calificar(String n, Float f) {
		media();
		if (notas.containsKey(n)) {
			notas.replace(n, f);
		} else {
			notas.put(n, f);
		}
	}
	@Override
	public String toString() {
		return "Nombre: " + nombre + " Asignaturas: " + notas.keySet() + " Notas: " + notas.values();
	}
}
