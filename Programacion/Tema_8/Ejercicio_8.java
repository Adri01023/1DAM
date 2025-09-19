package Ejercicios_tema8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio_8 {
	static String path;
public static void main(String[] args) throws IOException {
	int opc = 0;
	Scanner sc = new Scanner(System.in);
	do {
		System.out.println("Menu: \n 1) Ecribir los primeros 100 números pares \n 2) Mostrar contenido del fichero \n 3) Salir");
		opc = sc.nextInt();
		sc.nextLine();
		switch (opc) {
		case 1:
			System.out.println("Escribe el nombre del fichero");
			path = sc.nextLine();
			escribirFichero();
			break;
		case 2:
			leerFichero();
			break;
		case 3:
			System.out.println("Adeu");
		default:
			break;
		}
	} while (opc != 3);
	sc.close();
}
	static void escribirFichero() throws IOException {
		File f = new File(path);
		int contador = 1;
		try {
			if (!f.exists()) {
				f.createNewFile();
			}
			FileWriter fw = new FileWriter(f); // Si se quiere sobreescribir el fichero se pondrá true al lado de la f
			BufferedWriter bw = new BufferedWriter(fw);
			for (int i = 1; i < 1000; i++) {
				if (i % 2 == 0) {
					bw.write(i + ", ");
					contador++;
				}
				if (contador == 100) {
					i = 1001;
				}
			}
			bw.close();
		} catch (IOException e) {
			System.out.println("Error de escritura");
		} 
		}
	static void leerFichero() throws IOException {
		File f = new File(path);
		String linea;
		if (!f.exists()) {
			System.out.println("El fichero no existe");
		} else {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			while((linea = br.readLine()) != null) {
				System.out.println(linea);
			}
			br.close();
		}
	}
}
