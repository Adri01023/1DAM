package EjerciciosTema2;

public class Persona {
	int edad;
	String DNI, nombre;
	float peso, altura;
	String sexo = "H";

	public Persona() {
		
	}
	public Persona(String nombre, int edad, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	
	public Persona(String nombre, int edad, String sexo, String DNI, float peso, float altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.altura = altura;
		this.DNI = DNI;
		this.peso = peso;
	}
	
	public int calcularIMC() {
		float formula = peso / (altura*altura);
		if (formula < 20) return -1;
		if (formula >=20 && formula <= 25) return 0;
		if (formula > 25) return 1;
		return 0;
	}
	public boolean esMayordeEdad() {
		if (edad >= 18) return true;
		return false;
	}
@Override
	public String toString() {
		return "El nombre de la persona es: " + nombre + " su edad es: " + edad + " su sexo es: " + sexo + " mide " + altura + " su DNI es: " + DNI + " y pesa " + peso;
	}
}
