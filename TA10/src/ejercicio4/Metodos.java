package ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Metodos {
	// Muestra las opciones y ejecuta la que hayas elegido
	public static void mostrarOpciones() {
		Scanner sc = new Scanner(System.in);
		int n1;
		int n2;
		
		try {
			System.out.println("1. Sumar, 2. Restar, 3. Multiplicar, 4. Dividir, 5. Potencia, 6. Raiz cuadrada, 7. Raiz cúbica:");
			int option = sc.nextInt();
			switch(option) {
				case 1:
					System.out.println("Introduce el primer número:");
					n1 = sc.nextInt();
					System.out.println("Introduce el segundo número:");
					n2 = sc.nextInt();
					System.out.println(n1 + " + " + n2 + " = " + sumar(n1, n2));
					break;
				case 2:
					System.out.println("Introduce el primer número:");
					n1 = sc.nextInt();
					System.out.println("Introduce el segundo número:");
					n2 = sc.nextInt();
					System.out.println(n1 + " - " + n2 + " = " + restar(n1, n2));
					break;
				case 3:
					System.out.println("Introduce el primer número:");
					n1 = sc.nextInt();
					System.out.println("Introduce el segundo número:");
					n2 = sc.nextInt();
					System.out.println(n1 + " * " + n2 + " = " + multiplicar(n1, n2));
					break;
				case 4:
					System.out.println("Introduce el primer número:");
					n1 = sc.nextInt();
					System.out.println("Introduce el segundo número:");
					n2 = sc.nextInt();
					System.out.println(n1 + " / " + n2 + " = " + dividir(n1, n2));
					break;
				case 5:
					System.out.println("Introduce el primer número:");
					n1 = sc.nextInt();
					System.out.println("Introduce el segundo número:");
					n2 = sc.nextInt();
					System.out.println(n1 + " ^ " + n2 + " = " + potencia(n1, n2));
					break;
				case 6:
					System.out.println("Introduce el número:");
					n1 = sc.nextInt();
					System.out.println("Raiz cuadrada de " + n1 + " = +-" + raizCuadrada(n1));
					break;
				case 7:
					System.out.println("Introduce el número:");
					n1 = sc.nextInt();
					System.out.println("Raiz cúbica de " + n1 + " = " + raizCubica(n1));
					break;
			}
		}
		
		catch (InputMismatchException e) {
			sc.next();
			System.out.println("No has introducido un número :(");
		}
	}
	
	// Sumar, restar, multiplicar, dividir, potencia, raiz cuadrada y raiz cúbica
	public static double sumar(float n1, float n2) {
		return n1 + n2;
	}
	
	public static double restar(float n1, float n2) {
		return n1 - n2;
	}
	
	public static double multiplicar(float n1, float n2) {
		return n1 * n2;
	}
	
	public static double dividir(float n1, float n2) {
		return n1 / n2;
	}
	
	public static double potencia(float n1, float n2) {
		return Math.pow(n1, n2);
	}
	
	public static double raizCuadrada(float n1) {
		return Math.sqrt(n1);
	}
	
	public static double raizCubica(float n1) {
		return Math.cbrt(n1);
	}
}
