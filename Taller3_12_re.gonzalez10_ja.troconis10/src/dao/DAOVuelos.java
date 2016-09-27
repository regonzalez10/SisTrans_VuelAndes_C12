package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vos.*;

public class DAOVuelos extends AbstractDAO {
	
	public DAOVuelos(){
		super();
	}
	
	public void asociarAeronaveAVuelo(Long v, Avion a)  throws SQLException, Exception{
		
		String sql = "UPDATE ISIS2304A141620.VUELOS SET ";
		sql += "avion_asignado='" + a.getNumeroDeSerie() + "'";
		sql += " WHERE id = " + v;

		System.out.println("SQL stmt:" + sql);

		PreparedStatement prepStmt = conn.prepareStatement(sql);
		recursos.add(prepStmt);
		prepStmt.executeQuery();
	}
}
