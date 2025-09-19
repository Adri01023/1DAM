package Hospital;

public class Paciente extends Persona {
	private static final long serialVersionUID = 1L;
	Medico doctor;
	Paciente(String n, long nss, Medico d) {
		super(n, nss);
		doctor = d;
	}

	@Override
	public String toString() {
		return Nombre + " NrSegSoc: " + NrSeguridadSocial + " Le atiende: " + doctor;
	}
	
	public boolean equals(Paciente p) {
		if (this.Nombre.equals(p.Nombre) && this.doctor.equals(p.doctor) && this.NrSeguridadSocial == p.NrSeguridadSocial) {
			return true;
		} else {
			return false;
		}
	}
}
