package Hospital;

import java.io.IOException;

public class RecuperaDatosHospital {
	public static void main(String[] args) {
		Hospital h1 = null;
		SerializaHospital sh = new SerializaHospital("/home/alumno/");
		try {
			h1 = sh.leer("adrian_martin.dat");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException cn) {
			System.out.println("Fallo clase no encontrada");
		}
		System.out.println("Pacientes de la primera planta");
		h1.plantas.get(0).printPacientes();
		System.out.println();
		System.out.println("Pacientes de la segunda Planta");
		h1.plantas.get(1).printPacientes();
		System.out.println();
		System.out.println("Pacientes de un determinado médico");
		System.out.println(h1.plantas.get(0).pacientesDoctor(h1.getPlanta(0).get(0).doctor).toString());
		System.out.println(h1.plantas.get(1).pacientesDoctor(h1.getPlanta(0).get(0).doctor).toString());


		System.out.println();
		System.out.println("Fin");

	}
}
