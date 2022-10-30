package co.com.choucair.certification.crearusuario.tasks;

import co.com.choucair.certification.crearusuario.model.Utest_Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.choucair.certification.crearusuario.userinterface.PaginaInfoPersonal.*;

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
        actor.attemptsTo(Enter.theValue(datos.get(0).getStrNombre()).into(NOMBRE),
                Enter.theValue(datos.get(0).getStrApellido()).into(APELLIDO),
                Enter.theValue(datos.get(0).getStrEmail()).into(EMAIL),
                SelectFromOptions.byVisibleText(datos.get(0).getStrMesNacimiento()).from(MES_NACIMIENTO),
                SelectFromOptions.byVisibleText(datos.get(0).getStrDiaNacimiento()).from(DIA_NACIMIENTO),
                SelectFromOptions.byVisibleText(datos.get(0).getStrAnoNacimiento()).from(ANO_NACIMIENTO),
                Click.on(BOTON_DIRECION)
            );
    }
}
