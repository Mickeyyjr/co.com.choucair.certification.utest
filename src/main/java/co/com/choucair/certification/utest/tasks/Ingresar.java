package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.model.Usuario;
import co.com.choucair.certification.utest.userinterfaces.PaginaRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;



import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.By;

public class Ingresar implements Task {

    Usuario usuario = new Usuario();


    public Ingresar(Usuario usuario){
        this.usuario = usuario;
    }
    public static Performable datosRegistro(Usuario usuario) {
        return Tasks.instrumented(Ingresar.class, usuario);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(usuario.getNombre()).into(PaginaRegistro.INPUT_FIRST_NAME));
        actor.attemptsTo(Enter.theValue(usuario.getApellido()).into(PaginaRegistro.INPUT_LAST_NAME));
        actor.attemptsTo(Enter.theValue(usuario.getEmail()).into(PaginaRegistro.INPUT_EMAIL_ADDRESS));
        actor.attemptsTo(Click.on(PaginaRegistro.SELECT_MONTH_OF_BIRTH));
        actor.attemptsTo(SelectFromOptions.byValue("number:"+usuario.getMesCumpleaños()).from(PaginaRegistro.SELECT_MONTH_OF_BIRTH));
        actor.attemptsTo(Click.on(PaginaRegistro.SELECT_DAY_OF_BIRTH));
        actor.attemptsTo(SelectFromOptions.byValue("number:"+usuario.getDiaCumpleaños()).from(PaginaRegistro.SELECT_DAY_OF_BIRTH));
        actor.attemptsTo(Click.on(PaginaRegistro.SELECT_YEAR_OF_BIRTH));
        actor.attemptsTo(SelectFromOptions.byValue("number:"+usuario.getAñoCumpleaños()).from(PaginaRegistro.SELECT_YEAR_OF_BIRTH));
        actor.attemptsTo(Click.on(PaginaRegistro.BUTTON_NEXT));
        actor.attemptsTo(Enter.theValue("").into(PaginaRegistro.INPUT_CITY));
        actor.attemptsTo(Enter.theValue(usuario.getCiudad()).into(PaginaRegistro.INPUT_CITY));
        actor.attemptsTo(Enter.theValue("").into(PaginaRegistro.INPUT_ZIP_OR_POSTAL_CODE));
        actor.attemptsTo(Enter.theValue(usuario.getCodigoPostal()).into(PaginaRegistro.INPUT_ZIP_OR_POSTAL_CODE));
        actor.attemptsTo(Click.on(PaginaRegistro.SELECT_COUNTRY));
        actor.attemptsTo(Click.on(PaginaRegistro.OPTION_TO_SELECT.of(usuario.getPais())));
        actor.attemptsTo(Click.on(PaginaRegistro.BUTTON_NEXT));
        actor.attemptsTo(Click.on(PaginaRegistro.SELECT_YOUR_COMPUTER));
        actor.attemptsTo(Click.on(PaginaRegistro.OPTION_TO_SELECT.of(usuario.getComputador())));
        actor.attemptsTo(Click.on(PaginaRegistro.SELECT_VERSION));
        actor.attemptsTo(Click.on(PaginaRegistro.OPTION_TO_SELECT.of(usuario.getVersionComputador())));
        actor.attemptsTo(Click.on(PaginaRegistro.SELECT_OS_LANGUAGE));
        actor.attemptsTo(Click.on(PaginaRegistro.OPTION_TO_SELECT.of(usuario.getLenguajeComputador())));
        actor.attemptsTo(Click.on(PaginaRegistro.SELECT_YOUR_MOBILE_DEVICE));
        actor.attemptsTo(Click.on(PaginaRegistro.OPTION_TO_SELECT.of(usuario.getSistemaOperativoCelular())));
        actor.attemptsTo(Click.on(PaginaRegistro.SELECT_MODEL));
        actor.attemptsTo(Click.on(PaginaRegistro.OPTION_TO_SELECT.of(usuario.getModeloCelular())));
        actor.attemptsTo(Click.on(PaginaRegistro.SELECT_OPERATING_SYSTEM));
        actor.attemptsTo(Click.on(PaginaRegistro.OPTION_TO_SELECT.of(usuario.getVersionSistemaOperativo())));
        actor.attemptsTo(Click.on(PaginaRegistro.BUTTON_NEXT));
        actor.attemptsTo(Enter.theValue(usuario.getPassword()).into(PaginaRegistro.INPUT_PASSWORD));
        actor.attemptsTo(Enter.theValue(usuario.getPassword()).into(PaginaRegistro.INPUT_CONFIRM_PASSWORD));
        actor.attemptsTo(Click.on(PaginaRegistro.CHECKBOX_TERMS_OF_USE));
        actor.attemptsTo(Click.on(PaginaRegistro.CHECKBOX_PRIVACY_SETTING));
        actor.attemptsTo(Click.on(PaginaRegistro.BUTTON_NEXT));
    }
}
