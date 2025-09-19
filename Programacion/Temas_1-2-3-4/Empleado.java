package EjerciciosTema2;

public class Empleado {
	String nombre;
	long numero;
	static private int numEmpleados;
	public String setnombre(String nombre) {
		numEmpleados ++;
		return this.nombre = nombre;
	}
	public long setnumero(long numero) {
		numEmpleados++;
		return this.numero = numero;
	}
	public String getnombre() {
		return nombre;
	}
	public long getnumero() {
		return numero;
	}
	public int getnumEmpleados() {
		return numEmpleados;
	}
}