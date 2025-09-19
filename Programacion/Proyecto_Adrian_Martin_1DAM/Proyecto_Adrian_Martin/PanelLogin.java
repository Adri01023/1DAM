package Proyecto_Adrian_Martin;

import javax.swing.*;
import java.awt.*;

public class PanelLogin extends JPanel {
    public Control control;
    public JTextField usuario;
    public JPasswordField password;
    public PanelLogin(Control control1) {
        control = control1;
        crearLogin();
    }

    /**
     * Metodo que muestra en el JPanel las opciones haciendo uso de un GridBagConstraints principalmente
     */

    public void crearLogin() {
        setLayout(new BorderLayout(0, 20));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        JLabel titulo = new JLabel("Aplicación DGT", SwingConstants.CENTER);
        titulo.setFont(new Font("Tahoma", Font.BOLD, 18));
        add(titulo, BorderLayout.NORTH);
        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        // Usuario
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0.3;
        formPanel.add(new JLabel("Usuario:"), gbc);
        gbc.gridx = 1;
        gbc.weightx = 1.0;
        usuario = new JTextField(10);
        formPanel.add(usuario, gbc);
        // Contraseña
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 0.3;
        formPanel.add(new JLabel("Contraseña:"), gbc);
        gbc.gridx = 1;
        gbc.weightx = 1.0;
        password = new JPasswordField(10);
        formPanel.add(password, gbc);
        // Botón
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.weightx = 1.0;
        JButton btnAcceso = new JButton("Acceder");
        btnAcceso.setPreferredSize(new Dimension(0, 35)); // Altura fija
        formPanel.add(btnAcceso, gbc);

        add(formPanel, BorderLayout.CENTER);
        btnAcceso.addActionListener(e -> validarLogin());
    }

    /**
     * Metodo que valida si el usuario y contraseña introducidos corresponden a los de un usuario existente en el sistema gestor de bases de datos.
     * Una vez validado se almacena el usuario y contraseña en Control y se permite la entrada a la aplicacion
     */

    public void validarLogin() {
        String tuser = usuario.getText();
        String tcontrasena = password.getText();
        Base_de_Datos bd1 = new Base_de_Datos(tuser, tcontrasena);
        if (bd1.URL.equals("exito")) {
            JOptionPane.showMessageDialog(this, "Usuario autenticado correctamente");
            bd1.crearBD();
            control.setUser(tuser);
            control.setPass(tcontrasena);
            control.cambiarPanel(new PanelPrincipal(control));
        } else {
            JOptionPane.showMessageDialog(this, "Credenciales incorrectas", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}