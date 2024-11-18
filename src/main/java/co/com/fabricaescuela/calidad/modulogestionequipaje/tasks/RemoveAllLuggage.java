package co.com.fabricaescuela.calidad.modulogestionequipaje.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static co.com.fabricaescuela.calidad.modulogestionequipaje.userinterfaces.LuggageCostPage.*;

public class RemoveAllLuggage implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        for (int i = 0; i < 5; i++) {
            actor.attemptsTo(
                    WaitUntil.the(DECREASE_QUANTITY_BUTTON, isClickable()).forNoMoreThan(10).seconds(),
                    Click.on(DECREASE_QUANTITY_BUTTON)
            );
        }
    }

    public static RemoveAllLuggage completely() {
        return Tasks.instrumented(RemoveAllLuggage.class);
    }
}
