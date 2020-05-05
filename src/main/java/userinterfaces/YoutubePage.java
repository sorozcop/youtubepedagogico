package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class YoutubePage {
    public static final Target ENTRADA_DE_BUSQUEDA = Target.the("campo de entrada para la b\u00FAsqueda").locatedBy("//div[@id='search-input']/input");
    public static final Target BOTON_BUSCAR = Target.the("Bot\u00F3n para buscar").located(By.id("search-icon-legacy"));

}
