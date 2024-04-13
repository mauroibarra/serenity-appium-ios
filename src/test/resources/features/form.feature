Feature: Form Function

  Background: Login
    Given the user enter the username 'admin'
    And the user enter the password 'admin'
    And the user taps the login button

  @FillForm
  Scenario Outline: Fill the form
    Given the user enter the name '<name>'
    Given the user enter the lastname '<lastname>'
    And the user enter the mail '<mail>'
    And the user enter the phone '<phone>'
    When the user taps the send button
    Then the user will see the message '<message>'
    Examples:
      |name|lastname|mail|phone|message|
      |Johan|Agudelo|johan@gmail.com|31032020|Nombre: Johan, Apellido: Agudelo, Correo Electrónico: johan@gmail.com, Celular: 31032020|
      |Johan|Agudelo|johancorreo|121313|Correo electrónico no válido|
      ||Agudelo|joha@corre.co|1234131|Por favor, ingrese su nombre|

