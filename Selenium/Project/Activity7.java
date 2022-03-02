package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity7 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/crm/");
    }
    @Test
    public void act7() throws InterruptedException {
        WebElement username = driver.findElement(By.id("user_name"));
        WebElement pwd = driver.findElement(By.id("username_password"));
        username.sendKeys("admin");
        pwd.sendKeys("pa$$w0rd");
        WebElement Loginbtn = driver.findElement(By.id("bigbutton"));
        Loginbtn.click();
        //Printing the phone number from message box
        WebElement menu = driver.findElement(By.xpath("//*[@id='grouptab_0']"));
        menu.click();
        WebElement menu1 = driver.findElement(By.xpath("//*[@id='moduleTab_9_Leads']"));
        menu1.click();
        Thread.sleep(10000);
        WebElement icon = driver.findElement(By.xpath("//span[@title='Additional Details']"));
        icon.click();
        Thread.sleep(10000);
        String message = driver.findElement(By.xpath("//span[@class='phone']")).getText();
        System.out.println("Phone number is :" + message);
    }
    @AfterMethod
    public void after() {

        driver.close();
    }
}
