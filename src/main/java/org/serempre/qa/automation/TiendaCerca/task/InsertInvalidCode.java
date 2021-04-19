package org.serempre.qa.automation.TiendaCerca.task;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import org.serempre.qa.automation.TiendaCerca.interactions.WaitToLoad;
import org.serempre.qa.automation.TiendaCerca.interactions.WaitElement2;
import org.serempre.qa.automation.TiendaCerca.userinterface.SignUpOnAppUI;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class InsertInvalidCode implements Task{
	
	String city;
	String phone;
	String code;
	
	public InsertInvalidCode(String city, String phone, String code) {
		this.city = city;
		this.phone = phone;
		this.code = code;		

	}
	
	
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		char codech[] = code.toCharArray();
		
		actor.attemptsTo(
			    Click.on(SignUpOnAppUI.SELECT_CITY),
			    WaitToLoad.theMiliSeconds(500),
			    Click.on(SignUpOnAppUI.TEXTBOX_CITY.of(city)),
				WaitToLoad.theMiliSeconds(500),
				Click.on(SignUpOnAppUI.CONTINUE_BUTTON_ONE),
				WaitElement2.untilAppears(SignUpOnAppUI.TEXT_WELCOME),
				WaitToLoad.theMiliSeconds(2000),
				Click.on(SignUpOnAppUI.CONSUMER_BUTTON),
				WaitToLoad.theMiliSeconds(1000),
				WaitElement2.untilAppears(SignUpOnAppUI.TEXTBOX_PHONE_NUMBER),
				WaitToLoad.theMiliSeconds(500),
				Enter.theValue(phone).into(SignUpOnAppUI.INPUT_PHONE),
				Click.on(SignUpOnAppUI.ENTER_BUTTON),
				WaitToLoad.theMiliSeconds(500),
				WaitElement2.untilAppears(SignUpOnAppUI.TEXT_VALIDATION_CODE),
				Enter.theValue(Character.toString(codech[0])).into(SignUpOnAppUI.INPUT_CODE_VALIDATION_1),
				Enter.theValue(Character.toString(codech[1])).into(SignUpOnAppUI.INPUT_CODE_VALIDATION_2),
				Enter.theValue(Character.toString(codech[2])).into(SignUpOnAppUI.INPUT_CODE_VALIDATION_3),
				Enter.theValue(Character.toString(codech[3])).into(SignUpOnAppUI.INPUT_CODE_VALIDATION_4),
				Enter.theValue(Character.toString(codech[4])).into(SignUpOnAppUI.INPUT_CODE_VALIDATION_5),
				WaitToLoad.theMiliSeconds(800),
				Click.on(SignUpOnAppUI.VALIDATE_CODIGO_BUTTON),
				WaitToLoad.theMiliSeconds(800)
				);
				
	}	
	public static InsertInvalidCode inSlideAppTiendaCerca(String city,String phone, String code) {
		return instrumented(InsertInvalidCode.class, city, phone, code);
	}

}
