package co.com.choucair.certification.crearusuario.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/regristo_usurio.feature",
        tags="@Regresion",
        glue="co.com.choucair.certification.creearusuario.stepdefinitions",
        snippets=SnippetType.CAMELCASE)

public class RunnerTags {
}
