package Ejercicios_Tema_6;

public class Cuadrado extends Poligono {

	Cuadrado(double a, double b) {
		super(a, b);
	}

	double perimetro() {
		return altura * 4;
	}

	double area() {
		return altura * altura;
	}

}
