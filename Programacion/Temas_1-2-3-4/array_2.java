package EjerciciosTema2;
import java.util.Scanner;
public class array_2 {
	public static void main(String[] args) {
		int miarray[] = new int[10];
		var sc = new Scanner(System.in);
		for (int x = 0; x < 10; x++) {
			System.out.println("Introduce número (" + x + " de 10)");
			int numerin = sc.nextInt();
			miarray[x] = numerin;
		}
		for (int y: miarray) {
			if (y % 2 == 0)
				System.out.println(y + ", ");
		}
}
}
