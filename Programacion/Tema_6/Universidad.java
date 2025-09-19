package Ejercicios_Tema_6;

import Ejercicios_Tema_6.Persona.EstadoCivil;

public class Universidad {
	public static void main(String[] args) {
		Persona[] uni = new Persona[8];
		Profesor profe1 = new Profesor("Juanjo", "Grande Covián", "03265312S", EstadoCivil.Soltero, 2017, 58, "Política");
		uni[0] = profe1;
	}
}
