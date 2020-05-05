package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userinterfaces.TraductorGooglePage.RESULTADO_LENGUAJE_OBJETIVO;

public class LaPalabraTraducida implements Question<String> {

    public static LaPalabraTraducida es() {
        return new LaPalabraTraducida();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(RESULTADO_LENGUAJE_OBJETIVO).viewedBy(actor).asString().replace("\n ", "");
    }

}
