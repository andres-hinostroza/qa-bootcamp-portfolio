package login;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.*;

class LoginPOMTest {

    WebDriver driver;
    LoginPage loginPage;

    @BeforeEach
    void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        loginPage = new LoginPage(driver);
        loginPage.abrirPagina();
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }

    @Test
    void loginExitoso() {
        loginPage.login("tomsmith", "SuperSecretPassword!");
        assertTrue(loginPage.mensajeExitoVisible());
    }

    @Test
    void loginFallido() {
        loginPage.login("tomsmith", "password-incorrecta");
        assertTrue(loginPage.mensajeErrorVisible());
    }
}