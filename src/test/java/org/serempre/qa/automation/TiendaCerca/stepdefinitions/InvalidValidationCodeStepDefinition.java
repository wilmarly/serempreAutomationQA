package org.serempre.qa.automation.TiendaCerca.stepdefinitions;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.util.List;

import org.hamcrest.Matchers;
import org.serempre.qa.automation.TiendaCerca.exceptions.AlertInvalidCode;
import org.serempre.qa.automation.TiendaCerca.questions.ValidationInvalidCodeMessage;
import org.serempre.qa.automation.TiendaCerca.task.InsertInvalidCode;

import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class InvalidValidationCodeStepDefinition {

	@When("^the customer logs in with his phone number$")
	public void theCustomerLogsInWithHisPhoneNumber(List<String> info) {
        theActorInTheSpotlight().attemptsTo(InsertInvalidCode.inSlideAppTiendaCerca(info.get(1),info.get(3),info.get(5)));
	}


	@Then("^The user should see a warning message on App$")
	public void theUserShouldSeeAWarningMessageOnApp() {
		theActorInTheSpotlight().should(seeThat(ValidationInvalidCodeMessage.alertMessage(),Matchers.is(true))
				.orComplainWith(AlertInvalidCode.class,AlertInvalidCode.INVALID_CODE_MESSAGE));
	
	}
	
	
	
}
