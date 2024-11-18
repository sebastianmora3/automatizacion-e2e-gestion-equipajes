package co.com.fabricaescuela.calidad.modulogestionequipaje.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.fabricaescuela.calidad.modulogestionequipaje.userinterfaces.LuggagePage.SPECIAL_LUGGAGE_BUTTON;

public class ClickOn implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SPECIAL_LUGGAGE_BUTTON)
        );
    }

    public static ClickOn specialLuggage() {
        return Tasks.instrumented(ClickOn.class);
    }
}