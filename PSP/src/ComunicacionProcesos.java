import java.io.*;
 
 
public class ComunicacionProcesos {
 
   	public static void main(String[] args) throws IOException {
         	// TODO Auto-generated method stub
 
         	Runtime r = Runtime.getRuntime();
         	String com1 = "CMD /C DIR C:\\Windows\\";
         	String com2 = "CMD /C find \"ehome\" ";
         	
         	Process p1 = null;
         	Process p2 = null;
         	OutputStreamWriter os=null;
         	BufferedReader br=null;
         	BufferedReader brs =null;
         	try{
                	
                	p1 = r.exec(com1);
                	p2 = r.exec(com2);
                	InputStream is = p1.getInputStream();
                	InputStream iss = p2.getInputStream();
                	 br= new BufferedReader(new InputStreamReader(is));
                	
                	os = new OutputStreamWriter(p2.getOutputStream());
 
                	String resul;
                	
                	while((resul = br.readLine()) != null){
                       	System.out.println(resul);
                       	os.write(resul + "\n");
                       	os.flush();
                	}
                	br.close();
                	
             		os.close(); 
                	
                	
                	
                	brs= new BufferedReader(new InputStreamReader(iss));
                	
                	String salida;
                	
                	while((salida = brs.readLine()) != null){
                       	System.out.println(salida);
        
                	}
         	   	brs.close();
   	
         	}catch(Exception e){
                	e.printStackTrace();
         	}finally{
         		
         		
         	}
         	
   	}
 
}
