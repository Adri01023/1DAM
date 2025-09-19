package Proyecto_Adrian_Martin;

import javax.swing.*;
import java.awt.*;

public class PanelMultas extends JPanel {
    Control control;
    public PanelMultas(Control control1) {
        control = control1;
        mostrarOpciones();
    }

    /**
     * Metodo que muestra en el JPanel las opciones haciendo uso de un GridBagConstraints principalmente
     */

    public void mostrarOpciones() {
        setLayout(new BorderLayout(0,20));
        setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        //Label Menu Multas
        JLabel titulo = new JLabel("Menú Multas", SwingConstants.CENTER);
        titulo.setFont(new Font("Tahoma", Font.BOLD, 18));
        add(titulo, BorderLayout.NORTH);
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        //Botón Poner Multas
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        JButton poner_multa = new JButton("Poner Multa");
        poner_multa.addActionListener(e -> {
            control.cambiarPanel(new PanelPonerMulta(control));
        });
        panelPrincipal.add(poner_multa, gbc);
        //Botón Consultar Multas
        JButton consultar_multas = new JButton("Consultar Multas");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        consultar_multas.addActionListener(e -> {
            control.cambiarPanel(new PanelMultasConsultas(control));
        });
        panelPrincipal.add(consultar_multas, gbc);
        //Botón Atras
        JButton salir = new JButton("Atras");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        salir.addActionListener(e -> {
            control.cambiarPanel(new PanelPrincipal(control));
        });
        panelPrincipal.add(salir, gbc);
        add(panelPrincipal, BorderLayout.CENTER);
    }
}
