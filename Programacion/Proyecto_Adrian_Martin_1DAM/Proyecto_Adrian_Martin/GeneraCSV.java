package Proyecto_Adrian_Martin;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

public class GeneraCSV {
    String fichero;
    File archivo;
    ArrayList<String> columnas;
    boolean ficherocreado = false;
    ArrayList<ArrayList<String>> filas;
    public GeneraCSV(String nombrefichero , ArrayList<String> columnas1, ArrayList<ArrayList<String>> filas1) {
        fichero = nombrefichero;
        columnas = columnas1;
        filas = filas1;
        archivo = new File(fichero);
        try {
            escribeCSV();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     * Metodo que mediante PrintWriter y los arrays generados en Consultas escribe en un fichero csv la informacion
     */
    public void escribeCSV() throws SQLException {
        try {
        if (archivo.exists()) archivo.delete();
        PrintWriter escribir = new PrintWriter(new FileWriter(archivo));
            for (int i = 0; i < columnas.size(); i++) {
                escribir.print(columnas.get(i));
                if (i < columnas.size() - 1) escribir.print(";");
            }
            for (int i = 0; i < filas.size(); i++) {
                escribir.println();
                for (int j = 0; j < filas.get(i).size(); j++) {
                    escribir.print(filas.get(i).get(j));
                    if (j < filas.get(i).size() - 1) escribir.print(";");
                }
            }
            escribir.close();
            ficherocreado = true;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
