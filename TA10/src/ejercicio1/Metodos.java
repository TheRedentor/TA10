package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Metodos {
	public static void mostrarOpciones() {
		// Declarar variables
		int hint;
		Scanner sc = new Scanner(System.in);
		int tries;
		int randomNumber;
		
		// Inicializar variables
		hint = -2;
		tries = 0;
		randomNumber = generateRandomNumber();
		
		// Bucle para adivinar el número
		while (hint != 0) {
			try {
				System.out.println("Introduce un número entre 1 y 500:");
				int number = sc.nextInt();
				hint = isMajorOrMinor(number, randomNumber);
				if (hint == 1) {
					System.out.println("El número a adivinar és mayor");
					tries++;
				}
				else if (hint == -1) {
					System.out.println("El número a adivinar és menor");
					tries++;
				}
			}
			catch (InputMismatchException e) {
				sc.next();
				System.out.println("No has introducido un número :(");
				tries++;
			}
		}
		tries++;
		
		System.out.println("¡Has acertado el número!");
		System.out.println("Número de intentos: " + tries);
	}
	
	// Genera el número aleatorio
	public static int generateRandomNumber() {
		return (int)(Math.random()*500+1);
	}
	
	// Compara si el número introducido es mayor o menor que el número aleatorio
	public static int isMajorOrMinor(int number, int randomNumber) {
		if (number < randomNumber) {
			return 1;
		}
		
		else if (number > randomNumber) {
			return -1;
		}
		
		else {
			return 0;
		}
	}
}
