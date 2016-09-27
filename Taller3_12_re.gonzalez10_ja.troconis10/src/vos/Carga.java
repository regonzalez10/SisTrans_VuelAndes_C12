package vos;

public class Carga {
	
	private Long trackingNumber;
	private String contenido;
	private float volumen;
	private float peso;

	public Carga(Long trackingNumber, String contenido, float volumen, float peso) {
		super();
		this.trackingNumber = trackingNumber;
		this.contenido = contenido;
		this.volumen = volumen;
		this.peso = peso;
	}
	public Long getTrackingNumber() {
		return trackingNumber;
	}
	public void setTrackingNumber(Long trackingNumber) {
		this.trackingNumber = trackingNumber;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	public float getVolumen() {
		return volumen;
	}
	public void setVolumen(float volumen) {
		this.volumen = volumen;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}

}
