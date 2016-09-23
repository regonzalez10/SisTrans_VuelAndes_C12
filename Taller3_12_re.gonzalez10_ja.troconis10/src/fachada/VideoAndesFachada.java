package fachada;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Properties;

import dao.DAOVideos;
import vos.Video;

public class VideoAndesFachada {

	private static VideoAndesFachada instacia;

	private static final String CONNECTION_DATA_FILE_NAME_LOCAL = "/conexionLocal.properties";

	private static final String CONNECTION_DATA_FILE_NAME_REMOTE = "/conexion.properties";

	private static String connectionDataPath;

	private DAOVideos daoVideos;

	public static VideoAndesFachada darInstancia(String contextPathP) {
		connectionDataPath = contextPathP + CONNECTION_DATA_FILE_NAME_REMOTE;
		instacia = instacia == null ? new VideoAndesFachada() : instacia;
		return instacia;
	}

	private VideoAndesFachada() {
		daoVideos = new DAOVideos(connectionDataPath);
	}

	public ArrayList<Video> darVideos() throws Exception {
		daoVideos = daoVideos == null ? new DAOVideos(connectionDataPath) : daoVideos;
		return daoVideos.darVideos();
	}

	public ArrayList<Video> darVideosConError() throws Exception {
		daoVideos = daoVideos == null ? new DAOVideos(connectionDataPath) : daoVideos;
		return daoVideos.darVideosConError();
	}

	public ArrayList<Video> buscarVideosPorName(String name) throws Exception {
		daoVideos = daoVideos == null ? new DAOVideos(connectionDataPath) : daoVideos;
		return daoVideos.buscarVideosPorName(name);
	}

	public ArrayList<Video> buscarVideosPorNameYId(String name, int id) throws Exception {
		daoVideos = daoVideos == null ? new DAOVideos(connectionDataPath) : daoVideos;
		return daoVideos.buscarVideosPorNameYId(name, id);
	}

}
