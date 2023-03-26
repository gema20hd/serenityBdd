package com.pichincha.automationtest.glue;
import com.pichincha.automationtest.model.InformacionPersonal;
import com.pichincha.automationtest.tasks.CrearCuentaMyStore;
import com.pichincha.automationtest.userinterface.PaginaCrearCuenta;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
public class CrearCuentaGlue {
    @Given("que el {actor} deseo crear un cuenta en my store")
    public void que_el_cliente_deseo_crear_un_cuenta_en_my_store(Actor actor) {
        givenThat(actor).attemptsTo(
                Open.browserOn().the(PaginaCrearCuenta.class)
        );
    }
    @When("ingrese el email:{string} y haga clip el botón crear cuenta y deberia indicar rediriguir a la pantalla de llenar los datos del formulario para la creacion de cuentas")
    public void ingrese_el_email_y_haga_clip_el_botón_crear_cuenta_y_deberia_indicar_rediriguir_a_la_pantalla_de_llenar_los_datos_del_formulario_para_la_creacion_de_cuentas(String email) {
        GivenWhenThen.when(theActorInTheSpotlight()).wasAbleTo(
                CrearCuentaMyStore.conEmail(email)
        );
    }
    @And("ingrese el nombre:{string}, apellido:{string},  email:{string}, clave:{string}, selecione la fecha de nacimiento, acepte los terminos y condiciones; y haga clip en el boton registrar")
    public void ingrese_el_nombre_apellido_email_clave_selecione_la_fecha_de_nacimiento_acepte_los_terminos_y_condiciones_y_haga_clip_en_el_boton_registrar(String nombre, String apellido, String clave, String email) {
        InformacionPersonal informacionPersonal = new InformacionPersonal(nombre, apellido,clave, email);
        and(theActorInTheSpotlight()).wasAbleTo(
                CrearCuentaMyStore.conDatos(informacionPersonal)
        );
    }
    @Then("deberia indicar el mensaje de confirmacion de la cuenta creada {string}")
    public void deberia_indicar_el_mensaje_de_confirmacion_de_la_cuenta_creada(String mensaje) {
        mensaje = "Your account has been created.";
        then(theActorInTheSpotlight()).should(seeThat(the(mensaje)));
    }

}
