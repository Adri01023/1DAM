package EjerciciosTema2;

public class prueba_Numero {
	public static void main(String[] args) {
		Numero Prueba = new Numero(7);
		Prueba.setNumero(9);
		System.out.println(Prueba.n);
		System.out.println(Prueba.getTriple());
		Prueba.setRandom();
		System.out.println(Prueba.n);
	}
}
