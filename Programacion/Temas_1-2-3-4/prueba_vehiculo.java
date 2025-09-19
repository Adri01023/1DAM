package EjerciciosTema2;

public class prueba_vehiculo {
public static void main(String[] args) {
	Vehiculo_POO klk = new Vehiculo_POO(4, 150, 4200);
	Vehiculo_POO pol = new Vehiculo_POO(8, 100, 4600);
	System.out.println(klk.equals(pol));
	klk.copia(pol);
	System.out.println(klk.equals(pol));
}
}
