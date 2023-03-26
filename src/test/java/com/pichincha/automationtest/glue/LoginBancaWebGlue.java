package com.pichincha.automationtest.glue;

import com.pichincha.automationtest.model.InformacionCredito;
import com.pichincha.automationtest.model.InformacionLogin;
import com.pichincha.automationtest.tasks.IngresoCredencialesBancaWeb;
import com.pichincha.automationtest.tasks.RegistroInformacionCreditoHipotecario;
import com.pichincha.automationtest.tasks.ValidacionCredencialesBancaWeb;
import com.pichincha.automationtest.tasks.VerificacionInformacionCreditoHipotecario;
import com.pichincha.automationtest.userinterface.LoginBancaWebUI;
import com.pichincha.automationtest.userinterface.PaginaSimuladorCreditoUI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginBancaWebGlue {


    @Given("que el {actor} ingresa al banca web")
    public void que_el_cliente_ingresa_al_banca_web(Actor actor) {
        givenThat(actor).attemptsTo(Open.browserOn().the(LoginBancaWebUI.class));
    }
    @When("ingresa  el usuario: {string} y la clave:{string}")
    public void ingresa_el_usuario_y_la_clave(String usuario, String clave) {
        when(theActorInTheSpotlight()).wasAbleTo(
                IngresoCredencialesBancaWeb.
                        conInformacion(InformacionLogin.conDatos(usuario,clave))
        );
    }
    @Then("se mostrara el siguiente mensaje: {string}")
    public void se_mostrara_el_siguiente_mensaje(String mensaje) {
        then(theActorInTheSpotlight()).wasAbleTo(
                ValidacionCredencialesBancaWeb.confirmacionLogin(InformacionLogin.mensajeIngreso(mensaje))
        );
    }


}