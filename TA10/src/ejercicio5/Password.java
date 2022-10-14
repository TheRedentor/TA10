package ejercicio5;

import java.util.Random;

public class Password {
	// Declarar atributos
	private int longitud;
	private String contraseña;
	private String valoresRandom = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvxyz";
	
	// Constructores
	public Password() {
		this.longitud = 8;
		this.contraseña = "abcdefgh";
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = generarPassword();
	}
	
	// Comprueba si la contraseña es fuerte o débil
	public boolean esFuerte() {
		int mayus = 0;
		int minus = 0;
		int nums = 0;
		for (int i = 0; i < longitud; i++) {
			if (Character.isUpperCase(contraseña.charAt(i))) {
				mayus++;
			}
			else if (Character.isLowerCase(contraseña.charAt(i))) {
				minus++;
			}
			else if (Character.isDigit(contraseña.charAt(i))) {
				nums++;
			}
		}
		if (mayus > 2 && minus > 1 && nums > 5) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// Genera una contraseña aleatoria
	public String generarPassword() {
		String pass = "";
		for (int i = 0; i < longitud; i++) { // Loop para añadir a la contraseña el número de caracteres indicado
			Random r = new Random(); // Declaro un nuevo random
			int c = r.nextInt(valoresRandom.length() - 0) + 0; // Creo un numero aleatorio entre 0 y la longitud del string valoresRandom
			char n = valoresRandom.charAt(c); // Cojo de valoresRandom el carácter en la posición del número aleatorio anterior
			pass += n; // Añado el carácter a la contraseña
		}
		return pass;
	}
	
	// Getters y Setters
	public String getContraseña() {
		return contraseña;
	}
	
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
}
