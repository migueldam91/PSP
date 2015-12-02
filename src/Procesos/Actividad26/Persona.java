package Procesos.Actividad26;

public class Persona extends Thread {
	private String nombre;
	private Cuenta cuentaPersonal;
	private int aleatorio;
	private int sexo;
	public static int SEXO_HOMBRE=1,SEXO_MUJER=0;

	
	
	public Persona(String nombre, Cuenta cuentaPersonal) {
		super();
		this.nombre = nombre;
		this.cuentaPersonal = cuentaPersonal;
	}

	
	
	public Persona(String nombre, Cuenta cuentaPersonal, int sexo) {
		super();
		this.nombre = nombre;
		this.cuentaPersonal = cuentaPersonal;
		this.sexo = sexo;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		for (int i = 0; i < 4&& !cuentaPersonal.isFlagTope() && sexo==1; i++) {
			aleatorio= ((int) (Math.random() * 700) + 1);
			cuentaPersonal.ingresarDinero(aleatorio, cuentaPersonal.getMaxSaldoCuenta());
			System.out.println(nombre + " hace un ingreso de "+ aleatorio);
			
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			aleatorio = ((int) (Math.random() * 300) + 1);
			cuentaPersonal.hacerReintegro(aleatorio);
			System.out.println(nombre + " hace un reintegro de "+ aleatorio);
			
		}
		
		for (int i = 0; i < 4&& !cuentaPersonal.isFlagTope() && sexo==0; i++) {
			aleatorio = ((int) (Math.random() * 400) + 1);
			cuentaPersonal.hacerReintegro(aleatorio);
			System.out.println(nombre + " hace un reintegro de "+ aleatorio);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			aleatorio= ((int) (Math.random() * 600) + 1);
			cuentaPersonal.ingresarDinero(aleatorio, cuentaPersonal.getMaxSaldoCuenta());
			System.out.println(nombre + " hace un ingreso de "+ aleatorio);
		}
	}

}
