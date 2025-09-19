package Proyecto_Adrian_Martin;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class PanelPonerMulta extends JPanel {
    public Control control;
    String mat;
    ResultSet resultSet;
    public JTextField textomatricula;
    public JComboBox descripcion;
    public PanelPonerMulta(Control control1) {
        control = control1;
        mostrarOpciones();
    }

    /**
     * Metodo que muestra en el JPanel las opciones haciendo uso de un GridBagConstraints principalmente
     */

    public void mostrarOpciones() {
        control.frame.setSize(1200, 700);
        control.frame.setLocationRelativeTo(null);
        setLayout(new BorderLayout(0, 20));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel titulo = new JLabel("Asignar Multa", SwingConstants.CENTER);
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
        formPanel.add(new JLabel("Matrícula del infractor:"), gbc);

        gbc.gridx = 1;
        gbc.weightx = 1.0;
        textomatricula = new JTextField(10);
        formPanel.add(textomatricula, gbc);

        // Contraseña
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 0.3;
        formPanel.add(new JLabel("Descripción de la multa:"), gbc);

        gbc.gridx = 1;
        gbc.weightx = 1.0;
        descripcion = new JComboBox<>();
        formPanel.add(descripcion, gbc);

        cargarDescripciones();

        // Botón
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.weightx = 1.0;
        JButton btnAcceso = new JButton("Poner Multa");
        btnAcceso.setPreferredSize(new Dimension(0, 35)); // Altura fija
        formPanel.add(btnAcceso, gbc);
        add(formPanel, BorderLayout.CENTER);
        btnAcceso.addActionListener(e -> {
            String mat_valida = "^[0-9]{4}[A-Z]{3}$";
            mat = textomatricula.getText().toUpperCase();
            if (mat.matches(mat_valida)) insertarMulta();
            else JOptionPane.showMessageDialog(this,"Introduce una matrícula valida");
        });
        JButton salir = new JButton("Atrás");
        salir.setPreferredSize(new Dimension(0, 35));
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        salir.addActionListener(e -> {
                control.frame.setSize(400, 300);
                control.frame.setLocationRelativeTo(null);
                control.cambiarPanel(new PanelMultas(control));
        });
        formPanel.add(salir, gbc);
    }

    /**
     * Metodo para cargar el JComboBox con las descripciones, las cuales están almacenadas en la base de datos y son cargadas mediante una query.
     */

    public void cargarDescripciones() {
        Base_de_Datos bd1 = new Base_de_Datos(control.getUser(), control.getPass());
        try (Connection conexion = DriverManager.getConnection(bd1.URLAux, control.getUser(), control.getPass())) {
            PreparedStatement statement = conexion.prepareStatement("select descripcion from sanciones;");
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                descripcion.addItem(resultSet.getString("descripcion"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }

    /**
     * Metodo para insertar la multa, primero verifica que exista la matricula
     * Luego en funcion de la descripcion escogida se hace la consulta para sacar el codigo de la multa y realizar la insercion.
     */

    public void insertarMulta() {
        String cod;
        Boolean existe = false;
        String desc = descripcion.getSelectedItem().toString();
        Base_de_Datos bd1 = new Base_de_Datos(control.getUser(), control.getPass());
        try (Connection conexion = DriverManager.getConnection(bd1.URLAux,control.getUser(),control.getPass())) {
            String sql = "SELECT matricula FROM propietarios WHERE matricula = ?";
            PreparedStatement stmt = conexion.prepareStatement(sql); {
                stmt.setString(1, mat);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) existe = true;
                 else JOptionPane.showMessageDialog(this, "La matrícula no existe en la base de datos");
            }
                if (existe) {
                    stmt = conexion.prepareStatement("select codigo from multas_a_vehiculos mv join sanciones sa on mv.codSancion = sa.codigo where descripcion like '%" + desc + "%';");
                    ResultSet rs2 = stmt.executeQuery();
                    rs2.next();
                    cod = rs2.getString(1);
                    Statement statement = conexion.createStatement();
                    statement.executeUpdate("INSERT INTO multas_a_vehiculos VALUES ('" + cod + "','" + mat + "',CURDATE())");
                    JOptionPane.showMessageDialog(this, "Multa asignada con éxito");
                }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
