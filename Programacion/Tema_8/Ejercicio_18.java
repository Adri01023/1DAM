package Ejercicios_Tema8;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ejercicio_18 {
public static void main(String[] args) {
	File fichero = new File("ficheroaleatorio");
	escribirFicheroAleatorio(fichero);
	leerFicheroAleatorio(fichero);
	System.out.println("");
	actualizarSalario(6, 2000.69,fichero);
	System.out.println("");
	leerFicheroAleatorio(fichero);
}
static void escribirFicheroAleatorio(File f1) {
	RandomAccessFile fr;
	String apellido[] = {"FERNANDEZ","GIL","LOPEZ","RAMOS","SEVILLA","CASILLA","REY"};
	int dep[] = {10,20,10,10,30,30,20};
	double salario[] = {1000.45,2400.60,3000.0,1500.56,2200.0,1435.87,2000.0};
	StringBuilder buffer;
		try {
			if (!f1.exists()) f1.createNewFile();
			fr = new RandomAccessFile(f1, "rw");
			for (int i = 0; i < salario.length; i++) {
				fr.writeInt(i+1);
				buffer = new StringBuilder(apellido[i]);
				buffer.setLength(10);
				fr.writeChars(buffer.toString());
				fr.writeInt(dep[i]);
				fr.writeDouble(salario[i]);
			}
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
static void leerFicheroAleatorio(File f1) {
	int id;
	RandomAccessFile fr;
	int dep;
	double salario;
	char[] apellido = new char[10];
	String apellidoString;
	char aux;
	int pos = 0;
	try {
		if (!f1.exists()) System.out.println("Introduce un archivo válido");
		fr = new RandomAccessFile(f1,"r");
		while (fr.getFilePointer() < fr.length()) {
			fr.seek(pos);
			id = fr.readInt();
			for (int i = 0; i < apellido.length; i++) {
				aux = fr.readChar();
				apellido[i] = aux;
			}
			apellidoString = new String(apellido);
			dep = fr.readInt();
			salario = fr.readDouble();
			System.out.println("ID: " + id + ", Apellido: " + apellidoString + ", Departamento " + dep + ", Salario " + salario);
			pos += 36; // Le sumamos 36 "Bytes" ya que es lo que ocupa cada empleado (4+20+4+8)
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
}
static void actualizarSalario(int id, double sal, File f1) {
	try {
		RandomAccessFile fr = new RandomAccessFile(f1, "rw");
		int pos = 0;
		pos += (id - 1) * 36;
		pos += 28; // Para acceder al registro que se solicita -1 porq empieza en 0
		if (pos >= fr.length()) System.out.println("No existe el identificador solicitado");
		fr.seek(pos);
		System.out.println(fr.readDouble());
		fr.seek(pos);
		fr.writeDouble(sal);
		fr.seek(pos);
		System.out.println(fr.readDouble());
		fr.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}