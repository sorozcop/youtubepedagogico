package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class buscarVideoPage {

    public static final Target CAJA_TEXTO_VALOR_DE_BUSQUEDA = Target.the("caja de texto para buscar video").locatedBy("//input[@id='search']");
    public static final Target BOTON_DE_BUSQUEDA = Target.the("Boton de busqueda").located(By.id("search-icon-legacy"));

    public static final Target LISTA_DE_RESULTADOS = Target.the("lista de resultados").located(By.id("video-title"));
    public static final Target BOTON_DE_FILTRO = Target.the(" Boton de filtro para videos").locatedBy("//*[@id='text' and contains(text(),'Filtrar')]");

}
