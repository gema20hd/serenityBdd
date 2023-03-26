package com.pichincha.automationtest.tasks;

import com.pichincha.automationtest.model.Credito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.pichincha.automationtest.userinterface.PaginaSimuladorCreditoUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegistroInformacionCreditoHipotecario implements Task {

 private Credito credito;

    public RegistroInformacionCreditoHipotecario(Credito credito) {
        this.credito = credito;
    }

    public static RegistroInformacionCreditoHipotecario conInformacionCredito(Credito credito) {
        return instrumented(RegistroInformacionCreditoHipotecario.class, credito);

    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_CREDITO),
                Click.on(CHECK_VIVIENDA),
                Enter.theValue(credito.getValorSolicitar()).into(INPUT_MONTO_SOLICITAR),
                Enter.theValue(credito.getValorVivienda()).into(INPUT_PRECIO_VIVIENDA),
                Enter.theValue(credito.getPlazoPrestamo()).into(INPUT_PLAZO_PRESTAMO)
        );
        if (credito.getTipoAmortizacion().equalsIgnoreCase("Frances")){
            actor.attemptsTo(Click.on(CHECK_AMORTIZACION_FRANCE));
        }
        actor.attemptsTo(Click.on(BOTON_CALCULAR));
    }

}