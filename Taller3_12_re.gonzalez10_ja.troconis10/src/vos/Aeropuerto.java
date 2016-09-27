package vos;

import java.util.List;

public class Aeropuerto {


public enum TipoAeropuerto {
    INTERNACIONAL, LOCAL, NACIONAL
}

private TipoAeropuerto clasificacion;
private String nombre;
private String codIATA;
private String codigoCiudad;


public Aeropuerto(TipoAeropuerto clasificacion, String nombre, String codIATA) {
	
	this.clasificacion = clasificacion;
	this.setNombre(nombre);
	this.codIATA = codIATA;
}

public TipoAeropuerto getClasificacion() {
	return clasificacion;
}
public void setClasificacion(TipoAeropuerto clasificacion) {
	this.clasificacion = clasificacion;
}

public String getCodIATA() {
	return codIATA;
}
public void setCodIATA(String codIATA) {
	this.codIATA = codIATA;
}
public String getCodigoCiudad() {
	return codigoCiudad;
}

public void setCodigoCiudad(String codigoCiudad) {
	this.codigoCiudad = codigoCiudad;
}




public String getNombre() {
	return nombre;
}




public void setNombre(String nombre) {
	this.nombre = nombre;
}

}
