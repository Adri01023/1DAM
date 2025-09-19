package Ejercicios_Tema_6;

public class Servicio extends Empleados {
	String seccion;
	Servicio(String n, String a, String d, EstadoCivil e, int ai, int nd, String secc) {
		super(n, a, d, e, ai, nd);
		seccion = secc;
	}
	void TrasladoSecc(String sc) {
		seccion = sc;
	}
	void cambiarSecc(String d, String nc) {
		if (dni.equals(d)) {
			seccion = nc;
			System.out.println("Sección cambiada con éxito");
		} else System.out.println("No se ha encontrado el DNI introducido");
	}
	@Override
	public String toString() {
		return "Personal de Servicio: " + nombre + " " + apellidos + " Sección: " + seccion + " Número despacho: " + num_d;
	}
}
