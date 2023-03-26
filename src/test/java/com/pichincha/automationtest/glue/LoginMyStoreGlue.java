package com.pichincha.automationtest.glue;

import com.pichincha.automationtest.model.InformacionLogin;
import com.pichincha.automationtest.tasks.IngresoCredencialesBancaWeb;
import com.pichincha.automationtest.tasks.ValidacionCredencialesBancaWeb;
import com.pichincha.automationtest.userinterface.LoginBancaWebUI;
import com.pichincha.automationtest.userinterface.PaginaCrearCuenta;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginMyStoreGlue {
    @Given("{actor} Desea ingresar a la pagina de mystore")
    public void juan_desea_ingresar_a_la_pagina_de_mystore( Actor actor) {
        givenThat(actor).attemptsTo(
                Open.browserOn().the(PaginaCrearCuenta.class)
        );
    }
    @When("ingresa usuario:{string} y el clave:{string} y da clic en el boton Sing In")
    public void ingresa_usuario_y_el_clave_y_da_clic_en_el_boton_sing_in(String email, String password) {

    }
    @Then("se visualizar el home de la pagina web My store")
    public void se_visualizar_el_home_de_la_pagina_web_my_store() {

    }

}