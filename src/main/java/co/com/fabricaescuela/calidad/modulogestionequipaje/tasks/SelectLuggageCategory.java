package co.com.fabricaescuela.calidad.modulogestionequipaje.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static co.com.fabricaescuela.calidad.modulogestionequipaje.userinterfaces.LuggageCostPage.*;

public class SelectLuggageCategory implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LUGGAGE_CATEGORY_BUTTON, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(LUGGAGE_CATEGORY_BUTTON)
        );

        for (int i = 0; i < 5; i++) {
            actor.attemptsTo(
                    WaitUntil.the(INCREASE_QUANTITY_BUTTON, isClickable()).forNoMoreThan(10).seconds(),
                    Click.on(INCREASE_QUANTITY_BUTTON)
            );
        }
    }

    public static SelectLuggageCategory andIncrease() {
        return Tasks.instrumented(SelectLuggageCategory.class);
    }
}
