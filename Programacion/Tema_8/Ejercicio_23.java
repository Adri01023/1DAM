package Ejercicios_Tema8;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Ejercicio_23 {
public static void main(String[] args) {
	File fichero = new File("texto.txt");
	mostrarFichero();
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce la palabra que quieres hacer mayúscula");
	String palabra = sc.nextLine();
	cambioMayuscula(fichero, palabra);
	mostrarFichero();
	sc.close();
}
static void cambioMayuscula(File f1, String palabra) {
        try {
            RandomAccessFile fr = new RandomAccessFile(f1, "rw");
            long pos = 0;
            String linea;
            while ((linea = fr.readLine()) != null) {
                StringBuilder lineaux = new StringBuilder();
                for (String palabras : linea.split(" ")) {
                    if (palabras.equals(palabra)) {
                    	lineaux.append(palabras.toUpperCase()).append(" ");
                    } else {
                    	lineaux.append(palabras).append(" ");
                    }
                }
                fr.seek(pos);
                fr.writeBytes(lineaux.toString().trim() + "\n");
                pos = fr.getFilePointer();
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
}
static void mostrarFichero() {
	long pos = 0;
	File f1 = new File("texto.txt");
	try {
		RandomAccessFile fr = new RandomAccessFile(f1, "r");
		while (pos <= fr.length()) {
			String frase = fr.readLine();
			pos = fr.getFilePointer();
			if (frase == null) pos = 1111111011;
			else System.out.println(frase);
		}
		fr.close();
	} catch (IOException e) {
		e.getStackTrace();
	}
}
}
