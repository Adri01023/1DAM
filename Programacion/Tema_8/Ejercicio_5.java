package Ejercicios_Tema8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio_5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String path;
	String linea;
	System.out.println("Introduce el nombre del fichero a leer");
	path = sc.next();
	try {
		FileReader lee = new FileReader(path);
		BufferedReader leebu = new BufferedReader(lee);
		while ((linea = leebu.readLine()) != null) {
			System.out.println(linea);
		}
		leebu.close();
	} catch (FileNotFoundException e) {
		System.out.println("No se ha encontrado ningún fichero con el nombre escrito");
	} catch (IOException x) {
		System.out.println("Errorklk");
	}
	sc.close();
}
}
