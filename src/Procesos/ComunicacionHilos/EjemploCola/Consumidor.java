package Procesos.ComunicacionHilos.EjemploCola;

public class Consumidor extends Thread{
	private Cola cola;
	private int n;
	public Consumidor(Cola cola, int n) {
		super();
		this.cola = cola;
		this.n = n;
	}
	public Cola getCola() {
		return cola;
	}
	public void setCola(Cola cola) {
		this.cola = cola;
	}
	public int getCantidad() {
		return n;
	}
	public void setCantidad(int cantidad) {
		this.n = cantidad;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		int valor=0;
		for (int i =0; i <5; i++){
			try {
				valor= cola.get();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i + "---> Consumidor numero: " + n 
					+ ", consume: " + valor);
		}
		
	
	}
}
