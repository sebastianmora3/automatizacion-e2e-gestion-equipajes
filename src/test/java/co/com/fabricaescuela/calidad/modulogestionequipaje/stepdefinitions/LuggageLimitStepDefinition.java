package co.com.fabricaescuela.calidad.modulogestionequipaje.stepdefinitions;

import co.com.fabricaescuela.calidad.modulogestionequipaje.questions.BaggageCellar;
import co.com.fabricaescuela.calidad.modulogestionequipaje.questions.TheLuggageQuantity;
import co.com.fabricaescuela.calidad.modulogestionequipaje.tasks.AddHoldLuggage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.fabricaescuela.calidad.modulogestionequipaje.userinterfaces.CabinLuggagePage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class LuggageLimitStepDefinition {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("usuario");
    }

    @When("intento agregar mas de {string} maletas de cualquier tipo")
    public void elUsuarioIntentaAgregarMasDeMaletas(String limite) {
        int clicks = Integer.parseInt(limite) + 1; // Intentamos agregar uno más del límite
        OnStage.theActorInTheSpotlight().attemptsTo(
                AddHoldLuggage.times(clicks)
        );
    }

    @Then("no se me debe permitir exceder este limite")
    public void elSistemaNoDebePermitirExcederEsteLimite() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(TheLuggageQuantity.amount(LUGGAGE_QUANTITY_15KG), equalTo("3"))
        );
    }

    @Then("debe mostrar el indicador {string} de manera visible")
    public void debeMostrarElIndicadorDeManteraVisible(String indicador) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(MAX_INDICATOR_15KG).isDisplayed()
        );

        OnStage.theActorInTheSpotlight().should(
                seeThat(BaggageCellar.text(MAX_INDICATOR_15KG), equalTo(indicador))
        );

    }
}
