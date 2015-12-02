package Hilos;

public class PrimerHilo extends Thread{
	private int x;
	PrimerHilo(int x){
		this.x=x;
	}
	@Override
	public void run() {
		for (int i = 0; i <x;i++)
			System.out.println("En el hilo ....");
	}

}
