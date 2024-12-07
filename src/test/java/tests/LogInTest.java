package tests;

import Ridango.pages.LogInPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest {

    public void successfulLogIn() {
        LogInPage logInPage = new LogInPage();
        logInPage.logIn();
        Assert.assertTrue(logInPage.loginIsSuccessful());

    }
}
