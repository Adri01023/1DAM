package Ejercicios_Tema8;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Ejercicio_21 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Lista antes: ");
	mostrarFichero();
	int pos = 0;
	System.out.println("\nIntroduce una posición a modificar");
	pos = sc.nextInt();
	System.out.println("\nIntroduce el valor del nuevo entero");
	int numero = sc.nextInt();
	actualizarPosicion(pos, numero);
	System.out.println("\nLista después: ");
	mostrarFichero();
	sc.close();
}
static void actualizarPosicion(int x, int y) {
	File fichero = new File("enteros.dat");
	int pos = 0;
	try {
		RandomAccessFile fr = new RandomAccessFile(fichero, "rw");
		pos += (x-1) * 4;
		if (pos > fr.length()) System.out.println("La posición seleccionada excede el número de registros");
		else {
			fr.seek(pos);
			System.out.println("Número antes de modificarse: " + fr.readInt());
			fr.seek(pos);
			fr.writeInt(y);
			fr.seek(pos);
			System.out.println("Número después de modificarse: " + fr.readInt());
			fr.seek(pos);
		}
		fr.close();
	} catch (IOException e) {
		e.getStackTrace();
	}
}
static void mostrarFichero() {
	long pos = 0;
	File f1 = new File("enteros.dat");
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
