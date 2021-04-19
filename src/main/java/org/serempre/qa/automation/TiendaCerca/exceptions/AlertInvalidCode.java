package org.serempre.qa.automation.TiendaCerca.exceptions;

@SuppressWarnings("serial")
public class AlertInvalidCode extends AssertionError{
	
	public static final String INVALID_CODE_MESSAGE =  "Código invalido"; 
	
	public AlertInvalidCode(String message) {
		super(message);//inicializar la clase base excepciones antes de que java lo haga con un metodo sin parametros
	}
	
	public AlertInvalidCode(String message, Throwable cause) {
		super(message,cause);
	}
}
