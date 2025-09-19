package Ejercicios_Tema_6;

public class Prueba_Vehiculos_Alumnos {
	public static void main(String[] args) {
		Alumnos2[] alumnos = new Alumnos2[5];
		Vehiculo2[] vehiculos = new Vehiculo2[4];
		Alumnos2 alumno1 = new Alumnos2("Javier Maroto", 32);
		Alumnos2 alumno2 = new Alumnos2("Marco Polo", 25);
		Alumnos2 alumno3 = new Alumnos2("Britney Spears", 18);
		Alumnos2 alumno4 = new Alumnos2("Midas Alonso", 19);
		Alumnos2 alumno5 = new Alumnos2("Nicolás Maduro", 48);
		alumnos[0] = alumno1;
		alumnos[1] = alumno2;
		alumnos[2] = alumno3;
		alumnos[3] = alumno4;
		alumnos[4] = alumno5;
		for (int i = 1; i < 5; i++) {
			if (i == 5) break;
			else System.out.println("Es mayor de Javier Maroto con " + alumnos[i].nombre + " " + alumnos[i].edad  + " años "+ alumnos[0].esMayor(alumnos[i].edad));
		}
	}
}
