package Ejercicios_Tema_6;

public abstract class Poligono {
	double base, altura, lado1, lado2;
	Poligono(double a, double b) {
		altura = a;
		base = b;
	}
	abstract double perimetro();
	abstract double area();
}
