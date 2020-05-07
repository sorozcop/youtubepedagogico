package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.buscarVideoPage.BOTON_DE_FILTRO;

public class ApareceElElemento implements Question<Boolean> {

    public static ApareceElElemento filtrar() {
        return new ApareceElElemento();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return BOTON_DE_FILTRO.resolveFor(actor).isPresent();
    }
}
