package EjerciciosTema2;

public class prueba_klk {
	public static void main(String[] args) {
		Temperaturaklk Temp = new Temperaturaklk();

		System.out.printf("45 grados Fahrenheit son %.0f grados Celsius", Temp.celsiustoFahrenheit(45));
		System.out.printf("\nA %.0f Fahrenheit",  Temp.celsiustoFahrenheit(40.555));

	}
}