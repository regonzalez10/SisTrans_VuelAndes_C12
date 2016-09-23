package dao;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import javafx.scene.control.TreeTableRow;
import vos.Video;

public class DAOVideos {

	private Connection conexion;

	private String user;

	private String password;

	private String url;

	private String driver;

	public DAOVideos(String conectionData) {
		initConnectionData(conectionData);
	}

	private void initConnectionData(String conectionData) {
		try {
			File arch = new File(conectionData);
			Properties prop = new Properties();
			FileInputStream in = new FileInputStream(arch);
			prop.load(in);
			in.close();
			this.url = prop.getProperty("url");
			this.user = prop.getProperty("usuario");
			this.password = prop.getProperty("clave");
			this.driver = prop.getProperty("driver");
			Class.forName(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void establecerConexion() throws SQLException {
		System.out.println("Connecting to: " + url + " With user: " + user);
		conexion = DriverManager.getConnection(url, user, password);
	}

	public void closeConnection(Connection connection) throws SQLException {
		try {
			connection.close();
			connection = null;
		} catch (SQLException exception) {
			System.err.println("SQLException in closing Connection:");
			exception.printStackTrace();
			throw exception;
		}
	}

	public ArrayList<Video> darVideos() throws Exception {
		PreparedStatement prepStmt = null;
		ArrayList<Video> videos = new ArrayList<Video>();

		try {
			establecerConexion();
			String sql = "SELECT * FROM VIDEOS";
			prepStmt = conexion.prepareStatement(sql);
			ResultSet rs = prepStmt.executeQuery();
			while (rs.next()) {
				String name = rs.getString("NAME");
				int id = Integer.parseInt(rs.getString("ID"));
				int duration = Integer.parseInt(rs.getString("DURATION"));
				videos.add(new Video(id, name, duration));
			}

		} catch (SQLException e) {
			System.err.println("SQLException in executing:");
			e.printStackTrace();
			throw e;
		} finally {
			if (prepStmt != null) {
				try {
					prepStmt.close();
				} catch (SQLException exception) {
					System.err.println("SQLException in closing Stmt:");
					exception.printStackTrace();
					throw exception;
				}
			}
			if (this.conexion != null)
				closeConnection(this.conexion);
		}
		return videos;
	}

	public ArrayList<Video> darVideosConError() throws Exception {
		PreparedStatement prepStmt = null;
		ArrayList<Video> videos = new ArrayList<Video>();

		try {
			establecerConexion();
			String sql = "SELECT * FROM VIDEOSSS"; // intencionalmente se
													// escribe mal VIDEOS para
													// que lance error.
			prepStmt = conexion.prepareStatement(sql);
			ResultSet rs = prepStmt.executeQuery();

			while (rs.next()) {
				String name = rs.getString("NAME");
				int id = Integer.parseInt(rs.getString("ID"));
				int duration = Integer.parseInt(rs.getString("DURATION"));
				videos.add(new Video(id, name, duration));
			}

		} catch (SQLException e) {
			System.err.println("SQLException in executing:");
			e.printStackTrace();
			throw e;
		} finally {
			if (prepStmt != null) {
				try {
					prepStmt.close();
				} catch (SQLException exception) {
					System.err.println("SQLException in closing Stmt:");
					exception.printStackTrace();
					throw exception;
				}
			}
			if (this.conexion != null)
				closeConnection(this.conexion);
		}
		return videos;
	}

	public ArrayList<Video> buscarVideosPorName(String name) throws Exception {
		PreparedStatement prepStmt = null;
		ArrayList<Video> videos = new ArrayList<Video>();

		try {
			establecerConexion();
			String sql = "SELECT * FROM VIDEOS WHERE NAME ='" + name + "'";
			prepStmt = conexion.prepareStatement(sql);
			ResultSet rs = prepStmt.executeQuery();

			while (rs.next()) {
				String name2 = rs.getString("NAME");
				int id = Integer.parseInt(rs.getString("ID"));
				int duration = Integer.parseInt(rs.getString("DURATION"));
				videos.add(new Video(id, name, duration));
			}

		} catch (SQLException e) {
			System.err.println("SQLException in executing:");
			e.printStackTrace();
			throw e;
		} finally {
			if (prepStmt != null) {
				try {
					prepStmt.close();
				} catch (SQLException exception) {
					System.err.println("SQLException in closing Stmt:");
					exception.printStackTrace();
					throw exception;
				}
			}
			if (this.conexion != null)
				closeConnection(this.conexion);
		}
		return videos;
	}

	public ArrayList<Video> buscarVideosPorNameYId(String name, int id) throws Exception {
		PreparedStatement prepStmt = null;
		ArrayList<Video> videos = new ArrayList<Video>();

		try {
			establecerConexion();
			String sql = "SELECT * FROM VIDEOS WHERE NAME ='" + name + "' and ID = " + id;
			prepStmt = conexion.prepareStatement(sql);
			ResultSet rs = prepStmt.executeQuery();

			while (rs.next()) {
				String name2 = rs.getString("NAME");
				int id2 = Integer.parseInt(rs.getString("ID"));
				int duration = Integer.parseInt(rs.getString("DURATION"));
				videos.add(new Video(id, name, duration));
			}

		} catch (SQLException e) {
			System.err.println("SQLException in executing:");
			e.printStackTrace();
			throw e;
		} finally {
			if (prepStmt != null) {
				try {
					prepStmt.close();
				} catch (SQLException exception) {
					System.err.println("SQLException in closing Stmt:");
					exception.printStackTrace();
					throw exception;
				}
			}
			if (this.conexion != null)
				closeConnection(this.conexion);
		}
		return videos;
	}

}
