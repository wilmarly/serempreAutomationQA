@SignUpOnApp
Feature: Register in the application. 
    As a consumer user, I would like to be able to register in the Tienda Cerca Application. 

  @SignUpSuccessfully
  Scenario Outline: Register for the application successfully
    
	Given The customer   is on the home page of the Tienda Cerca App
	|<Nombre>|
	When the client registers his personal data
	| <idCase> | <City> | <TipodeUsuario> | <Celular> |<Nombre>| <Apellido> | <Correo> | <Direccion> |
	Then the user should register successfully
  
  Examples: 
  | idCase | City | TipodeUsuario | Celular | Nombre | Apellido | Correo | Direccion |
   ##@externaldata@./src/test/resources/datadriven/SignUPOnApp.xlsx@SignUpSuccessfullyData@1
 



