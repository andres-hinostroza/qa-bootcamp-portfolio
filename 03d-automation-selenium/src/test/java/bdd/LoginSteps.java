package bdd;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginSteps {

    WebDriver driver;

    @Before
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Dado("el usuario está en la página de login")
    public void usuarioEnPaginaLogin() {
        driver.get("https://the-internet.herokuapp.com/login");
    }

    @Cuando("ingresa el usuario {string} y contraseña {string}")
    public void ingresaCredenciales(String username, String password) {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    @Entonces("debe ver el mensaje {string}")
    public void verificaMensaje(String mensaje) {
        assertTrue(driver.getPageSource().contains(mensaje));
    }
}