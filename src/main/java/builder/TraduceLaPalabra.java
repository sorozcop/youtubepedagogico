package builder;

import net.serenitybdd.screenplay.Performable;
import tasks.Traduce;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class TraduceLaPalabra {

    private String laPalabra;
    private String elIdiomaBase;

    public TraduceLaPalabra(String laPalabra) {
        this.laPalabra = laPalabra;
    }

    public TraduceLaPalabra from(String elIdiomaBase) {
        this.elIdiomaBase = elIdiomaBase;
        return this;
    }

    public Performable a(String elIdiomaObjetivo) {
        return instrumented(Traduce.class, laPalabra, elIdiomaBase, elIdiomaObjetivo);
    }
}
