package co.com.fabricaescuela.calidad.modulogestionequipaje.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.fabricaescuela.calidad.modulogestionequipaje.userinterfaces.LuggagePage.*;

public class ViewThe implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(CABINA_TEXT),
                Scroll.to(BODEGA_TEXT),
                Scroll.to(ESPECIAL_TEXT)
        );
    }

    public static ViewThe luggageOptions() {
        return Tasks.instrumented(ViewThe.class);
    }
}
