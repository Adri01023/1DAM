package EjerciciosTema2;
import java.util.Random;
public class Numero {
			int n;
		public Numero(int n) {
			this.n = n;
		}
		public int anade(int suma) {
			return n += suma;
		}
		public int resta(int resta) {
			return n -= resta;
		}
		public int getValor() {
			return n;
		}
		public int getDoble() {
			return n*2;
		}
		public int getTriple() {
			return n*3;
		}
		public void setNumero(int n) {
			this.n = n;
		}
		public void setRandom() {
			Random randomNumbers = new Random();
			n = randomNumbers.nextInt(50);
		}
}