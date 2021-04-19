package org.serempre.qa.automation.TiendaCerca.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.util.List;

import org.hamcrest.Matchers;
import org.serempre.qa.automation.TiendaCerca.driver.Driver;
import org.serempre.qa.automation.TiendaCerca.exceptions.UnsuccessfullSignUp;
import org.serempre.qa.automation.TiendaCerca.task.InsertPersonalData;

import org.serempre.qa.automation.TiendaCerca.questions.ValidateSignUpSuccessfully;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.Before;


import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
public class SignUpOnAppStepDefinition {
	
	@Before
	public void setUp() {
		OnStage.setTheStage(Cast.ofStandardActors()); // para poder utilizar los actorea ntes de saber el nombre que tendra el actor 
	};
	

	@Given("^The customer   is on the home page of the Tienda Cerca App$")
	public void theCustomerIsOnTheHomePageOfTheTiendaCercaApp(List<String> info) {// Se utiliza lista String para para los parametros cargasdos en el datadriven sin necesidad de tenerlos como parametros en el nombre del decorador @Given

		Driver.web();
		theActorCalled(info.get(0)).whoCan(BrowseTheWeb.with(Driver.inThePage("https://co-tc-shopper-web-stage.serempre.dev/")));

	}


	@When("^the client registers his personal data$")
	public void theClientRegistersHisPersonalData(List<String> info) {
	        theActorInTheSpotlight().attemptsTo(InsertPersonalData.inDifferentAppSlides(info.get(1),info.get(3),info.get(4),info.get(5),info.get(6),info.get(7)));

	}

	@Then("^the user should register successfully$")
	public void theUserShouldRegisterSuccessfully() {
		
		theActorInTheSpotlight().should(seeThat(ValidateSignUpSuccessfully.successMessage(), Matchers.is(true))
				.orComplainWith(UnsuccessfullSignUp.class,UnsuccessfullSignUp.UNSECCESSFULL_SINGUP_MESSAGE));
	}


}
