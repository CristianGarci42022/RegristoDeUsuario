#Autor: Cristian Garcia
@Stories
#nuestro esenario
Feature: Regristo de usurio en la pagina de Utest
    #metodos que se van a utilizar
  @scenario1
  Scenario: Regristo de Cristian en la pagina de Utest
    Given Cristian quiere regristarse en la pagina de Utest
    When ingrese toda la informacion requerida
    | strNombre | strApellido | strEmail           | strMesNacimiento | strDiaNacimiento | strAnoNacimiento | strCiudad | strCodigoPostal | strPais   |
    | Cristian  | Garcia      | cristian@Utest.com |June              |15                |1998              |Bogota     |12345            |  Colombia |
    Then se realiza el regristo de manera exitosa