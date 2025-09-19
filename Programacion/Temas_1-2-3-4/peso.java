package EjerciciosTema2;

public class peso {
	String m;
	double p;
	public peso(double p, String m) {
		this.m = m.toUpperCase();
	}
	public double convertirPeso(String c) {
		c = c.toUpperCase();
		switch (c) {
		case "LB":
			switch (m) {
			case "LB":
				return p;
			case "LI":
				return p * 0.03;
			case "OZ":
				return p * 16;
			case "K":
				return p * 0.45;
			case "G":
				return p * 453.6;
			case "P":
				return p / 0.003;
			}
		case "LI":
			switch (m) {
			case "LB":
				return p * 32.17;
			case "LI":
				return p;
			case "OZ":
				return p / 0.001;
			case "K":
				return p * 0.45;
			case "G":
				return p * 453.6;
			case "P":
				return p / 0.003;
			default:
				break;
			}
			break;

		default:
			break;
		}
		return p;
	}
}
