package Procesos;

public class HiloEjemplo1_V2 extends Thread {
	int c;
	int hilo;
	
	public HiloEjemplo1_V2(int hilo){
		this.hilo=hilo;
		System.out.println("creacion del hilo " + hilo);
	}
	@Override
	public void run() {
		c=0;
		while(c<=5){
			System.out.println("Hilo: " + hilo + " c= " + c);
			c++;
		}
	
	}
	
}
