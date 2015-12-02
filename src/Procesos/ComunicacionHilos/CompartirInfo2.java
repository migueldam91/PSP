package Procesos.ComunicacionHilos;

public class CompartirInfo2 {
	public static void main(String[] args){
		Cuenta c = new Cuenta(50);
		SacarDinero hilo1 = new SacarDinero(c, "Miguel");
		SacarDinero hilo2 = new SacarDinero(c, "Alejandro");
		
		hilo1.start();hilo2.start();
	}

}
