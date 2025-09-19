package Ejercicios_tema8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio_12 {
public static void main(String[] args) {
	System.out.println("Dime el nombre del archivo");
	Scanner sc = new Scanner(System.in);
	String palabra;
	String path = sc.nextLine();
	File f1 = new File(path);
	if (!f1.exists()) System.out.println("El fichero introducido no existe");
	else {
		System.out.println("Probando método contar líneas");
		System.out.println("En el archivo hay: " + contarLineas(f1) + " líneas");
		System.out.println("Probando método contar caracteres");
		System.out.println("En el archivo hay: " + contarCaracteres(f1) + " caracteres");
		System.out.println("Probando método contar palabras");
		System.out.println("En el archivo hay: " + contarPalabras(f1) + " palabras");
		System.out.println("Probando método cadena max");
		System.out.println("La palabra más larga que se ha encontrado en el archivo es: " + cadenaMax(f1));
		System.out.println("Probando método cuenta palabra");
		System.out.println("Introduce la palabra que quieras contar");
		palabra = sc.nextLine();
		System.out.println("La palabra " + palabra + " se ha encontrado " + cuentaPalabra(f1,palabra));
	}
	sc.close();
}
static int contarLineas(File f1) {
	int contador = 0;
	try {
		FileReader fr1 = new FileReader(f1);
		BufferedReader br1 = new BufferedReader(fr1);
		while(br1.readLine() != null) {
			contador++;
		}
		br1.close();
		return contador;
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException x) {
		System.out.println("Error en la lectura");
	}
	return contador;
	
}
static int contarCaracteres(File f1) {
	String linea;
	String temporal = null;
	int contador = 0;
	try {
		FileReader fr1 = new FileReader(f1);
		BufferedReader br1 = new BufferedReader(fr1);
		while((linea = br1.readLine()) != null) {
			temporal += linea;
		}
		br1.close();
		char[] c = temporal.toCharArray();
		for (int i = 0; i < c.length; i++) {
			contador++;
		}
		return contador;
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException x) {
		System.out.println("Error en la lectura");
	}
	return contador;
}
static int contarPalabras(File f1) {
	String linea;
	String temporal = null;
	int contador = 0;
	try {
		FileReader fr1 = new FileReader(f1);
		BufferedReader br1 = new BufferedReader(fr1);
		while((linea = br1.readLine()) != null) {
			temporal += linea;
		}
		br1.close();
		StringTokenizer st = new StringTokenizer(temporal);
		while (st.hasMoreTokens()) {
			contador++;
			st.nextToken();
		}
		return contador;
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException x) {
		System.out.println("Error en la lectura");
	}
	return contador;
}
static String cadenaMax(File f1) {
	String linea;
	String temporal = null;
	int contador = 0;
	String mayor = null;
	try {
		FileReader fr1 = new FileReader(f1);
		BufferedReader br1 = new BufferedReader(fr1);
		temporal = "";
		while((linea = br1.readLine()) != null) {
			temporal += linea;
			System.out.println(temporal);
		}
		br1.close();
		StringTokenizer st = new StringTokenizer(temporal);
		while (st.hasMoreTokens()) {
			linea =st.nextToken(); 
			if (linea.length() > contador) {
				contador = linea.length();
				mayor = linea;
			}
		}
		return mayor;
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException x) {
		System.out.println("Error en la lectura");
	}
	return mayor;
}
static int cuentaPalabra(File f1, String texto) {
	String linea;
	String temporal = null;
	int contador = 0;
	try {
		FileReader fr1 = new FileReader(f1);
		BufferedReader br1 = new BufferedReader(fr1);
		while((linea = br1.readLine()) != null) {
			temporal += linea;
		}
		br1.close();
		StringTokenizer st = new StringTokenizer(temporal);
		while (st.hasMoreTokens()) {
			linea = st.nextToken();
			if (linea.equals(texto)) {
				contador++;
			}
		}
		return contador;
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException x) {
		System.out.println("Error en la lectura");
	}
	return contador;
}
}
