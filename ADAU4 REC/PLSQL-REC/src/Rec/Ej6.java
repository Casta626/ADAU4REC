package Rec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ej6 {
	public static void transaccion() {
		// 1. Conectarte al SGBD
		Connection conexion=null;
		try {
			conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system","casta");
			// 2. Crear un Statement
			Statement sentencia=conexion.createStatement();
			// 3. Ejecutarlo
			String sql= "UPDATE TABLE "
					+ "(SELECT PERS FROM ALUMNOx WHERE dni = 2) P "
					+ "SET VALUE(P) = ('123456789C','Audi',1998-11-24)";
		
			conexion.setAutoCommit(false);
			sentencia.execute(sql);
	
			conexion.commit();
			
			sentencia.close();
			conexion.close();
			
		} catch (SQLException e) {
			
			try {
				conexion.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
