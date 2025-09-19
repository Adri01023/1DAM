package EjerciciosTema2;

public class ejemplo_personas {
	public static void main(String[] args) {
		Persona chico = new Persona();
		Persona chica = new Persona();
		chico.nombre = "Manolo";
		chico.edad = 19;
		chica.nombre = "Gabriela";
		chica.edad = 21;
		chica.altura = 1.72;
		System.out.println(chico.nombre + " tiene " + chico.edad + " y mide " + chico.altura +
				"\n" + chica.nombre + " tiene " + chica.edad + " y mide " + chica.altura);
	}
}
