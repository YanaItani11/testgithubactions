package yanaItani.classTests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotatinsUsage {
    @BeforeTest
    public void printBefore(){
        System.out.println("This is before annotation");
    }
    @Test
    public void testAnnotation(){
        System.out.println("Test itself");
    }
    @AfterTest
    public void printAfter(){
        System.out.println("After annotation text");
    }
}
