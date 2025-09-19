package Ejercicios_Tema_6;

public class Multimedia {
	public enum Formato{
		wav, mp3, midi, avi, mov, mpg, cdAudio,  dvd
	}
	String titulo, autor;
	Formato formato;
	double duracion;
	public Multimedia(String t, String a, Formato f, double d) {
		titulo = t;
		autor = a;
		formato = f;
		duracion = d;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Formato getFormato() {
		return formato;
	}
	public void setFormato(Formato formato) {
		this.formato = formato;
	}
	public double getDuracion() {
		return duracion;
	}
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
@Override
	public String toString() {
		return "El título es " + titulo + " su autor se llama " + autor + " está en formato " + formato + " y tiene una duración de " + duracion;
}
	public boolean equals(Multimedia m) {
		if (m.autor == autor && m.titulo == titulo) {
			return true;
		} else return false;
	}
}
