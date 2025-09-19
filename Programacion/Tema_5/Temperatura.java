package ejercicios;

public class Temperatura {
	int dia_m;
	String dia_s;
	float temp;
	public Temperatura(int dia_m, String dia_s, float temp) {
		this.dia_m = dia_m;
		this.dia_s = dia_s;
		this.temp = temp;
	}
@Override
	public String toString() {
	return dia_s + " " + dia_m + " " + temp + "ºC";
 }
}
