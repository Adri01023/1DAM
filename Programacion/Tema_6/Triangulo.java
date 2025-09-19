package Ejercicios_Tema_6;

public class Triangulo extends Poligono {

	Triangulo(double a, double b, double l1, double l2) {
		super(a, b);
		lado1 = l1;
		lado2 = l2;
	}
	
	double perimetro() {
		return base + lado1 + lado2;
	}

	double area() {
		return (base * altura) / 2;
	}

}
