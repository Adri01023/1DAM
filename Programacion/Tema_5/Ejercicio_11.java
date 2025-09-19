package Ejercicios_Tema5;

import java.util.TreeSet;

public class Ejercicio_11 {
	public static void main(String[] args) {
		Vehiculo v1 = new Vehiculo("9089KLM", "Opel", "Astra", 150, 123000);
		Vehiculo v2 = new Vehiculo("5421ASN", "Ford", "Tucson", 130, 123000);
		Vehiculo v3 = new Vehiculo("7584NEO", "Ford", "Mondeo", 140, 304000);
		Vehiculo v4 = new Vehiculo("1384THC", "Peugeot", "208", 160, 50000);
		TreeSet<Vehiculo> lista = new TreeSet<Vehiculo>();
		lista.add(v1);
		lista.add(v2);
		lista.add(v3);
		lista.add(v4);
		System.out.println(lista);
	}
}
