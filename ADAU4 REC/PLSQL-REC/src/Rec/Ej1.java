package Rec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ej1 {
	public static void insertar() {

		try {
			Connection conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system","casta");
			Statement sentencia=conexion.createStatement();
			String insert1 = "INSERT INTO Alum_Asig VALUES(ALUMNOx"
			          + "('30456342C', 'Silvio Núñez Silvestre', 2000-7-1)"
			          + ",ASIGNATURASx("
			          + "ASIGNATURASx(1, 'Sistemas Informáticos')"
			          + "ASIGNATURASx(2, 'Bases de Datos')"
			          + "ASIGNATURASx(3, 'Programación')"
			          + "ASIGNATURASx(4, 'Lenguajes de Marcas')"
			          + "ASIGNATURASx(5, 'Entornos de Desarrollo.')"
			          + "ASIGNATURASx(6, 'Formación y Orientación Laboral'))";
			String insert2 = "INSERT INTO Alum_Asig VALUES(ALUMNOx"
			          + "('25456098X', 'Alexandra del Rosell', 1999-10-2)"
			          + ",ASIGNATURASx("
			          + "ASIGNATURASx(1, 'Sistemas Informáticos')"
			          + "ASIGNATURASx(2, 'Bases de Datos')"
			          + "ASIGNATURASx(5, 'Entornos de Desarrollo.')"
			          + "ASIGNATURASx(6, 'Formación y Orientación Laboral'))";
			String insert3 = "INSERT INTO Alum_Asig VALUES(ALUMNOx"
			          + "('17656324S', 'María Pilar Robledo', 1980-8-12)"
			          + ",ASIGNATURASx("
			          + "ASIGNATURASx(2, 'Bases de Datos')"
			          + "ASIGNATURASx(3, 'Programación')"
			          + "ASIGNATURASx(4, 'Lenguajes de Marcas')"
			          + "ASIGNATURASx(5, 'Entornos de Desarrollo.'))";
			sentencia.execute(insert1);
			sentencia.execute(insert2);
			sentencia.execute(insert3);
			sentencia.close();
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	}
