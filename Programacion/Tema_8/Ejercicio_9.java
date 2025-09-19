package Ejercicios_tema8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio_9 {
public static void main(String[] args) {
	String path;
	String texto;
	Scanner sc = new Scanner(System.in);
	System.out.println("Escribe el nombre del fichero");
	path = sc.nextLine();
	System.out.println("Escribe el texto que quieres escribir");
	texto = sc.nextLine();
	escribirFichero(path, texto);
	leerFichero(path);
	sc.close();
}
	static void escribirFichero(String p, String t) {
		File f = new File(p);
		try {
			if (!f.exists()) {
				f.createNewFile();
			}
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(convertir(t));
			bw.close();
		} catch (IOException w) {
			System.out.println("Error");
		}
	}
	static String convertir(String t) {
		StringBuilder sb = new StringBuilder(t);
		Character[] c = new Character[sb.length()];
		for (int i = 0; i < sb.length(); i++) {
			c[i] = sb.charAt(i);
		}
		for (int i = 0; i < c.length; i++) {
			if (Character.isUpperCase(c[i])) {
				c[i] = Character.toLowerCase(c[i]);
			} else {
				c[i] = Character.toUpperCase(c[i]);
			}
		}
		sb.delete(0, sb.length());
		for (int i = 0; i < c.length; i++) {
			sb.append(c[i]);
		}
		return sb.toString();
	}
	
	static void leerFichero(String p) {
		File f = new File(p);
		String linea;
		if (!f.exists()) {
			System.out.println("El fichero no existe");
		} else {
			try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			while((linea = br.readLine()) != null) {
				System.out.println(linea);
			}
			br.close();
			} catch (IOException x) {
				System.out.println("No se ha podido realizar la operación");
			}
		}
	}
}
