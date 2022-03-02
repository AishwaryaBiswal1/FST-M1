package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Activity8 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/crm/");
    }
    @Test
    public void act9() throws InterruptedException {
        WebElement username = driver.findElement(By.id("user_name"));
        WebElement pwd = driver.findElement(By.id("username_password"));
        username.sendKeys("admin");
        pwd.sendKeys("pa$$w0rd");
        WebElement Loginbtn = driver.findElement(By.id("bigbutton"));
        Loginbtn.click();
        Thread.sleep(5000);
        WebElement menu = driver.findElement(By.xpath("//*[@id='grouptab_0']"));
        menu.click();
        WebElement menu1 = driver.findElement(By.xpath("//*[@id=\'moduleTab_9_Accounts\']"));
        menu1.click();
        Thread.sleep(5000);
        int i = 1;
            List<WebElement> columnList = driver.findElements(By.xpath("//*[@id=\"MassUpdate\"]/div[3]/table/tbody//td[3]"));
            for (WebElement column : columnList) {
                System.out.println("The names are:" + column.getText());
                i+=2;
                if (i == 9)
                    break;

            }
        }
    @AfterMethod
    public void after() {

        driver.close();
    }

    }





