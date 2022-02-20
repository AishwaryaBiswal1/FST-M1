package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/crm/");
        WebElement username = driver.findElement(By.id("user_name"));
        WebElement pwd = driver.findElement(By.id("username_password"));
        username.sendKeys("admin");
        pwd.sendKeys("pa$$w0rd");
        WebElement Loginbtn = driver.findElement(By.id("bigbutton"));
        Loginbtn.click();
        // get the colour of Navigation menu
        String navigationMenu= driver.findElement(By.xpath("//div[@id='toolbar']")).getCssValue("background-color");;
        System.out.println(navigationMenu);
        driver.close();
    }


}
