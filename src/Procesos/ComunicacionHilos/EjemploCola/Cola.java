package Procesos.ComunicacionHilos.EjemploCola;

public class Cola {
	private int numero;
	private boolean disponible = false; // Cola vacia inicialmente

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	synchronized public int get() throws InterruptedException {
		while (!disponible) {
			System.out.println("No está disponible el paquete");
			wait();
		}
		disponible = false; // se pone cola vacia
		notifyAll();
		return numero; // se devuelve
	}

	synchronized public void put(int valor) throws InterruptedException {
		while (disponible) {
			System.out.println("Esta disponible");
			wait();
		}
		disponible = true; // Disponible para consumir
		numero = valor; // coloca valor en la cola
		notifyAll();
	}

}
