package Procesos.ComunicacionHilos.EjemploCola;

public class Productor extends Thread{
	private Cola cola;
	private int n;
	public Productor(Cola cola, int cantidad) {
		super();
		this.cola = cola;
		this.n = cantidad;
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
		for (int i =0; i <5; i++){
			try {
				cola.put(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i + "---> Productor numero: " + n 
					+ ", produce: " + i);
		}
	
	}

}
