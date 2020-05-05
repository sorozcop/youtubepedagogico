package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.LaPalabraTraducida;
import tasks.Abrir;
import tasks.Selecciona;
import tasks.Traduce;

import static builder.SuiteUrl.GOOGLE;
import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;
import static userinterfaces.GoogleAppsPage.GOOGLE_TRANSLATE;

public class TraductorGoogleStepdefinitions {


    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^que (.*) quiere traducir una palabra$")
    public void thatSusanWantsToTranslateAWord(String actor) {
        theActorCalled(actor).attemptsTo(
                Abrir.laAplicacion(GOOGLE),
                Selecciona.deLaSuite(GOOGLE_TRANSLATE)
        );
    }

    @When("^traduce la palabra (.*) de (.*) a (.*)$")
    public void translatesTheWord(String laPalabra, String idiomaBase, String idiomaObjetivo) {
        theActorInTheSpotlight().attemptsTo(
                Traduce.laPalabra(laPalabra).from(idiomaBase).a(idiomaObjetivo)
        );
    }
    @Then("^she should see the word (.*) in the screen$")
    public void shouldSeeTheWordInTheScreen(String laPalabraTraducida){
        theActorInTheSpotlight().should(eventually(seeThat(LaPalabraTraducida.es(), equalTo(laPalabraTraducida))));
    }

}
