package Ejercicios_tema8;

public class Utensilio {
	private String nombre;
	private int unidades;
	Utensilio(String n, int u) {
		nombre = n;
		unidades = u;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
}
