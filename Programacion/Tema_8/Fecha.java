package Ejercicios_tema8;

import java.io.Serializable;

public class Fecha implements Serializable {
	int dia, mes, año;
	Fecha(int d, int m, int a) {
		dia = d;
		mes = m;
		año = a;
	}
@Override
	public String toString() {
	return dia + "/" + mes + "/" + año;
}
}