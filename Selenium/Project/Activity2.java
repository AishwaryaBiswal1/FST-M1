package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/crm/");

    }

     @Test
    public void act2() {
        // Get the url of header image
        String link = driver.findElement(By.tagName("img")).getAttribute("src");
        System.out.println(link);
    }

    @AfterMethod
    public void after() {

        driver.close();
    }
}