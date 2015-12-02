package Procesos.ComunicacionHilos.EjemploCola.PingPong;

public class Productor1 extends Thread{
	private Cola1 cola1;
	private int n;
	public Productor1(Cola1 cola, int cantidad) {
		super();
		this.cola1 = cola;
		this.n = cantidad;
	}
	public Cola1 getCola() {
		return cola1;
	}
	public void setCola(Cola1 cola) {
		this.cola1 = cola;
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
		for (int i =0; i <15; i++){
			try {
				if(i%2==0)
					cola1.put("PING");
				else
					cola1.put("PONG");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	
	}

}
