package Procesos.Actividad26;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javafx.scene.text.Font;

public class AppletPrioridad extends Applet {
	long puntoInicio = 0;

	HiloContador h1 = new HiloContador(puntoInicio, "Hilo 1"), h2 = new HiloContador(puntoInicio, "Hilo 2"),
			h3 = new HiloContador(puntoInicio, "Hilo 3");
	java.awt.Font fuente;
	int priority = 0;
	Button b1, b2, b3, bi1, bi2, bi3, bd1, bd2, bd3,bft;
	private botonListener b1l = new botonListener(h1);
	private botonListener b2l = new botonListener(h2);
	private botonListener b3l = new botonListener(h3);

	@Override
	public void init() {
		// TODO Auto-generated method stub
		super.init();
		b1 = new Button("Finalizar Hilo1");
		bi1 = new Button("++");
		bd1 = new Button("--");
		
		add(bd1);
		add(b1);		add(bi1);
		b1.addActionListener(b1l);
		bi1.addActionListener(b1l);
		bd1.addActionListener(b1l);

		b2 = new Button("Finalizar Hilo2");
		bi2 = new Button("++");
		bd2 = new Button("--");
		
		add(bd2);
		add(b2);
		add(bi2);
		b2.addActionListener(b2l);
		bi2.addActionListener(b2l);
		bd2.addActionListener(b2l);

		b3 = new Button("Finalizar Hilo3");
		bi3 = new Button("++");
		bd3 = new Button("--");
		
		add(bd3);
		add(b3);
		add(bi3);
		b3.addActionListener(b3l);
		bi3.addActionListener(b3l);
		bd3.addActionListener(b3l);
		
		bft= new Button("Finalizar Todos");
		add(bft);
		bft.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				h1.setParar(true);h2.setParar(true);h3.setParar(true);
			}
		});

	}

	public void bajarPrioridad(HiloContador h) {
		
		priority = h.getPriority();
		if (priority < Thread.MAX_PRIORITY){
			System.out.println("*** Bajando prioridad hilo " + h.getName() + " ***");
			priority++;
		}else {
			System.out.println("!! Minima prioridad !!");
		}
		h.setPriority(priority);
	}

	public void subirPrioridad(HiloContador h) {
		
		priority = h.getPriority();
		System.out.println("Min "+ Thread.MIN_PRIORITY+ " Max "+ Thread.MAX_PRIORITY);
		if (priority> Thread.MIN_PRIORITY){
			System.out.println("*** Subiendo prioridad hilo " + h.getName() + " ***");
			priority--;
		}else {
			System.out.println("!! Maxima prioridad !!");
		}
		h.setPriority(priority);
	}

	@Override
	public void start() {
		fuente = new java.awt.Font("Arial", java.awt.Font.BOLD, 16);
		h1.start();
		h2.start();
		h3.start();
	}

	public void stop() {
		Thread hilocontador = Thread.currentThread();
		hilocontador = null;
	}

	@Override
	public void paint(Graphics g) {
		g.clearRect(0, 0, 400, 400);
		g.setFont(fuente);
		pintarLinea(g, h1, 1, 150);
		pintarLinea(g, h2, 1, 200);
		pintarLinea(g, h3, 1, 250);

	}

	public void pintarLinea(Graphics g, HiloContador h, int posX, int posY) {
		g.drawString(h.getName(), posX, posY);
		g.drawString(String.valueOf(h.getContador() / 1000), posX + 49, posY);
		g.drawString("Prioridad " + String.valueOf(h.getPriority()), posX + 99, posY);
	}

	public class HiloContador extends Thread {
		private boolean parar = false;
		private long contador = 0;
		private int prioridad = NORM_PRIORITY;

		public HiloContador(long conta, String nombre, int priorit) {
			super(nombre);
			this.contador = conta;
			this.prioridad = priorit;
		}

		public HiloContador(long puntoInicio, String string) {
			super(string);
			this.contador = puntoInicio;
		}

		
		public int getPrioridad() {
			return prioridad;
		}

		public void setPrioridad(int prioridad) {
			this.prioridad = prioridad;
		}

		@Override
		public void run() {
			while (!parar) {
				contador++;

				repaint();
			}
		}

		public boolean isParar() {
			return parar;
		}

		public void setParar(boolean parar) {
			this.parar = parar;
		}

		public long getContador() {
			return contador;
		}

		public void setContador(long contador) {
			this.contador = contador;
		}
	}

	public class botonListener implements ActionListener {
		private HiloContador h = null;

		public botonListener(HiloContador h) {
			this.h = h;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == b1) {
				h.setParar(true);
			} else if (e.getSource() == bi1) {
				subirPrioridad(h);
			} else if (e.getSource() == bd1) {
				bajarPrioridad(h);
			} else if (e.getSource() == b2) {
				h.setParar(true);
			} else if (e.getSource() == bi2) {
				subirPrioridad(h);
			} else if (e.getSource() == bd2) {
				bajarPrioridad(h);
			} else if (e.getSource() == b3) {
				h.setParar(true);
			} else if (e.getSource() == bi3) {
				subirPrioridad(h);
			} else if (e.getSource() == bd3) {
				bajarPrioridad(h);
			}
		}
	}

}
