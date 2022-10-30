package co.com.choucair.certification.crearusuario.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInfoPersonal {

    public static final Target NOMBRE= Target.the("Campo para nombre de usuario")
            .located(By.id(""));
    public static final Target APELLIDO= Target.the("Campo para apellido de usuario")
            .located(By.id(""));
    public static final Target EMAIL= Target.the("Campo para email de usuario")
            .located(By.id(""));
    public static final Target MES_NACIMIENTO= Target.the("Campo para mes de nacimiento de usuario")
            .located(By.id(""));
    public static final Target DIA_NACIMIENTO= Target.the("Campo para dia de nacimiento de usuario")
            .located(By.id(""));
    public static final Target ANO_NACIMIENTO= Target.the("Campo para año de nacimiento de usuario")
            .located(By.id(""));
    public static final Target BOTON_DIRECION= Target.the("Boton para ir a seccion de direccion")
            .located(By.id(""));
}
