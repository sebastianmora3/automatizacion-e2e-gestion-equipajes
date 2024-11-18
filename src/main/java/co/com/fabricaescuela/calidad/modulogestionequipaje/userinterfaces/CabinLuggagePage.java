package co.com.fabricaescuela.calidad.modulogestionequipaje.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CabinLuggagePage extends PageObject {

    // Scenario 1
    public static final Target SINGLE_BAG_TITLE = Target.the("Titulo de bolso pequeno")
            .locatedBy("/html/body/div[1]/div/form/div/div[2]/div/div[2]/div[2]/div[1]/div/div[1]/div/h3");

    public static final Target SINGLE_BAG_DESCRIPTION = Target.the("Descripción de bolso pequeño")
            .locatedBy("/html/body/div[1]/div/form/div/div[2]/div/div[2]/div[2]/div[1]/div/div[1]/div/p");

    public static final Target INCLUDED_TEXT = Target.the("Texto de incluido")
            .locatedBy("/html/body/div[1]/div/form/div/div[2]/div/div[2]/div[2]/div[1]/div/div[2]/div/label");

    public static final Target COMBINED_OPTION_TITLE = Target.the("Título de opción combinada")
            .locatedBy("/html/body/div[1]/div/form/div/div[2]/div/div[2]/div[2]/div[2]/div/div[1]/div/h3");

    public static final Target HAND_LUGGAGE_TEXT = Target.the("Texto de equipaje de mano")
            .locatedBy("/html/body/div[1]/div/form/div/div[2]/div/div[2]/div[2]/div[2]/div/div[1]/div/p");

    public static final Target PRICE_TEXT = Target.the("Texto del precio")
            .locatedBy("/html/body/div[1]/div/form/div/div[2]/div/div[2]/div[2]/div[2]/div/div[2]/div/label");

    // Scenario 2
    public static final Target HOLD_LUGGAGE_SECTION_TITLE = Target.the("Título de sección de equipaje de bodega")
            .locatedBy("/html/body/div[1]/div/form/div/div[2]/div/div[2]/div[3]/div/h3/p");

    public static final Target LUGGAGE_15KG_TITLE = Target.the("Título de maleta de 15kg")
            .locatedBy("/html/body/div[1]/div/form/div/div[2]/div/div[2]/div[4]/div[1]/div/div/div[1]/div/h3");

    public static final Target LUGGAGE_15KG_PRICE = Target.the("Precio de maleta de 15kg")
            .locatedBy("/html/body/div[1]/div/form/div/div[2]/div/div[2]/div[4]/div[1]/div/div/div[1]/div/p/span");

    public static final Target LUGGAGE_23KG_TITLE = Target.the("Título de maleta de 23kg")
            .locatedBy("/html/body/div[1]/div/form/div/div[2]/div/div[2]/div[4]/div[2]/div/div/div[1]/div/h3");

    public static final Target LUGGAGE_23KG_PRICE = Target.the("Precio de maleta de 23kg")
            .locatedBy("/html/body/div[1]/div/form/div/div[2]/div/div[2]/div[4]/div[2]/div/div/div[1]/div/p/span");

    public static final Target MAX_INDICATOR_15KG = Target.the("Indicador Max 3 para maleta 15kg")
            .locatedBy("/html/body/div[1]/div/form/div/div[2]/div/div[2]/div[4]/div[1]/div/div/div[2]/div[2]");

    public static final Target MAX_INDICATOR_23KG = Target.the("Indicador Max 3 para maleta 23kg")
            .locatedBy("/html/body/div[1]/div/form/div/div[2]/div/div[2]/div[4]/div[2]/div/div/div[2]/div[2]");

    public static final Target DECREASE_BUTTON_15KG = Target.the("Botón decrementar cantidad maleta 15kg")
            .locatedBy("/html/body/div[1]/div/form/div/div[2]/div/div[2]/div[4]/div[1]/div/div/div[2]/div[1]/button[1]");

    public static final Target INCREASE_BUTTON_15KG = Target.the("Botón incrementar cantidad maleta 15kg")
            .locatedBy("/html/body/div[1]/div/form/div/div[2]/div/div[2]/div[4]/div[1]/div/div/div[2]/div[1]/button[2]");

    public static final Target DECREASE_BUTTON_23KG = Target.the("Botón decrementar cantidad maleta 23kg")
            .locatedBy("/html/body/div[1]/div/form/div/div[2]/div/div[2]/div[4]/div[2]/div/div/div[2]/div[1]/button[1]");

    public static final Target INCREASE_BUTTON_23KG = Target.the("Botón incrementar cantidad maleta 23kg")
            .locatedBy("/html/body/div[1]/div/form/div/div[2]/div/div[2]/div[4]/div[2]/div/div/div[2]/div[1]/button[2]");

    // Scenario 3

    public static final Target LUGGAGE_QUANTITY_15KG = Target.the("Cantidad seleccionada de maleta 15kg")
            .locatedBy("/html/body/div[1]/div/form/div/div[2]/div/div[2]/div[4]/div[1]/div/div/div[2]/div[1]/span");
}
