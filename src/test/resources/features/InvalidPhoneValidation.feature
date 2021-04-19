
@InvalidPhoneValidation
Feature: Register in the application with invalid phone. 
    As a consumer user, I would like not to be able to register in the App when using a phone number not valid.
 

  @SignUpWithInvalidPhone
  Scenario Outline: Register for the application with invalid phone
    
	Given The customer is registering data in the App Tienda Cerca
	|<Nombre>|
  When the customer registers his phone number
	| <idCase> | <City> | <TipodeUsuario> | <Celular> |
	Then The user should see a warning message
  
  Examples: 
  | idCase | City | TipodeUsuario | Celular | Nombre |
   ##@externaldata@./src/test/resources/datadriven/InvalidPhoneValidation.xlsx@SignUpWithInvalidPhoneData@1
 


  @SignUpWithInvalidPhone2
  Scenario Outline: Register for the application with invalid phone
    
	Given The customer is registering data in the App Tienda Cerca
	|<Nombre>|
  When the customer registers his phone number
	| <idCase> | <City> | <TipodeUsuario> | <Celular> |
	Then The user should see a warning message dos
  
  Examples: 
  | idCase | City | TipodeUsuario | Celular | Nombre |
   ##@externaldata@./src/test/resources/datadriven/InvalidPhoneValidation.xlsx@SignUpWithInvalidPhoneData@2

