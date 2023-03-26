package com.pichincha.automationtest.tasks;

import com.pichincha.automationtest.model.Credito;
import com.pichincha.automationtest.model.Login;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.pichincha.automationtest.userinterface.LoginBancaWebUI.*;
import static com.pichincha.automationtest.userinterface.PaginaSimuladorCreditoUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresoCredencialesBancaWeb implements Task {

 private Login login;

    public IngresoCredencialesBancaWeb(Login login) {
        this.login = login;
    }

    public static IngresoCredencialesBancaWeb conInformacion(Login login) {
        return instrumented(IngresoCredencialesBancaWeb.class, login);

    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Enter.theValue(login.getUsuario()).into(INPUT_USUARIO),
                Enter.theValue(login.getClave()).into(INPUT_CLAVE)

        );
        actor.attemptsTo(Click.on(BOTON_INGRESAR));
    }

}