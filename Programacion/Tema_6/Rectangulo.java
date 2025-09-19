package Ejercicios_Tema_6;

public class Rectangulo extends Poligono {

	Rectangulo(double a, double b) {
		super(a, b);
	}

	@Override
	double perimetro() {
		return (altura * 2) + (base * 2);
	}

	@Override
	double area() {
		return altura * base;
	}

}
