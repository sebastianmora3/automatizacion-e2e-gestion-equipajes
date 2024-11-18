package co.com.fabricaescuela.calidad.modulogestionequipaje.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.fabricaescuela.calidad.modulogestionequipaje.userinterfaces.CabinLuggagePage.INCREASE_BUTTON_15KG;

public class AddHoldLuggage implements Task {
    private final int numberOfClicks;

    public AddHoldLuggage(int numberOfClicks) {
        this.numberOfClicks = numberOfClicks;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (int i = 0; i < numberOfClicks; i++) {
            actor.attemptsTo(
                    Click.on(INCREASE_BUTTON_15KG)
            );
        }
    }

    public static AddHoldLuggage times(int clicks) {
        return Tasks.instrumented(AddHoldLuggage.class, clicks);
    }
}

