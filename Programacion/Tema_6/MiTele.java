package Ejercicios_Tema_6;

public class MiTele implements Televisor {
	int numCanales, canalActual;
	boolean encendida = true;
	MiTele(int nc, int ca) {
		numCanales = nc;
		canalActual = ca;
	}
	public void encender() {
		if (encendida) {
			System.out.println("La tele ya está encendida");
		} else {
			encendida = true;
			System.out.println("Tele encendida");
		}
	}

	public void apagar() {
		if (encendida) {
			encendida = false;
			System.out.println("Tele apagada");
		} else {
			System.out.println("La tele ya está apagada");
		}
	}

	public void cambiarCanal(int c) {
		if (numCanales < c && encendida) {
			System.out.println("No se encuentra el canal solicitado");
		} else if (numCanales >= c && encendida){
			canalActual = c;
			System.out.println("Se ha cambiado el canal a " + c);
		} else {
			System.out.println("La tele está apagada");
		}
		
	}

}
