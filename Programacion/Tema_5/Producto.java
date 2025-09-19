package Ejercicios_Tema5;

public class Producto {
	String nombrep;
	int cantidad;
	float precio;
	static float total;
	public Producto(String n, int c, float p) {
		this.nombrep = n;
		this.cantidad = c;
		this.precio = p;
		total += (p*c);
	}
@Override
	public String toString() {
	return nombrep + "      " + cantidad + "        " + precio + "       " + cantidad*precio + "\n\n";
}
}
