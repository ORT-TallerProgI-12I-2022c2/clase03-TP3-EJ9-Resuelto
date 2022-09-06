package tp3.ej09;

public class Vehiculo {
	private String patente;
	private Categoria categoria;
	
	public Vehiculo(String patente, Categoria categoria) {
		this.patente = patente;
		this.categoria = categoria;
	}
	
	public double getTarifa() {
		return this.categoria.getTarifa();
	}
}
