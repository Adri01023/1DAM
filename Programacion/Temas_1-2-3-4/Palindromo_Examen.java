package EjerciciosTema2;

public class Palindromo_Examen {
	public static void main(String[] args) {
		System.out.println(palin("ALLA"));
	}
	public static boolean palin(String benito) {
		String paco = benito.replaceAll(" ", "");
		for (int i = 0; i < paco.length() ; i++) {
			if (paco.charAt(i) != paco.charAt(paco.length()-1 -i)) {
				return false;
			}
		}
		return true;
		}
	}
