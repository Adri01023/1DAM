package Ejercicios_Tema_6;

public class Pelicula extends Multimedia {
	String actor, actriz;
	public Pelicula(String t, String a, Formato f, double d, String ar, String az) {
		super(t, a, f, d);
		actor = ar;
		actriz = az;
		}
	public Pelicula(String t, String a, Formato f, double d, String ar) {
		super(t, a, f, d);
		actor = ar;
		}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getActriz() {
		return actriz;
	}
	public void setActriz(String actriz) {
		this.actriz = actriz;
	}
@Override
	public String toString() {
	if (actriz == null) return "El nombre de la película es " + titulo + " su actor/actriz principal es " + actor + " y su duracion es de " + duracion;
	else return "El nombre de la película es " + titulo + " sus actores principales son " + actor + " y " + actriz + " y su duracion es de " + duracion;
}
}
