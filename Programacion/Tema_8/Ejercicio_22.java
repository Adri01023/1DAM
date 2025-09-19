package Ejercicios_Tema8;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Ejercicio_22 {
public static void main(String[] args) {
	int opcion = 0;
	File fichero = new File("doubles.dat");
	double numero = 0;
	double numeroaux = 0;
	Scanner sc = new Scanner(System.in);
	while (opcion != 5) {
		System.out.println("Menú Ficheros \n1. Añadir números de tipo double al principio del fichero \n2. Añadir números de tipo double al final del fichero \n3. Mostrar el fichero creado \n4. Sustituir un número indicado por el usuario por otro número que también te indique el usuario \n5. Salir");
		opcion = sc.nextInt();
		switch (opcion) {
		case 1:
			System.out.println("Introduce un número de tipo double");
			numero = sc.nextDouble();
			añadirPrincipio(fichero,numero);
			break;
		case 2:
			System.out.println("Introduce un número de tipo double");
			numero = sc.nextDouble();
			añadirFinal(fichero,numero);
			break;
		case 3:
			mostrarFichero(fichero);
			break;
		case 4:
			System.out.println("Introduce el número que se quiere sustituir");
			numeroaux = sc.nextDouble();
			System.out.println("Introduce el número nuevo");
			numero = sc.nextDouble();
			sustituirNumero(fichero, numero, numeroaux);
			break;
		case 5:
			System.out.println("Adios...");
			break;
		default:
			System.out.println("Introduce una opción válida");
			break;
		}
	}
	sc.close();
}
static void añadirPrincipio(File f1, double n) {
	try {
		RandomAccessFile fr = new RandomAccessFile(f1, "rw");
		fr.writeDouble(n);
		fr.close();
		System.out.println("Número añadido con éxito");
	} catch (IOException e) {
		e.getStackTrace();
	}
}
static void añadirFinal(File f1, double n) {
	try {
		RandomAccessFile fr = new RandomAccessFile(f1, "rw");
		long pos = fr.length();
		fr.seek(pos);
		fr.writeDouble(n);
		fr.close();
		System.out.println("Número añadido con éxito");
	} catch (IOException e) {
		e.getStackTrace();
	}
}
static void mostrarFichero(File f1) {
	try {
		RandomAccessFile fr = new RandomAccessFile(f1, "r");
		while (fr.getFilePointer() <= fr.length()) {
			System.out.println(fr.readDouble());
		}
		fr.close();
	} catch (IOException e) {
		e.getStackTrace();
	}
}
static void sustituirNumero(File f1, double num, double numsus) {
	try {
		RandomAccessFile fr = new RandomAccessFile(f1, "rw");
		long pos = 0;
		while (fr.getFilePointer() <= fr.length()) {
			if (fr.readDouble() == numsus) {
				fr.seek(pos);
				fr.writeDouble(num);
			}
			pos += 8;
		}
		fr.close();
	} catch (IOException e) {
		e.getStackTrace();
	}
}
}
