package Ejercicios_Tema8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio_10 {
public static void main(String[] args) {
	double suma = 0;
	String linea;
	File f = new File("numeros.txt");
	try {
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		while((linea = br.readLine()) != null) {
			suma += Double.parseDouble(linea);
		}
		br.close();
		System.out.println("La suma de los números en el fichero numeros.txt es: " + suma);
	} catch (IOException e) {
		System.out.println("Error en la lectura de datos");
	}
	
}
}
