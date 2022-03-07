package Rec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//No me ha dado tiempo, no tener muy en cuenta
public class Ej5 {
	public static void actualizar() {
		
		try {
			Connection conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system","casta");
			// 2. Crear un Statement
			Statement sentencia=conexion.createStatement();
			// 3. Ejecutarlo
			String sql= "ADD TABLE "
					+ "(SELECT ASIGNATURASx FROM Alum_Asig2 WHERE ID = 3) P "
					+ "SET VALUE(P) = ASIGNATURAx (1,'Sistemas Informaticos')";
			sentencia.execute(sql);
			sentencia.close();
			conexion.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
