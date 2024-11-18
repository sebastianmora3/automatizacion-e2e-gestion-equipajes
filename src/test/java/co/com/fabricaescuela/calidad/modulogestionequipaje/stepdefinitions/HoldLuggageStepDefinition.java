package co.com.fabricaescuela.calidad.modulogestionequipaje.stepdefinitions;

import co.com.fabricaescuela.calidad.modulogestionequipaje.questions.BaggageCellar;
import co.com.fabricaescuela.calidad.modulogestionequipaje.tasks.ViewHoldLuggage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.fabricaescuela.calidad.modulogestionequipaje.userinterfaces.CabinLuggagePage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.equalTo;

public class HoldLuggageStepDefinition {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("usuario");
    }

    @When("el usuario visualiza la seccion {string}")
    public void elUsuarioVisualizaLaSeccion(String seccionTitulo) {
        OnStage.theActorInTheSpotlight().attemptsTo(ViewHoldLuggage.section());
        OnStage.theActorInTheSpotlight().should(
                seeThat(BaggageCellar.text(HOLD_LUGGAGE_SECTION_TITLE), equalTo(seccionTitulo))
        );
    }

    @Then("debe ver la opcion de maleta de {string} con precio {string}")
    public void debeVerLaOpcionDeMaletaConPrecio(String peso, String precio) {
        if (peso.equals("15kg")) {
            OnStage.theActorInTheSpotlight().should(
                    seeThat(BaggageCellar.text(LUGGAGE_15KG_TITLE), equalTo(peso)),
                    seeThat(BaggageCellar.text(LUGGAGE_15KG_PRICE), equalTo(precio))
            );
        } else {
            OnStage.theActorInTheSpotlight().should(
                    seeThat(BaggageCellar.text(LUGGAGE_23KG_TITLE), equalTo(peso)),
                    seeThat(BaggageCellar.text(LUGGAGE_23KG_PRICE), equalTo(precio))
            );
        }
    }

    @Then("debe ver un indicador {string} para cada opcion de bodega")
    public void debeVerUnIndicadorParaCadaOpcionDeBodega(String indicador) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(BaggageCellar.text(MAX_INDICATOR_15KG), equalTo(indicador)),
                seeThat(BaggageCellar.text(MAX_INDICATOR_23KG), equalTo(indicador))
        );
    }

    @Then("debe ver controles de cantidad para seleccionar el numero de maletas")
    public void debeVerControlesDeCantidadParaSeleccionarElNumeroDeMaletas() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(DECREASE_BUTTON_15KG, isVisible()).forNoMoreThan(10).seconds(),
                WaitUntil.the(INCREASE_BUTTON_15KG, isVisible()).forNoMoreThan(10).seconds(),
                WaitUntil.the(DECREASE_BUTTON_23KG, isVisible()).forNoMoreThan(10).seconds(),
                WaitUntil.the(INCREASE_BUTTON_23KG, isVisible()).forNoMoreThan(10).seconds()
        );
    }
}
