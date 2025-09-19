package EjerciciosTema2;
import java.util.Scanner;
public class faltas_jordi {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		System.out.println("Indica de que asignatura quieres saber cuanto puedes faltar: \n(SI para Seguridad Informática)\n(SR para Servicios en Red)\n(SOR para Sistemas Operativos en Red)\n(AW para Aplicaciones Web)\n(I para Inglés)\n(EM para Empresa)");
		String asig = sc.nextLine();
		asig = asig.toUpperCase();
		switch (asig) {
		case "SR":
			System.out.println("Cuantas horas has faltado");
			int horas = sc.nextInt();
			if (((170*0.15)-horas) <= 0) {
				System.out.println("Cagaste :(");
			} else {
				System.out.println("Puedes faltar a: " + ((170*0.15)-horas) + " horas");
			}
			if (((170*0.15) / 2) - horas <= 0 ) {
				System.out.println("Ya te deberían haber dado el aviso");
			} else {
				System.out.println("Te faltan: " + ((((170*0.15)/2) - horas)) + " horas para que te den el aviso");
			}
			
			break;
		case "SOR":
			System.out.println("Cuantas horas has faltado");
			horas = sc.nextInt();
			if (((170*0.15)-horas) <= 0) {
				System.out.println("Cagaste :(");
			} else {
				System.out.println("Puedes faltar a: " + ((170*0.15)-horas) + " horas");
			}
			if (((170*0.15) / 2) - horas <= 0 ) {
				System.out.println("Ya te deberían haber dado el aviso");
			} else {
				System.out.println("Te faltan: " + ((((170*0.15)/2) - horas)) + " horas para que te den el aviso");
			}
			break;
		case "SI":
			System.out.println("Cuantas horas has faltado");
			horas = sc.nextInt();
			if (((85*0.15)-horas) <= 0) {
				System.out.println("Cagaste :(");
			} else {
				System.out.println("Puedes faltar a: " + ((85*0.15)-horas) + " horas");
			}
			if (((85*0.15) / 2) - horas <= 0 ) {
				System.out.println("Ya te deberían haber dado el aviso");
			} else {
				System.out.println("Te faltan: " + ((((85*0.15)/2) - horas)) + " horas para que te den el aviso");
			}
			break;
		case "EM":
			System.out.println("Cuantas horas has faltado");
			horas = sc.nextInt();
			if (((65*0.15)-horas) <= 0) {
				System.out.println("Cagaste :(");
			} else {
				System.out.println("Puedes faltar a: " + ((65*0.15)-horas) + " horas");
			}
			if (((65*0.15) / 2) - horas <= 0 ) {
				System.out.println("Ya te deberían haber dado el aviso");
			} else {
				System.out.println("Te faltan: " + ((((65*0.15)/2) - horas)) + " horas para que te den el aviso");
			}
			break;
		case "I":
			System.out.println("Cuantas horas has faltado");
			horas = sc.nextInt();
			if (((40*0.15)-horas) <= 0) {
				System.out.println("Cagaste :(");
			} else {
				System.out.println("Puedes faltar a: " + ((40*0.15)-horas) + " horas");
			}
			if (((40*0.15) / 2) - horas <= 0 ) {
				System.out.println("Ya te deberían haber dado el aviso");
			} else {
				System.out.println("Te faltan: " + ((((40*0.15)/2) - horas)) + " horas para que te den el aviso");
			}
			break;
			
		case "AW":
			System.out.println("Cuantas horas has faltado");
			horas = sc.nextInt();
			if (((100*0.15)-horas) <= 0) {
				System.out.println("Cagaste :(");
			} else {
				System.out.println("Puedes faltar a: " + ((100*0.15)-horas) + " horas");
			}
			if (((100*0.15) / 2) - horas <= 0 ) {
				System.out.println("Ya te deberían haber dado el aviso");
			} else {
				System.out.println("Te faltan: " + ((((100*0.15)/2) - horas)) + " horas para que te den el aviso");
			}
			break;	
		}
		sc.close();
	}
	}
