package Proyecto_Adrian_Martin;

import javax.swing.*;
import java.awt.*;
import java.util.regex.Pattern;

public class PanelMultasConsultas extends JPanel {
    Control control;
    public PanelMultasConsultas(Control control1) {
        control = control1;
        mostrarOpciones();
    }

    /**
     * Metodo que muestra en el JPanel las opciones haciendo uso de un GridBagConstraints principalmente
     */

    public void mostrarOpciones() {
        setLayout(new BorderLayout(0,20));
        setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        //Label Menu Principal
        JLabel titulo = new JLabel("Menú Consultar Multas", SwingConstants.CENTER);
        titulo.setFont(new Font("Tahoma", Font.BOLD, 18));
        add(titulo, BorderLayout.NORTH);
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        JButton dni_o_nombre = new JButton("Por DNI o Nombre");
        dni_o_nombre.addActionListener(e -> {
            String opcion_dni_o_nombre = JOptionPane.showInputDialog("Introduce el DNI o nombre");
            if (opcion_dni_o_nombre != null && !opcion_dni_o_nombre.isEmpty()) {
                String dni_valida = "^[0-9]{8}[A-Z]$";
                String tipoConsulta = Pattern.matches(dni_valida, opcion_dni_o_nombre.toUpperCase()) ?
                        "consultadnimultas" : "consultanombremultas";
                Consultas consulta = new Consultas(control, opcion_dni_o_nombre, tipoConsulta);
                if (consulta.hayDatos()) {
                    control.frame.setSize(1200, 700);
                    control.frame.setLocationRelativeTo(null);
                } else {
                    control.frame.setSize(400, 300);
                    control.frame.setLocationRelativeTo(null);
                    JOptionPane.showMessageDialog(null, "No hay multas asignadas a esa consulta");
                }
            }
        });
        panelPrincipal.add(dni_o_nombre, gbc);
        JButton por_matricula = new JButton("Por Matrícula");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        por_matricula.addActionListener(e -> {
            String opcion_matricula = JOptionPane.showInputDialog("Introduce la matrícula");
            String mat_valida = "^[0-9]{4}[A-Z]{3}$";
            if (opcion_matricula != null && Pattern.matches(mat_valida, opcion_matricula.toUpperCase())) {
                Consultas panel = new Consultas(control, opcion_matricula, "consultamatriculamultas");
                if (panel.hayDatos()) {
                  control.frame.setSize(1200, 700);
                  control.frame.setLocationRelativeTo(null);
                } else {
                    control.frame.setSize(400, 300);
                    control.frame.setLocationRelativeTo(null);
                    JOptionPane.showMessageDialog(this, "No hay multas asignadas a la matrícula " + opcion_matricula.toUpperCase());
                }
            } else {
                JOptionPane.showMessageDialog(this, "Introduce una matrícula valida");
            }
        });
        panelPrincipal.add(por_matricula, gbc);
        JButton salir = new JButton("Atras");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        salir.addActionListener(e -> control.cambiarPanel(new PanelMultas(control)));
        panelPrincipal.add(salir, gbc);
        add(panelPrincipal, BorderLayout.CENTER);
    }
}
