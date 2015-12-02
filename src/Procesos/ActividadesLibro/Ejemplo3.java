package Procesos.ActividadesLibro;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Paths;

public class Ejemplo3 {
	public static void main(String[]args){
		
		Runtime r= Runtime.getRuntime();
		File file =new File("C:\\Users\\Miguel\\git\\PSP\\PSP\\src\\Procesos\\ActividadesLibro\\SVCHOST.txt");
		Process p=null;
		BufferedReader br;
		PrintWriter pw;
		try{
			
			p=r.exec("cmd /c tasklist");
			br = new BufferedReader(new InputStreamReader(p.getInputStream()));
			FileOutputStream fos = new FileOutputStream(file);
			pw = new PrintWriter(fos);
			String linea="";
			while((linea=br.readLine())!=null){
				System.out.println(linea);
				pw.write(linea);
				pw.flush();
			}
			
		}catch(IOException ioe){}
	}


}
