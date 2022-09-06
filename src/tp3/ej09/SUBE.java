package tp3.ej09;

public class SUBE extends MedioDePagoElectronico {
	
	private static final double DCTO = 0.1;

	public SUBE(String descripcion, int diasDemora) {
		super(descripcion, diasDemora);
	}

	@Override
	public double getDescuento() {
		return DCTO;
	}
	
}
