package co.com.choucair.certification.crearusuario.tasks;
import co.com.choucair.certification.crearusuario.userinterface.PaginaDispositivos;
import co.com.choucair.certification.crearusuario.model.Utest_Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.choucair.certification.crearusuario.userinterface.PaginaDispositivos.*;
import static org.openqa.selenium.Keys.*;


public class LLenarPaginaDispositivos implements  Task{

    private List<Utest_Datos>datos;

    public LLenarPaginaDispositivos (List<Utest_Datos> datos) {
        this.datos = datos;
    }

    public static LLenarPaginaDispositivos laPagina(List<Utest_Datos> datos) {
        return Tasks.instrumented(LLenarPaginaDispositivos.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CONTENEDOR_COMPUTADOR),
                Enter.theValue(datos.get(0).getStrComputador()).into(COMPUTADOR).thenHit(ARROW_DOWN, ENTER),
                Click.on(CONTENEDOR_VERSION),
                Enter.theValue(datos.get(0).getStrVercionComputador()).into(VERSION).thenHit(ARROW_DOWN, ENTER),
                Click.on(CONTENEDOR_LENGUAJE),
                Enter.theValue(datos.get(0).getStrLenguajeComputador()).into(LENGUAJE).thenHit(ARROW_DOWN, ENTER),
                Click.on(CONTENEDOR_DISPOSITIVO_MOVIL),
                Enter.theValue(datos.get(0).getStrDispositivoMovil()).into(DISPOSITIVO_MOVIL).thenHit(ARROW_DOWN, ENTER),
                Click.on(CONTENEDOR_MODELO_DISPOSITIVO_MOVIL),
                Enter.theValue(datos.get(0).getStrModeloDispositivoMovil()).into(MODELO_DISPOSITIVO_MOVIL).thenHit(ARROW_DOWN, ENTER),
                Click.on(CONTENEDOR_SO_DISPOSITIVO_MOVIL),
                Enter.theValue(datos.get(0).getStrSoDispositivoMovil()).into(SO_DISPOSITIVO_MOVIL).thenHit(ARROW_DOWN, ENTER),
                Click.on(BOTON_PASO_FINAL)
        );
    }
}
