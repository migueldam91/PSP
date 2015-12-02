package Procesos;

import java.applet.Applet;
import java.awt.Graphics;

public class AppletThread extends Applet implements Runnable {
	private Thread hilo = null;

	@Override
	public void init() {
		// TODO Auto-generated method stub
		super.init();
	}
	
	@Override
	public void start() {
		if (hilo == null){
			hilo = new Thread(this);
			hilo.start();
		}
	}
	@Override
	public void run() {
		Thread hiloActual = Thread.currentThread();
		while(hilo==hiloActual){
			
		}

	}
	@Override
	public void stop() {
		hilo=null;
	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
	}
}
