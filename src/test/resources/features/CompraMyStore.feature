@REQ_PQBP-XXXX @CrearCuenta @cucumber @R1
Feature: Crear cuenta en My store

  @id:1  @CrearCuentaMyStore @CrerCuentaNueva
  Scenario Outline: T-E2E-PQBP-XXXX-CA1- Crear una cuenta en la pagina de My Store para ingresar.
    Given que el cliente deseo crear un cuenta en my store
    When ingrese el email:"<email>" y haga clip el botón crear cuenta y deberia indicar rediriguir a la pantalla de llenar los datos del formulario para la creacion de cuentas
    And ingrese el nombre:"<nombre>", apellido:"<apellido>",  email:"<email>", clave:"<clave>", selecione la fecha de nacimiento, acepte los terminos y condiciones; y haga clip en el boton registrar
    Then  deberia indicar el mensaje de confirmacion de la cuenta creada "Your account has been created."
    Examples:
      |email|nombre|apellido|clave|
      |marce@hotmail.com|Marcela|Tapia|12345Red|


