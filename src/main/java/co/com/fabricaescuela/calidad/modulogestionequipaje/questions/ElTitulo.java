package co.com.fabricaescuela.calidad.modulogestionequipaje.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import co.com.fabricaescuela.calidad.modulogestionequipaje.userinterfaces.EquipajePage;

public class ElTitulo implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(EquipajePage.TITULO_PAGINA).answeredBy(actor);
    }

    public static ElTitulo delEquipaje() {
        return new ElTitulo();
    }
}