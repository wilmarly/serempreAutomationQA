package org.serempre.qa.automation.TiendaCerca.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class SignUpOnAppUI {
	
	public static final Target SELECT_CITY = Target.the("Select list of Cities")
			.locatedBy("//div[2]/div[1]/div[1]/div[1]");

	public static final Target TEXTBOX_CITY= Target.the("Text box to Write City")
			.locatedBy("//div[contains(text(),'{0}')]");
	
	public static final Target CONTINUE_BUTTON_ONE= Target.the("Button 'Continue'")
			.locatedBy("//div[1]/div[2]/div[3]/button[1]");

	public static final Target TEXT_WELCOME= Target.the("Text 'Bienvenido'")
			.locatedBy("//p[contains(text(),'Bienvenido')]");
	
	public static final Target CONSUMER_BUTTON= Target.the("Option 'Consumidor'")
			.locatedBy("//button[1]//span[contains(text(),'Consumidor')]");
	
	public static final Target TEXTBOX_PHONE_NUMBER= Target.the("Text 'Número de Celular'")
			.locatedBy("//label[contains(text(),'Número celular')]");
	
	public static final Target INPUT_PHONE = Target.the("Text Box to Write Phone")
			.locatedBy("//input[@id='abi-phone']");
	
	public static final Target ENTER_BUTTON = Target.the("Enter button")
			.locatedBy("//button[1]//span[contains(text(),'Ingresar')]");
	
	public static final Target TEXT_SIGNUP = Target.the("Text 'Regístrate'")
			.locatedBy("//p[contains(text(),'Regístrate')][1]");
	
	public static final Target CHECKBOX_ACCEPT_TERMS = Target.the("Accept Terms and Conditions")
			.locatedBy("//input[@id='abi-checkbox-terms']");
	
	public static final Target CHECKBOX_ACCEPT_POLICIES = Target.the("Accept Acept Policies")
			.locatedBy("//input[@id='abi-checkbox-policies']");
	
	public static final Target CONTINUE_BUTTON_TWO = Target.the("Button 'Continuar'")
			.locatedBy("//button[1]//span[contains(text(),'Continuar')]");
	
	public static final Target TEXT_PERSONAL_DATA = Target.the("Test 'Datos Personales'")
			.locatedBy("//p[contains(text(),'Datos Personales')]");
	
	public static final Target INPUT_NAME = Target.the("Input Name")
			.locatedBy("//input[@id='register-name']");
	
	public static final Target INPUT_LAST_NAME = Target.the("Input LastName")
			.locatedBy("//input[@id='register-lastName']");
	
	public static final Target INPUT_EMAIL = Target.the("Input e-mail")
			.locatedBy("//input[@id='register-email']");
	
	public static final Target NEXT_BUTTON = Target.the("Button 'Siguente'")
			.locatedBy("//button[1]//span[contains(text(),'Siguiente')]");
	
	public static final Target TEXT_WHERE_ARE_YOU = Target.the("Text '¿Dónde te ecuentras?'")
			.locatedBy("//p[contains(text(),'¿Dónde te encuentras?')]");
	
	public static final Target ENTER_ADRESS_BUTTON = Target.the("Buton 'Ingresa dirección'")
			.locatedBy("//button[1]//span[contains(text(),'Ingresa dirección')]");
	
	public static final Target INPUT_ADDRESS = Target.the("Input address'")
			.locatedBy("//input[@id='address']");
	
	public static final Target SELECT_LOCATION_BUTTON = Target.the("Button 'Seleccionar ubicación'")
			.locatedBy("//button[1]//span[contains(text(),'Seleccionar ubicación')]");
	
	public static final Target TEXT_SIGNUP_SUCCESSFULLY = Target.the("Button 'Seleccionar ubicación'")
			.locatedBy("//*[contains(text(),'Te has registrado')]");
	
	public static final Target EXIT_ADDRESS_TEXTBOX = Target.the("Button 'X'")
			.locatedBy("//button[1]//span[contains(text(),'X')]");
	
	public static final Target TEXT_INVALID_PHONE = Target.the("Message 'El teléfono debe ser un número válido'")
			.locatedBy("//div[contains(text(),'El teléfono debe ser un número válido')]");
	
	public static final Target TEXT_INVALID_PHONE_TWO = Target.the("Message 'El campo telefono debe contener entre 8 y 10 digitos'")
			.locatedBy("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]");
	
	public static final Target TEXT_VALIDATION_CODE = Target.the("Message 'Código de validación'")
			.locatedBy("//label[contains(text(),'Código de validación')]");
	
	public static final Target INPUT_CODE_VALIDATION_1 = Target.the("Message 'Código de validación'")
			.locatedBy("//input[@id='abi-otp-0']");
	
	public static final Target INPUT_CODE_VALIDATION_2 = Target.the("Message 'Código de validación'")
			.locatedBy("//input[@id='abi-otp-1']");
	
	public static final Target INPUT_CODE_VALIDATION_3 = Target.the("Message 'Código de validación'")
			.locatedBy("//input[@id='abi-otp-2']");
	
	public static final Target INPUT_CODE_VALIDATION_4 = Target.the("Message 'Código de validación'")
			.locatedBy("//input[@id='abi-otp-3']");
	
	public static final Target INPUT_CODE_VALIDATION_5 = Target.the("Message 'Código de validación'")
			.locatedBy("//input[@id='abi-otp-4']");
	
	public static final Target VALIDATE_CODIGO_BUTTON = Target.the("Button 'Validar codigo'")
			.locatedBy("//button[1]//span[contains(text(),'Validar código')]");

	public static final Target INVALID_CODE_TEXT = Target.the("Message 'Código no valdo'")
			.locatedBy("//div[contains(text(),'Código no válido')]");
	
}
