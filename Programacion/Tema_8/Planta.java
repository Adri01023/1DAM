package Hospital;

import java.io.Serializable;
import java.util.ArrayList;

public class Planta implements Serializable {
	private static final long serialVersionUID = 1L;
	int numero;
	ArrayList<Paciente> pacientes;
	public Planta(int n) {
		numero = n;
		pacientes = new ArrayList<Paciente>();
	}
	public void elimina(Paciente p) {
		if (pacientes.contains(p)) {
			pacientes.remove(p);
			System.out.println("Paciente eliminado con éxito");
		} else {
			System.out.println("No se ha encontrado el paciente");
		}
	}
	public void putPaciente(Paciente p) {
		if (pacientes.contains(p)) {
			System.out.println("El paciente ya está en la lista");
		} else {
			pacientes.add(p);
		}
	}
	public Paciente get(int n) {
		return pacientes.get(n);
	}
	public void printPacientes() {
		for (Paciente pac : pacientes) {
			System.out.println(pac.toString());
		}
	}
	public ArrayList<Paciente> pacientesDoctor(Medico m) {
		ArrayList<Paciente> pacientes_doctor = new ArrayList<Paciente>();
		for (Paciente pac : pacientes) {
			if (pac.doctor.equals(m)) {
				pacientes_doctor.add(pac);
			}
		}
		return pacientes_doctor;
	}
}
