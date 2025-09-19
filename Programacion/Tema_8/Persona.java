package Hospital;

import java.io.Serializable;

public abstract class Persona implements Serializable {
	private static final long serialVersionUID = 1L;
	String Nombre;
	long NrSeguridadSocial;
	Persona(String n, long nss) {
		Nombre = n;
		NrSeguridadSocial = nss;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public long getNrSeguridadSocial() {
		return NrSeguridadSocial;
	}
	public void setNrSeguridadSocial(long nrSeguridadSocial) {
		NrSeguridadSocial = nrSeguridadSocial;
	}
	public abstract String toString();
}
