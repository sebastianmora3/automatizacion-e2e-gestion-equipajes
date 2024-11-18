package co.com.fabricaescuela.calidad.modulogestionequipaje.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.fabricaescuela.calidad.modulogestionequipaje.userinterfaces.LuggageCostPage.TOTAL_COST;
import java.util.regex.Pattern;


public class CostFormat {
//    public static Question<Boolean> hasDecimalSeparatedByComma() {
//        return actor -> TOTAL_COST.resolveFor(actor).getText().contains(",");
//    }
//
//    public static Question<Boolean> hasThousandsSeparatedByDot() {
//        return actor -> TOTAL_COST.resolveFor(actor).getText().contains(".");
//    }

    public static Question<Boolean> hasDecimalSeparatedByComma() {
        return actor -> {
            String cost = TOTAL_COST.resolveFor(actor).getText()
                    .replace("COP ", "").trim(); // Elimina el prefijo "COP "

            // Verifica que los últimos 3 caracteres sean ",XX" donde X son dígitos
            return Pattern.matches(".*,\\d{2}$", cost);
        };
    }

    public static Question<Boolean> hasThousandsSeparatedByDot() {
        return actor -> {
            String cost = TOTAL_COST.resolveFor(actor).getText()
                    .replace("COP ", "").trim(); // Elimina el prefijo "COP "

            // Para números mayores a 999, verifica el formato correcto con punto
            if (cost.length() > 7) { // Considerando el formato XXX.XXX,XX
                return Pattern.matches("\\d{1,3}(\\.\\d{3})*,\\d{2}", cost);
            }
            // Para números menores a 1000
            return Pattern.matches("\\d{1,3},\\d{2}", cost);
        };
    }

    // Método adicional que verifica el formato completo en una sola llamada
    public static Question<Boolean> isCorrect() {
        return actor -> {
            String cost = TOTAL_COST.resolveFor(actor).getText()
                    .replace("COP ", "").trim();

            // Verifica el formato completo: X.XXX,XX o XXX,XX
            String pattern = "^(\\d{1,3}(\\.\\d{3})*,\\d{2})$";
            return Pattern.matches(pattern, cost);
        };
    }
}
