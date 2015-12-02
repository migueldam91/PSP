package Procesos.Actividad21;

public class PrimerHiloR implements Runnable {
	private int x;
	PrimerHiloR (int x){
		this.x=x;
	}
	@Override
	public void run() {
		for(int i = 0; i<x; i++)
			System.out.println("En el hilo... "+ i);
		
	}
	
}
