package Ejercicios_tema8;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_27 {
	static ArrayList<String> matricula = new ArrayList<>();
	static ArrayList<Integer> km = new ArrayList<>();
	static ArrayList<Integer> caballos = new ArrayList<>();
	static ArrayList<Integer> km2 = new ArrayList<>();
	static ArrayList<String> matricula2 = new ArrayList<>();
	static ArrayList<Integer> caballos2 = new ArrayList<>();
public static void main(String[] args) {
	matricula.add("1234-ABC");
	matricula.add("2345-FGT");
	matricula.add("7412-RET");
	matricula.add("5285-NBN");
	matricula.add("7896-JNB");
	matricula.add("9632-POI");
	matricula.add("1289-GTR");
	km.add(100000);
	km.add(200000);
	km.add(150000);
	km.add(1200);
	km.add(3000);
	km.add(40000);
	km.add(180000);
	caballos.add(95);
	caballos.add(110);
	caballos.add(150);
	caballos.add(125);
	caballos.add(110);
	caballos.add(150);
	caballos.add(180);
	File fichero = new File("vehiculos.dat");
	crearVehiculos(fichero);
	matricula2.add("2374-TRE");
	matricula2.add("8521-PER");
	caballos2.add(110);
	caballos2.add(1200);
	km2.add(130000);
	km2.add(2500);
	leerVehiculos(fichero);
	crearVehiculos2(fichero);
	leerVehiculos(fichero);
	System.out.println("Introduce un ID a buscar");
	Scanner sc = new Scanner(System.in);
	int id = sc.nextInt();
	buscarId(fichero, id);
	sc.close();
}
static void crearVehiculos(File f1) {
	FileOutputStream fos = null;
	ObjectOutputStream oos = null;
	try {
		if (!f1.exists()) {
			fos = new FileOutputStream(f1);
			oos = new ObjectOutputStream(fos);
		} else {
			fos = new FileOutputStream(f1, true);
			oos = new MiObjectOutputStream(fos);
		}
		for(int i = 0; i < caballos.size(); i++) {
			Vehiculos vehiculo = new Vehiculos(matricula.get(i), caballos.get(i), km.get(i));
			oos.writeObject(vehiculo);
			}
		System.out.println("Vehículos creados con éxito");
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException x) {
		x.printStackTrace();
	}
}
static void crearVehiculos2(File f1) {
	FileOutputStream fos = null;
	ObjectOutputStream oos = null;
	try {
		fos = new FileOutputStream(f1, true);
		oos = new MiObjectOutputStream(fos);
		for(int i = 0; i < caballos2.size(); i++) {
			Vehiculos vehiculo = new Vehiculos(matricula2.get(i), caballos2.get(i), km2.get(i));
			oos.writeObject(vehiculo);
			}
		System.out.println("Vehículos creados con éxito");
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException x) {
		x.printStackTrace();
	}
}
static void leerVehiculos(File f1) {
	ObjectInputStream ois = null;
	try {
		FileInputStream fis = new FileInputStream(f1);
		ois = new ObjectInputStream(fis);
		while (true) {
			Vehiculos vehiculo = (Vehiculos) ois.readObject();
			System.out.println("ID: " + vehiculo.getId() + " Matrícula: " + vehiculo.getMatricula() + " Caballos: " + vehiculo.getCaballos() + " Kilómetros: " + vehiculo.getKm());
		}
	} catch (EOFException e) {
	} catch (IOException y) {
		y.printStackTrace();
	} catch (ClassNotFoundException w) {
		w.printStackTrace();
	}
}
static void buscarId(File f1, int x) {
	ObjectInputStream ois = null;
	try {
		FileInputStream fis = new FileInputStream(f1);
		ois = new ObjectInputStream(fis);
		while (true) {
			Vehiculos vehiculo = (Vehiculos) ois.readObject();
			if (vehiculo.getId() == x) {
				System.out.println("Los datos del vehículo con ID: " + x + " son: Matrícula: " + vehiculo.getMatricula() + " Caballos: " + vehiculo.getCaballos() + " Kilómetros: " + vehiculo.getKm());
			}
		}
	} catch (EOFException e) {
	} catch (IOException y) {
		y.printStackTrace();
	} catch (ClassNotFoundException w) {
		w.printStackTrace();
	}
}
}
