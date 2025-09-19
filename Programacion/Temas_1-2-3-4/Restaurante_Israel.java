package EjerciciosTema2;

public class Restaurante_Israel {
	double papas, chocos;
	public Restaurante_Israel(double papas, double chocos) {
		this.papas = papas;
		this.chocos = chocos;
	}
	public int personasxcomida() {
		int pers = 0;
		if (papas <=0 || chocos <= 0) {
			return 0;
		} else {
		do {
			if (papas <= 0 || chocos <=0) {
				break;
			} else {
			pers += 3;
			papas --;
			chocos -= 0.5;
			}
		} while (papas >= 0 && chocos >= 0);
		return pers;
	}
}
	public void addChocos(int x) {
		this.chocos = chocos += x;
	}
	public void addPapas(int x) {
		this.papas = papas += x;
	}
	public void showChocos() {
		System.out.println("La cantidad de chocos que quedan es: " + chocos);
	}
	public void showPapas() {
		System.out.println("La cantidad de papas que quedan es: " + papas);
	}
}