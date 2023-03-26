package com.pichincha.automationtest.tasks;

import com.pichincha.automationtest.model.Credito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.pichincha.automationtest.userinterface.PaginaSimuladorCreditoUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class VerificacionInformacionCreditoHipotecario implements Task {



    private Credito credito;

    public VerificacionInformacionCreditoHipotecario(Credito credito) {
        this.credito = credito;
    }
    public static VerificacionInformacionCreditoHipotecario conInformacionValidacionCredito(Credito credito) {
        return instrumented(VerificacionInformacionCreditoHipotecario.class, credito);

    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        String valor= "$"+credito.getCuaotaMensual().substring(0,3)+","+credito.getCuaotaMensual().substring(4,6);
        actor.attemptsTo(
                Ensure.that(INFORMACION_CUOTA_MENSUAL).hasText(valor),
                Ensure.that(TASA_INTERES).hasText(credito.getTasaInteres()+"%"),
                Click.on(INFORMACION_REFERENCIAL),
                Click.on(BOTON_VOLVER)
        );
    }

}