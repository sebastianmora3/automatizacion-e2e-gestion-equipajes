package co.com.fabricaescuela.calidad.modulogestionequipaje.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.fabricaescuela.calidad.modulogestionequipaje.userinterfaces.LuggagePage.*;

public class TheLuggageCategories implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String cabina = CABINA_TEXT.resolveFor(actor).getText().toLowerCase();
        String bodega = BODEGA_TEXT.resolveFor(actor).getText().toLowerCase();
        String especial = ESPECIAL_TEXT.resolveFor(actor).getText().toLowerCase();

        return cabina.contains("cabina") &&
                bodega.contains("bodega") &&
                especial.contains("especial");
    }

    public static TheLuggageCategories areVisible() {
        return new TheLuggageCategories();
    }
}
