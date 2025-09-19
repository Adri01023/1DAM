package Ejercicios_Tema9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Primera_prueba {
public static void main(String[] args) {
	String url = "jdbc:mysql://localhost:3306/scott";
	String usuario = "alumno";
	try {
		Connection conexion = DriverManager.getConnection(url, usuario, usuario);
		String sql = "select dname from dept;";
		Statement st = conexion.createStatement();
		ResultSet rs = st.executeQuery(sql);
		while (rs.next()) {
			sql = rs.getString("dname");
			System.out.println(sql);
		}
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
}