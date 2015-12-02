
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejemplo4 {
	public static void main(String [] args) throws InterruptedException{
	Runtime r = Runtime.getRuntime();
	Scanner in = new Scanner(System.in);
	BufferedReader br;
	Process p = null;
	OutputStream os=null;
	try {
		p = r.exec("CMD /c date");
		
		os= p.getOutputStream();
		
		
		br = new BufferedReader(new InputStreamReader(p.getInputStream()));
		
		
		String linea="";
		os.write("12-01-2015".getBytes());
		os.flush();
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
