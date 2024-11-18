package co.com.fabricaescuela.calidad.modulogestionequipaje.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static co.com.fabricaescuela.calidad.modulogestionequipaje.userinterfaces.CabinLuggagePage.*;

public class ViewCabinLuggage implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SINGLE_BAG_TITLE, isVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(SINGLE_BAG_TITLE)
        );
    }

    public static ViewCabinLuggage options() {
        return Tasks.instrumented(ViewCabinLuggage.class);
    }
}