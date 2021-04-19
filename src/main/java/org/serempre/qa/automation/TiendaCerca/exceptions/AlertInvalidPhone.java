package org.serempre.qa.automation.TiendaCerca.exceptions;

@SuppressWarnings("serial")
public class AlertInvalidPhone extends AssertionError{
	
	public static final String INVALID_PHONE_MESSAGE =  "El teléfono debe ser un número válido"; 
	
	public AlertInvalidPhone(String message) {
		super(message);//inicializar la clase base excepciones antes de que java lo haga con un metodo sin parametros
	}
	
	public AlertInvalidPhone(String message, Throwable cause) {
		super(message,cause);
	}

}
