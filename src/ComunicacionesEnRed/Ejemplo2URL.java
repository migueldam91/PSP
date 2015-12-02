package ComunicacionesEnRed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class Ejemplo2URL {

	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.aboxsystem.com");
		
		URLConnection conexion = url.openConnection();
		Map<String, List<String>> lista= conexion.getHeaderFields();
		for (String iterator:lista.keySet())
			System.out.println(iterator);
		
		
		InputStream is = conexion.getInputStream();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		
		
		String linea;
		while((linea=br.readLine())!=null){
			System.out.println(linea);
		}
		br.close();
	}
}
