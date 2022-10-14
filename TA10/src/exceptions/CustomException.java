package exceptions;

public class CustomException extends Exception {
	private int exceptionCode;
	
	public CustomException(int errorCode) {
		super();
		this.exceptionCode = errorCode;
	}
	
	public CustomException() {
		super();
	}
	
	public String getMessage() {
		String message = "";
		switch(exceptionCode) {
			case 111:
				message = "Esto es el error 111";
				break;
			case 222:
				message = "Esto es el error 222";
				break;
			case 333:
				message = "Esto es el error 333";
				break;
			case 22:
				message = "Es par";
				break;
			case 11:
				message = "Es impar";
				break;
			case 25:
				message = "No has introducido un número";
				break;
			case 26:
				message = "El número no puede ser negativo o cero";
				break;
		}
		return message;
	}
}
