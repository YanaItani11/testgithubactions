package Ridango.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;

import java.time.Duration;

import static utils.DriverProvider.getCurrentDriver;
public class LogInPage {
    public String logInButtonXpath = "//a[@class='topbar-login-button font-thin']";
    public String usernameId = "username";
    public String passwordID = "password";
    public String logInPopupButtonXpath = "//input[@value='Logi sisse']";
    public String logInSuccessfulPopupXpath = "//div[@class='alert-box success radius cf']";
    public String textLoginPage = "main-content";

    public void waitForLogInPopup() {
        WebElement logInPopup = getCurrentDriver().findElement(By.id("login-form"));
        WebDriverWait wait = new WebDriverWait(getCurrentDriver(), Duration.ofSeconds(2));
        WebElement loginPopupButton = getCurrentDriver().findElement(By.xpath(logInPopupButtonXpath));
        wait.until(ExpectedConditions.elementToBeClickable(loginPopupButton));
    }

    public void logIn() {
        WebElement logInButton = getCurrentDriver().findElement(By.xpath(logInButtonXpath));
        logInButton.click();
        waitForLogInPopup();
        WebElement username = getCurrentDriver().findElement(By.id(usernameId));
        username.sendKeys("yana.itani@gmail.com");
        WebElement passwordd = getCurrentDriver().findElement(By.id(passwordID));
        passwordd.sendKeys("231997Fevral'");
        WebElement logInPopUpButton = getCurrentDriver().findElement(By.xpath(logInPopupButtonXpath));
        logInPopUpButton.click();
    }

    public Boolean loginIsSuccessful() {

        WebDriverWait wait = new WebDriverWait(getCurrentDriver(), Duration.ofSeconds(3));
        WebElement logInSuccessful = getCurrentDriver().findElement(By.xpath(logInSuccessfulPopupXpath));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(logInSuccessfulPopupXpath)));

        if (logInSuccessful.isDisplayed()) {
            return true;
        } else {
            return false;

        }
    }


    public void headerExists() {
        WebDriverWait wait = new WebDriverWait(getCurrentDriver(), Duration.ofSeconds(100));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(textLoginPage)));
        WebElement textLoginPageId = getCurrentDriver().findElement(By.id(textLoginPage));
    }

    public Boolean headerIndeedExists() {
        WebDriverWait waitt = new WebDriverWait(getCurrentDriver(), Duration.ofSeconds(100));
        WebElement textLoginPageIdd = getCurrentDriver().findElement(By.id(textLoginPage));
        waitt.until(ExpectedConditions.visibilityOfElementLocated(By.id(textLoginPage)));


        if (textLoginPageIdd.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }
}

