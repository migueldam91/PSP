package Procesos.ComunicacionHilos;

public class CompartirInfo1 {

	public static void main(String[] args) {
		
		Contador contador = new Contador(100);
		HiloA ha= new HiloA("Hilo1",contador );
		HiloB hb= new HiloB("Hilo2",contador );
		ha.start();
		hb.start();

	}

}
