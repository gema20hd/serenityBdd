package com.pichincha.automationtest.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.pichincha.automationtest.model.InformacionPersonal;
import com.pichincha.automationtest.userinterface.PaginaCrearCuenta;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.thucydides.core.annotations.Step;

public class CrearCuentaMyStore implements Task {

    private InformacionPersonal informacionPersonal;

    public CrearCuentaMyStore(InformacionPersonal informacionPersonal) {
        this.informacionPersonal = informacionPersonal;
    }
    public static CrearCuentaMyStore conEmail(String data) {
        return Tasks.instrumented(CrearCuentaMyStore.class, data);
    }

    public static CrearCuentaMyStore conDatos(InformacionPersonal data) {
        return Tasks.instrumented(CrearCuentaMyStore.class, data);
    }

    @Override
    @Step("{0} llena datos del formulario para crear la cuenta")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PaginaCrearCuenta.CLICK_BUTTON_SING_IN),
                Enter.theValue(informacionPersonal.getEmail()).into(PaginaCrearCuenta.INPUT_TEXT_EMAIL),
                Click.on(PaginaCrearCuenta.CLICK_BUTTON_CREATE),
                Click.on(PaginaCrearCuenta.CHECK_GENDER),
                Enter.theValue(informacionPersonal.getNombre()).into(PaginaCrearCuenta.INPUT_TEXT_FIRST_NAME),
                Enter.theValue(informacionPersonal.getApellido()).into(PaginaCrearCuenta.INPUT_TEXT_LAST_NAME),
                Enter.theValue(informacionPersonal.getClave()).into(PaginaCrearCuenta.INPUT_TEXT_PASSWORD),
                SelectFromOptions.byVisibleText("5").from(PaginaCrearCuenta.SELECTION_DAYS),
                SelectFromOptions.byVisibleText("April").from(PaginaCrearCuenta.SELECTION_MONTHS),
                SelectFromOptions.byVisibleText("2000").from(PaginaCrearCuenta.SELECTION_YEARS),
                Click.on(PaginaCrearCuenta.CHECK_INFORMATION),
                Click.on(PaginaCrearCuenta.CLICK_BUTTON_CREATE_ACCOUNT)
        );

    }

}
