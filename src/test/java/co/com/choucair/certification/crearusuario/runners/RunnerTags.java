package co.com.choucair.certification.crearusuario.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/regristo_usuario.feature",//direccion donde esta nuestro features
        tags="@scenario1",//llamar nuestros esenario,
        glue="co/com/choucair/certification/crearusuario/stepdefinitions",//llamado del StepDefinition
        snippets=SnippetType.CAMELCASE)

public class RunnerTags {
}
