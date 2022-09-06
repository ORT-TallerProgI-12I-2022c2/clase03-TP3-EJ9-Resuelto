package tp3.ej09;

public abstract class MedioDePago {
	private String descripcion;

	public MedioDePago(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public abstract double getDescuento();

	@Override
	public String toString() {
		return "MedioDePago [descripcion=" + descripcion + "]";
	}
	
	
	
}
