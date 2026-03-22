Feature: Login functionality

  Scenario: Login exitoso con credenciales válidas
    Given el usuario está en la página de login
    When ingresa el usuario "tomsmith" y contraseña "SuperSecretPassword!"
    Then debe ver el mensaje "You logged into a secure area!"

  Scenario: Login fallido con contraseña incorrecta
    Given el usuario está en la página de login
    When ingresa el usuario "tomsmith" y contraseña "password-incorrecta"
    Then debe ver el mensaje "Your password is invalid!"