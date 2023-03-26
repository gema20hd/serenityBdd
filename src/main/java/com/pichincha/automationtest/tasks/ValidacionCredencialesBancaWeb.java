package com.pichincha.automationtest.tasks;

import com.pichincha.automationtest.model.Login;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.pichincha.automationtest.userinterface.LoginBancaWebUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ValidacionCredencialesBancaWeb implements Task {

 private Login login;

    public ValidacionCredencialesBancaWeb(Login login) {
        this.login = login;
    }

    public static ValidacionCredencialesBancaWeb confirmacionLogin(Login login) {
        return instrumented(ValidacionCredencialesBancaWeb.class, login);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(login.getClave()).into(LABEL_MENSAJE));

    }

}