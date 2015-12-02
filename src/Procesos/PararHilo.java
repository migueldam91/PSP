package Procesos;

public class PararHilo extends Thread{
	private boolean parar=false;
	
	public PararHilo(){
	}
	
	public void pararHilo(){
		parar=true;
	}
	
	@Override
	public void run() {
		while(parar ==false){
			System.out.println("En el hilo!");
				System.out.println(this.getState());

				System.out.println(this.getState());
				pararHilo();
				System.out.println(this.getState());
		}
		System.out.println("se acabo el hilo!");
	}
	
	public static void main(String[] args){
		PararHilo hilo = new PararHilo();
		hilo.start();
	}

}
