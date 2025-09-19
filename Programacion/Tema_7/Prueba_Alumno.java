package Ejercicios_Tema_7;

public class Prueba_Alumno {
	public static void main(String[] args) {
        try {
            Alumno alumno = new Alumno("Juan", -1, 8.5);
            System.out.println(alumno);
        } catch (EdadNoValidaException e) {
            System.out.println("Excepción Edad Menor que 0");
        }
    }
}
