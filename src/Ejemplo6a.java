
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Ejemplo6a {

	public static void main(String[] args) throws IOException {
		Runtime r = Runtime.getRuntime();

		Process p = null;
		Process p1 = null;
		BufferedReader br = null;
		BufferedReader br2 = null;
		try {
			p = r.exec("java Ejemplo6");

			br = new BufferedReader(new InputStreamReader(p.getInputStream()));
			br2 = new BufferedReader(new InputStreamReader(System.in));	
			OutputStream outputStream = p.getOutputStream();
			String linea, aEscribir;
			System.out.println("Estoy leyendo una clasa Java ejecutada por r.exec()!");
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
				aEscribir = br2.readLine() + "\n";
				outputStream.write(aEscribir.getBytes());
				outputStream.flush();
			}
			outputStream.close();
			br2.close();
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			

		}

		// outputStreamWriter.close();

	}

}
