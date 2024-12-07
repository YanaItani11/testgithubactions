package yanaItani.sauseDemo.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

public class saucedemoTest extends BaseTest {

    @Test
    public void itemInBasket() {
        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        WebElement logInButton = driver.findElement(By.id("login-button"));
        logInButton.click();
        WebElement backpack = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        backpack.click();
        WebElement price = driver.findElement(By.xpath("//div[@class='inventory_item_price']"));
        String Pprice = price.getText();

        System.out.println("the price is " + Pprice);

        WebElement cart = driver.findElement(By.id("shopping_cart_container"));
        cart.click();
        WebElement basketItemPrice = driver.findElement(By.xpath("//div[@class='inventory_item_price']"));
        String newPrice = basketItemPrice.getText();

        Assert.assertEquals(Pprice, newPrice);

        WebElement removeButton = driver.findElement(By.id("remove-sauce-labs-backpack"));
        removeButton.click();
    }

        }

