import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import com.lts.ipc.IPCException;
import com.lts.ipc.Utils;


public class Programasuma {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Introduzca un n�mero: ");
		int num1=in.nextInt();
		System.out.println("Introduzca un segundo n�mero");
		int num2=in.nextInt();
		
		
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
	}

}
