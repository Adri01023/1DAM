package Ejercicios_Tema8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio_14 {
public static void main(String[] args) {
	File fichero = new File("numeros.txt");
	FileWriter fw;
	boolean repe = false;
	int contanorepe = 0;
	int contatotal = 0;
	try {
		fw = new FileWriter(fichero);
		BufferedWriter bw = new BufferedWriter(fw);
		int n = (int) (Math.random() * 1000);
		while(n < 500 || n > 800) {
			n = (int)(Math.random()*1000);
		}
		int numero;
		int[] listan = new int[n];
		for (int i = 0; i < n; i++) {
			numero = (int)(Math.random() * 1000);
			for (int x : listan) {
				if (x == numero) {
					repe = true;
					//System.out.println(x + " " + repe);
				}
			}
			listan[i] = numero;
			if (!repe) {
				bw.write(numero + "\n");
				contanorepe++;
			}
			contatotal++;
			repe = false;
		}
		bw.close();
		FileReader fr = new FileReader(fichero);
		BufferedReader br = new BufferedReader(fr);
		String linea;
		while ((linea = br.readLine()) != null) {
			System.out.println(linea);
		}
		br.close();
		System.out.println("\nSe han generado: " + contatotal + " números en total de los cuales se han introducido en el fichero: " + contanorepe);
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}
