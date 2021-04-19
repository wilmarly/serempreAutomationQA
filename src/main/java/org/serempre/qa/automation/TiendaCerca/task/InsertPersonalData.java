package org.serempre.qa.automation.TiendaCerca.task;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import org.serempre.qa.automation.TiendaCerca.interactions.WaitToLoad;
import org.serempre.qa.automation.TiendaCerca.interactions.WaitElement2;
import org.serempre.qa.automation.TiendaCerca.userinterface.SignUpOnAppUI;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;

public class InsertPersonalData implements Task {
	
	String city;
	String phone;
	String name;
	String last_name;
	String email;
	String adress;
	
	public InsertPersonalData(String city, String phone, String name, String last_name, String email, String adress) {
		this.city = city;
		this.phone = phone;
		this.name = name;
		this.last_name = last_name;
		this.email = email;				
		this.adress = adress;
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
				WaitElement2.untilAppears(SignUpOnAppUI.TEXT_SIGNUP),				
				WaitToLoad.theMiliSeconds(500),
				Click.on(SignUpOnAppUI.CHECKBOX_ACCEPT_TERMS),
				WaitToLoad.theMiliSeconds(500),
				Click.on(SignUpOnAppUI.CHECKBOX_ACCEPT_POLICIES),
				WaitToLoad.theMiliSeconds(500),
				Click.on(SignUpOnAppUI.CONTINUE_BUTTON_TWO),
				WaitElement2.untilAppears(SignUpOnAppUI.TEXT_PERSONAL_DATA),
				WaitToLoad.theMiliSeconds(500),
				Enter.theValue(name).into(SignUpOnAppUI.INPUT_NAME),
				WaitToLoad.theMiliSeconds(500),
				Enter.theValue(last_name).into(SignUpOnAppUI.INPUT_LAST_NAME),
				WaitToLoad.theMiliSeconds(500),
				Enter.theValue(email).into(SignUpOnAppUI.INPUT_EMAIL),
				WaitToLoad.theMiliSeconds(500),
				Click.on(SignUpOnAppUI.NEXT_BUTTON),
				WaitToLoad.theMiliSeconds(500),
				WaitElement2.untilAppears(SignUpOnAppUI.TEXT_WHERE_ARE_YOU),
				WaitToLoad.theMiliSeconds(5000),
				Click.on(SignUpOnAppUI.ENTER_ADRESS_BUTTON),
				WaitToLoad.theMiliSeconds(5000),
				Enter.theValue(adress).into(SignUpOnAppUI.INPUT_ADDRESS),
				WaitToLoad.theMiliSeconds(5000),
		         Check.whether(SignUpOnAppUI.SELECT_LOCATION_BUTTON.resolveFor(actor).isCurrentlyVisible())
                 .andIfSo(Click.on(SignUpOnAppUI.SELECT_LOCATION_BUTTON)).otherwise(Click.on(SignUpOnAppUI.EXIT_ADDRESS_TEXTBOX))
				
				//Click.on(SignUpOnAppUI.SELECT_LOCATION_BUTTON)
				);
		
		
	}	
	public static InsertPersonalData inDifferentAppSlides(String city,String phone,String name, String last_name, String email, String adress) {
		return instrumented(InsertPersonalData.class, city, phone, name, last_name, email, adress);
	}

}
