package tp3.ej09;

public abstract class MedioDePagoElectronico extends MedioDePago {

	private int diasDemora;
	
	public MedioDePagoElectronico(String descripcion, int diasDemora) {
		super(descripcion);
		this.diasDemora = diasDemora;
	}

	public int getDiasDemora() {
		return diasDemora;
	}

	@Override
	public String toString() {
		return "MedioDePagoElectronico [diasDemora=" + diasDemora + "]";
	}
	
	
}
