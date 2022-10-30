package co.com.choucair.certification.crearusuario.userinterface;

import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://utest.com/")
public class PaginaUtest extends PageObject {
    public static final Target BOTON_JOIN = Target.the("boton para iniciar regristo de usuario")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}
