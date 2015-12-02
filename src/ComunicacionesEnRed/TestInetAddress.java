package ComunicacionesEnRed;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TestInetAddress {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress dir = InetAddress.getLocalHost();
		System.out.println("**** Localhost ****");
		probarMetodos(dir);
		
		Scanner in = new Scanner(System.in);
		
		String nombreSitio = in.nextLine();
		System.out.println("*** URL ***");
		boolean o=false;
		while(!o){
		dir = InetAddress.getByName(nombreSitio);
		o=true;
		}
		probarMetodos(dir);
		
		System.out.println("*** Array de direcciones IP para "+ dir.getHostName() +" ***");
		InetAddress[] direcciones = InetAddress.getAllByName(dir.getHostName());
		for(int i =0 ; i<direcciones.length;i++)
			System.out.println("\t\t"+direcciones[i].toString());
		
	}
	
	public static void probarMetodos(InetAddress dir){
		InetAddress dir2;
		try{
			dir2 = InetAddress.getLocalHost();
			System.out.println("\t Método getLocalHost(): " + dir2);
		}catch (UnknownHostException uhe){uhe.printStackTrace();}
		
		System.out.println("\t Método getHostName(): " + dir.getHostName());
		System.out.println("\t Método getLocalHost(): " + dir.getHostAddress());
		System.out.println("\t Método toString(): " + dir.toString());
		System.out.println("\t Método getCanonicalHostName(): "+ dir.getCanonicalHostName());
		
		
	}
}
