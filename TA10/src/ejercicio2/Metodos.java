package ejercicio2;

import exceptions.CustomException;

public class Metodos {
	
	public static void mostrarError() {
		try {
			System.out.println("Mensaje mostrado por pantalla");
			Exception exception = new CustomException(333);
			System.out.println(exception);
			System.out.println("Programa terminado");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
