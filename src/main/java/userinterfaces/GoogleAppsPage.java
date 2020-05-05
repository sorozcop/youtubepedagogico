package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GoogleAppsPage {

    public static final Target GOOGLE_APPS = Target.the("Google Apps Button").located(By.id("gbwa"));
    public static final Target GOOGLE_TRANSLATE = Target.the("Google Translate Option").locatedBy("//span[@pid='51']");
    public static final Target YOUTUBE = Target.the("Youtube Option").locatedBy("//span[@pid='36']");


}
