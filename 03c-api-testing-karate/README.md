# 03c - API Testing con Karate Framework

## Descripción
Ejercicios prácticos de API Testing usando Karate Framework 1.3.1 con Maven y JUnit 5.

## Herramientas
- Karate Framework 1.3.1
- Maven 3.9.x
- Java 21 (Temurin)
- JSONPlaceholder API (https://jsonplaceholder.typicode.com)

## Estructura
src/test/java/jsonplaceholder/
├── usuarios.feature        # GET, POST, DELETE con validaciones de tipo
├── posts.feature           # Scenario Outline con múltiples datos
└── JsonPlaceholderTest.java # Runner principal

## Conceptos cubiertos
- Sintaxis Gherkin: Feature, Background, Scenario
- Verbos HTTP: GET, POST, DELETE
- Validaciones: status code, valor exacto, tipo de dato
- match response.campo == valor
- match response.campo == '#number' / '#string'
- Scenario Outline con Examples (datos parametrizados)
- Background para configuración compartida

## Diferencia con Postman
| Postman | Karate |
|---------|--------|
| Interfaz gráfica | Código puro |
| Manual o semi-automático | 100% automatizable |
| No integra con CI/CD fácilmente | Integra con pipelines |

## Cómo ejecutar
1. Requiere Java 21 y Maven instalados
2. `mvn clean test`
3. Reporte HTML en `target/karate-reports/karate-summary.html`