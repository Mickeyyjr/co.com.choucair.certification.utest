package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterfaces.PaginaPrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Presionar implements Task {
    public static Performable botonRegistro() {
        return Tasks.instrumented(Presionar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaPrincipal.BTN_JOIN_TODAY));
    }
}
