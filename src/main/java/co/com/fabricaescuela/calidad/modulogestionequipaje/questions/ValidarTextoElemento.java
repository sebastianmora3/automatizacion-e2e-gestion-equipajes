package co.com.fabricaescuela.calidad.modulogestionequipaje.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarTextoElemento implements Question<String> {
    private final Target elemento;

    public ValidarTextoElemento(Target elemento) {
        this.elemento = elemento;
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(elemento).answeredBy(actor);
    }

    public static ValidarTextoElemento de(Target elemento) {
        return new ValidarTextoElemento(elemento);
    }
}
