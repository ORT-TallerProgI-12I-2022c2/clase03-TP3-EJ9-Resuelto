package tp3.ej09;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		Estacion e = new Estacion("e12", "Peajes del sur");
		
		Cabina c1 = new Cabina("EFE123", new Efectivo("Cash"));
		Cabina c2 = new Cabina("SUB456", new SUBE("La que se usa en los transportes", 6) );
		Cabina c3 = new Cabina("PASE444", new PASE("Este tarda menos", 3) );
		Cabina c4 = new Cabina("EFE123", new Efectivo("Cash2"));
		Cabina c5 = new Cabina("PASE555", new PASE("Este tarda mas", 7) );
		
		e.addCabina( c1 );
		e.addCabina( c2 );
		e.addCabina( c3 );
		e.addCabina( c4 );
		e.addCabina( c5 );
		
		Vehiculo a = new Vehiculo("ABC123", Categoria.AUTO);
		Vehiculo m = new Vehiculo("XYZ456", Categoria.MOTO);
		Vehiculo c = new Vehiculo("DEF234", Categoria.CAMION);

		ArrayList<Cabina> conEfectivo = e.cabinasConEfectivo(); // Se esperan 2 cabinas
		for (Cabina cab : conEfectivo) {
			System.out.println(cab);
		}
		System.out.println(e.promedioDemora()); // Se espera 5.33333
		
		System.out.println(c1.cobrar(c)); // 100
		System.out.println(c2.cobrar(c)); // 90
		System.out.println(c3.cobrar(c)); // 85
		System.out.println(c4.cobrar(c)); // 100
		System.out.println(c5.cobrar(c)); // 88
		
		System.out.println(c1);
		System.out.println(e);
		Object x = null;
		System.out.println(x);
	}

}
