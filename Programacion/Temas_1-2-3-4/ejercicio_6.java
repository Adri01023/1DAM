package EjerciciosTema2;
import java.util.Scanner;
public class ejercicio_6 {
 public static void main(String[] args) {
	var sc = new Scanner(System.in);
	System.out.println("Introduce la nota que has sacado en programación");
	float nota_pro = sc.nextFloat();
	System.out.println("Introduce la nota que has sacado en LM");
	float nota_lm = sc.nextFloat();
	int contador = 0;
	if (nota_pro >=5) {
		contador++;
	}
	if (nota_lm >=5) {
		contador++;
	}
	if (contador ==2) {
		System.out.println("Has aprobado ambos examenes");
	} else if (contador ==1){
		System.out.println("Has aprobado un examen");
	} else {
		System.out.println("No has aprobado ningún examen");
	}
	sc.close();
}
}
