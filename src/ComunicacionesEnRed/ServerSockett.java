package ComunicacionesEnRed;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSockett {

	public static void main(String[] args) throws IOException {
		int port = 6000;
		ServerSocket serverSocket = new ServerSocket(6000);
		System.out.println("Escuchando en puerto " + serverSocket.getLocalPort());
		//realiza acciones con el cliente
		Socket cliente = new Socket("localhost",6000); // escucha acciones del cliente
		InetAddress i = cliente.getInetAddress();
		
		System.out.println("nombre host local " + i.getHostName());
		System.out.println("Dirección host "+i.getHostAddress());
		System.out.println("Direccion local " + i.getLocalHost());
		System.out.println("Puerto local " + cliente.getLocalPort());
		System.out.println("Puerto "+ cliente.getPort());
		cliente.close();
		serverSocket.close();
	}

}
