package EjerciciosTema2;

public class Viaje {
	String c_origen, c_destino, codigo;
	double importe, n_adulto, n_nino, plazas, reservas;
	static double recaudacion;
	
	public Viaje(String c_origen, String c_destino, double importe, double n_adulto, double n_nino) {
		this.c_origen = c_origen;
		this.c_destino = c_destino;
		String sub1 = c_origen.substring(0, 2);
		String sub2 = c_destino.substring(0, 2);
		this.codigo = sub1 + sub2;
		this.codigo = this.codigo.toUpperCase();
		this.importe = importe;
		this.n_adulto = n_adulto;
		this.plazas = 200;
		this.n_nino = n_nino;
	}
	public String detalles() {
		return "La ciudad de origen es " + c_origen + " su ciudad destino es " + c_destino + " el codigo del vuelo es " + codigo + " el importe por viaje ha sido " + importe + "€ el número de adultos es " + n_adulto + " y el número de niños es " + n_nino;
	}
	public double setPlazas(double plazas) {
		return this.plazas -= plazas;
	}
	public double getPlazas() {
		return plazas;
	}
	public String reserva() {
		double descuento = (n_nino * importe) * 0.2;
		if (this.n_nino > 0 && this.n_adulto > 0 ) {
			setPlazas(n_nino + n_adulto);
			recaudacion += (this.n_adulto * this.importe) + ((n_nino * importe) - descuento );
			return "El importe a pagar por los billetes de los adultos es " + this.n_adulto * this.importe + "€ y el importe a pagar por los niños es de " +  ((n_nino * importe) - descuento )+ "€";
		} else if (this.n_nino > 0 && this.n_adulto == 0) {
			return "Como vas a dejar volar solo al niño";
		} else if (this.n_nino == 0 && this.n_adulto >0) {
			recaudacion += (this.n_adulto * this.importe);
			setPlazas(n_adulto);
			return "El importe a pagar por los billetes es de " + this.n_adulto * this.importe + "€";
		}
		return "";
	}
	public double modifica(double fran) {
		if ((plazas + fran) < 0 ) {
			return 0;
		} else {
			return setPlazas(-fran);
		}
	}
	public double getRecaudacion() {
		return recaudacion;
	}
	
}
