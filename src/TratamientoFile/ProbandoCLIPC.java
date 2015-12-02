package TratamientoFile;

import java.io.File;
import java.io.IOException;

import com.lts.ipc.IPCException;
import com.lts.ipc.Utils;
import com.lts.ipc.sharedmemory.SharedMemory;

public class ProbandoCLIPC {
	public static void main(String[] args) throws IOException, IPCException {
		String path = new File("").getAbsolutePath();

		String filename = "C:/Users/Miguel/git/PSP/src/Nuevo documento de texto.txt";
		String nombreFichero = "Cacota.txt";
		File ficherito = new File(path.concat("/src/") + nombreFichero);
		ficherito.createNewFile();
		System.out.println("Prueba -->" + ficherito.getAbsolutePath());
		File fichero = new File(filename);
		
		System.out.println(fichero.exists() + " " + fichero.getAbsolutePath());
		SharedMemory sharedMemory= new SharedMemory();
		sharedMemory.connect(ficherito, 2);	sharedMemory.connect(fichero, 3);
		try {
			System.out.println(Utils.readFile(fichero));
			Utils.writeFile(ficherito, "Lo escrito con la libreria CLIPC!!");
			System.out.println(Utils.checkFile(ficherito));
			
		} catch (IOException | IPCException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
