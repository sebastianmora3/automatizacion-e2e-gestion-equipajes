package co.com.fabricaescuela.calidad.modulogestionequipaje.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class TheText implements Question<String> {
    private final Target element;

    public TheText(Target element) {
        this.element = element;
    }

    @Override
    public String answeredBy(Actor actor) {
        return element.resolveFor(actor).getText().trim();
    }

    public static TheText of(Target element) {
        return new TheText(element);
    }
}
