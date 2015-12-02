package Procesos;

public class NombreHilo implements Runnable{
	
	@Override
	public void run() {
		
	}
	
	public static void main (String [] args){
		NombreHilo h = new NombreHilo();
		new Thread(h).start();
	}
}
