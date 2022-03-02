package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Activity3 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/crm/");
        System.out.println("Page title is : " + driver.getTitle());
    }

    @Test
    public void act3() {
        // Get the first footertext
       String footerText= driver.findElement(By.id("admin_options")).getText();
       System.out.println(footerText);
    }

    @AfterMethod
    public void after() {

        driver.close();
    }

}
