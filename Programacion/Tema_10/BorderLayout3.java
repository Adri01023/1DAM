package ejercicio_tema10;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;
public class BorderLayout3 {
	public static void main(String[] args) {
		JFrame ventana = new JFrame("Ventana BorderLayout");
		ventana.setSize(400, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		ventana.setLayout(new BorderLayout());
		ventana.add(new JButton("Norte"), BorderLayout.NORTH);
		ventana.add(new JButton("Sur"), BorderLayout.SOUTH);
		ventana.add(new JButton("Este"), BorderLayout.EAST);
		ventana.add(new JButton("Oeste"), BorderLayout.WEST);
		ventana.add(new JButton("Centro"), BorderLayout.CENTER);
	}
}
