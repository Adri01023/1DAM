package Ejercicios_Tema8;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Ejercicio_20 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int numero = 0;
	File fichero = new File("enteros.dat");
	try {
		if (!fichero.exists()) fichero.createNewFile();
	} catch (IOException e) {
		e.getStackTrace();
	}
	while (numero != -1) {
		System.out.println("Fichero antes: ");
		mostrarFichero(fichero);
		System.out.println("Introduce un número entero");
		numero = sc.nextInt();
		escribirEntero(numero, fichero);
		System.out.println("Fichero despues: ");
		mostrarFichero(fichero);
	}
	sc.close();
}
static void escribirEntero(int x, File f1) {
	long pos = 0;
	try {
		RandomAccessFile fr = new RandomAccessFile(f1, "rw");
		pos = fr.length();
		fr.seek(pos);
		fr.writeInt(x);
		fr.close();
	} catch (IOException e) {
		e.getStackTrace();
	}
}
static void mostrarFichero(File f1) {
	long pos = 0;
	try {
		RandomAccessFile fr = new RandomAccessFile(f1, "r");
		while (pos <= fr.length()) {
			fr.seek(pos);
			System.out.println(fr.readInt());
			pos += 4;
		}
		fr.close();
	} catch (IOException e) {
		e.getStackTrace();
	}
}
}
