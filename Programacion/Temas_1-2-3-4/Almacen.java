package EjerciciosTema2;

public class Almacen {
	private String nombre_f, procedencia;
	private double n_kilos, precio_kg, precio_ventakg, beneficio;
	public Almacen(String nombre_f, String procedencia, double n_kilos, double precio_kg, double precio_ventakg) {
		this.nombre_f = nombre_f;
		this.procedencia = procedencia;
		this.n_kilos = n_kilos;
		this.precio_kg = precio_kg;
		this.precio_ventakg = precio_ventakg;
	}
	public String getcarga() {
		return "El nombre de fruta es " + nombre_f + " su pais de procedencia es " + procedencia + " el número de kilos es " + n_kilos + " el precio de coste por kilo ha sido " + precio_kg + "€ y su precio de venta es " + precio_ventakg + "€";
	}
	public void rebajar(double precio_ventakg) {
		if (precio_ventakg < this.precio_kg) {
			System.out.println("Precio de venta inválido");
		} else {
			this.precio_ventakg = precio_ventakg;
		}
	}
	public String vender(double n_kilos) {
		if (this.n_kilos < n_kilos) {
			return "Error, vuelva a introducir otros datos";
		} else {
			this.beneficio += n_kilos * (this.precio_ventakg - this.precio_kg);
			this.n_kilos -= n_kilos;
			return "El beneficio de la venta ha sido de " + n_kilos * (this.precio_ventakg - this.precio_kg) + "€";
		}
	}
	public String beneficio() {
		return "El beneficio de las ventas por el momento es: " + beneficio + "€";
	}
	public boolean comparaProcedencia(Almacen h1) {
		return this.procedencia.equals(h1.getProcedencia());
	}
	public String getNombre_f() {
		return nombre_f;
	}
	public void setNombre_f(String nombre_f) {
		this.nombre_f = nombre_f;
	}
	public String getProcedencia() {
		return procedencia;
	}
	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}
	public double getN_kilos() {
		return n_kilos;
	}
	public void setN_kilos(double n_kilos) {
		this.n_kilos = n_kilos;
	}
	public double getPrecio_kg() {
		return precio_kg;
	}
	public void setPrecio_kg(double precio_kg) {
		this.precio_kg = precio_kg;
	}
	public double getPrecio_ventakg() {
		return precio_ventakg;
	}
	public void setPrecio_ventakg(double precio_ventakg) {
		this.precio_ventakg = precio_ventakg;
	}
	public double getBeneficio() {
		return beneficio;
	}
	public void setBeneficio(double beneficio) {
		this.beneficio = beneficio;
	}
	
}
