package Procesos.AppletCronometro;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContadorApplet extends Applet implements Runnable,ActionListener{
	private Thread h;
	private Button b1,b2;
	private boolean parar=false;
	private Font fuente;
	private long contador=0;
	@Override
	public void init() {
		b1= new Button("Iniciar contador");
		add(b1);
		b2= new Button ("Parar contador");
		add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		fuente = new Font("Arial",Font.BOLD,24);
	}
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		super.start();
	}
	@Override
	public void run() {
		parar=false;
		Thread hiloActual = Thread.currentThread();
		while(h == hiloActual && !parar){
			try{
				Thread.sleep(300);
			}catch(InterruptedException ie){};
		repaint();
		contador++;
		}
		
	}

	@Override
	public void paint(Graphics g) {
		g.clearRect(0, 0, 400, 400);
		g.setFont(fuente);
		g.drawString(Long.toString(contador), 80, 100);
	}
	
	@Override
	public void stop() {
		h=null;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		b1.setLabel("continuar");
		if(e.getSource()==b1){
			if (!(h!=null && h.isAlive())){
				h=new Thread(this);
				h.start();
			}
		}else{
			if (e.getSource()==b2){
				parar=true;
			}
		}
		
	}
	

}
