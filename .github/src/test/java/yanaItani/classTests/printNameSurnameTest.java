package yanaItani.classTests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class printNameSurnameTest {
    @Test
    @Parameters({"firstName", "lastName"})
    public void printNameSurname (String firstName, String lastName) {
        String resultString = "The first name is: " + firstName + "and my last name is: " + lastName;
        System.out.println(resultString);
        Assert.assertTrue(resultString.contains(firstName) && resultString.contains(lastName+1));
    }
}
