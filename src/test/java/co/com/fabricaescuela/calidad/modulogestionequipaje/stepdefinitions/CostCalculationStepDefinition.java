package co.com.fabricaescuela.calidad.modulogestionequipaje.stepdefinitions;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import co.com.fabricaescuela.calidad.modulogestionequipaje.tasks.SelectLuggageCategory;
import co.com.fabricaescuela.calidad.modulogestionequipaje.tasks.RemoveAllLuggage;
import co.com.fabricaescuela.calidad.modulogestionequipaje.questions.TotalCost;
import co.com.fabricaescuela.calidad.modulogestionequipaje.questions.CostFormat;

public class CostCalculationStepDefinition {

    @When("el usuario selecciona una categoria de equipaje")
    public void elUsuarioSeleccionaUnaCategoriaDeLuggage() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SelectLuggageCategory.andIncrease()
        );
    }

    @Then("debe ver el costo actualizado inmediatamente")
    public void debeVerElCostoActualizadoInmediatamente() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(TotalCost.value(), equalTo("COP 249.500,00"))
        );
    }

//    @Then("los montos deben mostrarse con decimales separados por coma")
//    public void losMontosDebenMostrarseConDecimalesSeparadosPorComa() {
//        OnStage.theActorInTheSpotlight().should(
//                seeThat(CostFormat.hasDecimalSeparatedByComma())
//        );
//    }
//
//    @Then("los miles deben estar separados por punto")
//    public void losMilesDebenEstarSeparadosPorPunto() {
//        OnStage.theActorInTheSpotlight().should(
//                seeThat(CostFormat.hasThousandsSeparatedByDot())
//        );
//    }

    @Then("los montos deben mostrarse con decimales separados por coma")
    public void losMontosDebenMostrarseConDecimalesSeparadosPorComa() {
        OnStage.theActorInTheSpotlight().should(
                seeThat("El formato decimal es correcto",
                        CostFormat.hasDecimalSeparatedByComma(),
                        equalTo(true))
        );
    }

    @Then("los miles deben estar separados por punto")
    public void losMilesDebenEstarSeparadosPorPunto() {
        OnStage.theActorInTheSpotlight().should(
                seeThat("El formato de miles es correcto",
                        CostFormat.hasThousandsSeparatedByDot(),
                        equalTo(true))
        );
    }


    @When("el usuario elimina todo el equipaje")
    public void elUsuarioEliminaTodoElEquipaje() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                RemoveAllLuggage.completely()
        );
    }

    @Then("el valor total debe mostrarse como cero")
    public void elValorTotalDebeMostrarseComoCero() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(TotalCost.value(), equalTo("COP 0.000,00"))
        );
    }
}
