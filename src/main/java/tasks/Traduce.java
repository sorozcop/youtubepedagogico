package tasks;

import builder.TraduceLaPalabra;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static org.openqa.selenium.Keys.ENTER;
import static userinterfaces.TraductorGooglePage.*;

public class Traduce implements Task {

    private String laPalabra;
    private String elIdiomaBase;
    private String elIdiomaObjetivo;

    public Traduce(String laPalabra, String elIdiomaBase, String elIdiomaObjetivo) {
        this.laPalabra = laPalabra;
        this.elIdiomaBase = elIdiomaBase;
        this.elIdiomaObjetivo = elIdiomaObjetivo;
    }

    @Step("{0} intenta traducir la palabra #laPalabra de #elIdiomaBase a #elIdiomaObjetivo")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OPCION_IDIOMA_BASE),
                Enter.theValue(elIdiomaBase).into(IDIOMA_BASE).thenHit(ENTER),
                Click.on(OPCION_IDIOMA_OBJETIVO),
                Enter.theValue(elIdiomaObjetivo).into(IDIOMA_OBJETIVO).thenHit(ENTER),
                Enter.theValue(laPalabra).into(ENTRADA_IDIOMA_BASE)
        );
    }

    public static TraduceLaPalabra laPalabra(String theWord) {
        return new TraduceLaPalabra(theWord);
    }
}