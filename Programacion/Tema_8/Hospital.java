package Hospital;

import java.io.Serializable;
import java.util.ArrayList;

public class Hospital implements Serializable {
	private static final long serialVersionUID = 1L;
	ArrayList<Planta> plantas;
	public Hospital() {plantas = new ArrayList<Planta>();}
	public int size() {
		return plantas.size();
	}
	public void addPlanta(Planta p) {
			plantas.add(p);
	}
	public void removePlanta(int n) {
		for (Planta p : plantas) {
			if (p.numero == n) {
				plantas.remove(p);
				System.out.println("Planta eliminada con éxito");
			}
		}
	}
	public Planta getPlanta(int n) {
		if (n > plantas.size()) {
			System.out.println("Introduce un número dentro de los límites, 0 y " + plantas.size());
		} else {
			return plantas.get(n);
		}
		return null;
	}
}
