package Ejercicios_Tema_7;

public class Excepcion_Ejercicio6 {
	public static void main(String[] args) {
        try {
            throw new Exception("Este es un mensaje de error");
        } catch (Exception e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        } finally {
            System.out.println("Este mensaje siempre se muestra, pase lo que pase.");
        }
    }
}
