package Proyecto_Adrian_Martin;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.Vector;

public class PanelResultadoConsultas extends JPanel {
    JLabel datosPersonales;
    Control control;
    JTable tabla;
    ArrayList<ArrayList<String>> filascsv;
    ArrayList<Vector<Object>> filas;
    ArrayList<String> columnas;
    DefaultTableModel modeloTabla;
    String nombrefichero;
    PanelResultadoConsultas(Control control1, JLabel datosPersonales1, ArrayList<String> columns, ArrayList<Vector<Object>> rows, String nombrefich, ArrayList<ArrayList<String>> filascsv1) {
        control = control1;
        filas = rows;
        filascsv = filascsv1;
        columnas = columns;
        datosPersonales = datosPersonales1;
        nombrefichero = nombrefich;
        presentarTabla();
        cargarTabla();
    }

    /**
     * Metodo que presenta el esqueleto de la ventana que esta compuesto por:
     * labelDatosPersonales que indica el nombre y dni del propietario,
     * boton Generar documento CSV,
     * boton Atras
     */

    public void presentarTabla() {
        modeloTabla = new DefaultTableModel();
        tabla = new JTable(modeloTabla);
        setLayout(new BorderLayout());
        JPanel panelBotones = new JPanel();
        JButton btnGenerar = new JButton("Generar documento CSV");
        btnGenerar.addActionListener(e -> {
            GeneraCSV generardoc = new GeneraCSV(nombrefichero, columnas, filascsv);
            if (generardoc.ficherocreado) {
                JOptionPane.showMessageDialog(this, "Fichero generado correctamente en la ruta: " + generardoc.archivo.getAbsolutePath());
            } else {
                JOptionPane.showMessageDialog(this, "Error al generar el fichero");
            }
        });

        // Botón Atras
        JButton atras = new JButton("Atrás");
        atras.addActionListener(e -> {
            control.frame.setSize(400, 300);
            control.frame.setLocationRelativeTo(null);
            if (nombrefichero.startsWith("Multas")) control.cambiarPanel(new PanelMultasConsultas(control));
            else control.cambiarPanel(new PanelConsultas(control));
        });
        panelBotones.add(datosPersonales);
        panelBotones.add(atras);
        panelBotones.add(btnGenerar);
        add(panelBotones, BorderLayout.NORTH);
        add(new JScrollPane(tabla), BorderLayout.CENTER);
        control.frame.setSize(1200, 700);
        control.frame.setLocationRelativeTo(null);
    }

    /**
     * Metodo que utiliza los arrays pasados por parametro de la clase Consultas para rellenar la tabla
     */

    public void cargarTabla() {
        modeloTabla.setRowCount(0);
        modeloTabla.setColumnCount(0);
        for (int i = 0; i < columnas.size(); i++) {
            modeloTabla.addColumn(columnas.get(i));
        }
        for (Vector<Object> fila : filas) {
            modeloTabla.addRow(fila);
        }
        tabla.setRowHeight(25);
    }
}
