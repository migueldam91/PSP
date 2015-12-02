package Procesos.ComunicacionHilos.EjemploCola.PingPong;

public class Consumidor1 extends Thread{
	private Cola1 cola;
	private int n;
	public Consumidor1(Cola1 cola, int n) {
		super();
		this.cola = cola;
		this.n = n;
	}
	public Cola1 getCola() {
		return cola;
	}
	public void setCola(Cola1 cola) {
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
		String valor= "";
		for (int i =0; i <15; i++){
			try {
				valor= cola.get();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(valor);
		}
		
	
	}}