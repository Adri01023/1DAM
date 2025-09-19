package EjerciciosTema2;
import java.util.Scanner;
import java.util.Arrays;
public class ejercicio_22Arrays {
	public static void main(String[] args) {
		int n;
		String[] lista = new String[5];
		Arrays.fill(lista, "");
		do {
			System.out.println("\nMenú:\n"
					+ "  1. Introducir nombre\n"
					+ "  2. Listar nombres\n"
					+ "  3. Eliminar nombre\n"
					+ "  4. Eliminar todos los nombres\n"
					+ "  5. Salir");
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();	
			switch (n) {
			case 1:
				System.out.println("Que nombre quieres introducir");
				String nombre = sc.next();
				for(int i = 0; i < 5 ; i ++) {
					if (lista[i].equals("") && !lista[i].equals(nombre)) {
						lista[i] = nombre;
						break;
					}
					else if (!lista[4].equals("")) {
						System.out.println("Elimina un nombre para introducir otro"); 
						break;
					}
				}
				break;
			case 2:
				for (String h : lista) {
					if (!h.equals(""))
					System.out.println(h);
				}
				break;
			case 3:
				System.out.println("Introduce el nombre que quieres borrar");
				nombre = sc.next();
				for (int i = 0; i < 5; i ++) {
					if (lista[i].equals(nombre)) {
						lista[i] = "";
					}
				}
				break;
			case 4:
				for (int i = 0; i < 5; i ++) {
					lista[i] = "";
				}
			case 5:
				break;
			default:
				System.out.println("\n Introduce un número válido :/ \n");
				break;
			}
		} while (n != 5);
		
	 }
}
