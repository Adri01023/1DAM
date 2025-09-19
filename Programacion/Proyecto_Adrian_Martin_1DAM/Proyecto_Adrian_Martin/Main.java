package Proyecto_Adrian_Martin;

import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> {
                Control control = new Control();
                control.mostrarLogin();
        });
    }
}