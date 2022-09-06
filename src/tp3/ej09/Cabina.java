package tp3.ej09;

public class Cabina {
	private static final int MIN_H_PICO1 = 6;
	private static final int MAX_H_PICO1 = 10;
	private static final int MIN_H_PICO2 = 17;
	private static final int MAX_H_PICO2 = 20;
	private static final double INCR_H_PICO = 1.08;
	private String ID;
	private MedioDePago medioDePago;
	
	public Cabina(String iD, MedioDePago medioDePago) {
		super();
		ID = iD;
		this.medioDePago = medioDePago;
	}

	public double cobrar(Vehiculo v) {
		double aCobrar = v.getTarifa();
		if (esHoraPico()) {
			aCobrar = aCobrar * INCR_H_PICO;
		}
		return aCobrar - aCobrar * this.medioDePago.getDescuento();
	}
	
	private boolean esHoraPico() {
		double h = Estacion.dameHoraActual();
		return (h > MIN_H_PICO1 && h < MAX_H_PICO1) || (h > MIN_H_PICO2 && h < MAX_H_PICO2);
	}
	
	public boolean aceptaEfectivo() {
		return this.medioDePago instanceof Efectivo;
	}
	
	public boolean aceptaMedioDePagoElectronico() {
		return this.medioDePago instanceof MedioDePagoElectronico;
	}
	
	public int diasDeDemora() {
		int dias = 0;
		if (aceptaMedioDePagoElectronico()) {
			dias = ((MedioDePagoElectronico) this.medioDePago).getDiasDemora();
		}
		return dias;
	}

	@Override
	public String toString() {
		return "Cabina [ID=" + ID + ", medioDePago=" + medioDePago + "]";
	}
	
	
}
