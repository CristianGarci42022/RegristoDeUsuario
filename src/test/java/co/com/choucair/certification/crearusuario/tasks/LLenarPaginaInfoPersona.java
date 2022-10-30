package co.com.choucair.certification.crearusuario.tasks;

import co.com.choucair.certification.crearusuario.model.Utest_Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;

public class LLenarPaginaInfoPersona implements Task {

    private List<Utest_Datos> datos;

    public LLenarPaginaInfoPersona(List<Utest_Datos> datos) {
        this.datos = datos;
    }

    public static LLenarPaginaInfoPersona laPagina(List<Utest_Datos> datos) {
        return Tasks.instrumented(LLenarPaginaInfoPersona.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
