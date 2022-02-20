package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/crm/");
        System.out.println("Page title is : " + driver.getTitle());
        // Get the first footertext
       String footerText= driver.findElement(By.id("admin_options")).getText();
       System.out.println(footerText);
       driver.close();
    }
}
