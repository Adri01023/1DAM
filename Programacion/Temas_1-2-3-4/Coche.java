package EjerciciosTema2;


public class Coche {
		/*String marca = "Opel" , modelo = "Astra";
		public Coche(String mc, String ml) {
			marca =mc;
			modelo = ml;
		}
		public Coche(){
			
		}*/
	int velocidad;
	public int getvelocidad() {
		return velocidad;
	}
	public void setvelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	public void acelera(int incremento) {
		velocidad += incremento;
	}
	public void frena(int decremento) {
		velocidad -= decremento;
	}
}