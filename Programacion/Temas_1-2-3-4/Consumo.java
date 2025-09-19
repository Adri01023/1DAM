package EjerciciosTema2;

public class Consumo {
	double kms;
	double litros;
	double vmed;
	double pgas;
	
	public Consumo(double kms, double litros, double vmed, double pgas) {
		this.kms = kms;
		this.litros = litros;
		this.vmed = vmed;
		this.pgas = pgas;
	}
	public double getTiempo() {
		double tiempo = 60 * (kms / vmed);
		return tiempo;
	}
	public double consumoMedio() {
		double consu = (litros / kms) * 100;
		return consu;
	}
	public double consumo€() {
		double g4 = litros * pgas;
		double consu = (g4 / kms) * 100;
		return consu;
	
}
}
