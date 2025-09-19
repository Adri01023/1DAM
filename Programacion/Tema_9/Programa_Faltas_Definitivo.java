package Ejercicios_Tema9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Programa_Faltas_Definitivo {
	static String url = "jdbc:mysql://localhost:3306/faltas_dam";
	static String usuario = "alumno";
public static void main(String[] args) {
	int num = 0;
	int numaux = 0;
	Scanner sc = new Scanner(System.in);
	while (num != 4) {
		System.out.println("\nMenú Faltas:");
		System.out.println("-----------------");
		System.out.println("1) Consultar faltas");
		System.out.println("2) Actualizar faltas");
		System.out.println("3) Consultar perdida de matricula");
		System.out.println("4) Salir \n");
		num = sc.nextInt();
		switch (num) {
		case 1: {
			System.out.println("\n1) Sistemas Informáticos");
			System.out.println("2) Programación");
			System.out.println("3) Bases de Datos");
			System.out.println("4) Entornos de Desarrollo");
			System.out.println("5) Lenguaje de Marcas");
			System.out.println("6) Computación en la nube");
			System.out.println("7) Todos");
			numaux = sc.nextInt();
			switch (numaux) {
			case 1: {
				query("Siste");
				break;
			}
			case 2: {
				query("Pro");
				break;
			}
			case 3: {
				query("Bases");
				break;
			}
			case 4: {
				query("Entor");
				break;
			}
			case 5: {
				query("Lengua");
				break;
			}
			case 6: {
				query("Computa");
				break;
			}
			case 7: {
				query("");
				break;
			}
			default: {
				System.out.println("Elige una opción válida");
				break;
			}
			}
			break;
		}
		case 2: {
			System.out.println("\n1) Sistemas Informáticos");
			System.out.println("2) Programación");
			System.out.println("3) Bases de Datos");
			System.out.println("4) Entornos de Desarrollo");
			System.out.println("5) Lenguaje de Marcas");
			System.out.println("6) Computación en la nube");
			numaux = sc.nextInt();
			System.out.println("Cuantas faltas hay que sumar (si se quiere restar se pondrá el número en negativo ej: -2");
			int masfalta = sc.nextInt();
			switch (numaux) {
			case 1: {
				update("Siste", masfalta);
				break;
			}
			case 2: {
				update("Pro", masfalta);
				break;
			}
			case 3: {
				update("Bases", masfalta);
				break;
			}
			case 4: {
				update("Entor", masfalta);
				break;
			}
			case 5: {
				update("Lengua", masfalta);
				break;
			}
			case 6: {
				update("Comput", masfalta);
				break;
			}
			default: {
				System.out.println("Elige una opción válida");
				break;
			}
			}
			break;
		}
		case 3: {
			matricula();
			break;
		}
		case 4: {
			System.out.println("Adios...");
			break;
		}
		default: {
			System.out.println("Elige una opción válida");
			break;
		}
		}
	}
	sc.close();
}
public static void query(String x) {
	try {
		Connection conexion = DriverManager.getConnection(url, usuario, usuario);
		if (x.equals("")) {
			String sql = "select nombre, numfaltas, nummaxfaltas from faltas;";
			Statement st = conexion.createStatement();
			int num = 0;
			int nummax = 0;
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				sql = rs.getString("nombre");
				num = rs.getInt("numfaltas");
				nummax = rs.getInt("nummaxfaltas");
				System.out.println("\nEn " + sql + " tienes " + num + " faltas y para perder la evaluación continua te quedan " + ((nummax*0.25)-num) + " faltas \n");
			}
		} else {
			String sql = "select nombre, numfaltas, nummaxfaltas from faltas where nombre like '" + x + "%';";
			Statement st = conexion.createStatement();
			int num = 0;
			int nummax = 0;
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				sql = rs.getString("nombre");
				num = rs.getInt("numfaltas");
				nummax = rs.getInt("nummaxfaltas");
				System.out.println("\nEn " + sql + " tienes " + num + " faltas y para perder la evaluación continua te quedan " + ((nummax*0.25)-num) + " faltas \n");
			}
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
public static void update(String x, int y) {
	if (y != 0) {
		try {
			Connection conexion = DriverManager.getConnection(url, usuario, usuario);
			String sql = "update faltas set numfaltas = numfaltas + " + y + " where nombre like '" + x + "%';";
			Statement st = conexion.createStatement();
			int num = st.executeUpdate(sql);
			System.out.println("\nSe ha actualizado " + num + " fila correctamente \n");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} else {
		System.out.println("Introduce un valor distinto de 0");
	}
}
public static void matricula() {
	try {
		Connection conexion = DriverManager.getConnection(url, usuario, usuario);
		String sql = "select sum(numfaltas) from faltas;";
		Statement st = conexion.createStatement();
		int num = 0;
		ResultSet rs = st.executeQuery(sql);
		while (rs.next()) {
			num = rs.getInt(1);
			System.out.println("\nTienes " + num + " faltas (en teoria menos ya que aqui se cuentas las justificadas tb) osea te quedan " + (150-num) + " faltas.");
}
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
}