package tp3.ej09;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Estacion {
	private String ID;
	private String descripcion;
	private ArrayList<Cabina> cabinas;
	
	public Estacion(String iD, String descripcion) {
		ID = iD;
		this.descripcion = descripcion;
		this.cabinas = new ArrayList<>();
	}
	
	public void addCabina(Cabina c) {
		this.cabinas.add(c);
	}

	public static int dameHoraActual() {
		return LocalDateTime.now().getHour() - 3;
	}
	
	public ArrayList<Cabina> cabinasConEfectivo () {
		ArrayList<Cabina> lista = new ArrayList<>();
		for (Cabina cabina : this.cabinas) {
			if( cabina.aceptaEfectivo() ) {
				lista.add(cabina);
			}
		}
		return lista;
	}
	
	public double promedioDemora() {
		double promedio = 0;
		int acuDias = 0;
		int cont = 0;
		for (Cabina cabina : cabinas) {
			if (cabina.aceptaMedioDePagoElectronico()) {
				acuDias += cabina.diasDeDemora();
				cont++;
			}
		}
		if (acuDias > 0) {
			promedio = (acuDias * 1.0) / cont;
		}
		return promedio;
	}
}
