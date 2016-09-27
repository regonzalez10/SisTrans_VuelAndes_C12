package vos;

import java.util.Date;

public abstract class Vuelo {
	public enum TipoViaje {
	    INTERNACIONAL,NACIONAL
	}
	
	private TipoViaje tipo;
	private Long idVuelo;
	private Date horaSalida;
	private Date horaLlegada;
	private Long duracion;
	private Double distancia;
	private Integer frecuencia;
	private String aeroPuertoSalida;
	private String aeroPuertoLlegada;
	private String codIATAaerolinea;
	
	
	
	
	public Vuelo(TipoViaje tipo, Long idVuelo, Date horaSalida, Date horaLlegada, Long duracion, Double distancia,
			Integer frecuencia, String aeroPuertoSalida, String aeroPuertoLlegada, String codIATAaerolinea) {
		super();
		this.tipo = tipo;
		this.idVuelo = idVuelo;
		this.horaSalida = horaSalida;
		this.horaLlegada = horaLlegada;
		this.duracion = duracion;
		this.distancia = distancia;
		this.frecuencia = frecuencia;
		this.aeroPuertoSalida = aeroPuertoSalida;
		this.aeroPuertoLlegada = aeroPuertoLlegada;
		this.codIATAaerolinea = codIATAaerolinea;
	}
	public TipoViaje getTipo() {
		return tipo;
	}
	public void setTipo(TipoViaje tipo) {
		this.tipo = tipo;
	}
	public Long getIdVuelo() {
		return idVuelo;
	}
	public void setIdVuelo(Long idVuelo) {
		this.idVuelo = idVuelo;
	}
	public Date getHoraSalida() {
		return horaSalida;
	}
	public void setHoraSalida(Date horaSalida) {
		this.horaSalida = horaSalida;
	}
	public Date getHoraLlegada() {
		return horaLlegada;
	}
	public void setHoraLlegada(Date horaLlegada) {
		this.horaLlegada = horaLlegada;
	}
	public Long getDuracion() {
		return duracion;
	}
	public void setDuracion(Long duracion) {
		this.duracion = duracion;
	}
	public Double getDistancia() {
		return distancia;
	}
	public void setDistancia(Double distancia) {
		this.distancia = distancia;
	}
	public Integer getFrecuencia() {
		return frecuencia;
	}
	public void setFrecuencia(Integer frecuencia) {
		this.frecuencia = frecuencia;
	}
	public String getAeroPuertoSalida() {
		return aeroPuertoSalida;
	}
	public void setAeroPuertoSalida(String aeroPuertoSalida) {
		this.aeroPuertoSalida = aeroPuertoSalida;
	}
	public String getAeroPuertoLlegada() {
		return aeroPuertoLlegada;
	}
	public void setAeroPuertoLlegada(String aeroPuertoLlegada) {
		this.aeroPuertoLlegada = aeroPuertoLlegada;
	}
	public String getCodIATAaerolinea() {
		return codIATAaerolinea;
	}
	public void setCodIATAaerolinea(String codIATAaerolinea) {
		this.codIATAaerolinea = codIATAaerolinea;
	}

}
