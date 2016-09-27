package vos;

public class ReservasPasajeros extends Reservas {

	private boolean esEjecutiva;
	
	public ReservasPasajeros(Integer id, Integer idUsuario, Integer idVuelo,boolean esEjecutiva) {
		super(id, idUsuario, idVuelo);
		this.esEjecutiva = esEjecutiva;
		
	}

}
