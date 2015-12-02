package Procesos.AppletReloj;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Reloj extends Applet implements Runnable {

	private Thread hilo = null;
	private Font fuente;
	private String horaActual = "";

	@Override
	public void init() {
		fuente = new Font("Verdana", Font.ITALIC, 26);
		super.init();
	}

	@Override
	public void start() {
		if (hilo == null) {
			hilo = new Thread(this);
			hilo.start();
		}
	}

	@Override
	public void run() {
		Thread hiloActual = Thread.currentThread();
		while (hilo == hiloActual) {
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
			Calendar cal = Calendar.getInstance();
			horaActual = sdf.format(cal.getTime());
			repaint();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
			}
		}
	}
	@Override
	public void paint(Graphics g) {
		g.clearRect(1, 1, getSize().width, getSize().height);
		setBackground(Color.yellow);
		g.setFont(fuente);
		g.drawString(horaActual, 20, 50);
	}
}
