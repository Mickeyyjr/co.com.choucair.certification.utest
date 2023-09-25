package co.com.choucair.certification.utest.util;


import co.com.choucair.certification.utest.exception.UserNotFoundException;
import co.com.choucair.certification.utest.model.Usuario;

public class ObtenerUsuarioARegistrar {

    public static Usuario casoPrueba(String casoPrueba) throws Exception {
        return ObtenerTodosLosUsuariosARegistrar
                .fromDataSource()
                .stream()
                .filter(usuario -> usuario.getCasoPrueba().equalsIgnoreCase(casoPrueba))
                .findFirst().orElseThrow(() -> new UserNotFoundException("Usuario no encontrado en el archivo de datos con el caso de prueba " + casoPrueba));
    }

}
