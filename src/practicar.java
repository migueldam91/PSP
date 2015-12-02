import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream.GetField;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
/*
 * programa que permita ejecutar este programa;
	programa en java que muestre en pantalla 5 veces un saludo que se envía desde la línea de comandos.
	y guarde los mensajes generados por dicho programa en un fichero de texto. 
	Que será pasado como un argumento por la linea de comandos.
	
	programa que permita ejecutar el programa anterior (DIR). 
	y guarde los mensajes generados por dicho programa en un fichero de texto. 
	Que será pasado como un argumento por la linea de comandos.
*/
public class practicar {

	public static void main(String[] args) throws IOException {
		Runtime r = Runtime.getRuntime();
		Process p ;
		String linea;
		InputStream is=null;
		BufferedReader br=null;
		BufferedWriter bw=null;
		/*
		 * FileOutputStream fos = new FileOutputStream(args[0]);
		 * PrintWriter pw = new PrintWriter (fos);
		 */
		
		File f = new File(args[0]);
		f.createNewFile();
		
		try{
			p=r.exec("java programaSaludo Hallo!");
			is = p.getInputStream();
			br= new BufferedReader(new InputStreamReader(is));
			bw= new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f)));

			

			while((linea=br.readLine())!=null){	
				bw.write(linea);
				bw.newLine();
				/*
				 * pw.write(linea+"\r+\n);
				 * sysout(linea)
				 */
				
			}
		}catch(IOException ioe){
			ioe.printStackTrace();
		}finally{
				bw.flush();
				bw.close();
				br.close();
		}
		
	}

}
