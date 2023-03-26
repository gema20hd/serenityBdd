

@REQ_PQBP-XXXX @LoginMyStore @cucumber @R1
Feature: Deseo hacer login en My Store para  hacer una cuenta

  @id:1 @LoginMyStoreCredencialesCorrecta  @login
  Scenario Outline: T-E2E-PQBP-XXXX Hacer login exitoso con las crendenciales correctar
    Given Juan Desea ingresar a la pagina de mystore
    When ingresa usuario:"<email>" y el clave:"<password>" y da clic en el boton Sing In
    Then se visualizar el home de la pagina web My store

    Examples:
|email|password|
|gema@uce.edu.ec|123456reD|

