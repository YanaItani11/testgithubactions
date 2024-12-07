package tests;

import Ridango.pages.LogInPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class YanaTest extends BaseTest {
    @Test
    public void headerExists(){
        LogInPage loginpage = new LogInPage();
        loginpage.headerExists();
        Assert.assertTrue(loginpage.headerIndeedExists());
    }
}
