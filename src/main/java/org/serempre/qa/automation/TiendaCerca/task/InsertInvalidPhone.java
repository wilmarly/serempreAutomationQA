package org.serempre.qa.automation.TiendaCerca.task;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import org.serempre.qa.automation.TiendaCerca.interactions.WaitToLoad;
import org.serempre.qa.automation.TiendaCerca.interactions.WaitElement2;
import org.serempre.qa.automation.TiendaCerca.userinterface.SignUpOnAppUI;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class InsertInvalidPhone implements Task {
	
	String city;
	String phone;
	
	public InsertInvalidPhone(String city, String phone) {
		this.city = city;
		this.phone = phone;

	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
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
				WaitToLoad.theMiliSeconds(500)
				);
				
	}	
	public static InsertInvalidPhone inAppTiendaCerca(String city,String phone) {
		return instrumented(InsertInvalidPhone.class, city, phone);
	}

}
