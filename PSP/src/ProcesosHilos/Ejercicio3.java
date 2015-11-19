package ProcesosHilos;

public class Ejercicio3 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		int i = 1;

		while (true) {
			System.out.println(i);
			i++;
		}
	}

}
