package Ejercicios_tema8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio_11 {
	static String path3;
public static void main(String[] args) {
	String path1;
	String path2;
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce el nombre del primer fichero");
	path1 = sc.nextLine();
	System.out.println("Introduce el nombre del segundo fichero");
	path2 = sc.nextLine();
	File f1 = new File(path1);
	File f2 = new File(path2);
	String[] lista = path1.split("\\.");
	String[] lista2 = path2.split("\\.");
	path3 = lista[0] + "_" + lista2[0] + ".txt";
	System.out.println(path3);
	juntar(f1,f2);
	sc.close();
}
static void juntar(File f1, File f2) {
	try {
		File dest = new File(path3);
		if (dest.exists()) {
			dest.delete();
			dest.createNewFile();
		} else {
			dest.createNewFile();
		}
		if (!f1.exists()) f1.createNewFile();
		if (!f2.exists()) f2.createNewFile();
		String linea;
		FileWriter frdest = new FileWriter(dest, true);
		BufferedWriter bwdest = new BufferedWriter(frdest);
		FileReader fr1 = new FileReader(f1);
		BufferedReader br1 = new BufferedReader(fr1);
		FileReader fr2 = new FileReader(f2);
		BufferedReader br2 = new BufferedReader(fr2);
		while ((linea = br1.readLine()) != null) {
			bwdest.write(linea + "\n");
		}
		fr1.close();
		br1.close();
		linea = "";
		while ((linea = br2.readLine()) != null) {
			bwdest.write(linea + "\n");
		}
		fr2.close();
		br2.close();
		bwdest.close();
	} catch (FileNotFoundException e) {
		System.out.println("Fihcero no encontrado");
	} catch (IOException x) {
		System.out.println("Error en la escritura o lectura");
		x.printStackTrace();
	}
	
}
}
