package Activities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity4 {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/crm/");
    }

    @Test
    public void act4() {
        WebElement username=  driver.findElement(By.id("user_name"));
        WebElement pwd=  driver.findElement(By.id("username_password"));
        username.sendKeys("admin");
        pwd.sendKeys("pa$$w0rd");
        WebElement Loginbtn= driver.findElement(By.id("bigbutton"));
        Loginbtn.click();
        String expectedUrl= "https://alchemy.hguy.co/crm/index.php?module=Home&action=index";

        // Verify the exact url has opened.
        String actualUrl= driver.getCurrentUrl();
        System.out.println("Url is : " + actualUrl);
        Assert.assertEquals(expectedUrl,actualUrl);
        System.out.println("Successful");
    }

    @AfterMethod
    public void after() {

        driver.close();
    }
}
