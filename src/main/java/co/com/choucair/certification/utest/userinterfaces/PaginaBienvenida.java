package co.com.choucair.certification.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaBienvenida {
    public  static final Target WELCOME_MESSAGE = Target.the("Mensaje de bienvenida").located(By.tagName("h1"));

}
