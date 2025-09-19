package ejercicio_tema10;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelInteractivo4 {
	
	public static void main(String[] args) {
		JFrame ventana = new JFrame("Ventana Basica");
		ventana.setSize(400, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		JLabel etiqueta = new JLabel("Haz click en mi");
		ventana.setLayout(null);
		etiqueta.setFont(new Font("MONOSPACED", 1, 17));
		etiqueta.setBounds(100, 80, 150, 30);
		etiqueta.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				etiqueta.setText("Has hecho click");
			}
			public void mouseEntered(MouseEvent e) {
				etiqueta.setForeground(Color.red);
			}
			public void mouseExited(MouseEvent e) {
				etiqueta.setForeground(Color.blue);
			}
		});
		ventana.add(etiqueta);
	}
	
}
