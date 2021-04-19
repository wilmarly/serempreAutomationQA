package org.serempre.qa.automation.TiendaCerca.exceptions;

@SuppressWarnings("serial")
public class AlertInvalidPhoneDos extends AssertionError {

	public static final String INVALID_PHONE_MESSAGE_TWO =  "El campo telefono debe contener entre 8 y 10 digitos"; 
	
	public AlertInvalidPhoneDos(String message) {
		super(message);//inicializar la clase base excepciones antes de que java lo haga con un metodo sin parametros
	}
	
	public AlertInvalidPhoneDos(String message, Throwable cause) {
		super(message,cause);
	}
}
