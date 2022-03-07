package Rec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ej4 {
	public static void insertar() {

		try {
			Connection conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system","casta");
			Statement sentencia=conexion.createStatement();
			String insert1 = "INSERT INTO Alum_Asig2 VALUES(ALUMNOx"
			          + "('30456342C', 'Silvio Núñez Silvestre', 2000-7-1)"
			          + ",ASIGNTATURAS2x("
			          + "ASIGNTATURAS2x(1, 'Sistemas Informáticos')"
			          + "ASIGNTATURAS2x(2, 'Bases de Datos')"
			          + "ASIGNTATURAS2x(3, 'Programación')"
			          + "ASIGNTATURAS2x(4, 'Lenguajes de Marcas')"
			          + "ASIGNTATURAS2x(5, 'Entornos de Desarrollo.')"
			          + "ASIGNTATURAS2x(6, 'Formación y Orientación Laboral'))";
			String insert2 = "INSERT INTO Alum_Asig2 VALUES(ALUMNOx"
			          + "('25456098X', 'Alexandra del Rosell', 1999-10-2)"
			          + ",ASIGNTATURAS2x("
			          + "ASIGNTATURAS2x(1, 'Sistemas Informáticos')"
			          + "ASIGNTATURAS2x(2, 'Bases de Datos')"
			          + "ASIGNTATURAS2x(5, 'Entornos de Desarrollo.')"
			          + "ASIGNTATURAS2x(6, 'Formación y Orientación Laboral'))";
			String insert3 = "INSERT INTO Alum_Asig2 VALUES(ALUMNOx"
			          + "('17656324S', 'María Pilar Robledo', 1980-8-12)"
			          + ",ASIGNTATURAS2x("
			          + "ASIGNTATURAS2x(2, 'Bases de Datos')"
			          + "ASIGNTATURAS2x(3, 'Programación')"
			          + "ASIGNTATURAS2x(4, 'Lenguajes de Marcas')"
			          + "ASIGNTATURAS2x(5, 'Entornos de Desarrollo.'))";
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
