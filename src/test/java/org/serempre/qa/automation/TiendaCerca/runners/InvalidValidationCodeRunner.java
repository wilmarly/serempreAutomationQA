package org.serempre.qa.automation.TiendaCerca.runners;


import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import org.serempre.qa.automation.TiendaCerca.utilities.BeforeSuite;
import org.serempre.qa.automation.TiendaCerca.utilities.DataToFeature;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

@RunWith(RunnerPersonalizado.class)// runner personalizado para cargar primero los datos del documento excel
@CucumberOptions(features="src\\test\\resources\\features\\InvalidValidationCode.feature",
glue="org.serempre.qa.automation.TiendaCerca.stepdefinitions",
snippets=SnippetType.CAMELCASE// para que cuando se autogeneren los stepdefinitions se use CamelCase par definir sus nombres
,tags="@SignInWithInvalidValidationCode" //etiquetas definida en el feature que se desea ejecutar

)

public class InvalidValidationCodeRunner {
	
	@BeforeSuite
	public static void test() throws InvalidFormatException, IOException {//metodo para modificar el feature con los datos del documento excel
		DataToFeature.overrideFeatureFiles(".\\src\\test\\resources\\features\\InvalidValidationCode.feature");	
	}


}
