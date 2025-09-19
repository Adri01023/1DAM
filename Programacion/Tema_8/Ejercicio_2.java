package Ejercicios_tema8;

import java.io.File;
import java.util.Scanner;

public class Ejercicio_2 {
public static void main(String[] args) {
	System.out.println("Indica el nombre de un directorio o archivo");
	Scanner sc = new Scanner(System.in);
	String path = sc.nextLine();
	File archivo = new File(path);
	if (archivo.exists()) {
		System.out.println(archivo.getPath());
		System.out.println(archivo.getAbsolutePath());
		System.out.println(archivo.length());
		System.out.println(archivo.canRead());
		System.out.println(archivo.canWrite());
		if (archivo.isFile()) {
			System.out.println("Es un archivo");
		} else {
			System.out.println("Es un directorio");
		}
	} else {
		System.out.println("La ruta introducida no existe");
	}
	sc.close();
}
}
