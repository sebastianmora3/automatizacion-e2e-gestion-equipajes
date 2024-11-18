package co.com.fabricaescuela.calidad.modulogestionequipaje.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LuggageCostPage extends PageObject {
    public static final Target LUGGAGE_CATEGORY_BUTTON = Target.the("Botón de categoría de equipaje")
            .locatedBy("/html/body/div[1]/div/form/div/div[2]/div/div[2]/div[5]/div/h3/button/div/div");

    public static final Target INCREASE_QUANTITY_BUTTON = Target.the("Botón para aumentar cantidad")
            .locatedBy("/html/body/div[1]/div/form/div/div[2]/div/div[2]/div[5]/div/div/div/div[4]/div/div/div[2]/div/button[2]");

    public static final Target DECREASE_QUANTITY_BUTTON = Target.the("Botón para disminuir cantidad")
            .locatedBy("/html/body/div[1]/div/form/div/div[2]/div/div[2]/div[5]/div/div/div/div[4]/div/div/div[2]/div/button[1]");

    public static final Target TOTAL_COST = Target.the("Costo total")
            .locatedBy("/html/body/div[1]/div/form/div/div[2]/div/div[3]/span[2]");
}
