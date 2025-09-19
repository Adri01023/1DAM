package EjerciciosTema2;

public class prueba_comia {
	public static void main(String[] args) {
		Restaurante_Israel COMIAA = new Restaurante_Israel(5, 4);
		System.out.println(COMIAA.personasxcomida());
		COMIAA.showChocos();
		COMIAA.addChocos(3);
		COMIAA.showChocos();
	}
}
