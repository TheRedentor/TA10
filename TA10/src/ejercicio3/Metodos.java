package ejercicio3;

import java.util.Random;

import exceptions.CustomException;

public class Metodos {
	// Mostrar mensajes y ejecutar las funciones
	public static void mostrarMensaje() {
		int randomNumber;
		
		System.out.println("Generando número aleatorio...");
		randomNumber = generateRandomNumber();
		System.out.println("El número aleatorio generado es: " + randomNumber);
		Exception exception = new CustomException(isPair(randomNumber));
		System.out.println(exception.getMessage());
	}
	
	// Generar el número aleatorio
	public static int generateRandomNumber() {
		return new Random().nextInt(1000)-1;
	}
	
	// Comprueba si el número es par o impar
	public static int isPair(int number) {
		int pair;
		if (number%2 == 0) {
			pair = 22;
		}
		else {
			pair = 11;
		}
		return pair;
	}
	
}
