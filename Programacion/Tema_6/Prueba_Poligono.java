package Ejercicios_Tema_6;

import java.util.Scanner;

public class Prueba_Poligono {
	public static void main(String[] args) {
	double altura, base, lado1, lado2;
	Poligono[] poligonos = new Poligono[10];
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce el nombre del polígono (sin tildes)");
	String palabra = sc.next();
	switch (palabra.toUpperCase()) {
	case "TRIANGULO": {
		System.out.println("Introduce el valor de la altura");
		altura = sc.nextDouble();
		System.out.println("Introduce el valor de la base");
		base = sc.nextDouble();
		System.out.println("Introduce el valor del segundo lado");
		lado1 = sc.nextDouble();
		System.out.println("Introduce el valor del tercer lado");
		lado2 = sc.nextDouble();
		Triangulo triangulo = new Triangulo(altura, base, lado1, lado2);
		poligonos[0] = triangulo;
		System.out.println("El area del triángulo es " + triangulo.area());
		System.out.println("El perímetro del triángulo es " + triangulo.perimetro());
		break;
	}
	case "CUADRADO": {
		System.out.println("Introduce el valor del lado");
		lado1 = sc.nextDouble();
		Cuadrado cuadrado = new Cuadrado(lado1, 0);
		System.out.println("El area del cuadrado es " + cuadrado.area());
		System.out.println("El perímetro del cuadrado es " + cuadrado.perimetro());
		break;
	}
	case "RECTANGULO": {
		System.out.println("Introduce el valor de la altura");
		altura = sc.nextDouble();
		System.out.println("Introduce el valor de la base");
		base = sc.nextDouble();
		Rectangulo rectangulo = new Rectangulo(altura, base);
		System.out.println("El area del rectángulo es " + rectangulo.area());
		System.out.println("El perímetro del rectángulo es " + rectangulo.perimetro());
		break;
	}
	default: {
		System.out.println("Introduce un valor correcto");
		break;
	}
	}
	}
}
