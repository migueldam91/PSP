	import java.io.BufferedReader;

	import java.io.IOException;
	import java.io.InputStreamReader;

	import java.io.OutputStream;
	import java.io.OutputStreamWriter;
public class TareaProcesos {

		public static void main(String[] args) throws IOException {
			Runtime r = Runtime.getRuntime();
			Process p, p1;
			
			String linea;
			BufferedReader br=null;
			OutputStream os=null;
			BufferedReader br1=null;

			try{
				
				p=r.exec("cmd /c dir ");
				
				p1=r.exec("cmd /c find \"salida\" ");
				br = new BufferedReader(new InputStreamReader(p.getInputStream()));
		
				os = p1.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(os);
				//Se escribe en el flujo de comunicacion "out" de p1 el resultado de la salida de p.
				while((linea=br.readLine())!=null){	
					System.out.println(linea);
					osw.write(linea+"\n");
					osw.flush();
				}
				
				osw.close();
				br.close();
				br1=new BufferedReader(new InputStreamReader(p1.getInputStream()));
				
				while((linea=br1.readLine())!=null){	
					System.out.println(linea);
				}
				
			}catch(IOException ioe){
				ioe.printStackTrace();
			}finally{
				br1.close();
			}
			
		}

	}


