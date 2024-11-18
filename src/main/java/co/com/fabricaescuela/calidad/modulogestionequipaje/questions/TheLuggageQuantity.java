package co.com.fabricaescuela.calidad.modulogestionequipaje.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class TheLuggageQuantity implements Question<String> {
    private final Target element;

    public TheLuggageQuantity(Target element) {
        this.element = element;
    }

    @Override
    public String answeredBy(Actor actor) {
        return element.resolveFor(actor).getText().trim();
    }

    public static Question<String> amount(Target element) {
        return new TheLuggageQuantity(element);
    }
}
