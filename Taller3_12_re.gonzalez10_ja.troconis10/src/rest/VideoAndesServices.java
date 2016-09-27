package rest;
import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import master.VideoAndesFachada;
import vos.Video;

@Path("services")
public class VideoAndesServices {

	// GET SERVICES:

	@Context
	private ServletContext context;

	private String getPath() {
		return context.getRealPath("WEB-INF/ConnectionData");
	}

	@GET
	@Path("/GetVideosGET")
	@Produces({ MediaType.APPLICATION_JSON })
	public Response GetVideosGET() {
		VideoAndesFachada fachada = VideoAndesFachada.darInstancia(getPath());
		ArrayList<Video> videos = null;
		try {
			videos = fachada.darVideos();
		} catch (Exception e) {
			ArrayList<String> temp = new ArrayList<String>();
			temp.add(e.getMessage());
			return Response.status(500).entity(temp).build();
		}
		return Response.status(200).entity(videos).build();
	}

	@GET
	@Path("/GetVideosGETError")
	@Produces({ MediaType.APPLICATION_JSON })
	public Response GetVideosGETError() {
		VideoAndesFachada fachada = VideoAndesFachada.darInstancia(getPath());
		ArrayList<Video> videos = null;
		try {
			videos = fachada.darVideosConError();
		} catch (Exception e) {
			ArrayList<String> temp = new ArrayList<String>();
			temp.add(e.getMessage());
			return Response.status(500).entity(temp).build();
		}
		return Response.status(200).entity(videos).build();
	}

	@GET
	@Path("/GetVideosByNameGET")
	@Produces({ MediaType.APPLICATION_JSON })
	public Response GetVideosByNameGET(@QueryParam("name") String name) {
		VideoAndesFachada fachada = VideoAndesFachada.darInstancia(getPath());
		ArrayList<Video> videos = null;
		try {
			videos = fachada.buscarVideosPorName(name);
		} catch (Exception e) {
			ArrayList<String> temp = new ArrayList<String>();
			temp.add(e.getMessage());
			return Response.status(500).entity(temp).build();
		}
		return Response.status(200).entity(videos).build();
	}

	// POST SERVICES:

	@POST
	@Path("/GetVideosPOST")
	@Produces({ MediaType.APPLICATION_JSON })
	public Response GetVideosPOST() {
		VideoAndesFachada fachada = VideoAndesFachada.darInstancia(getPath());
		ArrayList<Video> videos = null;
		try {
			videos = fachada.darVideos();
		} catch (Exception e) {
			ArrayList<String> temp = new ArrayList<String>();
			temp.add(e.getMessage());
			return Response.status(500).entity(temp).build();
		}

		return Response.status(200).entity(videos).build();
	}

	@POST
	@Path("/GetVideosByNameAndIdPOST")
	@Produces({ MediaType.APPLICATION_JSON })
	public Response GetVideosByNameAndIdPOST(@FormParam("name") String name, @FormParam("id") String id) {
		VideoAndesFachada fachada = VideoAndesFachada.darInstancia(getPath());
		ArrayList<Video> videos = null;
		try {
			videos = fachada.buscarVideosPorNameYId(name, Integer.parseInt(id));
		} catch (Exception e) {
			ArrayList<String> temp = new ArrayList<String>();
			temp.add(e.getMessage());
			return Response.status(500).entity(temp).build();
		}
		return Response.status(200).entity(videos).build();
	}

}
