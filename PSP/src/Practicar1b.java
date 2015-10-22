import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practicar1b {

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		Process p;
		BufferedReader br =null;
		try {
			p=r.exec("java Ejemplo2");
			InputStreamReader isr = new InputStreamReader(p.getInputStream());
			br= new BufferedReader(isr);
			String linea;
			while((linea=br.readLine())!=null)
				System.out.println(br.readLine());
			
			p=r.exec("java Nombre "+ args[0]);
			isr= new InputStreamReader(p.getInputStream());
			br = new BufferedReader(isr);
			System.out.println("\n\nCambio a otro comando\n");
			System.out.println(br.readLine());
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	}

}
