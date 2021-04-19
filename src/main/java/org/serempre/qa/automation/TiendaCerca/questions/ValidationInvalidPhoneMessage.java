package org.serempre.qa.automation.TiendaCerca.questions;

import org.serempre.qa.automation.TiendaCerca.interactions.WaitElement2;
import org.serempre.qa.automation.TiendaCerca.userinterface.SignUpOnAppUI;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class ValidationInvalidPhoneMessage implements Question<Boolean>{
 
	@Override
	public Boolean answeredBy(Actor actor) {
		
		actor.attemptsTo(WaitElement2.untilAppears(SignUpOnAppUI.TEXT_INVALID_PHONE));
			return Visibility.of(SignUpOnAppUI.TEXT_INVALID_PHONE).viewedBy(actor).asBoolean();
			
	}
	
	public static ValidationInvalidPhoneMessage alertMessage() {
		return new ValidationInvalidPhoneMessage();
	}

}
