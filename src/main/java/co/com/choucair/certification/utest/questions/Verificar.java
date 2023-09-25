package co.com.choucair.certification.utest.questions;

import co.com.choucair.certification.utest.userinterfaces.PaginaBienvenida;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class Verificar implements Question {

    public static Verificar resultado(){
        return new Verificar();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(PaginaBienvenida.WELCOME_MESSAGE).viewedBy(actor).asString();
    }
}
