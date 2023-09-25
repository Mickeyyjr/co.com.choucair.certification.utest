package co.com.choucair.certification.utest.util;



import co.com.choucair.certification.utest.model.Usuario;

import java.util.List;

public class ObtenerTodosLosUsuariosARegistrar {


    public static List<Usuario> fromDataSource() throws Exception {
        ConvertExcelSheet convertExcelSheet =
                new ConvertExcelSheet(System.getProperty("user.dir") + "/src/test/resources/data/data.xlsx", "data");

        return convertExcelSheet.to(Usuario.class);
    }
}
