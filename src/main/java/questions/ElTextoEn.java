package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userinterfaces.buscarVideoPage.BOTON_DE_FILTRO;

public class ElTextoEn implements Question<String> {


    public static ElTextoEn elElementoFiltrar() {
        return new ElTextoEn();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(BOTON_DE_FILTRO).viewedBy(actor).asString();
    }
}
