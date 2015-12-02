package Procesos.Actividad21;

public class Hilo1 extends Thread{
	
	@Override
	public void run() {
		while(true){
			System.out.println("TIC");
			try {
				sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
