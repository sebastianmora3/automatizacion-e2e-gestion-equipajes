package co.com.fabricaescuela.calidad.modulogestionequipaje.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.fabricaescuela.calidad.modulogestionequipaje.userinterfaces.LuggageCostPage.TOTAL_COST;

public class TotalCost {
    public static Question<String> value() {
        return actor -> TOTAL_COST.resolveFor(actor).getText().trim();
    }
}
