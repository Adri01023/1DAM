package ejercicio_tema10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ventana_2 {
	public static void main(String[] args) {
		JFrame ventana = new JFrame("Ventana con Botón");
		ventana.setSize(400, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLayout(null);
		JButton boton = new JButton("Saluda");
		boton.setBounds(130, 100, 140, 40);
		boton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hola, bienvenido");
			}
		});
		ventana.add(boton);
		ventana.setVisible(true);
	}
}