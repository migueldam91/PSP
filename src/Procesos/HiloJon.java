package Procesos;

public class HiloJon extends Thread {
	private int n;
	private String nombre;

	public HiloJon(String nom , int c) {
		super(nom);
		this.n = c;
	}
	
	@Override
	public void run() {
		super.run();
		for(int i=1;i<=n;i++){
			System.out.println(getName() + ": "+ i);
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("Fin bucle " + getName());
	}
	
	
	public static void main(String [] args){
		HiloJon h1= new HiloJon("Hilo1", 2);
		HiloJon h2= new HiloJon("Hilo2", 5);
		HiloJon h3= new HiloJon("Hilo3", 7);
		h1.start();h2.start();h3.start();
		try{
			h1.join();h2.join();h3.join();
		}catch(InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("fin programa!!!!!!");
	}
	

}
