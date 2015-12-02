package Procesos.Actividad26;

public class Cuenta {
	private int saldo = 0;
	private int maxSaldoCuenta = 3000;
	private boolean flagTope = false;

	public boolean isFlagTope() {
		return flagTope;
	}

	public void setFlagTope(boolean flagTope) {
		this.flagTope = flagTope;
	}

	public Cuenta(int saldo, int maxSaldoCuenta) {
		super();
		this.saldo = saldo;
		this.maxSaldoCuenta = maxSaldoCuenta;
	}

	public int getSaldo() {
		return saldo;
	}

	synchronized public void ingresarDinero(int dinero, int maxSaldoCuenta) {
		int sumaSaldo = saldo + dinero;
		if (!(sumaSaldo > maxSaldoCuenta)) {
			this.saldo += dinero;
		} else {
			flagTope = true;
			System.out.println("Lo sentimos, esta cuenta tiene un máximo de " + maxSaldoCuenta + "euros");
			System.out.println("saldo " + saldo + " Suma de la operacion "+ sumaSaldo);

		}
	}

	synchronized public void hacerReintegro(int dinero) {
		if (saldo >= 0 && saldo >= dinero) {
			this.saldo -= dinero;
		} else {
			System.out.println("No hay saldo suficiente");
			flagTope = true;
		}
	}

	public int getMaxSaldoCuenta() {
		return maxSaldoCuenta;
	}

	public void setMaxSaldoCuenta(int maxSaldoCuenta) {
		this.maxSaldoCuenta = maxSaldoCuenta;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

}
