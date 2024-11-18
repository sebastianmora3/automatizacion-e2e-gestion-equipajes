package co.com.fabricaescuela.calidad.modulogestionequipaje.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LuggagePage extends PageObject {
    public static final Target CABINA_TEXT = Target.the("Texto categoría cabina")
            .locatedBy("/html/body/div[1]/div/form/div/div[2]/div/div[2]/div[1]/div/h3/p/span");

    public static final Target BODEGA_TEXT = Target.the("Texto categoría bodega")
            .locatedBy("/html/body/div[1]/div/form/div/div[2]/div/div[2]/div[3]/div/h3/p/span");

    public static final Target ESPECIAL_TEXT = Target.the("Texto categoría especial")
            .locatedBy("/html/body/div[1]/div/form/div/div[2]/div/div[2]/div[5]/div/h3/button/div/div/div/div/h3");

    // Botón de equipaje especial
    public static final Target SPECIAL_LUGGAGE_BUTTON = Target.the("Botón de equipaje especial")
            .locatedBy("/html/body/div[1]/div/form/div/div[2]/div/div[2]/div[5]/div/h3/button/div/div");

    // Títulos de opciones
    public static final Target MUSICAL_INSTRUMENT_TITLE = Target.the("Título instrumento musical")
            .locatedBy("/html/body/div[1]/div/form/div/div[2]/div/div[2]/div[5]/div/div/div/div[1]/div/div/div[1]/div/h3");

    public static final Target SPORTS_EQUIPMENT_TITLE = Target.the("Título equipo deportivo")
            .locatedBy("/html/body/div[1]/div/form/div/div[2]/div/div[2]/div[5]/div/div/div/div[2]/div/div/div[1]/div/h3");

    public static final Target AUDIOVISUAL_EQUIPMENT_TITLE = Target.the("Título equipos audiovisuales")
            .locatedBy("/html/body/div[1]/div/form/div/div[2]/div/div[2]/div[5]/div/div/div/div[3]/div/div/div[1]/div/h3");

    public static final Target PET_CARRIER_TITLE = Target.the("Título guacal mascotas")
            .locatedBy("/html/body/div[1]/div/form/div/div[2]/div/div[2]/div[5]/div/div/div/div[4]/div/div/div[1]/div/h3");

    // Precios
    public static final Target MUSICAL_INSTRUMENT_PRICE = Target.the("Precio instrumento musical")
            .locatedBy("/html/body/div[1]/div/form/div/div[2]/div/div[2]/div[5]/div/div/div/div[1]/div/div/div[1]/div/p/span");

    public static final Target SPORTS_EQUIPMENT_PRICE = Target.the("Precio equipo deportivo")
            .locatedBy("/html/body/div[1]/div/form/div/div[2]/div/div[2]/div[5]/div/div/div/div[2]/div/div/div[1]/div/p/span");

    public static final Target AUDIOVISUAL_EQUIPMENT_PRICE = Target.the("Precio equipos audiovisuales")
            .locatedBy("/html/body/div[1]/div/form/div/div[2]/div/div[2]/div[5]/div/div/div/div[3]/div/div/div[1]/div/p/span");

    public static final Target PET_CARRIER_PRICE = Target.the("Precio guacal mascotas")
            .locatedBy("/html/body/div[1]/div/form/div/div[2]/div/div[2]/div[5]/div/div/div/div[4]/div/div/div[1]/div/p/span");
}