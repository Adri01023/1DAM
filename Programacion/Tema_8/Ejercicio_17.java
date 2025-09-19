package Ejercicios_tema8;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_17 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double numero = Math.random() * 200;
	ArrayList<Double> array = new ArrayList<>();
	int conta = 0;
	double aux = 0;
	String path;
	System.out.println("Introduce el nombre de un fichero binario");
	path = sc.nextLine();
	File ficherob = new File(path);
	File ficherot = new File("fichero.txt");
	FileInputStream fis = null;
	FileOutputStream fos = null;
	try {
		if (!ficherob.exists()) ficherob.createNewFile();
		fis = new FileInputStream(ficherob);
		fos = new FileOutputStream(ficherob, false);
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataInputStream dis = new DataInputStream(bis);
		DataOutputStream dos = new DataOutputStream(bos);
		for (int i = 0; i < 49; i++ ) {
			aux += numero;
			dos.writeDouble(numero);
			numero = Math.random() * 200;
			conta++;
		}
		dos.writeDouble(aux);
		dos.close();
		for (int i= 0; i < 49; i++) {
			aux = dis.readDouble();
			array.add(aux);
			System.out.println(aux);
		}
		dis.close();
		FileWriter fw = new FileWriter(ficherot);
		FileReader fr = new FileReader(ficherot);
		BufferedWriter bw = new BufferedWriter(fw);
		BufferedReader br = new BufferedReader(fr);
		bw.write(array.toString());
		bw.close();
		path = br.readLine();
		System.out.println(path);
		br.close();
		System.out.println(conta);
		sc.close();
	} catch (IOException x) {
		x.getStackTrace();
	}
}
}
