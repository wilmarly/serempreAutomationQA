package org.serempre.qa.automation.TiendaCerca.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.util.List;

import org.hamcrest.Matchers;
import org.serempre.qa.automation.TiendaCerca.driver.Driver;
import org.serempre.qa.automation.TiendaCerca.exceptions.AlertInvalidPhone;
import org.serempre.qa.automation.TiendaCerca.exceptions.AlertInvalidPhoneDos;
import org.serempre.qa.automation.TiendaCerca.questions.ValidationInvalidPhoneMessage;
import org.serempre.qa.automation.TiendaCerca.questions.ValidationInvalidPhoneMessageDos;
import org.serempre.qa.automation.TiendaCerca.task.InsertInvalidPhone;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.Before;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

public class InvalidPhoneValidationStepDefinition {
	
	@Before
	public void setUp() {
		OnStage.setTheStage(Cast.ofStandardActors()); // para poder utilizar los actorea ntes de saber el nombre que tendra el actor 
	};

	@Given("^The customer is registering data in the App Tienda Cerca$")
	public void theCustomerIsRegisteringDataInTheAppTiendaCerca(List<String> info) {
		
		Driver.web();
		theActorCalled(info.get(0)).whoCan(BrowseTheWeb.with(Driver.inThePage("https://co-tc-shopper-web-stage.serempre.dev/")));

	}

	@When("^the customer registers his phone number$")
	public void theCustomerRegistersHisPhoneNumber(List<String> info) {
	        theActorInTheSpotlight().attemptsTo(InsertInvalidPhone.inAppTiendaCerca(info.get(1),info.get(3)));

	}

	@Then("^The user should see a warning message$")
	public void theUserShouldSeeAWarningMessage() {
	
		theActorInTheSpotlight().should(seeThat(ValidationInvalidPhoneMessage.alertMessage(),Matchers.is(true))
				.orComplainWith(AlertInvalidPhone.class,AlertInvalidPhone.INVALID_PHONE_MESSAGE));
	}
	
	@Then("^The user should see a warning message dos$")
	public void theUserShouldSeeAWarningMessageDos() {
		
		theActorInTheSpotlight().should(seeThat(ValidationInvalidPhoneMessageDos.alertMessageDos(),Matchers.is(true))
				.orComplainWith(AlertInvalidPhoneDos.class,AlertInvalidPhoneDos.INVALID_PHONE_MESSAGE_TWO));
	}

	

}
