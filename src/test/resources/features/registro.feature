#Autor: Miguel Angel Ortiz Montana
#language: es

  @HistoriaDeUsuario
    Característica: Verificar la creación de un nuevo usuario en el portal Utest
      Yo como usuario quiero registrarme en el portal Utest para verificar la funcionalidad de registro


      @dataprovider
      Esquema del escenario: Verificar registro correcto
        Dado que Miguel ingresa al portal utest
        Cuando presiona el boton de registro
        Y diligencia el formulario de registro <casoPrueba>
        Entonces verifica que su registro fue exitoso
        Ejemplos:
          | casoPrueba |
          | CP001      |
          | CP002      |
          | CP003      |
