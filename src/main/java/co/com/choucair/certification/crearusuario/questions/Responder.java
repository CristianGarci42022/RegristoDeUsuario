package co.com.choucair.certification.crearusuario.questions;

import co.com.choucair.certification.crearusuario.model.Utest_Datos;
import co.com.choucair.certification.crearusuario.userinterface.PaginaFinal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Responder implements Question<Boolean> {

    private List<Utest_Datos>datos;
    
    //generacion del constructor
    public Responder(List<Utest_Datos> datos) {
        this.datos = datos;
    }

    public static Responder aLos(List<Utest_Datos> datos) {
        //genera la respuesta con los datos
        return new Responder(datos);
    }

    //implementacion del metodo
    @Override
    public Boolean answeredBy(Actor actor) {
        //se optiene el texto del Boton final
        String texto_boton_final= Text.of(PaginaFinal.BOTON_SETUP).viewedBy(actor).asString();
        //hace la comparacion con el dato que se coloca en (TextoFinal) y si es igual finaliza de manera exitosa
        return datos.get(0).getStrTextoFinal().equals(texto_boton_final);
    }
}
