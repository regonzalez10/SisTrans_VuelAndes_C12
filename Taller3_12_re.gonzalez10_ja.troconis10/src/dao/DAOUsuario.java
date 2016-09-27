package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vos.*;

public class DAOUsuario extends AbstractDAO {

	public DAOUsuario(){
		super();
	}

	public void asociarAeronaveAVuelo(Long id, ReservasPasajeros r)  throws SQLException, Exception{

		String sql = "UPDATE ISIS2304A141620.VUELOS SET ";

		System.out.println("SQL stmt:" + sql);

		PreparedStatement prepStmt = conn.prepareStatement(sql);
		recursos.add(prepStmt);
		prepStmt.executeQuery();
	}
}
