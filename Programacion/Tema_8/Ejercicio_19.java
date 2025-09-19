package Ejercicios_Tema8;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ejercicio_19 {
public static void main(String[] args) {
	File fichero = new File("cadenalfinal");
	añadeCadena("HOLA", fichero);
	leerFichero(fichero);
}
static void añadeCadena(String cadena, File f1) {
	RandomAccessFile fr;
	try {
		fr = new RandomAccessFile(f1, "rw");
		long pos = fr.length();
		fr.seek(pos);
		fr.writeUTF(cadena);
		fr.close();
	} catch (IOException e) {
		e.getStackTrace();
	}
}
static void leerFichero(File f1) {
	RandomAccessFile fr;
	try {
		long pos = 0;
		fr = new RandomAccessFile(f1, "r");
		while (pos <= fr.length()) {
			System.out.println(fr.readUTF());
		}
		fr.close();
	} catch (IOException e) {
		e.getStackTrace();
	}
}
}
