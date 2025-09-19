package EjerciciosTema2;
import java.util.Scanner;
public class faltas_asir {
	public static void main(String[] args) {
	var sc = new Scanner(System.in);
	System.out.println("Indica de que asignatura quieres saber cuanto puedes faltar: \n(FH para Fundamentos de Hardware)\n(BD para Gestión de Bases de Datos)\n(ISO para Implementación de Sistemas Operativos)\n(LM para Lenguaje de Marcas)\n(PR para Planificación y Administración de Redes )\n(OPT para Materia Optativa)\n(FOL para FOL)");
	String asig = sc.nextLine();
	asig = asig.toUpperCase();
	switch (asig) {
	case "FH":
		System.out.println("Cuantas horas has faltado");
		int horas = sc.nextInt();
		if (((105*0.25)-horas) <= 0) {
			System.out.println("Cagaste :(");
		} else {
			System.out.println("Puedes faltar a: " + ((105*0.25)-horas) + " horas");
		}
		if (((105*0.25) / 2) - horas <= 0 ) {
			System.out.println("Ya te deberían haber dado el aviso");
		} else {
			System.out.println("Te faltan: " + ((((105*0.25)/2) - horas)) + " horas para que te den el aviso");
		}
		break;
	case "BD":
		System.out.println("Cuantas horas has faltado");
		horas = sc.nextInt();
		if (((200*0.25)-horas) <= 0) {
			System.out.println("Cagaste :(");
		} else {
			System.out.println("Puedes faltar a: " + ((200*0.25)-horas) + " horas");
		}
		if (((200*0.25) / 2) - horas <= 0 ) {
			System.out.println("Ya te deberían haber dado el aviso");
		} else {
			System.out.println("Te faltan: " + ((((200*0.25)/2) - horas)) + " horas para que te den el aviso");
		}
		break;
	case "ISO":
		System.out.println("Cuantas horas has faltado");
		horas = sc.nextInt();
		if (((245*0.25)-horas) <= 0) {
			System.out.println("Cagaste :(");
		} else {
			System.out.println("Puedes faltar a: " + ((245*0.25)-horas) + " horas");
		}
		if (((245*0.25) / 2) - horas <= 0 ) {
			System.out.println("Ya te deberían haber dado el aviso");
		} else {
			System.out.println("Te faltan: " + ((((245*0.25)/2) - horas)) + " horas para que te den el aviso");
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
	case "PR":
		System.out.println("Cuantas horas has faltado");
		horas = sc.nextInt();
		if (((190*0.25)-horas) <= 0) {
			System.out.println("Cagaste :(");
		} else {
			System.out.println("Puedes faltar a: " + ((190*0.25)-horas) + " horas");
		}
		if (((190*0.25) / 2) - horas <= 0 ) {
			System.out.println("Ya te deberían haber dado el aviso");
		} else {
			System.out.println("Te faltan: " + ((((190*0.25)/2) - horas)) + " horas para que te den el aviso");
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
		System.out.println("Cuantas horas has faltado (OPT por defecto)");
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
	}
	sc.close();
}
}