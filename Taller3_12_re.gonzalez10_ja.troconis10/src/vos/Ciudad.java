package vos;

import java.util.List;

public class Ciudad 
{
	private String codigo;
	private String nombre;
	private List<String> aeropuertos;
	private String pais;
	
	public Ciudad(String codigo,String nom, String pais,List<String> aeropuertos)
	{
		this.codigo = codigo;
		this.nombre = nom;
		this.pais = pais;
		this.aeropuertos = aeropuertos;
		
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<String> getAeropuertos() {
		return aeropuertos;
	}

	public void setAeropuertos(List<String> aeropuertos) {
		this.aeropuertos = aeropuertos;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

}
