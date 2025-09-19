package EjerciciosTema2;

public class ejercicio_50 {
	public static void main(String[] args) {
		int lins = 20;
		int nr = 20;
		do {
			for (int sp = 0 ;sp < lins - nr; sp++)
			System.out.print(" ");
			for (int i = 0; i < nr ; i++)
				System.out.print("* ");
			nr--;
				System.out.println();
} while (nr  > 0);
}
}