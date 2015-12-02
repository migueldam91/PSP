package ComunicacionesEnRed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Ejemplo2urlcon {

	public static void main(String[] args) throws IOException {
		URL url = new URL("http://localhost:8080/2014/vernombre.php");
		
		URLConnection conexion = url.openConnection();
		
		System.out.println("Direccion "+ conexion.getURL());
		Date fecha = new Date(conexion.getLastModified());
		System.out.println("Fecha ultima modificación " + fecha);
		
		System.out.println("Tipo de contenido " + conexion.getContentType());
		
		System.out.println("****");

		System.out.println("Todos los campos de la cabecera: ");
		
		Map<String,List<String>> cabeceras=conexion.getHeaderFields();
		Iterator it = cabeceras.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry map = (Map.Entry)it.next();
			System.out.println(map.getKey()+ " " + map.getValue());
		}
		System.out.println("***");
		
		System.out.println("Campo 1");
		System.out.println("getHeaderFields(1)  " + conexion.getHeaderField(1));
		
		System.out.println("Contenido de url.getFile()");
		System.out.println(url.getFile());
		BufferedReader pagina = new BufferedReader(new InputStreamReader(url.openStream()));
		String cadena;
		while ((cadena=pagina.readLine())!=null){
			System.out.println(cadena);
		}
	}

}
