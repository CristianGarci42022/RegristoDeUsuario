package co.com.choucair.certification.crearusuario.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaFinal {
    public static final Target CONTRASEÑA= Target.the("Campo para contraseña de usuario ")
            .located(By.id("password"));
    public static final Target CONFIRMAR_CONTRASEÑA= Target.the("Campo para confirmar contraseña de usuario ")
            .located(By.id("confirmPassword"));

    public static final Target CHECKBOX_STAY_INFORMED= Target.the("Checkbox para estar informado ")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target CHECKBOX_TERMS_OF_USE= Target.the("Checkbox terminos de uso ")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECKBOX_PRIVACIDAD= Target.the("Checkbox para privacidad ")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target BOTON_SETUP= Target.the("Boton para ir a seccion finalizar")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[2]/div/a"));
}
