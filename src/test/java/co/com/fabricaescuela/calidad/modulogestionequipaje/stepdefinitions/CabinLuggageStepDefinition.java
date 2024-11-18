package co.com.fabricaescuela.calidad.modulogestionequipaje.stepdefinitions;
import co.com.fabricaescuela.calidad.modulogestionequipaje.questions.CabinLuggageOption;
import co.com.fabricaescuela.calidad.modulogestionequipaje.tasks.ViewCabinLuggage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.fabricaescuela.calidad.modulogestionequipaje.userinterfaces.CabinLuggagePage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

public class CabinLuggageStepDefinition {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("usuario");
    }

    @When("el usuario visualiza las opciones de equipaje en cabina")
    public void elUsuarioVisualizaLasOpcionesDeEquipajeEnCabina() {
        OnStage.theActorInTheSpotlight().attemptsTo(ViewCabinLuggage.options());
    }

    @Then("debe ver la opcion {string} con descripcion {string}")
    public void debeVerLaOpcionConDescripcion(String opcion, String descripcion) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(SINGLE_BAG_TITLE, isVisible()).forNoMoreThan(20).seconds()
        );

        OnStage.theActorInTheSpotlight().should(
                seeThat(CabinLuggageOption.text(SINGLE_BAG_TITLE), equalTo(opcion)),
                seeThat(CabinLuggageOption.text(SINGLE_BAG_DESCRIPTION), equalTo(descripcion))
        );
    }

    @Then("debe ver que esta opcion esta {string}")
    public void debeVerQueEstaOpcionEsta(String estado) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(CabinLuggageOption.text(INCLUDED_TEXT), containsString(estado))
        );
    }

    @Then("debe ver la opcion {string} {string}")
    public void debeVerLaOpcion(String opcionCombinada, String descripcion) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(SINGLE_BAG_TITLE, isVisible()).forNoMoreThan(10).seconds()
        );

        OnStage.theActorInTheSpotlight().should(
                seeThat(CabinLuggageOption.text(COMBINED_OPTION_TITLE), equalTo(opcionCombinada)),
                seeThat(CabinLuggageOption.text(HAND_LUGGAGE_TEXT), equalTo(descripcion))
        );
    }

    @Then("debe ver el precio {string} para la opcion adicional de cabina")
    public void debeVerElPrecioParaLaOpcionAdicionalDeCabina(String precio) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(CabinLuggageOption.text(PRICE_TEXT), containsString(precio))
        );
    }
}
