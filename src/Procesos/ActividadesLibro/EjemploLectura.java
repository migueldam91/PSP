package Procesos.ActividadesLibro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class EjemploLectura {

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		InputStreamReader isr = new InputStreamReader(System.in);
		Process p = null, p1 = null;

		try {
			p = r.exec("CMD /c DIR");
			p1 = r.exec("CMD /c find \"salida\" ");
			// String palabro = new BufferedReader(isr).readLine();
			// System.out.println(palabro);

			BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
			
			OutputStream os = p1.getOutputStream();
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(os);
			String salidaProceso = "";
			while ((salidaProceso = br.readLine()) != null) {
				outputStreamWriter.write(salidaProceso+"\n");
				outputStreamWriter.flush();
			}
			outputStreamWriter.close();
			br.close();
			
			BufferedReader br1 = new BufferedReader(new InputStreamReader(p1.getInputStream()));

			while ((salidaProceso = br1.readLine()) != null){
				System.out.println(salidaProceso);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int exitValue;
		try {
			exitValue = p.waitFor();
			System.out.println("Valor de salida = " + exitValue);
		} catch (InterruptedException ie) {
		}

	}

}
