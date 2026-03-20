Feature: Posts con múltiples datos

  Background:
    * url 'https://jsonplaceholder.typicode.com'

  Scenario Outline: GET - Obtener post por ID
    Given path '/posts/<postId>'
    When method GET
    Then status 200
    And match response.id == <postId>
    And match response.userId == '#number'

    Examples:
      | postId |
      | 1      |
      | 2      |
      | 3      |