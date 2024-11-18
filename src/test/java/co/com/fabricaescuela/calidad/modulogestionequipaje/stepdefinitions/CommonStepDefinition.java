package co.com.fabricaescuela.calidad.modulogestionequipaje.stepdefinitions;

import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

public class CommonStepDefinition {

    @Given("que ingreso a la pagina de equipaje")
    public void elUsuarioAccedeALaPaginaDeGestionDeEquipaje() {
        OnStage.theActorInTheSpotlight()
                .wasAbleTo(Open.browserOn().thePageNamed("pages.equipajeUrl"));
    }
}
