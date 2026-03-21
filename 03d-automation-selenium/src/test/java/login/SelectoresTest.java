package login;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.*;

class SelectoresTest {

    WebDriver driver;

    @BeforeEach
    void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.get("https://the-internet.herokuapp.com/login");
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }

    @Test
    void verificarTituloPage() {
        new org.openqa.selenium.support.ui.WebDriverWait(driver, java.time.Duration.ofSeconds(5))
          .until(d -> !d.getTitle().isEmpty());
        String titulo = driver.getTitle();
        assertEquals("The Internet", titulo);
    }

    @Test
    void verificarPlaceholderUsername() {
        WebElement campo = driver.findElement(By.id("username"));
        assertEquals("", campo.getText());
        assertTrue(campo.isDisplayed());
        assertTrue(campo.isEnabled());
    }

    @Test
    void seleccionarPorCssSelector() {
        WebElement boton = driver.findElement(By.cssSelector("button[type='submit']"));
        assertTrue(boton.isDisplayed());
        assertTrue(boton.getText().contains("Login"));
    }

    @Test
    void seleccionarPorXpath() {
        WebElement header = driver.findElement(By.xpath("//h2[contains(text(),'Login Page')]"));
        assertTrue(header.isDisplayed());
    }

}