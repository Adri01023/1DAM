package EjerciciosTema2;

public class prueba_Empleados {
	public static void main(String[] args) {
		Empleados hola = new Empleados("Manolo" , 646739478);
		Empleados hola3 = new Empleados("Manolo" , 646739474);
		System.out.println(hola.equals(hola3));
		hola.copia(hola3);
		System.out.println(hola3.equals(hola));
		System.out.println(hola3.getEmpleados());
		System.out.println(hola.toString());
	}
}
