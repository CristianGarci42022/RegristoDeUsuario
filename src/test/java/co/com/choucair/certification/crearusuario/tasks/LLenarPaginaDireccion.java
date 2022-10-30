package co.com.choucair.certification.crearusuario.tasks;

import co.com.choucair.certification.crearusuario.model.Utest_Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.choucair.certification.crearusuario.userinterface.PaginaDirrecion.*;

public class LLenarPaginaDireccion implements Task{
    private final List<Utest_Datos>datos;

    public LLenarPaginaDireccion(List<Utest_Datos> datos) {
        this.datos = datos;
    }

    public static LLenarPaginaDireccion laPagina(List<Utest_Datos>datos) {
        return Tasks.instrumented(LLenarPaginaDireccion.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //Ingreso de llenar campo ciudad y paso a dar click fecha abajo para colocar cudad con un enter
        actor.attemptsTo(Enter.theValue(datos.get(0).getStrCiudad()).into(CIUDAD),
                Hit.the(Keys.ARROW_DOWN).into(CIUDAD),
                Hit.the(Keys.ENTER).into(CIUDAD),
                Enter.theValue(datos.get(0).getStrCodigoPostal()).into(CODIGO_POSTAL),
                //Ingresa el codigo del pais
                Click.on(CONTENEDOR_PAIS),
                //llena el nombre del pais
                Enter.theValue(datos.get(0).getStrPais()).into(PAIS),
                Click.on(BOTON_DISPOSITIVOS)

        );
    }
}
