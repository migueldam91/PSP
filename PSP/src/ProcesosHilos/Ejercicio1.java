package ProcesosHilos;

public class Ejercicio1 extends Thread {
	private int numero;
	
	public Ejercicio1(int n){
		this.numero=n;
	}
	
	
	public void run() {
		// Código a ejecutar por el hilo
		System.out.println("Hola desde el hilo creado por Thread!");
		int n1=1,n2=1,nx=0;
		System.out.println(n1 + "\n" + n2);
		for(int i =0 ;i<numero;i++){		
			nx=n1+n2;
			n1=n2;
			n2=nx;
			System.out.println(nx);
			
		}
		
	}

}
