  
@InvalidValidationCode
Feature: Login to the application with an invalid validation code.
    As a consumer user, I would like not to be able to log into the application when using invalid validation code.
 
  @SignInWithInvalidValidationCode
  Scenario Outline: Login to the application with invalid validation code
    
	Given The customer is registering data in the App Tienda Cerca
	|<Nombre>|
  When the customer logs in with his phone number
	| <idCase> | <City> | <TipodeUsuario> | <Celular> |<Nombre>| <ValidationCode> |
	Then The user should see a warning message on App
  
  Examples: 
  | idCase | City | TipodeUsuario | Celular | Nombre | ValidationCode |
   ##@externaldata@./src/test/resources/datadriven/InvalidValidationCode.xlsx@InvalidValidationCodeData@1
   |1   |Bogotá   |Consumidor   |3112786113   |Bot   |12846|


