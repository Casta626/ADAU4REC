package Rec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ej3 {
	public static void borrar() {
		try {
			Connection conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system","dani");
			Statement sentencia=conexion.createStatement();
			String sql="DELETE FROM TABLE (SELECT nombre FROM asignaturax WHERE ID = 5) A WHERE A.asignaturasx.ID=3";
			sentencia.execute(sql);
			
			sentencia.close();
			conexion.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
