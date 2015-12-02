
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Actividad14 {
	public static void main(String[]args){
		Runtime r= Runtime.getRuntime();
		Process p;
		BufferedReader br;
		try {
			p = r.exec("java Ejemplo");
			
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
		
	}
}
