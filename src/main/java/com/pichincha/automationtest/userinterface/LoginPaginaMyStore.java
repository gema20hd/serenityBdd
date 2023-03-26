package com.pichincha.automationtest.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("page:webdriver.base.url.store")
public class LoginPaginaMyStore extends PageObject{
    public static final Target CLICK_BUTTON_SING_IN = Target.the("'Boton registrar'").locatedBy("//*[@title='Log in to your customer account']");
    public static final Target INPUT_TEXT_EMAIL = Target.the("' Ingresar el email'").locatedBy("//*[@id='email_create']");
    public static final Target CLICK_BUTTON_CREATE_ACCOUNT= Target.the("'Boton crear cuenta'").locatedBy("//span[text()='Register']");
}
