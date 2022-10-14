package ejercicio5;

import java.util.InputMismatchException;
import java.lang.NegativeArraySizeException;
import java.lang.NullPointerException;
import java.util.Scanner;
import exceptions.CustomException;

public class Metodos {
	// Crear array de contraseñas y array de si es fuerte o débil
	public static Password[] crearContraseñas(){
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Número de contraseñas: ");
			int longitud = sc.nextInt();
			Password arrayPasswords[] = new Password[longitud];
			boolean arrayFuerte[] = new boolean[longitud];
			
			System.out.print("Longitud de las contraseñas: ");
			longitud = sc.nextInt();
			
			if (longitud > 0) { // Comprueba el valor de longitud ya que aqui no salta error si se le introduce un número negativo
				for (int i = 0; i < arrayPasswords.length; i++) {
					arrayPasswords[i] = new Password(longitud);
					arrayFuerte[i] = arrayPasswords[i].esFuerte();
				}
			}
			else {
				Exception exception = new CustomException(26);
				System.out.println(exception.getMessage());
				return arrayPasswords = new Password[0];
			}
			return arrayPasswords;
		}
		catch (InputMismatchException e) { // Captura el error si no se introduce un número
			Exception exception = new CustomException(25);
			System.out.println(exception.getMessage());
			return new Password[0];
		}
		catch (NegativeArraySizeException e) { // Captura el error si se introduce un número negativo en la longitud del array
			Exception exception = new CustomException(26);
			System.out.println(exception.getMessage());
			return new Password[0];
		}
	}
	
	// Muestra las contraseñas del array
	public static void mostrarContraseñas() {
		Password arrayPasswords[] = Metodos.crearContraseñas();
		for (int i = 0; i < arrayPasswords.length; i++) {
			System.out.println(arrayPasswords[i].getContraseña() + " " + arrayPasswords[i].esFuerte());
		}
	}
	
}
