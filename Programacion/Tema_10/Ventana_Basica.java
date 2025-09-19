package ejercicio_tema10;

import javax.swing.JFrame;

public class Ventana_Basica {
	public static void main(String[] args) {
		JFrame ventana = new JFrame("Ventana Basica");
		ventana.setSize(400, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
	}
}
