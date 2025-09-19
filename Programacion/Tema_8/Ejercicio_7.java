package Ejercicios_Tema8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_7 {
public static void main(String[] args) {
	int opc = 0;
	String path = null;
	String linea;
	Scanner sc = new Scanner(System.in);
	do {
		System.out.println("Menú ficheros\n 1. Crear Fichero y editarlo \n 2. Mostrar el contenido del fichero \n 3. Salir");
		try {
			opc = sc.nextInt();
		} catch(InputMismatchException x) {
			System.out.println("Introduce una opción válida");
			sc.nextLine();
			opc = 0;
		}
		switch (opc) {
		case 0:
			break;
		case 1:
			System.out.println("\nIntroduce el nombre del fichero");
			path = sc.next();
			try {
				FileWriter esc = new FileWriter(path);
				BufferedWriter escb = new BufferedWriter(esc);
					sc.nextLine();
					for (int i = 1; i < 4; i++) {
						linea = sc.nextLine();
						escb.write("Linea Nº " + i + " " + linea);
						escb.newLine();
					}
				escb.close();
			} catch (IOException e) {
				System.out.println("No se ha podido insertar los datos");
			}
			break;
		case 2:
			try {
				FileReader lee = new FileReader(path);
				BufferedReader leeb = new BufferedReader(lee);
				while ((linea = leeb.readLine()) != null) {
					System.out.println(linea);
				}
			} catch (FileNotFoundException e) {
				System.out.println("No se ha encontrado el fichero");
			} catch (IOException x) {
				System.out.println("Nabo");
			}
			break;
		case 3:
			break;
		default:
			System.out.println("Elige un número del menú (1 al 3)");
			break;
		}
	} while (opc != 3);
	sc.close();
}
}
