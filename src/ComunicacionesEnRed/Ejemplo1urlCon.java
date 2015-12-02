package ComunicacionesEnRed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class Ejemplo1urlCon {

	public static void main(String[] args) throws IOException {
		URL url = new URL("http://localhost:8080/2014/vernombre.php");
		URLConnection conexion = url.openConnection();
		conexion.setDoOutput(true);
		
		PrintWriter output = new PrintWriter(conexion.getOutputStream());
		
		output.write("nombre=Miguelito&apellido=Halys&edad=12");
		output.close();
		
		
		InputStream is = conexion.getInputStream();

		BufferedReader br = new BufferedReader(new InputStreamReader(is));

		String linea;
		while ((linea = br.readLine()) != null) {
			System.out.println(linea);
		}
		br.close();
	}

}
