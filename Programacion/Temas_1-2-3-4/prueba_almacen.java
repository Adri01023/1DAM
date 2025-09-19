package EjerciciosTema2;

public class prueba_almacen {
	public static void main(String[] args) {
		Almacen hola = new Almacen("Pera", "Marruecos", 5, 2.12, 3);
		Almacen hola2 = new Almacen("Pera", "Portugal", 5, 2.12, 3);
		System.out.println(hola.getcarga());	
		System.out.println(hola.vender(3));
		System.out.println(hola.beneficio());
		System.out.println(hola.vender(1.5));
		System.out.println(hola.beneficio());
		System.out.println(hola2.getcarga());
		System.out.println(hola.comparaProcedencia(hola2));
	}
}
