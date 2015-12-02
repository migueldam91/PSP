package Procesos.ActividadesLibro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ejemplo6a {

	public static void main(String[] args) throws IOException {
		Runtime r = Runtime.getRuntime();
		
		Process p=null;
		Process p1=null;
		
		
		p=r.exec("java Ejemplo6");
		
		InputStreamReader isr = new InputStreamReader(p.getInputStream());
		BufferedReader br = new BufferedReader(isr);
		String linea;
		while((linea=br.readLine())!=null){
			System.out.println(linea);
		}
		
		InputStream ie = p.getErrorStream();
		BufferedReader br1 = new BufferedReader(new InputStreamReader(ie));
		while((linea=br1.readLine())!=null){
			System.out.println(linea);
		}

	}

}
