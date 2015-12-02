package Procesos.Actividad21;

public class Hilo2 extends Thread{
	
	@Override
	public void run() {
		while(true){
			System.out.println("TAC");
			try {
				sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
