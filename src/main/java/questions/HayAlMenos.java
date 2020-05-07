package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.buscarVideoPage.LISTA_DE_RESULTADOS;

public class HayAlMenos implements Question<Boolean> {

    private int  cantidadDeVideos;

    public HayAlMenos(int cantidadDeVideos) {
        this.cantidadDeVideos = cantidadDeVideos;
    }

    public static HayAlMenos unResultado(int cantidadDeVideos) {
        return new HayAlMenos(cantidadDeVideos);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        int cantidadResultados= LISTA_DE_RESULTADOS.resolveAllFor(actor).size();
        if(cantidadResultados>=cantidadDeVideos){
            return  true;
        }
        return false;
    }
}
