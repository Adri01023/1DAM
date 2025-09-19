package EjerciciosTema2;

public class Empleados {
	String nombre;
	long telefono;
	static int contador;
	public Empleados(String nombre, long telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
		contador++;
	}
	public void copia(Empleados h1) {
		this.nombre = h1.nombre;
		this.telefono = h1.telefono;
	}
@Override
	public String toString() {
		return "El nombre del empleado es: " + this.nombre + " y su número de telefono es: " + this.telefono;
	}
@Override
	public boolean equals(Object h1) {
	if (this == h1) return true;
	if (h1 instanceof Empleados) {
		Empleados x = (Empleados) h1;
		if (x.nombre == nombre && x.telefono == telefono) {
			return true;
	}
		return false;
}
	return false;
}
	private static int numEmpleados() {
		return contador;
	}
	public int getEmpleados() {
		return numEmpleados();
	}
}

