package tasks;

import builder.SuiteUrl;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Abrir implements Task {
    private String url;

    public Abrir(String url) {
        this.url = url;
    }

    @Step("{0} quiere ir a #url")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(url)
        );
    }

    public static Performable laAplicacion(SuiteUrl app) {
        return instrumented(Abrir.class, app.url());
    }
}
