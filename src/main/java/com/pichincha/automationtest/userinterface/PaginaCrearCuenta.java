package com.pichincha.automationtest.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("page:webdriver.base.url.store")
public class PaginaCrearCuenta  extends PageObject{
    public static final Target CLICK_BUTTON_SING_IN = Target.the("'Boton registrar'").locatedBy("//*[@title='Log in to your customer account']");
    public static final Target INPUT_TEXT_EMAIL = Target.the("' Ingresar el email'").locatedBy("//*[@id='email_create']");
    public static final Target CLICK_BUTTON_CREATE = Target.the("'Boton crear'").locatedBy("//*[@id='SubmitCreate']/span");
    public static final Target CHECK_GENDER = Target.the("'Selecionar el genero'").locatedBy("//*[@id='id_gender2']");
    public static final Target INPUT_TEXT_FIRST_NAME = Target.the("' Ingresar el nombre'").locatedBy("//*[@id='customer_firstname']");
    public static final Target INPUT_TEXT_LAST_NAME = Target.the("' Ingresar el apellido'").locatedBy("//*[@id='customer_lastname']");
    public static final Target INPUT_TEXT_PASSWORD= Target.the("' Ingresar la clave'").locatedBy("//*[@id='passwd']");
    public static final Target SELECTION_DAYS= Target.the("'Seleccionar el día'").locatedBy("//*[@id='days']");
    public static final Target SELECTION_MONTHS= Target.the("' Ingresar el mes'").locatedBy("//*[@id='months']");
    public static final Target SELECTION_YEARS= Target.the("' Ingresar el anio'").locatedBy("//*[@id='years']");
    public static final Target CHECK_INFORMATION= Target.the("'Aceptar la publicidad'").locatedBy("//*[@id='optin']");
    public static final Target CLICK_BUTTON_CREATE_ACCOUNT= Target.the("'Boton crear cuenta'").locatedBy("//span[text()='Register']");
}
