

@REQ_PQBP-XXXX @LoginBancaWeb @cucumber @R1
Feature: Ingreso  correcto e incorrecto en banca web


  @id:1 @loginFallido  @Evalucion
  Scenario Outline: T-E2E-PQBP-XXXX Ingreso a banca web con credenciales incorrectas
    Given que el cliente ingresa al banca web
    When ingresa  el usuario: "<usuario>" y la clave:"<clave>"
    Then se mostrara el siguiente mensaje: "<mensaje>"
    Examples:
      |usuario|clave|mensaje|
      |gzumbaac|12Bp34Tcs/|Tu usuario o clave está incorrecta |


  @id:2 @loginExitoso  @Evalucion
  Scenario Outline: T-E2E-PQBP-XXXX Ingreso a banca web con credenciales correctas
    Given que el cliente ingresa al banca web
    When ingrese  el usuario: "<usuario>" y la clave:"<clave>"
    Then se visualizara la posición consolidad
    Examples:
|valorSolicitar|valorVivienda|tiempo|tipoAmortizacion|mensual|interes|
|10.000|100.000|15|Frances|167.23|8.45|
######            #| @externaldata@dataHipotecario.csv |
