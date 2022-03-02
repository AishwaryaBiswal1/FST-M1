package Activities;
import org.junit.AfterClass;
//import org.junit.Assert;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Activity1 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod(){
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/crm/");

    }
    @Test
    public void act1() {
        String actualTitle = driver.getTitle();
        System.out.println("Page title is : " + actualTitle);
        String expectedTitle = "SuiteCRM";

        //Verify the title gets matched
        Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedTitle));
        System.out.println("Successful");
    }

    @AfterMethod
    public void after () {
        driver.close();
    }

}