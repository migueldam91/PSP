package Hilos;

public class main {

	public static void main(String[] args) {
//		PrimerHilo primerHilo = new PrimerHilo(10);
//		primerHilo.start();
		
//		HiloEjemplo1 h = null;
//		for(int i =0 ; i<3;i++){
//			h=new HiloEjemplo1(i+1);
//			h.start();
//		}
//		System.out.println("3 hilos creados...");
		
		
		HiloEjemplo1_V2 h=null;
		for(int i =0; i<3;i++){
			h = new HiloEjemplo1_V2(i+1);
			h.start();
			
		}
		
		

	}

}
