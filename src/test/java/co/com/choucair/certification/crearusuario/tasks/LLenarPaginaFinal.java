package co.com.choucair.certification.crearusuario.tasks;

import co.com.choucair.certification.crearusuario.model.Utest_Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.certification.crearusuario.userinterface.PaginaFinal.*;

public class LLenarPaginaFinal implements Task {

    private List<Utest_Datos> datos;

    //creacion del constructor
    public LLenarPaginaFinal(List<Utest_Datos> datos) {
        this.datos = datos;
    }

    public static LLenarPaginaFinal laPagina(List<Utest_Datos> datos) {
        //ejecucion o respuesta final
        return Tasks.instrumented(LLenarPaginaFinal.class,datos);
    }

    //creacion de metodos
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datos.get(0).getStrContrasena()).into(CONTRASEÑA),
                Enter.theValue(datos.get(0).getStrContrasena()).into(CONFIRMAR_CONTRASEÑA),
                Click.on(CHECKBOX_STAY_INFORMED),
                Click.on(CHECKBOX_TERMS_OF_USE),
                Click.on(CHECKBOX_PRIVACIDAD),
                Click.on(BOTON_SETUP)



        );
    }
}
