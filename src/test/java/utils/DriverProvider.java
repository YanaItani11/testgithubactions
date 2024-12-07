package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DriverProvider {
    public static WebDriver driver;
    public static WebDriverWait wait;

    public static WebDriver getCurrentDriver() {
        if (driver == null) {
            init();
        }
        return driver;
    }

    public static void quitCurrentDriver() {
        driver.quit();
        driver = null;
        wait = null;
    }

    public static WebDriverWait getCurrentWait() {
        if (wait == null) {
            init();
        }
        return wait;
    }

    private static void init() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless", "--disable-gpu", "--no-sandbox");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
    }

}
