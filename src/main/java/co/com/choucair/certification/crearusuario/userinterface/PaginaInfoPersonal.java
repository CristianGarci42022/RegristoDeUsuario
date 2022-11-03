package co.com.choucair.certification.crearusuario.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInfoPersonal {
    //se continua con los parametros de cada uno de los campos que pide el formulario
    // y se le agrega el nombre que se encuentra por debajo de cada boton o campo
    public static final Target NOMBRE= Target.the("Campo para nombre de usuario")
            .located(By.id("firstName"));
    public static final Target APELLIDO= Target.the("Campo para apellido de usuario")
            .located(By.id("lastName"));
    public static final Target EMAIL= Target.the("Campo para email de usuario")
            .located(By.id("email"));
    public static final Target MES_NACIMIENTO= Target.the("Campo para mes de nacimiento de usuario")
            .located(By.id("birthMonth"));
    public static final Target DIA_NACIMIENTO= Target.the("Campo para dia de nacimiento de usuario")
            .located(By.id("birthDay"));
    public static final Target ANO_NACIMIENTO= Target.the("Campo para año de nacimiento de usuario")
            .located(By.id("birthYear"));
    public static final Target BOTON_DIRECION= Target.the("Boton para ir a seccion de direccion")
            .located(By.xpath("//a[@class='btn btn-blue']"));
}
