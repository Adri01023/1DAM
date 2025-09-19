package Ejercicios_tema8;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Ejercicio_25 {
public static void main(String[] args) {
	File fichero = new File("personas.dat");
	escribirFichero(fichero);
	try {
		leerFichero(fichero);
	} catch (IOException e) {
		e.printStackTrace();
	}
}
static void escribirFichero(File f1) {
	try {
		FileOutputStream os = new FileOutputStream(f1);
		ObjectOutputStream oos = new ObjectOutputStream(os);
		String[] dnis = {"12345678A", "98765432B", "78234212Z"};
		String[] nombres = {"Lucas González", "Anacleto Jiménez", "María Zapata"};
		double[] sueldos = {1200.40, 1000, 1100.25};
		int[] edades = {30,28,35};
		for (int i = 0; i < edades.length; i++) {
			Empleado trabajador = new Empleado(dnis[i], nombres[i], edades[i], sueldos[i]);
			oos.writeObject(trabajador);
		}
		oos.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
static void leerFichero(File f1) throws IOException {
		FileInputStream fis = new FileInputStream(f1);
		ObjectInputStream ois = new ObjectInputStream(fis);
	try {
		while (true) {
			Empleado trabajador = (Empleado) ois.readObject();
			System.out.println("Nombre: " + trabajador.getNombre() + " Edad: " + trabajador.getEdad() + " DNI: " + trabajador.getDni() + " Sueldo: " + trabajador.getSueldo());
		}
	}
	 catch (EOFException x) {}
	 catch (ClassNotFoundException e) {}
	ois.close();
	}
}
