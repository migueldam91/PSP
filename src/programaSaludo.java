
public class programaSaludo {

	public static void main(String[] args) {
		if (args.length==0){
			System.out.println("Mete alg�n argumento");
		}else
			for (int i=0; i<5;i++)
				System.out.println(args[0]);
	}

}
