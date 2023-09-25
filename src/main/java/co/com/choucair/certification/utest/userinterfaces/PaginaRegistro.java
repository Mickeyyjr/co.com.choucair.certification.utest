package co.com.choucair.certification.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaRegistro {
    public  static final Target INPUT_FIRST_NAME = Target.the("Input nombre").located(By.id("firstName"));
    public  static final Target INPUT_LAST_NAME = Target.the("Input apellido").located(By.id("lastName"));
    public  static final Target INPUT_EMAIL_ADDRESS = Target.the("Input email").located(By.id("email"));
    public  static final Target SELECT_MONTH_OF_BIRTH = Target.the("Select mes de cumpleaños").located(By.id("birthMonth"));
    public  static final Target SELECT_DAY_OF_BIRTH = Target.the("Select dia de cumpleaños").located(By.id("birthDay"));
    public  static final Target SELECT_YEAR_OF_BIRTH = Target.the("Select año de cumpleaños").located(By.id("birthYear"));
    public  static final Target INPUT_LANGUAGES_SPOKEN = Target.the("Input lenguajes que habla").located(By.xpath("//div[@id = 'languages']/child::div/child::input"));
    public  static final Target BUTTON_NEXT = Target.the("Boton siguiente").located(By.xpath("//a[contains(@class , 'btn-blue')]"));
    public  static final Target INPUT_CITY= Target.the("Input ciudad").located(By.id("city"));
    public  static final Target INPUT_ZIP_OR_POSTAL_CODE= Target.the("Input codigo postal").located(By.id("zip"));
    public  static final Target SELECT_COUNTRY = Target.the("Select pais").located(By.xpath("(//span[contains(@class, 'ui-select-toggle')])[2]"));
    public  static final Target SELECT_YOUR_COMPUTER = Target.the("Select computador").located(By.xpath("(//span[@aria-label = 'Select OS'])[1]"));
    public  static final Target SELECT_VERSION = Target.the("Select version").located(By.xpath("//span[@aria-label = 'Select a Version']"));
    public  static final Target SELECT_OS_LANGUAGE = Target.the("Select lenguaje").located(By.xpath("//span[@aria-label = 'Select OS language']"));
    public  static final Target SELECT_YOUR_MOBILE_DEVICE = Target.the("Select dispositivo movil").located(By.xpath("//span[@aria-label = 'Select Brand']"));
    public  static final Target SELECT_MODEL = Target.the("Select modelo").located(By.xpath("//span[@aria-label = 'Select a Model']"));
    public  static final Target SELECT_OPERATING_SYSTEM = Target.the("Select sisetma operaivo").located(By.xpath("(//span[@aria-label = 'Select OS'])[2]"));
    public  static final Target INPUT_PASSWORD = Target.the("Input contraseña").located(By.id("password"));
    public  static final Target INPUT_CONFIRM_PASSWORD = Target.the("Input confirmar contraseña").located(By.id("confirmPassword"));
    public  static final Target CHECKBOX_TERMS_OF_USE = Target.the("Checkbox terminos de uso").located(By.id("termOfUse"));
    public  static final Target CHECKBOX_PRIVACY_SETTING = Target.the("Checkbox ajustes de privacidad").located(By.id("privacySetting"));








}
