import java.io.IOException;

/*
 * programa java ejecute comando dir. 
 * Crear programa java que recibe desde cmd un nombre y lo visualice
 * utiliza el programa anterior para ejecutarlo
 * 
 */
public class practicar1{
	Thread t1,t2;
	public static void main(String[] args) throws IOException {

		Runtime r = Runtime.getRuntime();
		r.exec("java Nombre");
		Thread t1 = new Thread() {
			public void run() {
				try {
					r.exec("java Nombre");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				try {
					r.exec("java Ejemplo2");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
	t1.start();	
	t2.start();
	}
	
		/*
		 * Process p; Process p1;
		 * 
		 * String comando = "CMD /C DIR"; Runtime r = Runtime.getRuntime();
		 * String [] processes = { comando, "java Nombre" };
		 * 
		 * ProcessBuilder pb = new ProcessBuilder(processes); try{ pb.start();
		 * 
		 * }catch(IOException ioe){ ioe.printStackTrace(); }
		 */

		/*
		 * try { System.out.println("Run"); p = r.exec("java Nombre"); int
		 * exitval = p.waitFor(); System.out.println(exitval); if (exitval ==
		 * 0){ p1 = r.exec(comando); System.out.println("ejecutado Ejemplo2");
		 * }else System.out.println("p1:no he acabado"); } catch (IOException |
		 * InterruptedException ioe) { ioe.printStackTrace(); }
		 */

		/*
		 * try{ p=r.exec("java Ejemplo2"); try{ p.waitFor();
		 * 
		 * }catch(Exception e) { e.printStackTrace(); } p1=r.exec("java Nombre "
		 * +args[0]); }catch(IOException ioe){ ioe.printStackTrace(); }
		 */
	}


