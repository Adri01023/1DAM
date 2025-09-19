package Hospital;

import java.io.IOException;

public class PruebaHospital {
public static void main(String[] args) {
	Medico medicos[] = {new Medico("Francisco Leal", 34231432, Turno.Mañana, Departamento.GENERAL),
			new Medico("Manuel Demian", 57123211, Turno.FinSemana, Departamento.TRAUMATOLOGIA),
			new Medico("Roberto Macias", 12132312, Turno.Noche, Departamento.OBSTETRICIA),
			new Medico("Siproco Ral", 13242544, Turno.Tarde, Departamento.PEDIATRIA)};
	Paciente pacientes[] = {new Paciente("Mijail Kpros", 11222124, medicos[2]),
			new Paciente("Amparo Preira", 21324354, medicos[0]),
			new Paciente("Irene García", 24155321, medicos[3]),
			new Paciente("Pedro Lucas", 11213243, medicos[1]),
			new Paciente("Hector Nafero", 32121212, medicos[2]),
			new Paciente("Rosa Bona", 21232232,  medicos[1]),};
	Hospital hospi1 = new Hospital();
	Planta planta1 = new Planta(0);
	Planta planta2 = new Planta(1);
	hospi1.addPlanta(planta1);
	hospi1.addPlanta(planta2);
	for (int i = 0; i < pacientes.length; i++) {
		if (i >= 3) {
			planta2.putPaciente(pacientes[i]);
		} else {
			planta1.putPaciente(pacientes[i]);
		}
	}
	System.out.println("Pacientes de la primera planta");
	planta1.printPacientes();
	System.out.println();
	System.out.println("Pacientes de la segunda Planta");
	planta2.printPacientes();
	System.out.println();
	System.out.println("Pacientes de un determinado médico");
	System.out.println(planta1.pacientesDoctor(hospi1.getPlanta(0).get(0).doctor).toString());
	System.out.println(planta2.pacientesDoctor(hospi1.getPlanta(0).get(0).doctor).toString());
	System.out.println();
	System.out.println("Fin");
	SerializaHospital h = new SerializaHospital("/home/alumno/");
	try {
		h.escribe(hospi1, "adrian_martin.dat");
	} catch (IOException e) {
		System.out.println("Fallo");
	}
}	
}
