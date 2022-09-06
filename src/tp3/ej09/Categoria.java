package tp3.ej09;

public enum Categoria {
	/*
	public static final Categoria AUTO = new Categoria(80);
	public static final Categoria CAMION = new Categoria(120);
	public static final Categoria MOTO = new Categoria(60);
	*/
	
	AUTO(80), CAMION(100), MOTO(60);
	
	private double tarifa;

	private Categoria(double tarifa) {
		this.tarifa = tarifa;
	}

	public double getTarifa() {
		return tarifa;
	}
	
}
