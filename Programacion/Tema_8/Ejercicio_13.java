package Ejercicios_Tema8;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio_13 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int numero = 0;
	File f1 = new File("datos.dat");
	try {
		if (!f1.exists()) {
			System.out.println("El fichero no existe, creando nuevo fichero");
			f1.createNewFile();
		}
		FileWriter fw1 = new FileWriter(f1);
		BufferedWriter bw1 = new BufferedWriter(fw1);
		while (numero != -1) {
			System.out.println("Introduce el valor del número");
			numero = sc.nextInt();
			if (numero == -1) {
				System.out.println("Saliendo...");
			} else {
				bw1.write(numero + "\n");
			}
		}
		bw1.close();
		sc.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}
