import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.omg.CORBA_2_3.portable.OutputStream;


public class Ejemplo3 {

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		String comando = "CMD /C DATE";
		Process p = null;
		try{
			p=r.exec(comando);
			
			java.io.OutputStream os =  p.getOutputStream();
			os.write("02-12-2012".getBytes());
			os.flush();
			
			InputStreamReader isr = new InputStreamReader(p.getInputStream());
			BufferedReader br = new BufferedReader(isr);
			
			String linea;
			while((linea=br.readLine())!=null)
				System.out.println(br.readLine());
		
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
