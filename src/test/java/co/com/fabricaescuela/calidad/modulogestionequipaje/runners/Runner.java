package co.com.fabricaescuela.calidad.modulogestionequipaje.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/show_luggage.feature",
                "src/test/resources/features/luggage_management.feature",
                "src/test/resources/features/luggage_category.feature",
                "src/test/resources/features/luggage_cost.feature"},
        glue = "co.com.fabricaescuela.calidad.modulogestionequipaje.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class Runner {}