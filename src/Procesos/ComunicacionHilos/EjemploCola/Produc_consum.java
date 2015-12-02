package Procesos.ComunicacionHilos.EjemploCola;

import Procesos.ComunicacionHilos.EjemploCola.PingPong.Cola1;
import Procesos.ComunicacionHilos.EjemploCola.PingPong.Consumidor1;
import Procesos.ComunicacionHilos.EjemploCola.PingPong.Productor1;

public class Produc_consum {

	public static void main(String[] args) {
		Cola1 cola = new Cola1();
		Productor1 p = new Productor1(cola, 1);
		Consumidor1 c = new Consumidor1(cola, 1);
		p.start();c.start();

	}

}
