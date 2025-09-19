package Ejercicios_Tema_6;

public class Vehiculo {
	double peso;
	String matricula;
	Vehiculo(double p, String m) {
		peso = p;
		matricula = m;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	@Override
	public String toString() {
		return "Matrícula " + matricula + ", peso " + peso + " kg";
	}
	
}
