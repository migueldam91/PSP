package Hilos;

public class HiloPrioridad1 extends Thread {
	private int c = 0;
	private boolean stopHilo = false;

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public boolean isStopHilo() {
		return stopHilo;
	}

	public void setStopHilo(boolean stopHilo) {
		this.stopHilo = stopHilo;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while(!stopHilo) c++;
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		HiloPrioridad1 h1= new HiloPrioridad1();
		HiloPrioridad1 h2= new HiloPrioridad1();
		HiloPrioridad1 h3= new HiloPrioridad1();
		
		h1.setPriority(NORM_PRIORITY);
		h2.setPriority(MAX_PRIORITY);
		h3.setPriority(MIN_PRIORITY);
		
		h1.start();h2.start();h3.start();
		
		Thread.sleep(1000);
		h1.setStopHilo(true);
		h2.setStopHilo(true);
		h3.setStopHilo(true);
		
		System.out.println("H2 (Prioridad Máxima) " + h2.getC());
		System.out.println("H1 (Prioridad Normal) " + h1.getC());
		System.out.println("H3 (Prioridad Mínima) " + h3.getC());
		System.exit(0);
		
	}
	
}
