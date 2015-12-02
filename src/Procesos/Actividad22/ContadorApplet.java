package Procesos.Actividad22;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContadorApplet extends Applet implements ActionListener {
	private HiloContador h1 = new HiloContador(0), h2 = new HiloContador(0);
	private Button b1, b2;
	private Font fuente;

	@Override
	public void init() {
		b1 = new Button("Finalizar hilo 1");add(b1);
		b2 = new Button("Finalizar hilo 2");add(b2);

		b1.addActionListener(this);	b2.addActionListener(this);
		fuente = new Font("Arial", Font.BOLD, 24);

		h1.start();	h2.start();
	}

	
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		super.start();
	}

	@Override
	public void paint(Graphics g) {
		g.clearRect(0, 0, 400, 400);
		g.setFont(fuente);
		g.drawString(Long.toString(h1.getContador()), 80, 100);
		g.drawString(Long.toString(h2.getContador()), 100, 120);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == b1) {
			if ((h1 != null && h1.isAlive())) {
				h1.pararHilo();
				b1.setLabel("finalizado");
			}
		} else if (e.getSource() == b2)
			if (h2 != null && h2.isAlive()) {
				h2.pararHilo();
				
				b2.setLabel("finalizado");
			}
	}

	class HiloContador extends Thread {
		private boolean parar = false;
		private long contador = 0;

		public HiloContador(long c) {
			this.contador = c;

		}

		public long getContador() {
			return contador;
		}

		@Override
		public void run() {
			
			Thread hiloActual = Thread.currentThread();
			while (this == hiloActual && !parar) {
				try {
					Thread.sleep(300);
				} catch (InterruptedException ie) {
				}
				;
				repaint();
				contador++;
			}
		}

		public void pararHilo(){
			parar=true;
		}
	}
}
