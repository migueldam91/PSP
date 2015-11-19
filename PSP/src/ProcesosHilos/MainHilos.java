package ProcesosHilos;

public class MainHilos extends Thread {
	int n = 0;
	@SuppressWarnings("deprecation")
	public static void main(String[]args) throws InterruptedException{
		/*new Hilos1(5).run();
		new Hilos2(5).run();*/
		//new Hilos3().run();
		//new Hilos3a().run();
		System.out.println("Comienza del contador descontrolado");
		Thread t = new Hilos4();
		t.start();
		sleep(1000);
		t.stop();
		System.out.println("Fin del contador descontrolado");
	
		
	}
}
