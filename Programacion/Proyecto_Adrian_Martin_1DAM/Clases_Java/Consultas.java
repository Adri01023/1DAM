package Proyecto_Adrian_Martin;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Vector;

public class Consultas {
    String param, tipoconsulta, sql, nombrefich;
    ResultSet resultSet;
    StringBuilder sb = new StringBuilder();
    JLabel labelDatosPersonales = new JLabel();
    Control control;
    ArrayList<String> fila;
    ArrayList<String> columnas = new ArrayList<>();
    ArrayList<ArrayList<String>> filas = new ArrayList<>();
    ArrayList<Vector<Object>> vectores = new ArrayList<>();

    Consultas(Control control1, String param1, String tipoconsulta1) {
        control = control1;
        param = param1;
        tipoconsulta = tipoconsulta1;
        buscarConsulta();
        obtenerNombreApellidos();
        nombrefich = sb.toString().replace(" ", "_");
        if (hayDatos()) {
            PanelResultadoConsultas panel = new PanelResultadoConsultas(control, labelDatosPersonales, columnas, vectores, nombrefich, filas);
            control.cambiarPanel(panel);
        }
    }

    /**
     * Metodo para seleccionar la query adecuada segun los parametros recibidos
     * Ejecuta al final el metodo cargarDatos(String query)
     */

    public void buscarConsulta() {
        switch (tipoconsulta) {
            case "consultadnimultas":
                sql = "select mv.matricula, sa.descripcion, sa.rango, sa.importe, sa.retiradaCarnet, mv.fecha from multas_a_vehiculos mv join sanciones sa join propietarios pr join personas pe on mv.codSancion = sa.codigo and mv.matricula = pr.matricula and pr.DNI = pe.DNI where pr.DNI like '"+param+"' order by mv.fecha desc;";
                sb.append("Multas_");
                break;
            case "consultanombremultas":
                sql = "select mv.matricula, sa.descripcion, sa.rango, sa.importe, sa.retiradaCarnet, mv.fecha from multas_a_vehiculos mv join sanciones sa join propietarios pr join personas pe on mv.codSancion = sa.codigo and mv.matricula = pr.matricula and pr.DNI = pe.DNI where concat(pe.nombre,' ',pe.apellido1,' ',pe.apellido2) like (select concat(pe.nombre,' ',pe.apellido1,' ',pe.apellido2) from personas pe where concat(pe.nombre,' ',pe.apellido1,' ',pe.apellido2) like '%" + param + "%' order by mv.fecha desc LIMIT 1);";
                sb.append("Multas_");
                break;
            case "consultamatriculamultas":
                sql = "select mv.matricula, sa.descripcion, sa.rango, sa.importe, sa.retiradaCarnet, mv.fecha from multas_a_vehiculos mv join sanciones sa join propietarios pr join personas pe on mv.codSancion = sa.codigo and mv.matricula = pr.matricula and pr.DNI = pe.DNI where pr.matricula like '"+param+"' order by mv.fecha desc;";
                sb.append("Multas_");
                break;
            case "consultadni":
                sql = "select au.matricula, au.marca, au.modelo, au.FechaPermisoCirculacion from automoviles au join propietarios pr join personas pe on au.matricula = pr.matricula and pr.DNI = pe.DNI where pe.DNI like '"+ param + "' order by au.marca;";
                sb.append("Vehiculos_");
                break;
            case "consultanombre":
                sql = "select au.matricula, au.marca, au.modelo, au.FechaPermisoCirculacion from automoviles au join propietarios pr join personas pe on au.matricula = pr.matricula and pr.DNI = pe.DNI where concat(pe.nombre,' ',pe.apellido1,' ',pe.apellido2) like (select concat(pe.nombre,' ',pe.apellido1,' ',pe.apellido2) from personas pe where concat(pe.nombre,' ',pe.apellido1,' ',pe.apellido2) like '%" + param + "%' order by au.marca LIMIT 1);";
                sb.append("Vehiculos_");
                break;
            case "consultamatricula":
                sql = "select pe.direccion, pe.ciudad, pe.telefono, au.matricula, au.marca, au.modelo, au.FechaPermisoCirculacion from personas pe join propietarios pr join automoviles au on au.matricula = pr.matricula and pr.DNI = pe.DNI where au.matricula like '" + param.toUpperCase() + "' order by au.marca;";
                sb.append("Datos_");
                break;
        }
        cargarDatos(sql);
    }

    /**
     * Metodo para rellenar los distintos arrays con los datos de la consulta
     * Estos arrays seran pasados a PanelResultadoConsultas para su presentacion en una tabla y la generación de csv correspondiente
     */

    public void cargarDatos(String query) {
        Base_de_Datos bd1 = new Base_de_Datos(control.getUser(),control.getPass());
        try (Connection conexion = DriverManager.getConnection(bd1.URLAux, control.getUser(), control.getPass())) {
            PreparedStatement statement = conexion.prepareStatement(query);
            resultSet = statement.executeQuery();
            int cuentaColumn = resultSet.getMetaData().getColumnCount();
                for (int i = 1; i <= cuentaColumn; i++) {
                    columnas.add(resultSet.getMetaData().getColumnName(i));
                }
            while (resultSet.next()) {
                Vector<Object> vector = new Vector<>();
                fila = new ArrayList<String>();
                for (int i = 1; i <= cuentaColumn; i++) {
                    vector.add(resultSet.getObject(i));
                    fila.add(resultSet.getString(i).replace(",", " "));
                }
                filas.add(fila);
                vectores.add(vector);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Metodo para obtener los datos de la persona consultada
     * Estos se usaran en un label y para formar el nombre del fichero csv correspondiente
     */

    public void obtenerNombreApellidos() {
        Calendar fecha = Calendar.getInstance();
        switch (tipoconsulta) {
            case "consultadnimultas":
            case "consultadni":
                sql = "select nombre, apellido1, apellido2, DNI from personas where dni = '" + param + "';";
                break;
            case "consultanombremultas":
            case "consultanombre":
                sql = "select nombre, apellido1, apellido2, DNI from personas where concat(nombre,' ',apellido1,' ',apellido2) like '%"+ param.toUpperCase() +"%';";
                break;
            case "consultamatriculamultas":
            case "consultamatricula":
                sql = "select nombre, apellido1, apellido2, pe.DNI as DNI from personas pe join propietarios pr on pe.DNI = pr.DNI where matricula like '" + param.toUpperCase() + "';";
                break;
        }
        Base_de_Datos bd1 = new Base_de_Datos(control.getUser(), control.getPass());
        try (Connection conexion = DriverManager.getConnection(bd1.URLAux, control.getUser(), control.getPass())) {
            PreparedStatement statement = conexion.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                String nombre = rs.getString("nombre");
                String apellido1 = rs.getString("apellido1");
                String apellido2 = rs.getString("apellido2");
                String dni = rs.getString("DNI");
                sb.append(nombre + "_" + apellido1 + "_" + apellido2 + "_" + fecha.get(Calendar.YEAR) + "_0" + (fecha.get(Calendar.MONTH) + 1) + ".csv");
                if (tipoconsulta.equals("consultamatricula")) {
                    labelDatosPersonales.setText("Datos del propietario/a: " + nombre + " " + apellido1 + " " + apellido2 + " " + " DNI: " + dni);
                } else if (tipoconsulta.equals("consultamatriculamultas") || tipoconsulta.equals("consultadnimultas") || tipoconsulta.equals("consultanombremultas")){
                    labelDatosPersonales.setText("Multas a nombre de: " + nombre + " " + apellido1 + " " + apellido2 + " " + " DNI: " + dni);
                } else {
                    labelDatosPersonales.setText("Vehículos de: " + nombre + " " + apellido1 + " " + apellido2 + " " + " DNI: " + dni);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Metodo que comprueba si existen datos mediante el uso del metodo isEmpty() sobre un array
     */

    public boolean hayDatos() {
        return !filas.isEmpty();
    }
}
