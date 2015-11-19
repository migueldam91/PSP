import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		String comando = "java Programasuma";
		Process p = null;
		
		try {
			p = r.exec(comando);
			BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
			OutputStream os = p.getOutputStream();
			
			
			Scanner in=new Scanner(System.in);
			String linea;
			
			while ((linea=br.readLine())!= null){
				System.out.println(linea);
				os.write((in.next()+"\n").getBytes());
				os.flush();
				
			}
			
			
		} catch (Exception e) {
			e.getMessage();
		}

	}

}
