package com.pichincha.automationtest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("page:webdriver.base.url.hipotecario")
public class PaginaSimuladorCreditoUI extends PageObject {

    public static final Target BOTON_CREDITO = Target.the("BOTON_CREDITO").
            locatedBy("//*[@id='menubarSimulateCreditButton']");
    public static final Target CHECK_VIVIENDA = Target.the("CHECK_VIVIENDA").
            locatedBy("//*[@id='setNewUsedProductCheckboxInput']");

    public static final Target INPUT_PRECIO_VIVIENDA = Target.the("INPUT_PRECIO_VIVIENDA").
            locatedBy("//*[@id='home-price-calculator']");

    public static final Target INPUT_MONTO_SOLICITAR = Target.the("INPUT_MONTO_SOLICITAR").
            locatedBy("//*[@id='requested-amount-calculator']");
    public static final Target INPUT_PLAZO_PRESTAMO = Target.the("INPUT_PLAZO_PRESTAMO").
            locatedBy("//*[@id='loan-term-years-calculator']");

    public static final Target CHECK_AMORTIZACION_FRANCE = Target.the("CHECK_AMORTIZACION_FRANCE").
            locatedBy("//*[@id='setFrenchAmortizationCheckboxInput']");
   public static final Target BOTON_CALCULAR = Target.the("BOTON_CALCULAR").
            locatedBy("//pichincha-button[@id='calculateButton']");

    public static final Target INFORMACION_CUOTA_MENSUAL = Target.the("INFORMACION_CUOTA_MENSUAL").
            locatedBy("//*[contains(@class, 'monthly-fee')]");


    public static final Target TASA_INTERES = Target.the("TASA_INTERES").
            locatedBy("//*[contains(@class, 'results-container')]//*[contains(@class, 'grid-spacing-2')]/pichincha-grid[2]/div/pichincha-grid/div/pichincha-grid/div/div[2]/div/div/div[5]/div[2]/pichincha-typography");
    public static final Target INFORMACION_REFERENCIAL = Target.the("TASA_INTERES").
            locatedBy("//*[contains(@class, 'grid-spacing-1')]//*[contains(@class, 'desktop-card')]");

    public static final Target BOTON_VOLVER = Target.the("BOTON_VOLVER").
            locatedBy("//pichincha-button[@id='recalculateButton']");

}