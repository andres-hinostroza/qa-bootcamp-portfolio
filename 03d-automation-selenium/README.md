# 03d - Automatización UI con Selenium

## Descripción
Ejercicios prácticos de automatización E2E usando Selenium 4.20.0 con Java y JUnit 5.

## Herramientas
- Selenium 4.20.0
- Java 25 (Temurin)
- Maven 3.9.x
- JUnit 5.10.2
- ChromeDriver (incluido en Selenium 4)
- the-internet.herokuapp.com (app de práctica)

## Estructura
src/test/java/login/
├── LoginTest.java         # Login happy/sad path básico
├── SelectoresTest.java    # Selectores CSS, XPath, assertions
├── LoginPage.java         # Page Object Model - selectores y acciones
└── LoginPOMTest.java      # Tests usando Page Object Model

## Conceptos cubiertos
- WebDriver: get(), findElement(), quit()
- Selectores: By.id(), By.cssSelector(), By.xpath()
- Acciones: sendKeys(), click(), getText()
- Assertions: assertEquals(), assertTrue()
- WebDriverWait — esperas explícitas
- @BeforeEach / @AfterEach — setup y limpieza
- Page Object Model (POM) — patrón de diseño

## Diferencia con Cypress
| Cypress | Selenium |
|---------|----------|
| JavaScript | Java |
| Corre dentro del navegador | Corre fuera del navegador |
| Ideal para proyectos JS/Node | Ideal para proyectos Java/Enterprise |

## Cómo ejecutar
1. Requiere Java y Maven instalados
2. `mvn test`