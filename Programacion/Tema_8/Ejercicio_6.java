package Ejercicios_Tema8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio_6 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String path;
	System.out.println("Introduce el nombre del fichero a editar");
	path = sc.next();
	String linea;
	try {
		FileWriter esc = new FileWriter(path);
		do {
			linea = sc.next();
			esc.write(linea);
		} while (!linea.equals("fin"));
		esc.close();
		FileReader lee = new FileReader(path);
		BufferedReader leebu = new BufferedReader(lee);
		while ((linea = leebu.readLine()) != null) {
			System.out.println(linea);
		}
		leebu.close();
	} catch (IOException e) {
		System.out.println("No se ha podido insertar los datos");
	}
	sc.close();
}
}
