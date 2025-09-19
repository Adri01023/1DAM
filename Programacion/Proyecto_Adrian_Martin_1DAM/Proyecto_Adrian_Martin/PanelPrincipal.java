package Proyecto_Adrian_Martin;

import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {
    Control control;
    public PanelPrincipal(Control control1) {
        control = control1;
        mostrarPrincipal();
    }

    /**
     * Metodo que muestra en el JPanel las opciones haciendo uso de un GridBagConstraints principalmente
     */

    public void mostrarPrincipal() {
        setLayout(new BorderLayout(0,20));
        setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        //Label Menu Principal
        JLabel titulo = new JLabel("Menú Principal", SwingConstants.CENTER);
        titulo.setFont(new Font("Tahoma", Font.BOLD, 18));
        add(titulo, BorderLayout.NORTH);
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        //Botón Consultar Datos
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        JButton consultas = new JButton("Consultar Datos");
        consultas.addActionListener(e -> {
            control.cambiarPanel(new PanelConsultas(control));
        });
        panelPrincipal.add(consultas, gbc);
        //Botón Multas
        JButton multas = new JButton("Multas");
        multas.addActionListener(e -> {
            control.cambiarPanel(new PanelMultas(control));
        });
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        panelPrincipal.add(multas, gbc);
        //Botón Salir al Login
        JButton salir = new JButton("Salir al Login");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        salir.addActionListener(e -> {
            control.cambiarPanel(new PanelLogin(control));
        });
        panelPrincipal.add(salir, gbc);
        add(panelPrincipal, BorderLayout.CENTER);
    }
}
