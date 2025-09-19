package EjerciciosTema2;
import java.util.Scanner;
public class faltas_dam {
	public static void main(String[] args) {
	var sc = new Scanner(System.in);
	System.out.println("Indica de que asignatura quieres saber cuanto puedes faltar: \n(P para Programación)\n(SI para Sistemas Informáticos)\n(LM para Lenguaje de Marcas)\n(ED para Entornos de Desarrollo)\n(BD para Bases de Datos)\n(OPT para Materia Optativa)\n(FOL para FOL)");
	String asig = sc.nextLine();
	asig = asig.toUpperCase();
	switch (asig) {
	case "P":
		System.out.println("Cuantas horas has faltado");
		int horas = sc.nextInt();
		if (((270*0.25)-horas) <= 0) {
			System.out.println("Cagaste :(");
		} else {
			System.out.println("Puedes faltar a: " + ((270*0.25)-horas) + " horas");
		}
			if (((270*0.25) / 2) - horas <= 0 ) {
				System.out.println("Ya te deberían haber dado el aviso");
			} else {
				System.out.println("Te faltan: " + ((((270*0.25)/2) - horas)) + " horas para que te den el aviso");
			}
		
		break;
	case "BD":
		System.out.println("Cuantas horas has faltado");
		horas = sc.nextInt();
		if (((205*0.25)-horas) <= 0) {
			System.out.println("Cagaste :(");
		} else {
			System.out.println("Puedes faltar a: " + ((205*0.25)-horas) + " horas");
		}
		if (((205*0.25) / 2) - horas <= 0 ) {
			System.out.println("Ya te deberían haber dado el aviso");
		} else {
			System.out.println("Te faltan: " + ((((205*0.25)/2) - horas)) + " horas para que te den el aviso");
		}
		break;
	case "SI":
		System.out.println("Cuantas horas has faltado");
		horas = sc.nextInt();
		if (((205*0.25)-horas) <= 0) {
			System.out.println("Cagaste :(");
		} else {
			System.out.println("Puedes faltar a: " + ((205*0.25)-horas) + " horas");
		}
		if (((205*0.25) / 2) - horas <= 0 ) {
			System.out.println("Ya te deberían haber dado el aviso");
		} else {
			System.out.println("Te faltan: " + ((((205*0.25)/2) - horas)) + " horas para que te den el aviso");
		}
		break;
	case "LM":
		System.out.println("Cuantas horas has faltado");
		horas = sc.nextInt();
		if (((110*0.25)-horas) <= 0) {
			System.out.println("Cagaste :(");
		} else {
			System.out.println("Puedes faltar a: " + ((110*0.25)-horas) + " horas");
		}
		if (((110*0.25) / 2) - horas <= 0 ) {
			System.out.println("Ya te deberían haber dado el aviso");
		} else {
			System.out.println("Te faltan: " + ((((110*0.25)/2) - horas)) + " horas para que te den el aviso");
		}
		break;
	case "ED":
		System.out.println("Cuantas horas has faltado");
		horas = sc.nextInt();
		if (((60*0.25)-horas) <= 0) {
			System.out.println("Cagaste :(");
		} else {
			System.out.println("Puedes faltar a: " + ((60*0.25)-horas) + " horas");
		}
		if (((60*0.25) / 2) - horas <= 0 ) {
			System.out.println("Ya te deberían haber dado el aviso");
		} else {
			System.out.println("Te faltan: " + ((((60*0.25)/2) - horas)) + " horas para que te den el aviso");
		}
		break;
	case "OPT":
		System.out.println("Cuantas horas has faltado");
		horas = sc.nextInt();
		if (((50*0.25)-horas) <= 0) {
			System.out.println("Cagaste :(");
		} else {
			System.out.println("Puedes faltar a: " + ((50*0.25)-horas) + " horas");
		}
		if (((50*0.25) / 2) - horas <= 0 ) {
			System.out.println("Ya te deberían haber dado el aviso");
		} else {
			System.out.println("Te faltan: " + ((((50*0.25)/2) - horas)) + " horas para que te den el aviso");
		}
		break;
	case "FOL":
		System.out.println("Cuantas horas has faltado");
		horas = sc.nextInt();
		if (((100*0.25)-horas) <= 0) {
			System.out.println("Cagaste :(");
		} else {
			System.out.println("Puedes faltar a: " + ((100*0.25)-horas) + " horas");
		}
		if (((100*0.25) / 2) - horas <= 0 ) {
			System.out.println("Ya te deberían haber dado el aviso");
		} else {
			System.out.println("Te faltan: " + ((((100*0.25)/2) - horas)) + " horas para que te den el aviso");
		}
		break;
	default:
		System.out.println("Cuantas horas has faltado (LM por defecto)");
		horas = sc.nextInt();
		if (((110*0.25)-horas) <= 0) {
			System.out.println("Cagaste :(");
		} else {
			System.out.println("Puedes faltar a: " + ((110*0.25)-horas) + " horas");
		}
		if (((110*0.25) / 2) - horas <= 0 ) {
			System.out.println("Ya te deberían haber dado el aviso");
		} else {
			System.out.println("Te faltan: " + ((((110*0.25)/2) - horas)) + " horas para que te den el aviso");
		}
		break;
	}
	sc.close();
}
}
