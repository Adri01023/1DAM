package ejercicio_tema10;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Calculadora extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JTextField display;
	private double num1, num2, resultado;
	private char operador;
	private boolean borraDisp = false;
	private final String CUA = "x\u00B2", RAIZ = "\u221A"; //Codigo Unicode para simbolizar elevar al cuadrado y raiz cuadrada
	public Calculadora() {
		setTitle("Calculadora");
		setSize(300,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		display = new JTextField();
		display.setEditable(false);
		display.setFont(new Font("ARIAL", Font.BOLD, 20));
		display.setHorizontalAlignment(JTextField.RIGHT);
		add(display, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(5, 4, 8, 8)); //Filas, Columnas, Espacio entre ellas
		
		String botones[] = {
				"7", "8", "9", "C",
				"4", "5", "6", "+",
				"1", "2", "3", "-",
				" ", "0", ".", "*",
				CUA, RAIZ, "=", "/"
		};
		
		for (String string : botones) {
			JButton boton = new JButton(string);
			boton.setFont(new Font("Arial", Font.BOLD, 18));
			boton.setPreferredSize(new Dimension(50,50));
			boton.addActionListener(this);
			panel.add(boton);
		}
		add(panel, BorderLayout.CENTER);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		
		if (comando.charAt(0) >= '0' && comando.charAt(0) <= '9') {
			if (borraDisp) {
				display.setText(comando);
				num2 = resultado = 0;
				borraDisp = false;
			} else display.setText(display.getText() + comando);
		} else if (comando.equals("C")) {
			display.setText("");
			num1 = num2 = resultado = 0;
		} else if (comando.equals("=")) {
			num2 = display.getText().length() != 0 ? Double.parseDouble(display.getText()) : 0;
			switch (operador) {
			case '+': resultado = num1 + num2; break;
			case '-': resultado = num1 - num2; break;
			case '*': resultado = num1 * num2; break;
			case '/': resultado = num2 != 0 ? num1 / num2 : 0; break;
			}
			display.setText(String.valueOf(resultado));
			num1 = resultado;
			borraDisp = true;
		} else operacion(comando);
	}
	
	private void operacion(String comando) {
		boolean d = true;
		num1 = Double.parseDouble(display.getText());
		switch (comando) {
		case CUA: resultado = num1*num1; break;
		case RAIZ: resultado = Math.sqrt(num1); break;
		case ".": if(!display.getText().contains(comando)) display.setText(display.getText() + ".");
		case " ": d = false; break;
		default: operador = comando.charAt(0);
			display.setText("");
			d = false;
		}
		if(d) display.setText(String.valueOf(resultado));
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			new Calculadora().setVisible(true);
		});
	}
}
