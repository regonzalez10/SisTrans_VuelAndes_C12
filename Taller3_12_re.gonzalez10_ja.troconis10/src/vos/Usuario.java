package vos;



public class Usuario {
	
	public enum TipoUsuario {
		 VUELANDES(1), AEROLINEA(2), CLIENTE(3);
		int id;
	   
		private TipoUsuario(int num)
		{
			this.id = num;
		}
		
	}
	public enum TipoDocumento {
	    PASAPORTE(1), CEDULA(2), CEDULAEXTRANJERIA(3);
		int id;
		private TipoDocumento(int num)
		{
			this.id = num;
		}
	}
	
	private TipoUsuario clasificacionUsuario;
	private TipoDocumento clasificacionDocumento;
	private String nombre;
	private Integer id;
	private String clave;
	
	
	
	public Usuario(TipoUsuario clasificacionUsuario, TipoDocumento clasificacionDocumento, String nombre, Integer id,
			String clave) {
		super();
		this.clasificacionUsuario = clasificacionUsuario;
		this.clasificacionDocumento = clasificacionDocumento;
		this.nombre = nombre;
		this.id = id;
		this.clave = clave;
	}
	public TipoUsuario getClasificacionUsuario() {
		return clasificacionUsuario;
	}
	public void setClasificacionUsuario(TipoUsuario clasificacionUsuario) {
		this.clasificacionUsuario = clasificacionUsuario;
	}
	public TipoDocumento getClasificacionDocumento() {
		return clasificacionDocumento;
	}
	public void setClasificacionDocumento(TipoDocumento clasificacionDocumento) {
		this.clasificacionDocumento = clasificacionDocumento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	

}
