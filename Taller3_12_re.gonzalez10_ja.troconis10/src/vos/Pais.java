package vos;

import java.util.List;

public class Pais 
{
	private String nombre;
	private String codigo;
	private List<String> ciudades;
	
	public Pais(String nombre, String codigo,List<String> ciudades) {
	
		this.nombre = nombre;
		this.codigo = codigo;
		this.ciudades = ciudades;
	}
	public List<String> getCiudades() {
		return ciudades;
	}

	public void setCiudades(List<String> ciudades) {
		this.ciudades = ciudades;
	}

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



}
