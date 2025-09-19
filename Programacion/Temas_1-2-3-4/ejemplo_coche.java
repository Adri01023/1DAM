package EjerciciosTema2;

public class ejemplo_coche {
	public static void main(String[] args) {
		/*Coche Coche1 = new Coche();
		System.out.print(Coche1.marca + Coche1.modelo);
		Coche Coche2 = new Coche("BMW", "SERIE 1");
		System.out.println("\n" + Coche2.marca + Coche2.modelo);*/
		Coche Coche1 = new Coche();
		Coche1.setvelocidad(120);
		Coche1.acelera(51);
		System.out.println(Coche1.getvelocidad());
}
}
