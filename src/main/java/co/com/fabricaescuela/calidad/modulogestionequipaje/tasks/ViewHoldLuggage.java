package co.com.fabricaescuela.calidad.modulogestionequipaje.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.fabricaescuela.calidad.modulogestionequipaje.userinterfaces.CabinLuggagePage.HOLD_LUGGAGE_SECTION_TITLE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ViewHoldLuggage implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(HOLD_LUGGAGE_SECTION_TITLE, isVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(HOLD_LUGGAGE_SECTION_TITLE)
        );
    }

    public static ViewHoldLuggage section() {
        return Tasks.instrumented(ViewHoldLuggage.class);
    }
}
