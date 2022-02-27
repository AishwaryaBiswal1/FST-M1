package Activities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Googletask {
    // Declare Android driver
    AndroidDriver<MobileElement> driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "appiumClass");
        caps.setCapability("platformName", "android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.google.android.apps.tasks");
        caps.setCapability("appActivity", ".ui.TaskListsActivity");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, caps);
    }
    @Test
    public void addtask() {
        // Add task1
        MobileElement addtask1=  driver.findElementById("com.google.android.apps.tasks:id/tasks_list");
        addtask1.click();
        MobileElement taskname1= driver.findElementById("com.google.android.apps.tasks:id/add_task_title");
        taskname1.sendKeys("Complete Activity with Google Tasks");
        MobileElement save=  driver.findElementById("com.google.android.apps.tasks:id/add_task_done");
        save.click();
      // Add task2
        MobileElement addtask2=  driver.findElementById("com.google.android.apps.tasks:id/tasks_list");
        addtask2.click();
        MobileElement taskname2= driver.findElementById("com.google.android.apps.tasks:id/add_task_title");
        taskname2.sendKeys("Complete Activity with Google Keep");
        save.click();
        // Add task3
        MobileElement addtask3=  driver.findElementById("com.google.android.apps.tasks:id/tasks_list");
        addtask3.click();
        MobileElement taskname3= driver.findElementById("com.google.android.apps.tasks:id/add_task_title");
        taskname3.sendKeys("Complete the second Activity Google Keep");
        save.click();

        // number of task added
        List<MobileElement> numberOfTask = driver.findElementsByXPath("com.google.android.apps.tasks:id/tasks_list");
        System.out.println("Number of task shown currently: " + numberOfTask.size());



        // Assertion for counting task
        Assert.assertEquals(numberOfTask.size(), 3);
    }

    @AfterClass
    public void tearDown() {
        // Close app
        driver.quit();
    }
}
