package Hospital;

public class Medico extends Persona {
	private static final long serialVersionUID = 1L;
	Turno turno;
	Departamento departamento;
	Medico(String n, long nss, Turno t, Departamento d) {
		super(n, nss);
		turno = t;
		departamento = d;
	}
	@Override
	public String toString() {
		return Nombre;
	}
	public boolean equals(Medico m) {
		if (this.Nombre.equals(m.Nombre) && this.turno.equals(m.turno) && this.departamento.equals(m.departamento) && this.NrSeguridadSocial == m.NrSeguridadSocial) {
			return true;
		} else {
			return false;
		}
	}

}
