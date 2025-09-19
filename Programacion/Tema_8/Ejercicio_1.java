package Ejercicios_tema8;

import java.io.File;
import java.util.Scanner;

public class Ejercicio_1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Indica la ruta del directorio a ver");
	String path = sc.nextLine();
	try {
	File archivo = new File(path);
	String[] listd = archivo.list();
	for (int i = 0; i < listd.length; i++) {
		System.out.println(listd[i]);
	}
	} catch (NullPointerException x) {
		System.out.println("Introduce una ruta válida");
	}
	sc.close();
}
}
