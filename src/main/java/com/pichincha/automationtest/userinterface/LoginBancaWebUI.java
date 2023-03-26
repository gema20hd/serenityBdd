package com.pichincha.automationtest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("page:webdriver.base.url.bancaWeb")
public class LoginBancaWebUI extends PageObject {

    public static final Target INPUT_USUARIO = Target.the("INPUT_USUARIO").
            locatedBy("//*[@id='bb_input_0']");

    public static final Target INPUT_CLAVE = Target.the("INPUT_USUARIO").
            locatedBy("//*[@id='bb_input_1']");

    public static final Target BOTON_INGRESAR = Target.the("BOTON_INGRESAR").
            locatedBy("//*[@aria-label='Login']");

     public static final Target LABEL_MENSAJE = Target.the("BOTON_INGRESAR").
            locatedBy("//html/body/div/div/div/div/div/div/div/pbw-pichincha-banca-web-public/bb-root/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/pbw-login-widget/pbw-login-container/div/div[3]/div/pbw-alert-ui/div/div");
}