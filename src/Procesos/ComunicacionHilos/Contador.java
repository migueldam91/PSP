package Procesos.ComunicacionHilos;

public class Contador {
	private int c=0;

	public Contador(int c) {
		super();
		this.c = c;
	}

	public void incrementa(){
		c++;
	}
	
	public void decrementa(){
		c--;
	}
	
	public int getC() {
		return c;
	}


	
	
}
