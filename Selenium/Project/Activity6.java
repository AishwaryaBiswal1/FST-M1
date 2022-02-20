package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/crm/");
        WebElement username = driver.findElement(By.id("user_name"));
        WebElement pwd = driver.findElement(By.id("username_password"));
        username.sendKeys("admin");
        pwd.sendKeys("pa$$w0rd");
        WebElement Loginbtn = driver.findElement(By.id("bigbutton"));
        Loginbtn.click();
        //Menu checking
        WebElement menu = driver.findElement(By.xpath("//*[@id='grouptab_3']"));
        Boolean status= menu.isDisplayed();
        System.out.println("Menu is present:"+ status);
        driver.close();
    }

}
