package Ejercicios_tema8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio_29 {
public static void main(String[] args) {
	String frase = "";
	int contanon = 0;
	StringBuilder sb = new StringBuilder();
	String fraseaux = "";
	Scanner sc = new Scanner(System.in);
	File fichero = new File("ejercicio29.dat");
	FileWriter fos;
	FileReader fis;
	BufferedReader br;
	BufferedWriter bw;
	boolean esnumero = false;
	try {
		if (!fichero.exists()) fichero.createNewFile();
		fos = new FileWriter(fichero);
		fis = new FileReader(fichero);
		br = new BufferedReader(fis);
		bw = new BufferedWriter(fos);
	while (!frase.equals("fin")) {
		System.out.println("Introduce una cadena de caráteres");
		frase = sc.nextLine();
		for (char c : frase.toCharArray()) {
			if (Character.isDigit(c) && !esnumero && sb.length() >= 1) {
				System.out.println(sb.toString());
				bw.write(sb.toString() + "\n");
				sb.delete(0, sb.length());
			}
			if (Character.isDigit(c) && esnumero) {
				sb.append(c);
			}
			if (Character.isDigit(c) && !esnumero) {
				esnumero = true;
				sb.append(c);
			} else {
				esnumero = false;
				contanon++;
			}
			if (frase.equals("fin")) {
				bw.write(sb.toString());
			}
		}
	}
	bw.close();
	System.out.println("Total de carácteres no númericos: " + contanon);
	System.out.println("Valores numericos:");
	while ((fraseaux = br.readLine()) != null) {
		System.out.println(fraseaux);
	}
	br.close();
} catch (IOException e) {
	e.printStackTrace();
}
}
}