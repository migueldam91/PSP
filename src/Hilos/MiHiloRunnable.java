package Hilos;

public class MiHiloRunnable implements Runnable{
	private String nombre;
	private int duracion;
	
	
	public MiHiloRunnable(String nom,int dura){
		this.nombre=nom;
		this.duracion=dura;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	
	public static void main(String[] args) {
		MiHiloRunnable h1 = new MiHiloRunnable("Hilo1",200);
		
		new Thread(h1).start();

	}

	

}
