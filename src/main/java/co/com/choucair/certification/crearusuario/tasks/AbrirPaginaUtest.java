package co.com.choucair.certification.crearusuario.tasks;

import co.com.choucair.certification.crearusuario.userinterface.PaginaUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPaginaUtest implements Task {

    private PaginaUtest paginaUtest;

    public static AbrirPaginaUtest laPagina() {
        return Tasks.instrumented(AbrirPaginaUtest.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginaUtest),
                Click.on(paginaUtest.BOTON_JOIN));
    }

}
