package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static utils.DriverProvider.*;

public class BaseTest {

        @BeforeMethod
        public void setUp() {
            getCurrentDriver().get("https://tartu.pilet.ee/et/home");
        }

        @AfterMethod
        public void tearDown() {
            quitCurrentDriver();
        }
    }


