package Ejercicios_tema8;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio_3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce el nombre de un directorio");
	String path = sc.nextLine();
	File directorio = new File(path);
	if (directorio.exists()) {
		String[] listd = directorio.list();
		for (int i = 0; i < listd.length; i++) {
			System.out.println(listd[i]);
		}
	} else {
		directorio.mkdir();
		System.out.println("Directorio " + directorio.getName() + " creado con éxito");
		File archivo1 = new File(path,"FICHERO1.TXT");
		File archivo2 = new File(path,"FICHERO2.TXT");
		try {
			archivo1.createNewFile();
			archivo2.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Archivos creados con éxito");
		String[] listd = directorio.list();
		for (int i = 0; i < listd.length; i++) {
			System.out.println(listd[i]);
		}
		System.out.println("\n Cambiando nombre a FICHERO1.TXT a FICHERO3.TXT");
		File archivo3 = new File(path,"FICHERO3.TXT");
		try {
			archivo3.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		archivo1.renameTo(archivo3);
		listd = directorio.list();
		for (int i = 0; i < listd.length; i++) {
			System.out.println(listd[i]);
		}
	}
}
}
