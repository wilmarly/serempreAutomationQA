package org.serempre.qa.automation.TiendaCerca.exceptions;

@SuppressWarnings("serial")
public class UnsuccessfullSignUp extends AssertionError  {
	
	public static final String UNSECCESSFULL_SINGUP_MESSAGE =  "Registro fallido, No se ha podido introducir una dirección"; 
	
	public UnsuccessfullSignUp(String message) {
		super(message);//inicializar la clase base excepciones antes de que java lo haga con un metodo sin parametros
	}
	
	public UnsuccessfullSignUp(String message, Throwable cause) {
		super(message,cause);
	}

}
