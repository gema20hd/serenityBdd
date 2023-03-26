

@REQ_PQBP-XXXX @SimulacionCredito @cucumber @R1
Feature: Simulación de crédito hipotecario, para calcular cuánto se debería pagar de forma mensual

  @id:1 @CreditoHipotecarioCalculadora  @Evalucion
  Scenario Outline: T-E2E-PQBP-XXXX Calcular cuánto se debería pagar de forma mensual, en base al valor del producto, el valor del préstamos a solicitar y los meses que se desea diferir el préstamo.
    Given Juan ingresa al simulador de creditos hipotecarios y selecciona el producto que le interesa vivienda nueva o usado
    And vivienda e ingresa valorsolicitar:"<valorSolicitar>" valor de la vivienda:"<valorVivienda>" plazo:"<tiempo>" y selecciona el tipo de amortizacion:"<tipoAmortizacion>" y da clic en el boton calcular
    Then se visualizar la cuota mensual:"<mensual>" y la tasa de interes:"<interes>"
    Examples:
|valorSolicitar|valorVivienda|tiempo|tipoAmortizacion|mensual|interes|
|10.000|100.000|15|Frances|167.23|8.45|
#|@externaldata@dataHipotecario.csv |
