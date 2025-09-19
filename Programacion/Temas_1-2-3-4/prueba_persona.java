package EjerciciosTema2;
import java.util.Scanner;
public class prueba_persona {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		String nombresito = sc.next();
		String sexy = sc.next();
		int edadp = sc.nextInt();
		float pesop = sc.nextFloat();
		float alturap = sc.nextFloat();
		Persona pruebaklk = new Persona(nombresito, edadp, sexy, "05451068E", pesop, alturap);
		System.out.println(pruebaklk.toString());
	}
}
