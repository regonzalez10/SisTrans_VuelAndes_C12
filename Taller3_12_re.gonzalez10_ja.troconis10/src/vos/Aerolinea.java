package vos;

import java.util.List;

public class Aerolinea {
	
	private String nombre;
	private String codigoPais;
	private String codIATA;
	private List<Integer> usuariosFrecuentes;
	private List<String> aviones;
	
	
	public Aerolinea(String nombre, String codigoPais, String codIATA, List<Integer> usuariosFrecuentes, List<String> aviones) {
		
		this.nombre = nombre;
		this.codigoPais = codigoPais;
		this.codIATA = codIATA;
		this.usuariosFrecuentes = usuariosFrecuentes;
		this.aviones = aviones;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigoPais() {
		return codigoPais;
	}
	public void setCodigoPais(String codigoPais) {
		this.codigoPais = codigoPais;
	}
	public String getCodIATA() {
		return codIATA;
	}
	public void setCodIATA(String codIATA) {
		this.codIATA = codIATA;
	}
	public List<Integer> getUsuariosFrecuentes() {
		return usuariosFrecuentes;
	}
	public void setUsuariosFrecuentes(List<Integer> usuariosFrecuentes) {
		this.usuariosFrecuentes = usuariosFrecuentes;
	}
	public List<String> getAviones() {
		return aviones;
	}
	public void setAviones(List<String> aviones) {
		this.aviones = aviones;
	}

}
