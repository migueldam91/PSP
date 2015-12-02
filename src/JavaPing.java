import java.io.*;

class JavaPing 
{
  public static void main(String[ ] args) {
    Runtime runTime= Runtime.getRuntime();
    Process process=null;
    
    try {
      process = runTime.exec("ping www.uam.es");
      BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
      for (int i=0; i< 10; i++)
        System.out.println("Saludo " + in.readLine());

    } catch (IOException e) {
      System.out.println("No pudimos correr el ping");
      System.exit(-1);
    }
    if (process!=null)
      process.destroy();
    try {
      process.waitFor();
    } catch( InterruptedException e ) {
      System.out.println("No pudimos esperar por término");
      System.exit(-1);
    }
    System.out.println("Estatus de témino:  "+process.exitValue());
    System.exit(0);    
  }
}
