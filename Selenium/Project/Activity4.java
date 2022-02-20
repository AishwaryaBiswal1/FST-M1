package Activities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/crm/");
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
        driver.close();

    }
}
