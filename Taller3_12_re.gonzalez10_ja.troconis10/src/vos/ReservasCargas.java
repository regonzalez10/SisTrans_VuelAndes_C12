package vos;

public class ReservasCargas extends Reservas {
	private Integer trackingNumber;
	
	public ReservasCargas(Integer id, Integer idUsuario, Integer idVuelo, Integer trackingNumber) {
		super(id, idUsuario, idVuelo);
		this.trackingNumber = trackingNumber;
	}

	

	public Integer getTrackingNumber() {
		return trackingNumber;
	}

	public void setTrackingNumber(Integer trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

}
