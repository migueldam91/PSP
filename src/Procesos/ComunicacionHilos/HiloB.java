package Procesos.ComunicacionHilos;

public class HiloB extends Thread {
	private Contador contador;

	public HiloB(String nom, Contador con) {
		super(nom);
		this.contador = con;
	}

	@Override
	public void run() {
		super.run();
		synchronized (contador) {

			for (int i = 0; i < 300; i++)
				contador.decrementa();

			System.out.println(getName() + " Contador vale " + contador.getC());
		}
	}
}
