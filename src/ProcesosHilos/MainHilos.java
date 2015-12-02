package ProcesosHilos;

import java.util.Scanner;

public class MainHilos extends Thread {
	int n = 0;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		Scanner in = new Scanner(System.in);
		int opc = 0;
		while (true) {
			System.out.println("Seleccione Ejercicio ");
			System.out.println("1.Fibonacci \t 2.Cuenta atras \t 3.Controlador descontrolado \t 4.salir");
			opc = in.nextInt();
			switch (opc) {
			case 1:
				Ejercicio1();
				break;
			case 2:
				Ejercicio2();
				break;
			case 3:
				Ejercicio3();
				break;
			case 4:
				System.exit(0);
				break;
			default:
				break;
			}
		}

	}

	public static void Ejercicio1() {
		new Ejercicio1(5).run();
		new Ejercicio1a(5).run();
	}

	public static void Ejercicio2() {
		new Ejercicio2().run();
	}

	public static void Ejercicio3() throws InterruptedException {
		System.out.println("Comienza del contador descontrolado");
		Thread t = new Ejercicio3();
		t.start();
		sleep(1000);
		t.stop();
		System.out.println("Fin del contador descontrolado");
	}
}
