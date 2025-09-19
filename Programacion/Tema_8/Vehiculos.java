package Ejercicios_tema8;

import java.io.Serializable;

public class Vehiculos implements Serializable {
	String matricula;
	Integer caballos, km;
	public static int ida = 0;
	int id;
	Vehiculos(String m, Integer c, Integer k) {
		matricula = m;
		caballos = c;
		km = k;
		ida++;
		id = ida;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Integer getCaballos() {
		return caballos;
	}
	public void setCaballos(Integer caballos) {
		this.caballos = caballos;
	}
	public Integer getKm() {
		return km;
	}
	public void setKm(Integer km) {
		this.km = km;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
