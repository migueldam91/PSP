package ComunicacionesEnRed;

import java.net.MalformedURLException;
import java.net.URL;

public class Ejemplo1URL {

	public static void main(String[] args) throws MalformedURLException {
	URL url ;
	
	url=new URL("http://docs.oracle.com");
	
	visualizar(url);
	
	
	System.out.println("***********");
	url= new URL("http", "www.elconfidencial.es", "rajoy-incorpora-la-doble-vuelta-en-municipales-para-acabar-con-los-pactos-de-perdedores_1109422");
	visualizar(url);

	System.out.println("***********");
	url = new URL("http", "docs.oracle.com", 80,"/javase/7");
	visualizar(url);
	
	System.out.println("***********");
	URL urlBase= new URL("http://docs.oracle.com/");
	
	url = new URL(urlBase, "/javase/7/docs/api/java/net/URL.html");
	visualizar(url);

	
	}

	public static void visualizar(URL url){
		System.out.println("\t toString() " + url.toString());
		System.out.println("\t getProtocol() " + url.getProtocol());
		System.out.println("\t getPort() " + url.getPort());
		System.out.println("\t getHost() " + url.getHost());
		System.out.println("\t getFile() " + url.getFile());
		System.out.println("\t getUserInfo() " + url.getUserInfo());
		System.out.println("\t getPath() " + url.getPath());
		System.out.println("\t getAuthority() " + url.getAuthority());
		System.out.println("\t getQuery() " + url.getQuery());
		
		
	}
}
