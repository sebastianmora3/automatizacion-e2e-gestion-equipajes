package co.com.fabricaescuela.calidad.modulogestionequipaje.stepdefinitions;

import co.com.fabricaescuela.calidad.modulogestionequipaje.questions.TheLuggageCategories;
import co.com.fabricaescuela.calidad.modulogestionequipaje.questions.TheText;
import co.com.fabricaescuela.calidad.modulogestionequipaje.tasks.ClickOn;
import co.com.fabricaescuela.calidad.modulogestionequipaje.tasks.ViewThe;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static org.hamcrest.Matchers.*;
import java.util.List;
import java.util.Map;

import static co.com.fabricaescuela.calidad.modulogestionequipaje.userinterfaces.LuggagePage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class ShowLuggageStepDefinition {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("usuario");
    }

    @When("el usuario visualiza las opciones disponibles")
    public void elUsuarioVisualizaLasOpcionesDisponibles() {

        OnStage.theActorInTheSpotlight().attemptsTo(ViewThe.luggageOptions());
    }

    @Then("debe ver las categorias {string}, {string} y {string}")
    public void debeVerLasCategorias(String categoria1, String categoria2, String categoria3) {
        OnStage.theActorInTheSpotlight()
                .should(seeThat(TheLuggageCategories.areVisible(), is(true)));
    }

    @When("el usuario hace clic en la opcion {string}")
    public void elUsuarioHaceClicEnLaOpcion(String opcion) {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickOn.specialLuggage());
    }

    @Then("debe ver las siguientes opciones de equipaje especial con sus costos:")
    public void debeVerLasOpcionesDeEquipajeEspecialConSusCostos(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps();

        OnStage.theActorInTheSpotlight().should(
                seeThat("Texto instrumento musical",
                        TheText.of(MUSICAL_INSTRUMENT_TITLE),
                        equalTo("Instrumento musical 15kg")),
                seeThat("Precio instrumento musical",
                        TheText.of(MUSICAL_INSTRUMENT_PRICE),
                        equalTo("COP 49,900.00")),

                seeThat("Texto equipo deportivo",
                        TheText.of(SPORTS_EQUIPMENT_TITLE),
                        equalTo("Equipo deportivo 15kg")),
                seeThat("Precio equipo deportivo",
                        TheText.of(SPORTS_EQUIPMENT_PRICE),
                        equalTo("COP 49,900.00")),

                seeThat("Texto equipos audiovisuales",
                        TheText.of(AUDIOVISUAL_EQUIPMENT_TITLE),
                        equalTo("Equipos adiovisuales 15kg")),
                seeThat("Precio equipos audiovisuales",
                        TheText.of(AUDIOVISUAL_EQUIPMENT_PRICE),
                        equalTo("COP 49,900.00")),

                seeThat("Texto guacal mascota",
                        TheText.of(PET_CARRIER_TITLE),
                        equalTo("Guacal con mascota 15kg")),
                seeThat("Precio guacal mascota",
                        TheText.of(PET_CARRIER_PRICE),
                        equalTo("COP 49,900.00"))
        );
    }

}