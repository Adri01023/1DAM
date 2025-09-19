package Ejercicios_Tema_7;

public class EdadNoValidaException extends Exception {
	String n;
    public EdadNoValidaException(String mensaje) {
        n = mensaje;
    }
}
