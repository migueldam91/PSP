package ProcesosHilos;

public class Ejercicio1a implements Runnable{
	private int numero;
	
	public Ejercicio1a(int n){
		this.numero=n;
	}

	public void run() {
		int n1=1,n2=1,nx=0;
		System.out.println("Implements Runnable: ");
		System.out.println(n1 + "\n" + n2);
		for(int i =0 ;i<numero;i++){
			nx=n1+n2;
			n1=n2;
			n2=nx;
			System.out.println(nx);
			
		}
		
	}




}
