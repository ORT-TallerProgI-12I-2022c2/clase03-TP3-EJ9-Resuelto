package tp3.ej09;

public class PASE extends MedioDePagoElectronico {
	private static final double DCTO = 0.15;
	private static final int DEMORA_ESP = 5;
	private static final double DCTO_X_DEM_ESP = 0.12;
	
	public PASE(String descripcion, int diasDemora) {
		super(descripcion, diasDemora);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getDescuento() {
		double d = DCTO;
		if (getDiasDemora() > DEMORA_ESP) {
			d = DCTO_X_DEM_ESP;
		}
		
		return d;
	}
	
}
