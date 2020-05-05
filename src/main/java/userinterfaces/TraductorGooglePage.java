package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TraductorGooglePage {
    public static final Target OPCION_IDIOMA_BASE = Target.the("Source Language Button").locatedBy("//div[contains(@class,'tlid-open-source-language-list')]");
    public static final Target OPCION_IDIOMA_OBJETIVO = Target.the("Target Language Button").locatedBy("//div[contains(@class,'tlid-open-target-language-list')]");
    public static final Target IDIOMA_BASE = Target.the("Source Language").located(By.id("sl_list-search-box"));
    public static final Target IDIOMA_OBJETIVO = Target.the("Target Language").located(By.id("tl_list-search-box"));
    public static final Target ENTRADA_IDIOMA_BASE = Target.the("Source Language TextArea").located(By.id("source"));
    public static final Target RESULTADO_LENGUAJE_OBJETIVO = Target.the("Target Language Result Area").locatedBy("//span[contains(@class,'tlid-translation translation')]");

}
