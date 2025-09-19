package Ejercicios_Tema8;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_4 {
	public static void main(String[] args) {
		int opc = 0;
		String path = "";
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\nMenú ficheros\n 1. Crear Fichero \n 2. Eliminar Fichero \n 3. Renombrar Fichero \n");
			try {
				opc = sc.nextInt();
			} catch(InputMismatchException x) {
				System.out.println("Introduce una opción válida");
				sc.nextLine();
				opc = 0;
			}
			switch (opc) {
			case 0:
				break;
			case 1:
				System.out.println("\nIntroduce el nombre del fichero");
				path = sc.next();
				crearFichero(path);
				break;
			case 2:
				System.out.println("\nIntroduce el nombre del fichero a eliminar");
				path = sc.next();
				eliminarFichero(path);
				break;
			case 3:
				System.out.println("\nIndica el nombre del fichero a renombrar");
				path = sc.next();
				File fi = new File(path);
				if (fi.exists()) {
					System.out.println("Indica el nuevo nombre que va a tener el fichero");
					path = sc.next();
					renombrarFichero(fi,path);
				} else {
					System.out.println("No existe un fichero con el nombre que has escrito");
				}
				break;
			default:
				System.out.println("Elige un número del menú (1 al 3)");
				break;
			}
		} while (opc != 4);
		sc.close();
	}
		static void crearFichero(String x) {
			File prueba = new File(x);
			File directorio;
			if (prueba.getParent() == null) {
				directorio = new File(".");
			} else {
				directorio = new File(prueba.getParent());
			}
			if (!prueba.exists()) {
				try {
					prueba.createNewFile();
					System.out.println("Fichero creado con éxito");
					String[] lista = directorio.list();
					for (int i = 0; i < lista.length; i++) {
						System.out.println(lista[i]);
					}
				} catch (IOException e) {
					System.out.println("No se ha podido crear el archivo");
				}
			} else {
				System.out.println("No se puede crear un archivo que ya existe");
			}
		}
		static void eliminarFichero(String x) {
			File path = new File(x);
			if (path.exists()) {
				if (path.delete()) {
					System.out.println("El archivo se ha eliminado con éxito");
				} else {
					System.out.println("No se ha podido eliminar el archivo");
				}
			} else {
				System.out.println("No se puede eliminar un archivo que no existe");
			}
			File directorio;
			if (path.getParent() == null) {
				directorio = new File(".");
			} else {
				directorio = new File(path.getParent());
			}
			String[] lista = directorio.list();
			for (int i = 0; i < lista.length; i++) {
				System.out.println(lista[i]);
			}
		}
		static void renombrarFichero(File f, String nN) {
			File nuevon = new File(nN);
			if (f.renameTo(nuevon)) {
				System.out.println("Nombre del archivo actualizado con éxito");
			} else {
				System.out.println("No se ha podido renombrar el archivo");
			}
			File directorio;
			if (f.getParent() == null) {
				directorio = new File(".");
			} else {
				directorio = new File(f.getParent());
			}
			String[] lista = directorio.list();
			for (int i = 0; i < lista.length; i++) {
				System.out.println(lista[i]);
			}
		}
	}