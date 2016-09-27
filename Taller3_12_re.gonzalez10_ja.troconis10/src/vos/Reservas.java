package vos;

public abstract class Reservas {
	
	private Integer id;

	private Integer idUsuario;
	
	private Integer idVuelo;

	
	public Reservas(Integer id, Integer idUsuario, Integer idVuelo) {
		super();
		this.id = id;
		this.idUsuario = idUsuario;
		this.idVuelo = idVuelo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Integer getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(Integer idVuelo) {
		this.idVuelo = idVuelo;
	}
}
