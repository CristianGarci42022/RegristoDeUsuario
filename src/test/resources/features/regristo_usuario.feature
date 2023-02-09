#Autor: Cristian Garcia
@Stories
#nuestro esenario
Feature: Regristo de usurio en la pagina de Utest
    #metodos que se van a utilizar
  @scenario1
  Scenario: Regristo de Cristian en la pagina de Utest
    Given Cristian quiere regristarse en la pagina de Utest
    When ingrese toda la informacion requerida
      | strNombre | strApellido | strEmail           | strMesNacimiento | strDiaNacimiento | strAnoNacimiento | strCiudad | strCodigoPostal | strPais   | strComputador | strVercionComputador | strLenguajeComputador | strDispositivoMovil | strModeloDispositivoMovil | strSoDispositivoMovil | strContrasena   |
      | Mrs Garcia  | Pro      | SenorPro@elmarter.com |June              |24                |2003              |Bucaramanga     | 680005            |  Colombia | winows        | 10                   | english               | Xiaomi              | Redmi Note 8 pro          | Android 12            | SenorPro2023...Aaa@ |
    Then se realiza el regristo de manera exitosa
      | strTextoFinal  |
      | Complete Setup |