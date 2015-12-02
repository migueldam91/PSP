package Procesos.ComunicacionHilos;

public class SacarDinero extends Thread {
	private Cuenta c;
	String nombre;

	public SacarDinero(Cuenta c, String nombre) {
		super();
		this.c = c;
		this.nombre = nombre;
	}

	public Cuenta getC() {
		return c;
	}

	public void setC(Cuenta c) {
		this.c = c;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();

		for (int x = 1; x <= 4; x++) {
			c.retirarDinero(10, nombre);
		}
	}
}
