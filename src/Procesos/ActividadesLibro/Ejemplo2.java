package Procesos.ActividadesLibro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ejemplo2 {
	public static void main(String [] args){
		Runtime r = Runtime.getRuntime();
		String linea="";
		BufferedReader br = null;
		Process p = null;
		try {
			p = r.exec("CMD /c DIRad");
			
			br = new BufferedReader(new InputStreamReader(p.getInputStream()));
			
			
			while((linea=br.readLine())!=null){
				System.out.println(linea);
			}
			//br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int exitValue;
		InputStream bis=null;
		try{
			exitValue = p.waitFor();
			bis=p.getErrorStream();
			br=new BufferedReader(new InputStreamReader(bis));
			while((linea=br.readLine())!=null)
				System.out.println(linea);
			System.out.println("Valor de salida = "+ exitValue);
		}catch(InterruptedException ie){} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}