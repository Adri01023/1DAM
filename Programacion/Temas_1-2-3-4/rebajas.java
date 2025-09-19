package EjerciciosTema2;

public class rebajas {
	public float descubrePorcentaje(float po, float pr) {
		float division =1 - (pr / po);
		float resultado = division * 100;
		return resultado;
	}
}
