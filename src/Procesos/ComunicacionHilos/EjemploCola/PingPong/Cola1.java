package Procesos.ComunicacionHilos.EjemploCola.PingPong;

public class Cola1 {
	private String palabra;
	private boolean disponible = false; // Cola vacia inicialmente


	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	synchronized public String get() throws InterruptedException {
		while (!disponible) {
			wait();
		}
		disponible = false; // se pone cola vacia
		notifyAll();
		return palabra; // se devuelve
	}

	synchronized public void put(String palabro) throws InterruptedException {
		while (disponible) {
			wait();
		}
		disponible = true; // Disponible para consumir
		palabra = palabro; // coloca valor en la cola
		notifyAll();
	}

}
