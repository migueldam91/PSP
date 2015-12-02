
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejemplo {
	public static void main(String [] args){
		Runtime r = Runtime.getRuntime();
		
		BufferedReader br;
		Process p = null;
		try {
			p = r.exec("CMD /c DIR");
			
			br = new BufferedReader(new InputStreamReader(p.getInputStream()));
			
			String linea="";
			while((linea=br.readLine())!=null){
				System.out.println(linea);
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int exitValue;
		try{
			exitValue = p.waitFor();
			System.out.println("Valor de salida = "+ exitValue);
		}catch(InterruptedException ie){}
		
		
	}
}
