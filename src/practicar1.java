import java.io.IOException;

/*
 * programa java ejecute comando dir. 
 * Crear programa java que recibe desde cmd un nombre y lo visualice
 * utiliza el programa anterior para ejecutarlo
 * 
 */
public class practicar1 {
	public static void main (String[] args){
		Runtime r = Runtime.getRuntime();
		Process p ;
		Process p1;
		
		try{
			p=r.exec("java Ejemplo2");
			try{
                 p.waitFor();
             
			}catch(Exception e)
             {
                 e.printStackTrace();
             }
			p1=r.exec("java Nombre "+args[0]);
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
	}

}
