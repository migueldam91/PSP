import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TareaProcesos {

	public static void main(String[] args) throws IOException {
		Runtime r = Runtime.getRuntime();
		Process p = null, p1 = null;

		String linea;
		BufferedReader br = null;
		OutputStream os = null;

		try {
			
			p = r.exec("cmd /c dir ");
			p1 = r.exec("cmd /c find \"Procesos\" ");
			
			br = new BufferedReader(new InputStreamReader(p.getInputStream()));

			OutputStreamWriter osw1 = new OutputStreamWriter(p1.getOutputStream());
			System.out.println("Prueba");
			// Se escribe en el flujo de comunicacion "out" de p1 el resultado
			// de la salida de p.
			while ((linea = br.readLine()) != null) {
				osw1.write(linea + "\n");
				osw1.flush();
			}
			System.out.println("Prueba");
			osw1.close();
//			br.close();

			BufferedReader br1 = new BufferedReader(new InputStreamReader(p1.getInputStream()));
			while ((linea = br1.readLine()) != null) {
				System.out.println(linea);
			}
			br1.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		System.out.println("Prueba");
		 InputStreamReader isr = new InputStreamReader(p.getErrorStream());
		 InputStreamReader isr1 = new InputStreamReader(p1.getErrorStream());
		
		 BufferedReader br2=new BufferedReader(isr);
		
		 while((linea=br2.readLine())!=null){
		 System.out.println(linea);
		 }
		System.out.println("Prueba");

		int exitValue;
		try {
			exitValue = p.waitFor();
			System.out.println("Valor de salida = " + exitValue);
		} catch (InterruptedException ie) {
		}
	}

}
