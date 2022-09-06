package tp3.ej09;

public class Efectivo extends MedioDePago {

	public Efectivo(String descripcion) {
		super(descripcion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getDescuento() {
		return 0;
	}

	@Override
	public String toString() {
		return super.toString() + " Efectivo (sin descuento)";
	}
	
	
}
