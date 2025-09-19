package EjerciciosTema2;

import java.util.Scanner;

public class palindromo_recursividad {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la palabra");
		String palabra = sc.nextLine();
		int conta = 0;
		int recorre = 1;
		palabra = palabra.toUpperCase();
		int limite = (palabra.length()/2);
		for (int x = 0; x < limite ; x++) {
			if (palabra.charAt(x) == palabra.charAt(palabra.length()-recorre)) {
				conta = 1;
				recorre ++;
			} else {
				conta = 0;
			}
		}
		if (conta == 1) {
			System.out.println("La palabra introducida es un palíndromo");
		} else {
			System.out.println("La palabra introducida NO es un palíndromo");
		}
		sc.close();
	} 
}
