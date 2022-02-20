package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity9 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/crm/");
        WebElement username = driver.findElement(By.id("user_name"));
        WebElement pwd = driver.findElement(By.id("username_password"));
        username.sendKeys("admin");
        pwd.sendKeys("pa$$w0rd");
        WebElement Loginbtn = driver.findElement(By.id("bigbutton"));
        Loginbtn.click();
        WebElement menu = driver.findElement(By.xpath("//*[@id='grouptab_0']"));
        menu.click();
        WebElement menu1 = driver.findElement(By.xpath("//*[@id='moduleTab_9_Leads']"));
        menu1.click();
        Thread.sleep(5000);
        // Printing first 10 values form names & user column
        int i = 0;
        List<WebElement> columnList = driver.findElements(By.xpath("//*[@id=\"MassUpdate\"]/div[3]/table/tbody//td[3]"));
        for (WebElement column : columnList) {
            System.out.println("The names are:" + column.getText());
            i++;
            if (i == 9)
                break;
        }
        int j = 0;
        List<WebElement> columnList1 = driver.findElements(By.xpath("//*[@id=\"MassUpdate\"]/div[3]/table/tbody//td[8]"));
        for (WebElement column : columnList1) {
            System.out.println("The users are:" + column.getText());
            j++;
            if (j == 9)
                break;
        }
    }
}


