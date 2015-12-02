package Procesos.ComunicacionHilos;

public class Cuenta {
	private int saldo;

	public Cuenta(int SaldoInicial) {
		this.saldo = SaldoInicial;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public void restarSaldo(int cantidad) {
		saldo = saldo - cantidad;
	}

	synchronized public void retirarDinero(int cantidad, String nombre) {
		if (getSaldo() >= cantidad) {
			System.out.println("Se va a retirar del saldo " + cantidad + "(Saldo actual =" + getSaldo() + ")");

			try {
				Thread.sleep(500);
			} catch (InterruptedException ie) {
				System.out.println("EXCEPCION!");
			}
			restarSaldo(cantidad);
			System.out.println(nombre + " saca " + cantidad + ". Saldo actual= " + getSaldo());
		} else {
			System.out.println(
					"Lo siento, " + nombre + " no puede retirar el dinero. No hay saldo suficiente " + getSaldo());
		}

		if (getSaldo() < 0) {
			System.out.println("Saldo negativo => " + getSaldo());
		}
	}
}
