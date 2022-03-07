package Rec;

import java.math.BigDecimal;
import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Date;

public class Ej2 {
	public static void consulta() {
		try {
			Connection conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system","dani");
			Statement sentencia=conexion.createStatement();
			//i
			String consulta1="SELECT * FROM Alum_Asig";
			ResultSet rs1 = sentencia.executeQuery(consulta1);

			while(rs1.next()) {
				Struct alumnos = (Struct) rs1.getObject(1);

                Object[] atr_alum= alumnos.getAttributes();
                
				for(int i=0;i<atr_alum.length;i++) {
					Struct alumno= (Struct) atr_alum[i];
					Object [] atributos_alum = alumno.getAttributes();
					
					String dni = (String) atributos_alum[0];
	                String nombre = (String) atributos_alum[1];
	                Date fecha = (Date) atributos_alum[2];
	                System.out.println(dni);
					System.out.println(nombre);
					System.out.println(fecha);
					
				}
				
				Struct asignaturas = (Struct) rs1.getObject(1);

                Object[] atr_asig= asignaturas.getAttributes();
                
				for(int i=0;i<atr_asig.length;i++) {
					Struct asig= (Struct) atr_asig[i];
					Object [] atributos_asig = asig.getAttributes();
					
					BigDecimal id = (BigDecimal) atributos_asig[0];
	                String nombre = (String) atributos_asig[1];
	                System.out.println(id);
					System.out.println(nombre);
					
				}
			}
			
			rs1.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
