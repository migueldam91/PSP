package Procesos.Actividad21;

public class main {

	public static void main (String[] args){
//		Hilo1 h1= new Hilo1();
//		Hilo2 h2 = new Hilo2();
//		
//		h1.start();
//		h2.start();
		
		PrimerHiloR primerHiloR = new PrimerHiloR(10);
		new Thread(primerHiloR).start();
	}
}
