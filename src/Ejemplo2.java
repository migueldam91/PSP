import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class Ejemplo2 {

	public static void main(String[] args) throws IOException {

		Runtime r = Runtime.
				getRuntime();
		
		String comando = "CMD /C DIR ";
		Process p = null;
		BufferedReader br=null;
		try
		{
			p= r.exec(comando);
			InputStream is = p.getInputStream();
			br = new BufferedReader(new InputStreamReader(is));
			String linea;
				while((linea=br.readLine())!=null)
					System.out.println(linea);
				
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally{
			br.close();
		}
		
		
		//Otro flujo de mensajes, en este caso el de errores.
		try{
			InputStream er = p.getErrorStream();
			BufferedReader brer = new BufferedReader(new InputStreamReader(er));
			
			String liner = null;
			while((liner= brer.readLine())!=null){
				System.out.println("Error >>" + liner);
			}
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		
		// comprobacion de error - 0 bien 1 - mal
		int exitVal;
		try{
			exitVal=p.waitFor();
			System.out.println("Valor de salida: "+ exitVal);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		
	}

}
