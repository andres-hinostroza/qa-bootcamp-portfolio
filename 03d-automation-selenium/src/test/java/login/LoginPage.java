package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

class LoginPage {

    WebDriver driver;

    By campoUsername = By.id("username");
    By campoPassword = By.id("password");
    By botonLogin    = By.cssSelector("button[type='submit']");
    By mensajeExito  = By.cssSelector(".flash.success");
    By mensajeError  = By.cssSelector(".flash.error");

    LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    void abrirPagina() {
        driver.get("https://the-internet.herokuapp.com/login");
    }

    void login(String username, String password) {
        driver.findElement(campoUsername).sendKeys(username);
        driver.findElement(campoPassword).sendKeys(password);
        driver.findElement(botonLogin).click();
    }

    boolean mensajeExitoVisible() {
        return driver.findElement(mensajeExito).isDisplayed();
    }

    boolean mensajeErrorVisible() {
        return driver.findElement(mensajeError).isDisplayed();
    }
}