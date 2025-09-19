package Proyecto_Adrian_Martin;

import javax.swing.*;
import java.awt.*;

public class Control {
    JFrame frame;

    String user, pass;
    /**
     * Metodo para obtener el usuario
     * Se invoca cada vez que se requiere acceder a la Base de Datos.
     */
    public String getUser() {
        return user;
    }
    /**
     * Metodo para obtener la contraseña
     * Se invoca cada vez que se requiere acceder a la Base de Datos.
     */
    public String getPass() {
        return pass;
    }
    /**
     * Metodo para establecer el usuario
     * Se invoca en el PanelLogin cuando las credenciales que ha introducido el usuario son correctas.
     */
    public void setUser(String user) {
        this.user = user;
    }
    /**
     * Metodo para establecer la contraseña del usuario
     * Se invoca en el PanelLogin cuando las credenciales que ha introducido el usuario son correctas.
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    public Control() {
        configurarFrame();
        frame.setVisible(true);
    }

    /**
     * Metodo para inicializar el frame para ponerlo con el tamaño y estilo deseados
     */

    public void configurarFrame() {
        frame = new JFrame("Mi App - Adrian Martin Morales");
        ImageIcon icon = new ImageIcon("images.jpeg");
        frame.setIconImage(icon.getImage());
        frame.add(new JLabel(icon));
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * Inicializa el frame y le añade el Login como primer panel
     */
    public void mostrarLogin() {
        frame.add(new PanelLogin(this));
    }
    /**
     * Metodo usado para navegar entre los distintos paneles
     */
    public void cambiarPanel(JPanel nuevoPanel) {
        frame.getContentPane().removeAll();
        frame.add(nuevoPanel);
        frame.revalidate();
        frame.repaint();
    }
}
