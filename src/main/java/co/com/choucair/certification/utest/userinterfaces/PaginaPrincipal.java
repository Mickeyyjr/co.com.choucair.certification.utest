package co.com.choucair.certification.utest.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://utest.com/")
public class PaginaPrincipal extends PageObject {
    public  static final Target BTN_JOIN_TODAY = Target.the("Boton unete hoy").located(By.className("unauthenticated-nav-bar__sign-up"));
}
