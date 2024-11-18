package co.com.fabricaescuela.calidad.modulogestionequipaje.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EquipajePage {
    public static final Target TITULO_PAGINA = Target.the("título de la página")
            .located(By.cssSelector("h1"));
}