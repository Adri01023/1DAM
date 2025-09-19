package EjerciciosTema2;

public class Calculadora {
	String operacion = "x";
	double operando1 = 19;
	double operando2 = 92;
	double resultado;
	public double calcular (String operacion, double operando1, double operando2) {
		if (operacion == "+") {
			resultado =  operando1 + operando2;
		} else if (operacion == "-"){
			resultado = operando1 - operando2;
		} else if (operacion == "/") {
			resultado = operando1 / operando2;
		} else if (operacion == "x"){
			resultado = operando1 * operando2;
		}
		return resultado;
}
}