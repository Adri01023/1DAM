package Ejercicios_tema8;

public class Alumno extends Persona {
	private static final long serialVersionUID = 2536070533976631600L;
	Fecha fecha;
	Alumno(String d, String n, int e, int dia, int mes, int año) {
		super(d, n, e);
		fecha = new Fecha(dia, mes, año);
	}
	public Fecha getFecha() {
		return fecha;
	}
	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}
}