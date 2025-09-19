package Ejercicios_Tema_6;

import Ejercicios_Tema_6.Multimedia.Formato;

public class Prueba_Ej1 {
	public static void main(String[] args) {
		Multimedia prueba = new Multimedia("Interstellar", "Nolan", Formato.wav, 2.52);
		Multimedia prueba2 = new Multimedia("Dias de futbol", "Paco", Formato.avi, 3.12);
		System.out.println(prueba);
		System.out.println(prueba.equals(prueba2));
		System.out.println(prueba2);
		ListaMultimedia hola = new ListaMultimedia(10);
		System.out.println(hola.add(prueba));
		hola.add(prueba2);
		System.out.println(hola.size());	
		System.out.println(hola);
}
}
