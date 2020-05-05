package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static userinterfaces.buscarVideoPage.BOTON_DE_BUSQUEDA;
import static userinterfaces.buscarVideoPage.CAJA_TEXTO_VALOR_DE_BUSQUEDA;

public class Buscar  implements Task {

    private String criterioDeBusqueda;

    public Buscar(String criterioDeBusqueda) {
        this.criterioDeBusqueda = criterioDeBusqueda;
    }

    public static Performable unVideo(String criterioDeBusqueda) {
        return instrumented(Buscar.class , criterioDeBusqueda);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CAJA_TEXTO_VALOR_DE_BUSQUEDA, isClickable()).forNoMoreThan(3).seconds(),
                Enter.theValue(criterioDeBusqueda).into(CAJA_TEXTO_VALOR_DE_BUSQUEDA),
                Click.on(BOTON_DE_BUSQUEDA)
        );
    }

}
