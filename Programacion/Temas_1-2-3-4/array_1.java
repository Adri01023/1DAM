package EjerciciosTema2;

public class array_1 {
	public static void main(String[] args) {
		int pares[] = new int[10];
		int contador = 0;
		for (int x = 0; x < 25; x++) {
			if (x % 2 == 0) {
				pares[contador++] = x;
			}
			if (contador == 10) 
				break;
		}
		for (int y: pares) {
			System.out.print(y + ", ");
		}
	}
}