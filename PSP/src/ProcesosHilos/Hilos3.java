package ProcesosHilos;

public class Hilos3 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();

		System.out.println("comienzo de la cuenta atrás");

		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("fin de la cuenta atrás");
	}

}
