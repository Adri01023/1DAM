package Ejercicios_Tema_7;

import java.util.Scanner;

public class Prueba_Ejercicio7 {
public static void main(String[] args) throws Excepcion_Ejercicio7 {
	System.out.println("Introduzca texto, sin ningún número");
	Scanner sc = new Scanner(System.in);
	String n = sc.next();
	try {
		if (n.matches(".*\\d.*")) {
			sc.close();
            throw new Excepcion_Ejercicio7(n);
        } else {
        	System.out.println("Cadena válida");
        }
	} catch (Excepcion_Ejercicio7 ex) {
		System.out.println("Error: Se tiene que introducir solo texto, sin números");
	}
	sc.close();
}
}
