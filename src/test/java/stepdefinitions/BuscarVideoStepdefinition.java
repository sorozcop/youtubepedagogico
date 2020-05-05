package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.Buscar;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BuscarVideoStepdefinition {

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que (.*) quiere ver un video$")
    public void queSebastianQuiereVerUnVideo(String actor) {
        theActorCalled(actor).wasAbleTo( Open.url("https://www.youtube.com/") );
    }

    @Cuando("^busca el video (.*)$")
    public void buscaElVideoBeethovenSymphonyHubbleImages(String criterioDeBusqueda) {
        theActorInTheSpotlight().attemptsTo(Buscar.unVideo(criterioDeBusqueda));
    }

    @Entonces("^debe ver por lo menos (\\d+) video en lista$")
    public void debeVerPorLoMenosVideoEnLista(int cantidadDeVideos) {

    }
}
