package com.pichincha.automationtest.glue;

import com.pichincha.automationtest.model.InformacionCredito;
import com.pichincha.automationtest.tasks.RegistroInformacionCreditoHipotecario;
import com.pichincha.automationtest.tasks.VerificacionInformacionCreditoHipotecario;
import com.pichincha.automationtest.userinterface.PaginaSimuladorCreditoUI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class SimulacionCreditoHipotecarioGlue {

    @Given("{actor} ingresa al simulador de creditos hipotecarios y selecciona el producto que le interesa vivienda nueva o usado")
    public void que_el_cliente_ingresa_al_simulador_de_creditos_hipotecarios(Actor actor) {
        givenThat(actor).attemptsTo(Open.browserOn().the(PaginaSimuladorCreditoUI.class));
    }
    @When("vivienda e ingresa valorsolicitar:{string} valor de la vivienda:{string} plazo:{string} y selecciona el tipo de amortizacion:{string} y da clic en el boton calcular")
    public void vivienda_e_ingresa_valorsolicitar_valor_de_la_vivienda_plazo_y_selecciona_el_tipo_de_amortizacion(String valorSolicitar, String valorVivienda, String plazo, String tipoAmortizacion) {
        when(theActorInTheSpotlight()).wasAbleTo(
                RegistroInformacionCreditoHipotecario.
                        conInformacionCredito(InformacionCredito.conDatos(
                        valorSolicitar,valorVivienda,plazo,tipoAmortizacion))
        );
    }
    @Then("se visualizar la cuota mensual:{string} y la tasa de interes:{string}")
    public void el_deberia_validar_la_cuota_mensual_y_la_tasa_de_interes(String mensual, String interes) {
        then(theActorInTheSpotlight()).wasAbleTo(
                VerificacionInformacionCreditoHipotecario.conInformacionValidacionCredito(InformacionCredito.cuotaMensualInteres(
                        mensual,interes))
        );
    }



}