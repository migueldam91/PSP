package Procesos;

public class HiloEjemploInterrupted extends Thread {
	@Override
	public void run() {
		super.run();
		try {

			while (!Thread.currentThread().isInterrupted()) {
				System.out.println(getState());
				System.out.println("en el hilo");
				sleep(1000);
				
			}
		} catch (InterruptedException e) {
			System.out.println("EXCEPCION!");
		}

	}

	public static void main(String[] args) {
		HiloEjemploInterrupted hilo = new HiloEjemploInterrupted();

		hilo.start();

		for (int i = 0; i < 100; i++){
			hilo.interrupt();
			hilo.notify();
		}
	}

}
