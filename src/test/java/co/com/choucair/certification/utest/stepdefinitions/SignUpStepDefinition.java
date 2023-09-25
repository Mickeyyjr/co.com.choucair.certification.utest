package co.com.choucair.certification.utest.stepdefinitions;

import co.com.choucair.certification.utest.model.Usuario;
import co.com.choucair.certification.utest.questions.Verificar;
import co.com.choucair.certification.utest.tasks.AbrirPagina;
import co.com.choucair.certification.utest.tasks.Ingresar;
import co.com.choucair.certification.utest.tasks.Presionar;
import co.com.choucair.certification.utest.util.ObtenerUsuarioARegistrar;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

public class SignUpStepDefinition {

    @Before
    public void iniciarEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que Miguel ingresa al portal utest$")
    public void queMiguelIngresaAlPortalUtest() throws Exception {


        OnStage.theActorCalled("Miguel").wasAbleTo(AbrirPagina.urlApp());
    }

    @Cuando("^presiona el boton de registro$")
    public void presionaElBotonDeRegistro() throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Presionar.botonRegistro());
    }


    @Y("^diligencia el formulario de registro (.*)$")
    public void diligenciaElFormularioDeRegistro(String casoPrueba) throws Exception {
            Usuario usuarioRegistrar = ObtenerUsuarioARegistrar.casoPrueba(casoPrueba);
            OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.datosRegistro(usuarioRegistrar));

    }

    @Entonces("^verifica que su registro fue exitoso$")
    public void verificaQueSuRegistroFueExitoso() throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verificar.resultado(), Matchers.equalTo("Welcome to the world's largest community of freelance software testers!")));
    }
}
