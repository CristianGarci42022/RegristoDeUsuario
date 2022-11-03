package co.com.choucair.certification.crearusuario.stepdefinitions;

import co.com.choucair.certification.crearusuario.model.Utest_Datos;
import co.com.choucair.certification.crearusuario.questions.Responder;
import co.com.choucair.certification.crearusuario.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UtestStepDefinition {

    @Before//se hace la union con feature que es nuestro esenario
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    //esenario convertito en guerquin y se implementa las librerias
    @Given("^Cristian quiere regristarse en la pagina de Utest$")
    public void cristian_quiere_regristarse_en_la_pagina_de_utest() throws Throwable {
        theActorCalled("Cristian").wasAbleTo(AbrirPaginaUtest.laPagina());
    }
    //llama cada una de las tareas creandas
    @When("^ingrese toda la informacion requerida$")
    public void ingrese_toda_la_informacion_requerida(List<Utest_Datos> datos) throws Throwable {
        theActorInTheSpotlight().attemptsTo(LLenarPaginaInfoPersona.laPagina(datos), LLenarPaginaDireccion.laPagina(datos),
                LLenarPaginaDispositivos.laPagina(datos), LLenarPaginaFinal.laPagina(datos)
        );
    }

    //genererador de preguntas
    @Then("^se realiza el regristo de manera exitosa$")
    public void se_realiza_el_regristo_de_manera_exitosa(List<Utest_Datos>datos) throws Throwable {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Responder.aLos(datos)));

    }
}
