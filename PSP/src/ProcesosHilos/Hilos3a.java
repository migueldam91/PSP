package ProcesosHilos;

public class Hilos3a implements Runnable {

	@Override
	public void run() {
		System.out.println("comienzo de la cuenta atrás");

		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("fin de la cuenta atrás");
		
	}

	
	

}
