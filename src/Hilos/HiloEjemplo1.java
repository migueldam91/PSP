package Hilos;

public class HiloEjemplo1 extends Thread{
	private int c;
	private int hilo;
	
	public HiloEjemplo1(int hilo){
		this.hilo=hilo;
		System.out.println("Creacion hilo: "+ hilo);
	}
	@Override
	public void run() {
		c=0;
		while(c<=5){
			System.out.println("Hilo: " + hilo + " c= "+ c);
			c++;
		}
	}
}
