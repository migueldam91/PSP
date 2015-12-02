package Procesos.Actividad26;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppletLetra extends Applet implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private HiloMovimiento hilo = new HiloMovimiento(1);
	private Font fuente;
	private Button b1;
	private int posX = 0;

	private String[] mensButon = { "Finalizar Hilo", "Reanudar hilo" };

	@Override
	public void init() {
		// TODO Auto-generated method stub
		super.init();
		b1 = new Button(mensButon[0]);
		add(b1);
		b1.addActionListener(this);
		fuente = new Font("Arial", Font.BOLD, 32);

	}

	@Override
	public void start() {
		hilo.start();

	}

	@Override
	public void stop() {
		hilo = null;
	}

	@Override
	public void paint(Graphics g) {
		g.clearRect(0, 0, 400, 400);
		g.setFont(fuente);
		g.drawString("O", hilo.getPosX(), 100);
	}

	@Override
	synchronized public void actionPerformed(ActionEvent arg0) {
		if (!hilo.isAlive()) {
			b1.setLabel(mensButon[0]);
			hilo = new HiloMovimiento(posX);
			hilo.start();
		} else {
			b1.setLabel(mensButon[1]);
			hilo.interrupt();
			pararHilo(hilo);
		}
	}

	public void pararHilo(Thread t) {
		t = null;

	}

	public class HiloMovimiento extends Thread {
		private int posX = 1;

		public HiloMovimiento(int posicion) {
			this.posX = posicion;
		}

		public int getPosX() {
			return posX;
		}

		public void setPosX(int posX) {
			this.posX = posX;
		}

		@Override
		public void run() {
			boolean volver = false;
			while (!this.isInterrupted()) {
				posX = hilo.getPosX();
				if (posX >= getSize().width)
					volver = true;
				else if (posX == 1)
					volver = false;
				if (!volver)
					posX++;
				else
					posX--;
				repaint();
			}
		}
	}
}
