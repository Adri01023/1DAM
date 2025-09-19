package Ejercicios_tema8;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_30 {
public static void main(String[] args) {
	ArrayList<Utensilio> utensilios = new ArrayList<Utensilio>();
	Utensilio uten1 = new Utensilio("martillo", 4);
	Utensilio uten2 = new Utensilio("destornillador", 5);
	Utensilio uten3 = new Utensilio("sierra", 8);
	Utensilio uten4 = new Utensilio("palanca", 4);
	utensilios.add(uten1);
	utensilios.add(uten2);
	utensilios.add(uten3);
	utensilios.add(uten4);
	añadirUtensilios(utensilios);
	mostrarFichero();
	System.out.println("Que linea quieres buscar");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	buscarLinea(num);
	sc.close();
	copiarOtroFichero();
}
static void buscarLinea(int num) {
	long pos = 0;
	File fichero = new File("utensilios");
	try {
		if (!fichero.exists()) fichero.createNewFile();
		RandomAccessFile fr = new RandomAccessFile(fichero, "r");
		pos = 34 * (num - 1);
		char aux;
		char nombre[] = new char[15];
		fr.seek(pos);
		num = fr.readInt();
    	for (int i = 0; i < nombre.length; i++) {
    		aux = fr.readChar();
			nombre[i] = aux;
		}
    	String cadena = new String(nombre);
    	cadena = cadena.trim();
    	System.out.println(cadena + " --> " + num);
		fr.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
static void añadirUtensilios(ArrayList<Utensilio> uten) {
	File fichero = new File("utensilios");
	try {
		if (!fichero.exists()) fichero.createNewFile();
		RandomAccessFile raf = new RandomAccessFile(fichero, "rw");
		for (int i = 0; i < uten.size(); i++) {
			StringBuilder sb = new StringBuilder(uten.get(i).getNombre());
			sb.setLength(15);
			raf.writeInt(uten.get(i).getUnidades());
			raf.writeChars(sb.toString());
		}
		raf.close();
	} catch (IOException e) {
	e.printStackTrace();
}
}
static void mostrarFichero() {
	File f1 = new File("utensilios");
	// Si queremos ver utensilios txt: File f1 = new File("utensilios.txt");
    try {
        RandomAccessFile fr = new RandomAccessFile(f1, "r");
        long pos = 0;
        int num;
        char[] nombre = new char[15];
        char aux;
        while (fr.getFilePointer() < fr.length()) {
        	fr.seek(pos);
        	num = fr.readInt();
        	for (int i = 0; i < nombre.length; i++) {
        		aux = fr.readChar();
				nombre[i] = aux;
			}
        	String cadena = new String(nombre);
        	cadena = cadena.trim();
        	System.out.println(cadena + " --> " + num);
        	pos += 34;
        }
        fr.close();
        } catch (IOException e) {
        	e.printStackTrace();
        }
}
static void copiarOtroFichero() {
	File fichero1 = new File("utensilios");
	File fichero2 = new File("utensilios.txt");
	int num = 0;
	char aux;
	char[] nombre = new char[15];
	long pos = 0;
	try {
	if (!fichero2.exists()) fichero2.createNewFile();
	RandomAccessFile fr1 = new RandomAccessFile(fichero1, "r");
	RandomAccessFile fr2 = new RandomAccessFile(fichero2, "rw");
	while (fr1.getFilePointer() < fr1.length()) {
		fr1.seek(pos);
    	num = fr1.readInt();
    	fr2.writeInt(num);
    	for (int i = 0; i < nombre.length; i++) {
    		aux = fr1.readChar();
			fr2.writeChar(aux);
		}
    	pos += 34;
	}
	fr1.close();
	fr2.close();
	System.out.println("utensilios copiada a utensilios.txt con éxito");
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}