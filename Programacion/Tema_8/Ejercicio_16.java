package Ejercicios_tema8;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio_16 {
public static void main(String[] args) {
	String modelo;
	String matricula;
	String marca;
	double deposito;
	Scanner sc = new Scanner(System.in);
	File fichero = new File("coches");
	FileInputStream fis = null;
	FileOutputStream fos = null;
	try {
		fis = new FileInputStream(fichero);
		 fos = new FileOutputStream(fichero, true);
	} catch (Exception x) {}
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		System.out.println("Introduce el modelo del coche");
		modelo = sc.nextLine();
		System.out.println("Introduce la matricula del coche");
		matricula = sc.nextLine();
		System.out.println("Introduce la cantidad de deposito del coche");
		deposito = sc.nextDouble();
		System.out.println("Introduce la marca del coche");
		sc.nextLine();
		marca = sc.nextLine();
		sc.close();
		try {
			dos.writeUTF(matricula);
			dos.writeUTF(marca);
			dos.writeDouble(deposito);
			dos.writeUTF(modelo);
			dos.close();
			while (true) {
				matricula = dis.readUTF();
				 marca = dis.readUTF();
				deposito = dis.readDouble();
				modelo = dis.readUTF();
				System.out.println("El modelo del coche es: " + modelo + " su matricula es " + matricula + " tiene una capacidad de deposito de " + deposito + " litros y su marca es: " +marca);
			}
		} catch (Exception y) {
		} finally {
		try {dis.close();} catch (IOException x) {}
	}
}}