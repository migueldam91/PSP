package Hilos;

public class HiloPrioridad2 extends Thread {

	public HiloPrioridad2(String nom) {
		super(nom);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("Ejecutando ["+ getName() + "]");
		for(int i =0;i <=5;i++)
			System.out.println("\t (" + getName()+ ": "+ i + ")");
	}

	public static void main(String[] args) {
		HiloPrioridad2 h1= new HiloPrioridad2("Uno");
		HiloPrioridad2 h2= new HiloPrioridad2("Dos");
		HiloPrioridad2 h3= new HiloPrioridad2("Tres");
		HiloPrioridad2 h4= new HiloPrioridad2("Cuatro");
		HiloPrioridad2 h5= new HiloPrioridad2("Cinco");
		
		h1.setPriority(4);
		h2.setPriority(3);
		h3.setPriority(Thread.NORM_PRIORITY);
		h4.setPriority(7);
		h5.setPriority(7);
		
		h1.start();
		h2.start();
		h3.start();
		h4.start();
		h5.start();
	}

}
