package vos;



public class Avion 
{
	public enum TipoAvion {
	    PASAJERO,CARGA
	}
	private TipoAvion clasificacion;
	private String numeroDeSerie;
	private String modelo;
	private String marca;
	private Integer añoFabricacion;
	private boolean propiedad;
	private String codigoAerolinea;
	private Integer sillasEjecutivas;
	private Integer sillasEconomicas;
	private Integer capacidad;
	
	
	
	
	public Avion(TipoAvion clasificacion, String numeroDeSerie, String modelo, String marca, Integer añoFabricacion,
			boolean propiedad, String codigoAerolinea, Integer sillasEjecutivas, Integer sillasEconomicas,
			Integer capacidad) {
		this.clasificacion = clasificacion;
		this.numeroDeSerie = numeroDeSerie;
		this.modelo = modelo;
		this.marca = marca;
		this.añoFabricacion = añoFabricacion;
		this.propiedad = propiedad;
		this.codigoAerolinea = codigoAerolinea;
		this.sillasEjecutivas = sillasEjecutivas;
		this.sillasEconomicas = sillasEconomicas;
		this.capacidad = capacidad;
	}
	
	public TipoAvion getClasificacion() {
		return clasificacion;
	}
	public void setClasificacion(TipoAvion clasificacion) {
		this.clasificacion = clasificacion;
	}
	public String getNumeroDeSerie() {
		return numeroDeSerie;
	}
	public void setNumeroDeSerie(String numeroDeSerie) {
		this.numeroDeSerie = numeroDeSerie;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Integer getAñoFabricacion() {
		return añoFabricacion;
	}
	public void setAñoFabricacion(Integer añoFabricacion) {
		this.añoFabricacion = añoFabricacion;
	}
	public boolean isPropiedad() {
		return propiedad;
	}
	public void setPropiedad(boolean propiedad) {
		this.propiedad = propiedad;
	}
	public String getCodigoAerolinea() {
		return codigoAerolinea;
	}
	public void setCodigoAerolinea(String codigoAerolinea) {
		this.codigoAerolinea = codigoAerolinea;
	}
	public Integer getSillasEjecutivas() {
		return sillasEjecutivas;
	}
	public void setSillasEjecutivas(Integer sillasEjecutivas) {
		this.sillasEjecutivas = sillasEjecutivas;
	}
	public Integer getSillasEconomicas() {
		return sillasEconomicas;
	}
	public void setSillasEconomicas(Integer sillasEconomicas) {
		this.sillasEconomicas = sillasEconomicas;
	}
	public Integer getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}
	
	
	
	

}
