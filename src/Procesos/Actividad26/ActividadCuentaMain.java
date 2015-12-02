package Procesos.Actividad26;

public class ActividadCuentaMain {

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(4000, 4200);

		Persona persona1 = new Persona("Miguel", cuenta, Persona.SEXO_HOMBRE);
		Persona persona2 = new Persona("Elena", cuenta, Persona.SEXO_MUJER);
		Persona persona3 = new Persona("Ana", cuenta, Persona.SEXO_MUJER);

		persona1.start();
		persona2.start();
		persona3.start();

	}

}
