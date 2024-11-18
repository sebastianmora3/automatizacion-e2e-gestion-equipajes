package co.com.fabricaescuela.calidad.modulogestionequipaje.stepdefinitions;

import co.com.fabricaescuela.calidad.modulogestionequipaje.userinterfaces.EquipajePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static org.hamcrest.Matchers.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class FindTitlePageStepDefinition {

    @Before
    public void config(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("usuario");
    }

    @When("espero que la pagina cargue completamente")
    public void elUsuarioEsperaQueLaPaginaCargueCompletamente() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(EquipajePage.TITULO_PAGINA, isVisible())
                        .forNoMoreThan(10).seconds()
        );
    }

    @Then("debo ver la pagina de gestion de equipaje")
    public void debeVerLaPaginaDeGestionDeEquipaje() {
        OnStage.theActorInTheSpotlight().should(
                seeThat("el título está presente",
                        actor -> Text.of(EquipajePage.TITULO_PAGINA).answeredBy(actor),
                        equalTo("Personaliza tu viaje"))
        );
    }
}
