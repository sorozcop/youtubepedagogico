package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static userinterfaces.GoogleAppsPage.GOOGLE_APPS;

public class Selecciona implements Task {

    private Target opcion;

    public Selecciona(Target opcion) {
        this.opcion = opcion;
    }

    @Step("{0} opens the #option")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(GOOGLE_APPS, isClickable()).forNoMoreThan(3).seconds(),
                Click.on(GOOGLE_APPS),
                Switch.toFrame(0),
                WaitUntil.the(opcion, isClickable()).forNoMoreThan(3).seconds(),
                Click.on(opcion),
                Switch.toDefaultContext()
        );
    }

    public static Performable deLaSuite(Target opcion) {
        return instrumented(Selecciona.class, opcion);
    }
}
