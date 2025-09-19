package EjerciciosTema2;

public class Vehiculo_POO {
	private int numRuedas;
	private double velMax, peso;
	public Vehiculo_POO(int numRuedas, double velMax, double peso) {
		this.numRuedas = numRuedas;
		this.peso = peso;
		this.velMax = velMax;
	}
	public int getNumRuedas() {
		return numRuedas;
	}
	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}
	public double getVelMax() {
		return velMax;
	}
	public void setVelMax(double velMax) {
		this.velMax = velMax;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
@Override
	public boolean equals(Object h1) {
		if (this == h1) return true;
		if (h1 instanceof Vehiculo_POO) {
			Vehiculo_POO x = (Vehiculo_POO)h1;
			if (x.numRuedas == numRuedas && x.peso == peso && x.velMax == velMax) {
				return true;
		}
			return false;
	}
		return false;
}
	public void copia(Vehiculo_POO h1) {
		this.numRuedas= h1.numRuedas;
		this.peso=h1.peso;
		this.velMax=h1.velMax;
	}
}
