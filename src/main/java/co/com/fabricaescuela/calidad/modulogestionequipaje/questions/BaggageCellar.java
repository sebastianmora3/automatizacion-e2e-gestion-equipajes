package co.com.fabricaescuela.calidad.modulogestionequipaje.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class BaggageCellar implements Question<String> {

    private final Target element;

    public BaggageCellar(Target element) {
        this.element = element;
    }

    @Override
    public String answeredBy(Actor actor) {
        return element.resolveFor(actor).getText().trim();
    }

    public static Question<String> text(Target element) {
        return new BaggageCellar(element);
    }
}
