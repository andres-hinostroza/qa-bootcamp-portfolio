Feature: API Testing con JSONPlaceholder

  Background:
    * url 'https://jsonplaceholder.typicode.com'

  Scenario: GET - Obtener lista de usuarios
    Given path '/users'
    When method GET
    Then status 200
    And match response[0].id == 1

  Scenario: POST - Crear un post
    Given path '/posts'
    And request { title: 'Ejercicio Karate', body: 'Aprendiendo Karate', userId: 1 }
    When method POST
    Then status 201
    And match response.title == 'Ejercicio Karate'

  Scenario: DELETE - Eliminar un post
    Given path '/posts/1'
    When method DELETE
    Then status 200