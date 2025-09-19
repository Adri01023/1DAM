package EjerciciosTema2;

public class consumo_prueba {
	public static void main(String[] args) {
		Consumo Pruebaklk = new Consumo(53.4, 3, 53.4, 1.56);
		System.out.printf("El tiempo en minutos para recorrer es de: %.2f min" ,Pruebaklk.getTiempo());
		System.out.printf("\nEl consumo medio del vehículo en euros por cada 100 kilómetros es de: %.2f €/100km" , Pruebaklk.consumo€());
		System.out.printf("\nEl consumo medio del vehículo en litros por cada 100 kilómetros es de: %.2f litros/100km" , Pruebaklk.consumoMedio());
	}
}
