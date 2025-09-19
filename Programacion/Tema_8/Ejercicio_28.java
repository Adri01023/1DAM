package Ejercicios_tema8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Ejercicio_28 {
public static void main(String[] args) {
	Asignatura [] asignaturas = new Asignatura[6];
	asignaturas = rellenaArray(asignaturas);
	escribirFichero(asignaturas);
	leerFichero();
	calcularMedia();
}
static Asignatura[] rellenaArray(Asignatura[] a) {
	Scanner sc = new Scanner(System.in);
	double nota;
	String[] nombres = new String[]{"Entornos","Sistemas","Programación","Bases de Datos","Marcas","Computación en la nube"};
	for (int i = 0; i < nombres.length; i++) {
		System.out.println("Cual es tu nota en " + nombres[i]);
		nota = sc.nextDouble();
		if (nota >= 0 && nota <= 10) {
			Asignatura asig = new Asignatura(nombres[i],nota);
			a[i] = asig;
			System.out.println("Nota añadida con éxito");
		} else {
			System.out.println("Ingresa una nota entre 1 y 10");
			i--;
		}
	}
	sc.close();
	return a;
}
static void escribirFichero(Asignatura[] a) {
	File fichero = new File("notas.txt");
	try {
		if (!fichero.exists()) fichero.createNewFile();
		FileOutputStream fos = new FileOutputStream(fichero);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		for (int i = 0; i < a.length; i++) {
			oos.writeObject(a[i]);
		}
		System.out.println("Fichero creado con éxito");
		oos.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
static void leerFichero() {
	File fichero = new File("notas.txt");
	ObjectInputStream ois;
	try {
	FileInputStream fis = new FileInputStream(fichero);
	ois = new ObjectInputStream(fis);
	while (true) {
		Asignatura asignatura = (Asignatura) ois.readObject();
		System.out.println(asignatura.getNombre() + ": " + asignatura.getNota());
	}
	} catch (IOException e) {}
	  catch (ClassNotFoundException x) {
		x.printStackTrace();
	}
}
static void calcularMedia() {
	File fichero = new File("notas.txt");
	double notas = 0;
	ObjectInputStream ois;
	try {
	FileInputStream fis = new FileInputStream(fichero);
	ois = new ObjectInputStream(fis);
	while (true) {
		Asignatura asignatura = (Asignatura) ois.readObject();
		notas += asignatura.getNota();
	}
	} catch (IOException e) {
		System.out.println("La media de las notas es: " + notas/6); 
		}
	  catch (ClassNotFoundException x) {
		x.printStackTrace();
	}
}
}
